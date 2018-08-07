package com.example.sergi.mentalmodels

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.app.Fragment
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class TestFragment1 (): Fragment() {

    var state : String = "A"

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater?.inflate(R.layout.fragment_test_fragment1, container, false)!!
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (MainActivity.testNumber==1){
            this.view.setBackgroundResource(R.drawable.t1_s1)
            state = "A"
            //stateMachineTest1()
        }

    }

    fun stateMachineTest1(){


        while(state != "F1" || state != "F2" || state != "F3"){
            if(state == "A"){

            }

        }



    }
}
