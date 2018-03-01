package com.pokerplayer.model.card

enum class Suit private constructor(private val id: Char, private val displayName: String) {
    HEARTS('h', "Hearts"),
    SPADES('s', "Spades"),
    DIAMONDS('d', "Diamonds"),
    CLUBS('c', "Clubs");

    fun getID(): Char {
        return id;
    }
}