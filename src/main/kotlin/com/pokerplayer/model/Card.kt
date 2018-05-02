package com.pokerplayer.model

data class Card(val rank: Rank, val suit: Suit)
{
    private val MAX_RANKS = 13
    val index: Int
        get() = (MAX_RANKS*this.suit.ordinal)+this.rank.ordinal

    constructor(index: Int) : this(Rank.fromIndex(index%13), Suit.fromIndex(index/13))

    constructor(pip: String) : this(Rank.fromChar(pip[0].toUpperCase()), Suit.fromChar(pip[1]))
    {
        if (pip.length != 2)
        {
            throw IllegalArgumentException("$pip should be two characters")//todo: Constructors should not fail
        }
    }

    companion object
    {
        fun getFullSet(): Set<Card> = Rank.values().flatMap {
            r -> Suit.values().map { Card(r, it) }
        }.toHashSet()
    }

    override fun toString(): String
    {
        return "$rank$suit"
    }
}