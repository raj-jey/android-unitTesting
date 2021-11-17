package com.example.androidtestingassignment

import android.media.SubtitleData
import com.example.androidtestingassignment.operations.*

class OperationsActivity {

    fun getOperation(operatorText:String):Operations{
        var operation:Operations
        if(operatorText.equals("add")){
            operation = AddOperation()
        }
        else if(operatorText.equals("multiply")){
            operation = MultiplyOperation()
        }
        else if(operatorText.equals("subtract")){
            operation = SubOperation()
        }
        else{
            operation = DefaultOperation()
        }
        return operation
    }
}