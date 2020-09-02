package com.example.github.homework

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.LogPrinter
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TableLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_homework.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.table_item.*
import kotlinx.android.synthetic.main.table_item.view.*

import java.util.*

class MainActivity : AppCompatActivity() {

    var arr = mutableSetOf("Chinese","Hamburger","Pizza","American","Mexican")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework)

    }
//
//    fun ChangeFood(view : View){
//        tv_title.text = arr.random()
//        startActivity(Intent(this,HomeWork3::class.java))
//
//    }
//
//    fun AddFood(view: View){
//        et_food.text?.let {
//            arr.add(it.toString())
//        }
//    }


    fun addTable(view : View) {
        val layout: View = LayoutInflater.from(applicationContext)
            .inflate(R.layout.table_item, null) //布局打气筒获取单行对象
        layout.tx_version.text = et_version.text.toString()
        layout.tx_code.text = et_code.text.toString()
        tab_layout.addView(layout)
    }

}




