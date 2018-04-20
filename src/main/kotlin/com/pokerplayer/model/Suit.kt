package com.pokerplayer.model

enum class Suit(val sign: Char)
{
    CLUBS('c'),
    DIAMONDS('d'),
    HEARTS('h'),
    SPADES('s');

    companion object
    {
        private val map = Suit.values().associateBy(Suit::sign);
        fun fromChar(sign: Char) = map[sign] ?: throw IllegalArgumentException("$sign")
    }

    override fun toString(): String
    {
        return "$sign"
    }
}