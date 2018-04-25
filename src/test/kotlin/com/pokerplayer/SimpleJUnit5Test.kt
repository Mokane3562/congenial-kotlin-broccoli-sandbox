package com.pokerplayer

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class SimpleJUnit5Test
{
    @Test
    @DisplayName("should print info about junit5 test")
    fun exampleTest()
    {
        println("JUnit 5 test")
    }
}
