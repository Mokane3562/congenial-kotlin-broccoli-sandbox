package com.pokerplayer.model

import java.util.*

data class Card(val rank: Rank, val suit: Suit)
{
    private val MAX_RANKS = 13
    val index: Int
        get() = (MAX_RANKS*this.suit.ordinal)+this.rank.ordinal;

    constructor(index: Int) : this(Rank.fromIndex(index%13), Suit.fromIndex(index/13))

    constructor(pip: String) : this(Rank.fromChar(pip[0].toUpperCase()), Suit.fromChar(pip[1]))
    {
        if (pip.length != 2)
        {
            throw IllegalArgumentException("$pip should be two characters")
        }
    }

    companion object
    {
        fun getFullSet(): Set<Card>
        {
            val set =  HashSet<Card>()
            for (rank in Rank.values())
            {
                for (suit in Suit.values())
                {
                    set.add(Card(rank, suit))
                }
            }
            return set
        }
    }

    fun getDistance(other: Card): Int
    {
        return if (this.rank == Rank.ACE && other.rank <= Rank.FIVE)
        {
            (-1).compareTo(other.rank.ordinal)
        }
        else if (this.rank <= Rank.FIVE && other.rank == Rank.ACE)
        {
            this.rank.ordinal.compareTo(-1)
        }
        else
        {
            this.rank.compareTo(other.rank)
        }
    }

    override fun toString(): String
    {
        return "$rank$suit"
    }
}