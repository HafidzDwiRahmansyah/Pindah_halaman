package com.example.pindahhalaman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPindah = findViewById<Button>(R.id.pindah)

        buttonPindah.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}