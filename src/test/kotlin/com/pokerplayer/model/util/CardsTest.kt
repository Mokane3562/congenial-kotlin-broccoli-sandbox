package com.pokerplayer.model.util

import org.junit.Assert
import org.junit.jupiter.api.Test

import java.util.ArrayList

class CardsTest {

    private val allCards: List<Card>
        get() {
            val cards = ArrayList<Card>()
            for (suit in Suit.values()) {
                for (rank in Rank.values()) {
                    cards.add(Card(rank, suit))
                }
            }
            return cards
        }

    @Test
    fun testCardsToList() {
        val list = Card.all
        Assert.assertArrayEquals(list.toTypedArray(), allCards.toTypedArray())
        Assert.assertTrue(1==2)//fails
    }
}
