
package com.pokerplayer

import com.pokerplayer.util.Deck
import org.hamcrest.CoreMatchers.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertThat

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
