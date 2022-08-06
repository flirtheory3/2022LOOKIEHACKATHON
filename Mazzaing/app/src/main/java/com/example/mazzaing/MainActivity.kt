package com.example.mazzaing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seoul_btn.setOnClickListener {
            val intent = Intent(this@MainActivity, SelectFood::class.java)
            startActivity(intent)
        }
    }
}