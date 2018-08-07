package com.example.sergi.mentalmodels

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.app.Fragment
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class TestFragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater?.inflate(R.layout.fragment_test_fragment1, container, false)!!
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.view.setBackgroundResource(R.drawable.t1_s1)



    }
}
