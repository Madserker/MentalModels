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
            changeToB()
        }
        else if(state=="B"){
            changeToC()
        }
        else if(state=="C"){
            changeToF()
        }
    }
    override fun option2(){
        if(state=="A"){
        }
        else if(state=="B" || state=="C"){
            changeToD()
        }
        else if(state=="D"){
            changeToE()
        }
    }
    override fun option3(){
        if(state=="A"){
        }
        else if(state=="B"||state=="C"){
            changeToE()
        }
    }

    fun changeToA(){
        state = "A"
        image = Constants.test1_A_image
        text  = Constants.test1_A_text
        answer1 = Constants.test1_A_answer1
        answer2 = Constants.test1_A_answer2
        answer3 = Constants.test1_A_answer3
    }
    fun changeToB(){
        state = "B"
        image = Constants.test1_B_image
        text  = Constants.test1_B_text
        answer1 = Constants.test1_B_answer1
        answer2 = Constants.test1_B_answer2
        answer3 = Constants.test1_B_answer3
    }
    fun changeToC(){
        state = "C"
        image = Constants.test1_C_image
        text  = Constants.test1_C_text
        answer1 = Constants.test1_C_answer1
        answer2 = Constants.test1_C_answer2
        answer3 = Constants.test1_C_answer3
    }
    fun changeToD(){
        state = "D"
        image = Constants.test1_D_image
        text  = Constants.test1_D_text
        answer1 = Constants.test1_D_answer1
        answer2 = Constants.test1_D_answer2
        answer3 = Constants.test1_D_answer3
    }
    fun changeToE(){
        state = "E"
        image = Constants.test1_E_image
        text  = Constants.test1_E_text
        answer1 = Constants.test1_E_answer1
        answer2 = Constants.test1_E_answer2
        answer3 = Constants.test1_E_answer3
    }
    fun changeToF(){
        state = "F"
        image = Constants.test1_F_image
        text  = Constants.test1_F_text
        answer1 = Constants.test1_F_answer1
        answer2 = Constants.test1_F_answer2
        answer3 = Constants.test1_F_answer3
    }


}