package com.example.github.homework

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.LogPrinter
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var arr = mutableSetOf("Chinese","Hamburger","Pizza","American","Mexican")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun ChangeFood(view : View){
        tv_title.text = arr.random()
    }

    fun AddFood(view: View){
        et_food.text?.let {
            arr.add(it.toString())
        }
    }
}




