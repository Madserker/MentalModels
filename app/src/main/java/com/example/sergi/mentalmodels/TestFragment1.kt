package com.example.sergi.mentalmodels

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.app.Fragment
import android.content.Intent
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_test_fragment1.*



class TestFragment1 (): Fragment() {

    var stateMachine = StateMachineTest1()


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater?.inflate(R.layout.fragment_test_fragment1, container, false)!!
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (MainActivity.testNumber==1){
            stateMachine = StateMachineTest1()
        }
        stateMachineTest(stateMachine)

    }

    fun stateMachineTest(stateMachine : StateMachineTest){
        //this.view.setBackgroundResource(R.drawable.test1_a_image)//change
        var variableValue =  stateMachine.image
        this.view.setBackgroundResource(resources.getIdentifier(variableValue, "drawable", activity.packageName))
        textView1.text = stateMachine.text
        answer1.text = stateMachine.answer1
        answer2.text = stateMachine.answer2
        answer3.text = stateMachine.answer3


        button1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                stateMachine.option1()
                textView1.text = stateMachine.text
                answer1.text = stateMachine.answer1
                answer2.text = stateMachine.answer2
                answer3.text = stateMachine.answer3
                variableValue =  stateMachine.image
                view.setBackgroundResource(resources.getIdentifier(variableValue, "drawable", activity.packageName))
            }
        })

        button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                stateMachine.option2()
                textView1.text = stateMachine.text
                answer1.text = stateMachine.answer1
                answer2.text = stateMachine.answer2
                answer3.text = stateMachine.answer3
                variableValue =  stateMachine.image
                view.setBackgroundResource(resources.getIdentifier(variableValue, "drawable", activity.packageName))
            }
        })

        button3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                stateMachine.option3()
                textView1.text = stateMachine.text
                answer1.text = stateMachine.answer1
                answer2.text = stateMachine.answer2
                answer3.text = stateMachine.answer3
                variableValue =  stateMachine.image
                view.setBackgroundResource(resources.getIdentifier(variableValue, "drawable", activity.packageName))
            }
        })




    }
}
