package com.example.sergi.mentalmodels

import android.provider.Settings.Global.getString

class StateMachineTest3() : StateMachineTest{
    override var state : String = "A"
    override var image : String = Constants.test3_A_image
    override var text : String = Constants.test3_A_text
    override var answer1: String = Constants.test3_A_answer1
    override var answer2: String = Constants.test3_A_answer2
    override var answer3: String = Constants.test3_A_answer3

    override fun option1(){
        if(state=="A"){
            changeToB()
        }
        else if(state=="B"){
            changeToD()
        }
        else if(state=="C"){
            changeToG()
        }
        else if(state=="D"){
            changeToI()
        }
        else if(state=="F"){
            changeToI()
        }
        else if(state=="G"){
            changeToJ()
        }
        else if(state=="H"){
            changeToK()
        }
        else if(state=="I"){
            changeToL()
        }
        else if(state=="J"){
            changeToN()
        }
        else if(state=="K"){
            changeToI()
        }
        else if(state=="L"){
            changeToO()
        }
    }
    override fun option2(){
        if(state=="A"){
            changeToC()
        }
        else if(state=="B"){
            changeToE()
        }
        else if(state=="C"){
            changeToH()
        }
        else if(state=="D"){
            changeToE()
        }
        else if(state=="F"){
            changeToE()
        }
        else if(state=="G"){
            changeToK()
        }
        else if(state=="H"){
            changeToK()
        }
        else if(state=="I"){
            changeToM()
        }
        else if(state=="J"){
            changeToI()
        }
        else if(state=="K"){
            changeToE()
        }
        else if(state=="L"){
            changeToM()
        }
    }
    override fun option3(){
        if(state=="B"){
            changeToF()
        }
    }

    fun changeToA(){
        state = "A"
        image = Constants.test3_A_image
        text  = Constants.test3_A_text
        answer1 = Constants.test3_A_answer1
        answer2 = Constants.test3_A_answer2
        answer3 = Constants.test3_A_answer3
    }
    fun changeToB(){
        state = "B"
        image = Constants.test3_B_image
        text  = Constants.test3_B_text
        answer1 = Constants.test3_B_answer1
        answer2 = Constants.test3_B_answer2
        answer3 = Constants.test3_B_answer3
    }
    fun changeToC(){
        state = "C"
        image = Constants.test3_C_image
        text  = Constants.test3_C_text
        answer1 = Constants.test3_C_answer1
        answer2 = Constants.test3_C_answer2
        answer3 = Constants.test3_C_answer3
    }
    fun changeToD(){
        state = "D"
        image = Constants.test3_D_image
        text  = Constants.test3_D_text
        answer1 = Constants.test3_D_answer1
        answer2 = Constants.test3_D_answer2
        answer3 = Constants.test3_D_answer3
    }
    fun changeToE(){
        state = "E"
        image = Constants.test3_E_image
        text  = Constants.test3_E_text
        answer1 = Constants.test3_E_answer1
        answer2 = Constants.test3_E_answer2
        answer3 = Constants.test3_E_answer3
    }
    fun changeToF(){
        state = "F"
        image = Constants.test3_F_image
        text  = Constants.test3_F_text
        answer1 = Constants.test3_F_answer1
        answer2 = Constants.test3_F_answer2
        answer3 = Constants.test3_F_answer3
    }
    fun changeToG(){
        state = "G"
        image = Constants.test3_G_image
        text  = Constants.test3_G_text
        answer1 = Constants.test3_G_answer1
        answer2 = Constants.test3_G_answer2
        answer3 = Constants.test3_G_answer3
    }
    fun changeToH(){
        state = "H"
        image = Constants.test3_H_image
        text  = Constants.test3_H_text
        answer1 = Constants.test3_H_answer1
        answer2 = Constants.test3_H_answer2
        answer3 = Constants.test3_H_answer3
    }
    fun changeToI(){
        state = "I"
        image = Constants.test3_I_image
        text  = Constants.test3_I_text
        answer1 = Constants.test3_I_answer1
        answer2 = Constants.test3_I_answer2
        answer3 = Constants.test3_I_answer3
    }
    fun changeToJ(){
        state = "J"
        image = Constants.test3_J_image
        text  = Constants.test3_J_text
        answer1 = Constants.test3_J_answer1
        answer2 = Constants.test3_J_answer2
        answer3 = Constants.test3_J_answer3
    }
    fun changeToK(){
        state = "K"
        image = Constants.test3_K_image
        text  = Constants.test3_K_text
        answer1 = Constants.test3_K_answer1
        answer2 = Constants.test3_K_answer2
        answer3 = Constants.test3_K_answer3
    }
    fun changeToL(){
        state = "L"
        image = Constants.test3_L_image
        text  = Constants.test3_L_text
        answer1 = Constants.test3_L_answer1
        answer2 = Constants.test3_L_answer2
        answer3 = Constants.test3_L_answer3
    }
    fun changeToM(){
        state = "M"
        image = Constants.test3_M_image
        text  = Constants.test3_M_text
        answer1 = Constants.test3_M_answer1
        answer2 = Constants.test3_M_answer2
        answer3 = Constants.test3_M_answer3
    }
    fun changeToN(){
        state = "N"
        image = Constants.test3_N_image
        text  = Constants.test3_N_text
        answer1 = Constants.test3_N_answer1
        answer2 = Constants.test3_N_answer2
        answer3 = Constants.test3_N_answer3
    }
    fun changeToO(){
        state = "O"
        image = Constants.test3_O_image
        text  = Constants.test3_O_text
        answer1 = Constants.test3_O_answer1
        answer2 = Constants.test3_O_answer2
        answer3 = Constants.test3_O_answer3
    }











}