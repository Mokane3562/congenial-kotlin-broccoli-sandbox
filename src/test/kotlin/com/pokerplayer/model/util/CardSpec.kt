package com.pokerplayer.model.util

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.pokerplayer.model.util.Card
import com.pokerplayer.model.util.Rank
import com.pokerplayer.model.util.Suit
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on


object CardSpec : Spek({
    given("The ace of spades and the king of clubs") {
        on("Construction of ace of spades") {
            val aceOfSpades = Card(Rank.ACE, Suit.SPADES)
            it("Should have rank ACE and Suit SPADES") {
                assertThat(aceOfSpades.rank, equalTo(Rank.ACE))
                assertThat(aceOfSpades.suit, equalTo(Suit.SPADES))
            }
        }
        on("Construction of king of clubs") {
            val kingOfClubs = Card(Rank.KING, Suit.CLUBS)
            it("Should have Rank King and Suit CLUBS") {
                assertThat(kingOfClubs.rank, equalTo(Rank.KING))
                assertThat(kingOfClubs.suit, equalTo(Suit.CLUBS))
            }
        }
    }
})