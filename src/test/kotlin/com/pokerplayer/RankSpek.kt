package com.pokerplayer

import com.pokerplayer.model.Rank
import junit.framework.Assert.assertEquals
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*

object RankSpek : Spek({
    describe("a rank")
    {
        var rank: Rank
        context("Jack")
        {
            val jack = Rank.JACK
            given("an integer representation")
            {
                val index = 9
                on("creation"){
                    rank = Rank.fromIndex(index)
                    it("should exist")
                    {
                        assertEquals(rank, jack)
                    }
                }
            }
        }
        context("Five")
        {
            val five = Rank.FIVE
            given("an character representation")
            {
                val char = '5'
                on("creation"){
                    rank = Rank.fromChar(char)
                    it("should exist")
                    {
                        assertEquals(rank, five)
                    }
                }
            }
        }
    }
})