package com.pokerplayer.model.util

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.pokerplayer.model.util.Deck
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object DeckSpec : Spek({
    given("A Deck of cards") {
        val deck = Deck()
        on("Construction") {
            it("Should have 52 cards") {
                assertThat(52, equalTo(deck.size))
            }
        }
        on("Drawing a card") {
            val card = deck.draw()
            it("Should have 51 cards") {
                assertThat(51, equalTo(deck.size))
            }
        }
    }
})
