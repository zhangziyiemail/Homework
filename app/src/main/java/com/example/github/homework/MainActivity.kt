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
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.table_item.*
import kotlinx.android.synthetic.main.table_item.view.*

import java.util.*

class MainActivity : AppCompatActivity() {

    var arr = mutableSetOf("Chinese","Hamburger","Pizza","American","Mexican")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }
    fun signIn(view : View){

        Toast.makeText(this,"username is  ${et_username.text.toString()} password is ${et_password.text.toString()}",Toast.LENGTH_SHORT)
    }

    fun forgot(view : View){
        Toast.makeText(this,"forgot",Toast.LENGTH_SHORT)
    }

    fun CreatAccount(view : View){
        Toast.makeText(this,"creatAccoutn",Toast.LENGTH_SHORT)
    }
}




