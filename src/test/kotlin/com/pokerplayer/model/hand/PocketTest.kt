package com.pokerplayer.model.hand

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.pokerplayer.model.card.Card
import com.pokerplayer.model.card.Rank
import com.pokerplayer.model.card.Suit
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object PocketTest : Spek({
    given("A pocket of king and 8 on suit"){
        val pocket = Pocket(Card(Rank.KING, Suit.CLUBS), Card(Rank.EIGHT, Suit.CLUBS))
        on("Testing for pair and suited"){
            it("Should not be a pair"){
                assertThat(pocket.isPair, equalTo(false))
            }
            it("Should be suited"){
                assertThat(pocket.isSuited, equalTo(true))
            }
        }
    }
    given("A pocket of pair king off suit") {
        val pocket = Pocket(Card(Rank.KING, Suit.CLUBS), Card(Rank.KING, Suit.SPADES))
        on("Testing for pair and suited") {
            it("Should be a pair") {
                assertThat(pocket.isPair, equalTo(true))
            }
            it("Should not be suited") {
                assertThat(pocket.isSuited, equalTo(false))
            }
        }
    }
})