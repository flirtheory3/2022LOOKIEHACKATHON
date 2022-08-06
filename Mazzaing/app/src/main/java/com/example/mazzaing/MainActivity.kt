package com.example.mazzaing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //각 버튼들의 intent를 통한 SelectFood로의 이동

        seoul_btn.setOnClickListener {
            val intent = Intent(this@MainActivity, SelectFood::class.java)
            startActivity(intent)
        }

        busan_btn.setOnClickListener {
            val intent = Intent(this@MainActivity, SelectFood::class.java)
            startActivity(intent)
        }

        kyeongki_btn.setOnClickListener {
            val intent = Intent(this@MainActivity, SelectFood::class.java)
            startActivity(intent)
        }

        kyeongsang_btn.setOnClickListener {
            val intent = Intent(this@MainActivity, SelectFood::class.java)
            startActivity(intent)
        }

        jeonla_btn.setOnClickListener {
            val intent = Intent(this@MainActivity, SelectFood::class.java)
            startActivity(intent)
        }

        chungcheong_btn.setOnClickListener {
            val intent = Intent(this@MainActivity, SelectFood::class.java)
            startActivity(intent)
        }

        jeju_btn.setOnClickListener {
            val intent = Intent(this@MainActivity, SelectFood::class.java)
            startActivity(intent)
        }

        gangwon_btn.setOnClickListener {
            val intent = Intent(this@MainActivity, SelectFood::class.java)
            startActivity(intent)
        }


    }
}