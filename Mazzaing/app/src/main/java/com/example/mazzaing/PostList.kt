package com.example.mazzaing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_post_list.*

class PostList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_list)
        mazzainglogo.setOnClickListener{
            val intent = Intent(this@PostList, MainActivity::class.java)
            startActivity(intent)
        }
    }
}