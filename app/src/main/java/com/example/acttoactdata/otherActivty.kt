package com.example.acttoactdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class otherActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_activty)
        var getData = getIntent().getStringExtra("name")
        Toast.makeText(this,"Your name is :${getData}",Toast.LENGTH_SHORT).show()

    }
}