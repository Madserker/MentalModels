package com.example.sergi.mentalmodels.View

import android.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.sergi.mentalmodels.R

class Test() : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        var fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container, TestFragment1())
        //fragmentTransaction.add(R.id.container, TestFragment2())
        fragmentTransaction.commit()


    }
}
