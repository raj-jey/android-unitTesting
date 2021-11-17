package com.example.androidtestingassignment

import junit.framework.TestCase
import org.junit.Test
import org.junit.Assert.*

class TextActivityTest{

    @Test
    fun should_return_hello_world(){
        val textActivity = TextActivity()
        assertEquals("Hello World",textActivity.sayHello("World"))
    }

    @Test
    fun should_not_return_hello_world(){
        val textActivity = TextActivity()
        assertNotEquals("Hello World",textActivity.sayHello("Earth"))
    }
}