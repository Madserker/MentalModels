package com.example.sergi.mentalmodels

import android.provider.Settings.Global.getString

class StateMachineTest2() : StateMachineTest{
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
        else if(state=="D"){
            changeToG()
        }
        else if(state=="E"){
            changeToH()
        }
        else if(state=="F" || state=="G") {
            changeToI()
        }
        else if(state=="H"){
            changeToK()
        }
        else if(state=="I"){
            changeToJ()
        }
        else if(state=="J"){
            changeToL()
        }
        else if(state=="L"){
            changeToN()
        }
    }
    override fun option2(){
        if(state=="A"){
            changeToB()
        }
        else if(state=="B" || state=="C"){
            changeToD()
        }
        else if(state=="D"){
            changeToE()
        }
        else if(state=="E"||state=="F"){
            changeToG()
        }
        else if(state=="H"){
            changeToJ()
        }
        else if(state=="I" || state=="G"){
            changeToK()
        }
        else if(state=="J"){
            changeToM()
        }
        else if(state=="L"){
            changeToO()
        }
    }
    override fun option3(){
        if(state=="B"||state=="C"){
            changeToE()
        }
        else if(state=="F"){
            changeToD()
        }
        else if(state=="H"){
            changeToI()
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
    fun changeToG(){
        state = "G"
        image = Constants.test1_G_image
        text  = Constants.test1_G_text
        answer1 = Constants.test1_G_answer1
        answer2 = Constants.test1_G_answer2
        answer3 = Constants.test1_G_answer3
    }
    fun changeToH(){
        state = "H"
        image = Constants.test1_H_image
        text  = Constants.test1_H_text
        answer1 = Constants.test1_H_answer1
        answer2 = Constants.test1_H_answer2
        answer3 = Constants.test1_H_answer3
    }
    fun changeToI(){
        state = "I"
        image = Constants.test1_I_image
        text  = Constants.test1_I_text
        answer1 = Constants.test1_I_answer1
        answer2 = Constants.test1_I_answer2
        answer3 = Constants.test1_I_answer3
    }
    fun changeToJ(){
        state = "J"
        image = Constants.test1_J_image
        text  = Constants.test1_J_text
        answer1 = Constants.test1_J_answer1
        answer2 = Constants.test1_J_answer2
        answer3 = Constants.test1_J_answer3
    }
    fun changeToK(){
        state = "K"
        image = Constants.test1_K_image
        text  = Constants.test1_K_text
        answer1 = Constants.test1_K_answer1
        answer2 = Constants.test1_K_answer2
        answer3 = Constants.test1_K_answer3
    }
    fun changeToL(){
        state = "L"
        image = Constants.test1_L_image
        text  = Constants.test1_L_text
        answer1 = Constants.test1_L_answer1
        answer2 = Constants.test1_L_answer2
        answer3 = Constants.test1_L_answer3
    }
    fun changeToM(){
        state = "M"
        image = Constants.test1_M_image
        text  = Constants.test1_M_text
        answer1 = Constants.test1_M_answer1
        answer2 = Constants.test1_M_answer2
        answer3 = Constants.test1_M_answer3
    }
    fun changeToN(){
        state = "N"
        image = Constants.test1_N_image
        text  = Constants.test1_N_text
        answer1 = Constants.test1_N_answer1
        answer2 = Constants.test1_N_answer2
        answer3 = Constants.test1_N_answer3
    }
    fun changeToO(){
        state = "O"
        image = Constants.test1_O_image
        text  = Constants.test1_O_text
        answer1 = Constants.test1_O_answer1
        answer2 = Constants.test1_O_answer2
        answer3 = Constants.test1_O_answer3
    }











}