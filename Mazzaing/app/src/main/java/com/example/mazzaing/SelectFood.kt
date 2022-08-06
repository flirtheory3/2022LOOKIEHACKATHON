package com.example.mazzaing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_select_food.*

class SelectFood : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_food)

        koreanFoodButton.setOnClickListener {
            val intent = Intent(this@SelectFood, PostList::class.java)
            startActivity(intent)
        }

        westernFoodButton.setOnClickListener {
            val intent = Intent(this@SelectFood, PostListWestern::class.java)
            startActivity(intent)

        }

        chineseFoodButton.setOnClickListener {
            val intent = Intent(this@SelectFood, PostListChinese::class.java)
            startActivity(intent)
        }

        asianFoodButton.setOnClickListener {
            val intent = Intent(this@SelectFood, PostListAsian::class.java)
            startActivity(intent)
        }

        snack_barButton.setOnClickListener {
            val intent = Intent(this@SelectFood, PostListSnackbar::class.java)
            startActivity(intent)
        }

        dessertButton.setOnClickListener {
            val intent = Intent(this@SelectFood, PostListDessert::class.java)
            startActivity(intent)
        }
    }
}