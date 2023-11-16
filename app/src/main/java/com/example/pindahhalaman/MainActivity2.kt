package com.example.pindahhalaman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttonPindah = findViewById<Button>(R.id.pindah)

        buttonPindah.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}