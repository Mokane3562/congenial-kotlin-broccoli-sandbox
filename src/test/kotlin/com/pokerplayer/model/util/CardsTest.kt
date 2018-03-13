package com.pokerplayer.model.util

import org.jetbrains.spek.api.Spek
import org.junit.Assert
import org.junit.jupiter.api.Test
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

import java.util.ArrayList

@RunWith(JUnitPlatform::class)
class CalculatorSpec: Spek({
    fun allCards(): List<Card> {
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
        Assert.assertArrayEquals(list.toTypedArray(), allCards().toTypedArray())
        Assert.assertTrue(1==2)//fails
    }
})
