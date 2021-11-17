package com.example.androidtestingassignment

import com.example.androidtestingassignment.operations.*
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert
import org.junit.Test


class OperationsActivityTest{

    @Test
    fun should_return_add_operation(){
        val operationsActivity = OperationsActivity()
        val operations: Operations = operationsActivity.getOperation("add")

        Assert.assertThat(operations, instanceOf(AddOperation::class.java))
    }

    @Test
    fun should_return_sub_operation(){
        val operationsActivity = OperationsActivity()
        val operations = operationsActivity.getOperation("subtract")

        Assert.assertThat(operations, instanceOf(SubOperation::class.java))
    }

    @Test
    fun should_return_multiply_operation(){
        val operationsActivity = OperationsActivity()
        val operations = operationsActivity.getOperation("multiply")

        Assert.assertThat(operations, instanceOf(MultiplyOperation::class.java))
    }

    @Test
    fun should_return_default_operation(){
        val operationsActivity = OperationsActivity()
        val operations = operationsActivity.getOperation("random")

        Assert.assertThat(operations, instanceOf(DefaultOperation::class.java))
    }
}
