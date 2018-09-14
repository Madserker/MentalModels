package com.example.sergi.mentalmodels

import android.provider.Settings.Global.getString

class StateMachineTest2() : StateMachineTest{
    override var state : String = "B"
    override var image : String = Constants.test2_B_image
    override var text : String = Constants.test2_B_text
    override var answer1: String = Constants.test2_B_answer1
    override var answer2: String = Constants.test2_B_answer2
    override var answer3: String = Constants.test2_B_answer3

    override fun option1(){
        if(state=="B"){
            changeToC()
        }
        else if(state=="C"){
            changeToE()
        }
        else if(state=="D"){
            changeToE()
        }
        else if(state=="E"){
            changeToH()
        }
        else if(state=="F"){
            changeToJ()
        }
        else if(state=="G"){
            changeToK()
        }
        else if(state=="I"){
            changeToH()
        }
        else if(state=="L"){
            changeToJ()
        }
        else if(state=="M"){
            changeToN()
        }
        else if(state=="N"){
            changeToP()
        }
        else if(state=="O"){
            changeToH()
        }

    }
    override fun option2(){
        if(state=="B"){
            changeToD()
        }
        else if(state=="C"){
            changeToF()
        }
        else if(state=="D"){
            changeToG()
        }
        else if(state=="E"){
            changeToI()
        }
        else if(state=="F"){
            changeToI()
        }
        else if(state=="G"){
            changeToL()
        }
        else if(state=="I"){
            changeToM()
        }
        else if(state=="L"){
            changeToM()
        }
        else if(state=="M"){
            changeToO()
        }
        else if(state=="N"){
            changeToO()
        }
        else if(state=="O"){
            changeToQ()
        }
        else if(state=="Q"){
            changeToJ()
        }
    }
    override fun option3(){
        if(state=="B"){
            changeToD()
        }
        else if(state=="F"){
            changeToG()
        }
        else if(state=="G"){
            changeToJ()
        }
    }


    fun changeToB(){
        state = "B"
        image = Constants.test2_B_image
        text  = Constants.test2_B_text
        answer1 = Constants.test2_B_answer1
        answer2 = Constants.test2_B_answer2
        answer3 = Constants.test2_B_answer3
    }
    fun changeToC(){
        state = "C"
        image = Constants.test2_C_image
        text  = Constants.test2_C_text
        answer1 = Constants.test2_C_answer1
        answer2 = Constants.test2_C_answer2
        answer3 = Constants.test2_C_answer3
    }
    fun changeToD(){
        state = "D"
        image = Constants.test2_D_image
        text  = Constants.test2_D_text
        answer1 = Constants.test2_D_answer1
        answer2 = Constants.test2_D_answer2
        answer3 = Constants.test2_D_answer3
    }
    fun changeToE(){
        state = "E"
        image = Constants.test2_E_image
        text  = Constants.test2_E_text
        answer1 = Constants.test2_E_answer1
        answer2 = Constants.test2_E_answer2
        answer3 = Constants.test2_E_answer3
    }
    fun changeToF(){
        state = "F"
        image = Constants.test2_F_image
        text  = Constants.test2_F_text
        answer1 = Constants.test2_F_answer1
        answer2 = Constants.test2_F_answer2
        answer3 = Constants.test2_F_answer3
    }
    fun changeToG(){
        state = "G"
        image = Constants.test2_G_image
        text  = Constants.test2_G_text
        answer1 = Constants.test2_G_answer1
        answer2 = Constants.test2_G_answer2
        answer3 = Constants.test2_G_answer3
    }
    fun changeToH(){
        state = "H"
        image = Constants.test2_H_image
        text  = Constants.test2_H_text
        answer1 = Constants.test2_H_answer1
        answer2 = Constants.test2_H_answer2
        answer3 = Constants.test2_H_answer3
    }
    fun changeToI(){
        state = "I"
        image = Constants.test2_I_image
        text  = Constants.test2_I_text
        answer1 = Constants.test2_I_answer1
        answer2 = Constants.test2_I_answer2
        answer3 = Constants.test2_I_answer3
    }
    fun changeToJ(){
        state = "J"
        image = Constants.test2_J_image
        text  = Constants.test2_J_text
        answer1 = Constants.test2_J_answer1
        answer2 = Constants.test2_J_answer2
        answer3 = Constants.test2_J_answer3
    }
    fun changeToK(){
        state = "K"
        image = Constants.test2_K_image
        text  = Constants.test2_K_text
        answer1 = Constants.test2_K_answer1
        answer2 = Constants.test2_K_answer2
        answer3 = Constants.test2_K_answer3
    }
    fun changeToL(){
        state = "L"
        image = Constants.test2_L_image
        text  = Constants.test2_L_text
        answer1 = Constants.test2_L_answer1
        answer2 = Constants.test2_L_answer2
        answer3 = Constants.test2_L_answer3
    }
    fun changeToM(){
        state = "M"
        image = Constants.test2_M_image
        text  = Constants.test2_M_text
        answer1 = Constants.test2_M_answer1
        answer2 = Constants.test2_M_answer2
        answer3 = Constants.test2_M_answer3
    }
    fun changeToN(){
        state = "N"
        image = Constants.test2_N_image
        text  = Constants.test2_N_text
        answer1 = Constants.test2_N_answer1
        answer2 = Constants.test2_N_answer2
        answer3 = Constants.test2_N_answer3
    }
    fun changeToO(){
        state = "O"
        image = Constants.test2_O_image
        text  = Constants.test2_O_text
        answer1 = Constants.test2_O_answer1
        answer2 = Constants.test2_O_answer2
        answer3 = Constants.test2_O_answer3
    }
    fun changeToP(){
        state = "P"
        image = Constants.test2_P_image
        text  = Constants.test2_P_text
        answer1 = Constants.test2_P_answer1
        answer2 = Constants.test2_P_answer2
        answer3 = Constants.test2_P_answer3
    }
    fun changeToQ(){
        state = "Q"
        image = Constants.test2_Q_image
        text  = Constants.test2_Q_text
        answer1 = Constants.test2_Q_answer1
        answer2 = Constants.test2_Q_answer2
        answer3 = Constants.test2_Q_answer3
    }











}