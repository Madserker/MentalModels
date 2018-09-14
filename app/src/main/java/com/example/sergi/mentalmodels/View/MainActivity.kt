package com.example.sergi.mentalmodels.View

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sergi.mentalmodels.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        var testNumber : Int = 0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_test3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                testNumber = 1
                val intent = Intent(this@MainActivity.applicationContext, Test::class.java)
                startActivity(intent)

            }
        })
        btn_test2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                testNumber = 2
                val intent = Intent(this@MainActivity.applicationContext, Test::class.java)
                startActivity(intent)

            }
        })
        btn_test3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                testNumber = 3
                val intent = Intent(this@MainActivity.applicationContext, Test::class.java)
                startActivity(intent)

            }
        })
    }

}
