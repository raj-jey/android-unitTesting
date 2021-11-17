package com.example.androidtestingassignment

import junit.framework.TestCase
import org.junit.Test
import org.junit.Assert.*;

class AdditionActivityTest{

    @Test
    fun addition_for_two_positive_numbers(){
        val additionActivity = AdditionActivity()
        assertEquals(30,additionActivity.addNumbers(10,20))
    }

    @Test
    fun addition_for_two_negative_numbers(){
        val additionActivity = AdditionActivity()
        assertEquals(-30,additionActivity.addNumbers(-10,-20))
    }

    @Test
    fun addition_for_positive_and_negative_numbers(){
        val additionActivity = AdditionActivity()
        assertEquals(-10,additionActivity.addNumbers(10,-20))
    }
}