/*
package com.pokerplayer

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.pokerplayer.model.Card
import com.pokerplayer.model.Rank
import com.pokerplayer.model.Suit

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object ComboSpec : Spek({
    given("a Combo ATs"){
        val leftCard =
            Card(Rank.ACE, Suit.CLUBS)
        val rightCard =
            Card(Rank.TEN, Suit.CLUBS)
        val combo = Combo(leftCard, rightCard)
        on("construction") {
            it("should know if the cards are connectors"){
                assertThat(combo.isConnector, equalTo(true))
            }
            it("should know if the cards are suited"){
                assertThat(combo.isSuited, equalTo(true))
            }
            it("should know if the cards are broadway"){
                assertThat(combo.isBroadway, equalTo(true))
            }
            it("should know if the cards are a pair"){
                assertThat(combo.isPair, equalTo(false))
            }
        }
    }

    given("a Combo A9o"){
        val leftCard = Card(
            Rank.NINE,
            Suit.HEARTS
        )
        val rightCard =
            Card(Rank.ACE, Suit.CLUBS)
        val combo = Combo(leftCard, rightCard)
        on("construction") {
            it("should know if the cards are connectors"){
                assertThat(combo.isConnector, equalTo(false))
            }
            it("should know if the cards are suited"){
                assertThat(combo.isSuited, equalTo(false))
            }
            it("should know if the cards are broadway"){
                assertThat(combo.isBroadway, equalTo(false))
            }
            it("should know if the cards are a pair"){
                assertThat(combo.isPair, equalTo(false))
            }
        }
    }

    given("a Combo A5o"){
        val leftCard = Card(
            Rank.FIVE,
            Suit.SPADES
        )
        val rightCard = Card(
            Rank.ACE,
            Suit.DIAMONDS
        )
        val combo = Combo(leftCard, rightCard)
        on("construction") {
            it("should know if the cards are connectors"){
                assertThat(combo.isConnector, equalTo(true))
            }
            it("should know if the cards are suited"){
                assertThat(combo.isSuited, equalTo(false))
            }
            it("should know if the cards are broadway"){
                assertThat(combo.isBroadway, equalTo(false))
            }
            it("should know if the cards are a pair"){
                assertThat(combo.isPair, equalTo(false))
            }
        }
    }

    given("a Combo A6s"){
        val leftCard =
            Card(Rank.ACE, Suit.HEARTS)
        val rightCard =
            Card(Rank.SIX, Suit.HEARTS)
        val combo = Combo(leftCard, rightCard)
        on("construction") {
            it("should know if the cards are connectors"){
                assertThat(combo.isConnector, equalTo(false))
            }
            it("should know if the cards are suited"){
                assertThat(combo.isSuited, equalTo(true))
            }
            it("should know if the cards are broadway"){
                assertThat(combo.isBroadway, equalTo(false))
            }
            it("should know if the cards are a pair"){
                assertThat(combo.isPair, equalTo(false))
            }
        }
    }

    given("a Combo TT"){
        val leftCard =
            Card(Rank.ACE, Suit.SPADES)
        val rightCard =
            Card(Rank.ACE, Suit.HEARTS)
        val combo = Combo(leftCard, rightCard)
        on("construction") {
            it("should know if the cards are connectors"){
                assertThat(combo.isConnector, equalTo(true))
            }
            it("should know if the cards are suited"){
                assertThat(combo.isSuited, equalTo(false))
            }
            it("should know if the cards are broadway"){
                assertThat(combo.isBroadway, equalTo(true))
            }
            it("should know if the cards are a pair"){
                assertThat(combo.isPair, equalTo(true))
            }
        }
    }
})*/
