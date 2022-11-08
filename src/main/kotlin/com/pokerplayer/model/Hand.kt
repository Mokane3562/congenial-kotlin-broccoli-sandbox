package com.pokerplayer.model

sealed class Hand : Comparable<Hand>
{
    override fun compareTo(other: Hand): Int
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

data class HighCard(val rank: Rank) : Hand()
{
    override fun compareTo(other: Hand): Int
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

data class OnePair(val rank: Rank) : Hand()
{
    override fun compareTo(other: Hand): Int
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

data class TwoPair(val highRank: Rank, val lowRank: Rank) : Hand()
{
    override fun compareTo(other: Hand): Int
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

data class ThreeOfAKind(val rank: Rank) : Hand()
{
    override fun compareTo(other: Hand): Int
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

data class Straight(val highRank: Rank) : Hand()
{
    override fun compareTo(other: Hand): Int
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

data class Flush(val highestRank: Rank, val suit: Suit) : Hand()
{
    override fun compareTo(other: Hand): Int
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

data class FullHouse(val tripleRank: Rank, val doubleRank: Rank) : Hand()
{
    override fun compareTo(other: Hand): Int
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

data class FourOfAKind(val rank: Rank) : Hand()
{
    override fun compareTo(other: Hand): Int
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

data class StraightFlush(val highRank: Rank, val suit: Suit) : Hand()
{
    override fun compareTo(other: Hand): Int
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}