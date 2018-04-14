package com.pokerplayer.model

enum class Suit(val sign: Char) {
    HEARTS('h'),
    SPADES('s'),
    DIAMONDS('d'),
    CLUBS('c');

    companion object {
        private val map = Suit.values().associateBy(Suit::sign);
        fun fromChar(sign: Char) = map[sign] ?: throw IllegalArgumentException()
    }
}