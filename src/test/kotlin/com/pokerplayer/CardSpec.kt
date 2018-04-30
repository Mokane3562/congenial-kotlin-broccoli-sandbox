package com.pokerplayer

import com.pokerplayer.model.Card
import com.pokerplayer.model.Rank
import com.pokerplayer.model.Suit
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import java.lang.reflect.Constructor
import kotlin.test.assertEquals

object CardSpec : Spek({
    describe("a card")
    {
        var card: Card
        context("Ace of Spades")
        {
            val aceOfSpades = Card(Rank.ACE, Suit.SPADES)
            given("an integer representation")
            {
                val index = 51
                on("creation"){
                    card = Card(index)
                    it("should exist")
                    {
                        assertEquals(card, aceOfSpades)
                    }
                    it("should have a string representation")
                    {
                        assertEquals(card.toString(), aceOfSpades.toString())
                    }
                }
            }
        }
        context("Seven of Clubs")
        {
            val sevenOfClubs = Card(Rank.SEVEN, Suit.CLUBS)
            given("a string representation")
            {
                val pip = "7c"
                on("creation"){
                    card = Card(pip)
                    it("should exist")
                    {
                        assertEquals(card, sevenOfClubs)
                    }
                    it("should have an integer representation")
                    {
                        assertEquals(card.index, sevenOfClubs.index)
                    }
                }
            }
        }
    }
})
