package com.pokerplayer

import com.pokerplayer.model.Rank
import com.pokerplayer.model.Suit
import junit.framework.Assert.assertEquals
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*

object SuitSpek : Spek({
    describe("a suit")
    {
        var suit: Suit
        context("Hearts")
        {
            val hearts = Suit.HEARTS
            given("an integer representation")
            {
                val index = 2
                on("creation"){
                    suit = Suit.fromIndex(index)
                    it("should exist")
                    {
                        assertEquals(suit, hearts)
                    }
                }
            }
        }
        context("Clubs")
        {
            val clubs = Suit.CLUBS
            given("an character representation")
            {
                val char = 'c'
                on("creation"){
                    suit = Suit.fromChar(char)
                    it("should exist")
                    {
                        assertEquals(suit, clubs)
                    }
                }
            }
        }
    }
})