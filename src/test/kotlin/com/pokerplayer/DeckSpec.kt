
package com.pokerplayer

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.pokerplayer.model.Card
import com.pokerplayer.util.Deck
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import kotlin.test.todo

object DeckSpec : Spek({
    given("a deck of cards")
    {
        val deck = Deck()
        on("construction")
        {
            it("should have 52 cards")
            {
                assertThat(52, equalTo(deck.size))
            }
        }
        on("drawing a card")
        {
            val card = deck.draw()
            it("should have 51 cards")
            {
                assertThat(51, equalTo(deck.size))
            }
            it("should return the Two of Clubs")
            {
                assertThat(card, equalTo(Card("2c")))
            }
        }
        on("reset")
        {
            deck.reset()
            it("should have 52 cards")
            {
                assertThat(52, equalTo(deck.size))
            }
        }
        on("shuffle")
        {
            deck.shuffle()
            xit("should be very well shuffled")
            {
                todo { "How should we test this?" }
            }
        }
    }
})
