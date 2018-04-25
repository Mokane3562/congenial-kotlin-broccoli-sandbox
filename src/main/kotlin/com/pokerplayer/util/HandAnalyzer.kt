package com.pokerplayer.util

import com.pokerplayer.model.*

object HandAnalyzer
{
    fun isStraight(potentialHand: PotentialHand): Boolean
    {
        val sortedCards = potentialHand.list.sortedBy { it.rank }
        if (getDistance(sortedCards[0], sortedCards[4]) == -4) return true
        if (sortedCards[4].rank == Rank.ACE && sortedCards[0].rank == Rank.TWO && sortedCards[3].rank == Rank.FIVE) return true
        return false
    }

    fun isFlush(potentialHand: PotentialHand): Boolean
    {
        val suit = potentialHand.list[0].suit
        if (potentialHand.list.all { it.suit == suit }) return true
        return false
    }

    fun isBroadway(card: Card): Boolean
    {
        return card.rank >= Rank.TEN
    }

    fun isFace(card: Card): Boolean
    {
        return card.rank == Rank.JACK || card.rank == Rank.QUEEN || card.rank == Rank.KING
    }

    fun getDistance(foo: Card, bar: Card): Int
    {
        return if (foo.rank == Rank.ACE && bar.rank <= Rank.FIVE)
        {
            (-1).compareTo(bar.rank.ordinal)
        }
        else if (foo.rank <= Rank.FIVE && bar.rank == Rank.ACE)
        {
            foo.rank.ordinal.compareTo(-1)
        }
        else
        {
            foo.rank.compareTo(bar.rank)
        }
    }

    fun analyzeHand(potentialHand: PotentialHand): Hand //fixme: Needs to be cleaned up and extracted. Very yucky mess.
    {
        val groups = potentialHand.list.groupBy { it.rank }
        val sortedCards = potentialHand.list.sortedBy { it.rank }
        var highestRankInStraight = groups.maxBy { it.key }!!.key
        if (sortedCards[4].rank == Rank.ACE && sortedCards[0].rank == Rank.TWO && sortedCards[3].rank == Rank.FIVE) highestRankInStraight = Rank.FIVE
        val rankOfLargestGroup = groups.maxBy { it.value.size }!!.key
        val rankOfSmallestGroup = groups.minBy { it.value.size }!!.key

        when (groups.size)
        {
            2 ->
            {
                if (groups.any { it.value.size == 4 })
                {
                    return FourOfAKind(rankOfLargestGroup)
                }
                return FullHouse(rankOfLargestGroup, rankOfSmallestGroup)
            }
            3 ->
            {
                if (groups.any { it.value.size == 3 })
                {
                    return ThreeOfAKind(rankOfLargestGroup)
                }
                val filtered = groups.filter { it.value.size == 2 }
                val filteredMax = filtered.maxBy { it.key }!!.key
                val filteredMin = filtered.minBy { it.key }!!.key
                return TwoPair(filteredMax, filteredMin)
            }
            4 -> return OnePair(rankOfLargestGroup)
            else ->
            {
                val flush = isFlush(potentialHand)
                val straight = isStraight(potentialHand)
                when
                {
                    flush && straight -> return StraightFlush(highestRankInStraight, sortedCards[0].suit)
                    flush             -> return Flush(highestRankInStraight, sortedCards[0].suit)
                    straight          -> return Straight(highestRankInStraight)
                    else              -> return HighCard(highestRankInStraight)
                }
            }
        }
    }
}
