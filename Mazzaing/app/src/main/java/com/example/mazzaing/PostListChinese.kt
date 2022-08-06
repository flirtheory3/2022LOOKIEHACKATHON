package com.example.mazzaing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_post_list_chinese.*


class PostListChinese : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_list_chinese)

        mazzainglogo.setOnClickListener{
            val intent = Intent(this@PostListChinese, MainActivity::class.java)
            startActivity(intent)
        }
    }
}