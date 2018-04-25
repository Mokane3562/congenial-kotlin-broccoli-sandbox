package com.pokerplayer

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.pokerplayer.model.Card
import com.pokerplayer.model.Rank
import com.pokerplayer.model.Suit
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
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

    describe("The Cards") {
        fun allCards(): Set<Card> {
            val cards = HashSet<Card>()
            for (suit in Suit.values()) {
                for (rank in Rank.values()) {
                    cards.add(Card(rank, suit))
                }
            }
            return cards
        }

        on("collection") {
            val all = Card.getFullSet()

            it("should have 52 cards") {
                assertThat(all.size, equalTo(52))
            }
        }
    }
})