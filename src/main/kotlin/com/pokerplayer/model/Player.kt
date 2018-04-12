package com.pokerplayer.model

data class Player(val name: String, val chips: Int, val pocket: Pair<Card, Card>)
