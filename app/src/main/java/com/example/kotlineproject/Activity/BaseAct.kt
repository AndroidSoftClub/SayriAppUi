package com.example.kotlineproject.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlineproject.R

open class BaseAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }

    open fun tos(msg : String){
        Toast.makeText(this, "Its a toast!", Toast.LENGTH_SHORT).show()
    }
}