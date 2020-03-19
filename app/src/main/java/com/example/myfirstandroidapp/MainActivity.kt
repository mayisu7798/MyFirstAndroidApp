package com.example.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = listOf("Alexandre","Barbara","Catherine","Dorian","Emilie")
        val sorted_list = list.sortedBy { it.length }
        Log.d("list", sorted_list.toString())
        TextView2.setText(sorted_list.toString())
        Button.setOnClickListener { TextView.setText(sorted_list.random()) }
    }

}
