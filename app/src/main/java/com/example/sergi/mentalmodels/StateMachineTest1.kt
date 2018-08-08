package com.example.sergi.mentalmodels

import android.provider.Settings.Global.getString

class StateMachineTest1() : StateMachineTest{
    override var state : String = "A"
    override var image : String = ""
    override var text : String = Constants.test1_A_text
    override var question : String = ""
    override var answer1: String = ""
    override var answer2: String = ""
    override var answer3: String = ""

    override fun option1(){
        if(state=="A"){
            state = "B"
            /*
            * image = ..
            * question = ..
            * answer1 = ..
            * */
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