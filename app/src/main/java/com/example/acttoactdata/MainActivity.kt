package com.example.acttoactdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toActivity(view:View){
        var intent: Intent = Intent(this,otherActivty::class.java)
        intent.putExtra("name","Shoaib")
        intent.putExtra("Age",21)
        startActivity(intent)

    }
}