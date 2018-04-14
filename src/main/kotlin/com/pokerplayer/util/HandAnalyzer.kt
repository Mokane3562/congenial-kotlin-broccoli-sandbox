package com.pokerplayer.util

import com.pokerplayer.model.Card
import com.pokerplayer.model.Hand
import com.pokerplayer.model.Rank
import java.lang.IllegalArgumentException

object HandAnalyzer {
    fun isStraight(hand: Hand): Boolean {
        val sorted = hand.list.sortedBy { it.rank }
        if (sorted[0].compareTo(sorted[4]) == -4) return true
        if (sorted[4].rank == Rank.ACE && sorted[0].rank == Rank.TWO && sorted[3].rank == Rank.FIVE) return true
        return false
    }

    fun isFlush(hand: Hand): Boolean {
        val suit = hand.list[0].suit
        if (hand.list.all { it.suit == suit }) return true
        return false
    }

    fun isBroadway(card: Card): Boolean {
        return card.rank >= Rank.TEN
    }

    fun isFace(card: Card): Boolean {
        return card.rank == Rank.JACK || card.rank == Rank.QUEEN || card.rank == Rank.KING
    }

    fun analyzeHand(hand: Hand): String {
        val groups = hand.list.groupBy { it.rank }
        when (groups.size) {
            2 -> {
                if (groups.any { it.value.size == 4 }) return "four-of-a-kind"
                return "full-house"
            }
            3 -> {
                if (groups.any { it.value.size == 3 }) return "three-of-a-kind"
                return "two-pair"
            }
            4 -> return "one-pair"
            else -> {
                val flush = isFlush(hand)
                val straight = isStraight(hand)
                when {
                    flush && straight -> return "straight-flush"
                    flush             -> return "flush"
                    straight          -> return "straight"
                    else              -> return "high-card"
                }
            }
        }
    }
}
