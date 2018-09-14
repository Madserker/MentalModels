package com.example.sergi.mentalmodels.View

import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sergi.mentalmodels.*
import kotlinx.android.synthetic.main.fragment_test_fragment1.*



class TestFragment1 (): Fragment() {

    lateinit var stateMachine : StateMachineTest;


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater?.inflate(R.layout.fragment_test_fragment1, container, false)!!
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (MainActivity.testNumber == 1){
            stateMachine = StateMachineTest1()
        }
        else if (MainActivity.testNumber == 2){
            stateMachine = StateMachineTest2()
        }
        else if (MainActivity.testNumber == 3){
            stateMachine = StateMachineTest3()
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
