package com.pokerplayer

import com.pokerplayer.model.Hand
import com.pokerplayer.util.HandAnalyzer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import kotlin.test.assertEquals
import kotlin.test.assertFails

object HandAnalyzerSpek : Spek({
    given("a hand")
    {
        context("2h 2d 2c Kc Qd")
        {
            val hand = Hand.fromString("2h 2d 2c Kc Qd")
            on("analysis")
            {
                val results = HandAnalyzer.analyzeHand(hand)
                it("should be a three-of-a-kind")
                {
                    assertEquals(results, "three-of-a-kind")
                }
            }
        }
        context("2h 5h 7d 8c 9s")
        {
            val hand = Hand.fromString("2h 5h 7d 8c 9s")
            on("analysis")
            {
                val results = HandAnalyzer.analyzeHand(hand)
                it("should be a high-card")
                {
                    assertEquals(results, "high-card")
                }
            }
        }
        context("Ah 2d 3c 4c 5d")
        {
            val hand = Hand.fromString("Ah 2d 3c 4c 5d")
            on("analysis")
            {
                val results = HandAnalyzer.analyzeHand(hand)
                it("should be a straight")
                {
                    assertEquals(results, "straight")
                }
            }
        }
        context("2h 3h 2d 3c 3d")
        {
            val hand = Hand.fromString("2h 3h 2d 3c 3d")
            on("analysis")
            {
                val results = HandAnalyzer.analyzeHand(hand)
                it("should be a full-house")
                {
                    assertEquals(results, "full-house")
                }
            }
        }
        context("2h 7h 2d 3c 3d")
        {
            val hand = Hand.fromString("2h 7h 2d 3c 3d")
            on("analysis")
            {
                val results = HandAnalyzer.analyzeHand(hand)
                it("should be a two-pair")
                {
                    assertEquals(results, "two-pair")
                }
            }
        }
        context("2h 7h 7d 7c 7s")
        {
            val hand = Hand.fromString("2h 7h 7d 7c 7s")
            on("analysis")
            {
                val results = HandAnalyzer.analyzeHand(hand)
                it("should be a four-of-a-kind")
                {
                    assertEquals(results, "four-of-a-kind")
                }
            }
        }
        context("Th Jh Qh Kh Ah")
        {
            val hand = Hand.fromString("Th Jh Qh Kh Ah")
            on("analysis")
            {
                val results = HandAnalyzer.analyzeHand(hand)
                it("should be a straight-flush")
                {
                    assertEquals(results, "straight-flush")
                }
            }
        }
        context("4h 4s Ks 5d Ts")
        {
            val hand = Hand.fromString("4h 4s Ks 5d Ts")
            on("analysis")
            {
                val results = HandAnalyzer.analyzeHand(hand)
                it("should be a one-pair")
                {
                    assertEquals(results, "one-pair")
                }
            }
        }
        context("Qc Tc 7c 6c 4c")
        {
            val hand = Hand.fromString("Qc Tc 7c 6c 4c")
            on("analysis")
            {
                val results = HandAnalyzer.analyzeHand(hand)
                it("should be a flush")
                {
                    assertEquals(results, "flush")
                }
            }
        }
        context("an invalid hand")
        {
            on("creation?")
            {
                it("should be invalid")
                {
                    assertFails { Hand.fromString("Ah Ah 7c 6c 4c") }
                }
            }
        }
    }
})
