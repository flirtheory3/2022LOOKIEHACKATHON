package com.example.mazzaing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_createpost.*

class Createpost : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createpost)

        mazzainglogo.setOnClickListener{
            val intent = Intent(this@Createpost, MainActivity::class.java)
            startActivity(intent)
        }
    }
}