package com.pokerplayer.model

import com.pokerplayer.util.Deck
import com.pokerplayer.util.TableConfig

data class Table(val settings: TableConfig, val deck: Deck, val players: List<Player>)
