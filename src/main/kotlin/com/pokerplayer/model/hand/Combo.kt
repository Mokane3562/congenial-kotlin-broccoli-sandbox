package com.pokerplayer.model.hand

import com.pokerplayer.model.card.Rank


open class Combo (private val rank1: Rank, private val rank2: Rank, val isSuited: Boolean) {
    val isConnector: Boolean
        get() = rank1.getDistance(rank2) < 5

    val isPair: Boolean
        get() = rank1 == rank2

    val isBroadway: Boolean
        get() = rank1.isBroadway && rank2.isBroadway

    val isSuitedConnector: Boolean
        get() = isConnector && isSuited

    override fun toString(): String {
        return "Combo{" + rank1.id + rank2.id + (if (isSuited) 's' else if (isPair) "" else 'o') + '}'
    }
}