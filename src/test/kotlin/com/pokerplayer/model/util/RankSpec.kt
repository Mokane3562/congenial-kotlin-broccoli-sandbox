package com.pokerplayer.model.util

import com.pokerplayer.model.util.Rank
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions

object RankSpec : Spek({
    given("The enumeration of all ranks") {
        on("Checking broadway ranks") {
            it("Should find all cards less than 10 to not be broadway") {
                Assertions.assertFalse(Rank.NINE.isBroadway)
                Assertions.assertFalse(Rank.FIVE.isBroadway)
                Assertions.assertFalse(Rank.TWO.isBroadway)
            }
            it("Should find all cards 10 or greater to be broadway") {
                Assertions.assertTrue(Rank.TEN.isBroadway)
                Assertions.assertTrue(Rank.QUEEN.isBroadway)
                Assertions.assertTrue(Rank.ACE.isBroadway)
            }
        }

        on("Checking face values") {
            it("Should find all face valued cards to be face") {
                Assertions.assertTrue(Rank.JACK.isFace && Rank.QUEEN.isFace && Rank.KING.isFace)
            }
            it("Should find all number valued cards to be not face") {
                Assertions.assertFalse(Rank.TEN.isFace)
                Assertions.assertFalse(Rank.ACE.isFace)
            }
        }

        on("Getting the distance of a pair of cards") {
            it("Should find equal cards to have 0 distance") {
                Assertions.assertEquals(0, Rank.ACE.getDistance(Rank.ACE))
            }
            it("Find the correct distance value for all non-equal cards") {
                Assertions.assertEquals(1, Rank.ACE.getDistance(Rank.TWO))
                Assertions.assertEquals(5, Rank.SIX.getDistance(Rank.ACE))
                Assertions.assertEquals(3, Rank.JACK.getDistance(Rank.ACE))
                Assertions.assertEquals(11, Rank.KING.getDistance(Rank.TWO))
            }
        }

        on("Ordinal testing") {
            it("Should find that an ace is larger than a king") {
                Assertions.assertTrue(Rank.ACE > Rank.KING)
            }
        }
    }
})