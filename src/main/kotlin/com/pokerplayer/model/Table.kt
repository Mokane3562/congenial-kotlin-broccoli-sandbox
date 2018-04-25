package com.pokerplayer.model

import com.pokerplayer.util.Deck
import com.pokerplayer.util.TableConfig

open class Table(val settings: TableConfig, val deck: Deck, val players: List<Player>) {
    enum class Type {
        HOLDEM,
        OMAHA
    }
}
