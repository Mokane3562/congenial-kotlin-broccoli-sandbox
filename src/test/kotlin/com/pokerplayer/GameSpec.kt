/*
package com.pokerplayer

import com.natpryce.hamkrest.*
import com.natpryce.hamkrest.assertion.assertThat
import com.pokerplayer.model.Card
import com.pokerplayer.model.Rank
import com.pokerplayer.model.Suit
import com.pokerplayer.model.Player
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import java.util.*
import kotlin.collections.ArrayList

object GameSpec : Spek({
    given("A new game of Poker") {
        val game =
            Main(Player("Jerry"), Player("Steve"))
        on("Construction") {
            it("Should have at least two players") {
                assertThat(game.players.size, greaterThanOrEqualTo(2))
                assertThat({
                    val game =
                        Main(ArrayList(Arrays.asList(Player("Lonely Jim"))))
                }, throws<Exception>())
            }
            it("Should have at most ten players") {
                assertThat(game.players.size, lessThanOrEqualTo(10))
                assertThat({
                    val game = Main(
                        ArrayList(
                            Arrays.asList(
                                Player("1"),
                                Player("2"),
                                Player("3"),
                                Player("4"),
                                Player("5"),
                                Player("6"),
                                Player("7"),
                                Player("8"),
                                Player("9"),
                                Player("10"),
                                Player("11")
                            )
                        )
                    )
                }, throws<Exception>())
            }
        }
        on("A new round") {
            val dealer = game.dealer
            val smallBlind = game.smallBlind
            game.boardCards.add(Card(Rank.ACE, Suit.CLUBS))
            game.newRound()
            it("Should clear all cards from the board") {
                assertThat(game.boardCards.size, equalTo(0))
            }
            it("Should correctly advance the dealer") {
                assertThat(game.dealer, equalTo(smallBlind))
                game.newRound()
                assertThat(game.dealer, equalTo(dealer))
            }
        }
    }
})
*/
