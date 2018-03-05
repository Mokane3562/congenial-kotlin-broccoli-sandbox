package com.pokerplayer.model.game

import com.natpryce.hamkrest.*
import com.natpryce.hamkrest.assertion.assertThat
import com.pokerplayer.model.card.Card
import com.pokerplayer.model.card.Rank
import com.pokerplayer.model.card.Suit
import com.pokerplayer.model.entities.Player
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import java.util.*

object GameTest : Spek({
    given("A new game of Poker") {
        val game = Game(Player("Jerry"), Player("Steve"))
        on("Construction") {
            it("Should have at least two players") {
                assertThat(game.players.size, greaterThanOrEqualTo(2))
                assertThat({
                    val game = Game(LinkedHashSet(Arrays.asList(Player("Lonely Jim"))))
                }, throws<Exception>())
            }
            it("Should have at most ten players") {
                assertThat(game.players.size, lessThanOrEqualTo(10))
                assertThat({
                    val game = Game(
                        LinkedHashSet(
                            Arrays.asList(
                                Player("1"), Player("2"), Player("3"), Player("4"),
                                Player("5"), Player("6"), Player("7"), Player("8"),
                                Player("9"), Player("10"), Player("11")
                            )
                        )
                    )
                }, throws<Exception>())
            }
        }
        on("A new round") {
            game.dealerIndex = 0
            game.boardCards.add(Card(Rank.ACE, Suit.CLUBS))
            game.newRound()
            it("Should clear all cards from the board") {
                assertThat(game.boardCards.size, equalTo(0))
            }
            it("Should correctly advance the dealer") {
                assertThat(game.dealerIndex, equalTo(1))
                game.newRound()
                assertThat(game.dealerIndex, equalTo(0))
            }
        }
    }
})
