package com.pokerplayer.model.hand

import com.pokerplayer.model.card.Card

class Pocket(
        private val leftCard: Card,
        private val rightCard: Card)
    : Combo(
        leftCard.rank,
        rightCard.rank,
        leftCard.suit == rightCard.suit)
{
    override fun toString(): String {
        return "Pocket{$leftCard : $rightCard}"
    }
}