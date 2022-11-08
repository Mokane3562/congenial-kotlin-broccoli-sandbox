package com.pokerplayer.model

enum class Suit(val sign: Char)
{
    CLUBS('c'),
    DIAMONDS('d'),
    HEARTS('h'),
    SPADES('s');

    companion object
    {
        private val signMap = Suit.values().associateBy(Suit::sign);
        fun fromChar(sign: Char) = signMap[sign] ?: throw IllegalArgumentException("$sign")

        private val indexMap = Suit.values().associateBy(Suit::ordinal);
        fun fromIndex(int: Int) = indexMap[int] ?: throw IllegalArgumentException("$int")
    }
}