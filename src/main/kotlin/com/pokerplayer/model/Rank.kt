package com.pokerplayer.model

enum class Rank(val sign: Char)
{
    TWO('2'),
    THREE('3'),
    FOUR('4'),
    FIVE('5'),
    SIX('6'),
    SEVEN('7'),
    EIGHT('8'),
    NINE('9'),
    TEN('T'),
    JACK('J'),
    QUEEN('Q'),
    KING('K'),
    ACE('A');

    companion object
    {
        private val map = Rank.values().associateBy(Rank::sign);
        fun fromChar(sign: Char) = map[sign] ?: throw IllegalArgumentException("$sign")

        private val indexMap = Rank.values().associateBy(Rank::ordinal);
        fun fromIndex(int: Int) = indexMap[int] ?: throw IllegalArgumentException("$int")
    }
}
