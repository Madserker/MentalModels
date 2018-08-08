package com.example.sergi.mentalmodels

import android.provider.Settings.Global.getString

class StateMachineTest1() : StateMachineTest{
    override var state : String = "A"
    override var image : String = Constants.test1_A_image
    override var text : String = Constants.test1_A_text
    override var answer1: String = Constants.test1_A_answer1
    override var answer2: String = Constants.test1_A_answer2
    override var answer3: String = Constants.test1_A_answer3

    override fun option1(){
        if(state=="A"){
            state = "B"
            image = Constants.test1_B_image
            text  = Constants.test1_B_text
            answer1 = Constants.test1_B_answer1
            answer2 = Constants.test1_B_answer2
            answer3 = Constants.test1_B_answer3
        }
        else if(state=="B"){


        }
    }
    override fun option2(){
        if(state=="A"){

        }
        else if(state=="B"){

        }
    }
    override fun option3(){
        if(state=="A"){

        }
        else if(state=="B"){

        }
    }


}