package com.pokerplayer.model.card

enum class Suit private constructor(val id: Char, val displayName: String) {
    HEARTS('h', "Hearts"),
    SPADES('s', "Spades"),
    DIAMONDS('d', "Diamonds"),
    CLUBS('c', "Clubs")
}