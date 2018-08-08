package com.example.sergi.mentalmodels

interface StateMachineTest {
    var state : String
    var image : String
    var text : String
    var question : String
    var answer1: String
    var answer2: String
    var answer3: String

    fun option1()
    fun option2()
    fun option3()
}