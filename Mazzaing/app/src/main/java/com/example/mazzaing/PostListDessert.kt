package com.example.mazzaing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_post_list_dessert.*
import kotlinx.android.synthetic.main.activity_post_list_dessert.mazzainglogo


class PostListDessert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_list_dessert)

        mazzainglogo.setOnClickListener{
            val intent = Intent(this@PostListDessert, MainActivity::class.java)
            startActivity(intent)
        }

        //테스트용 배열
        val postList = ArrayList<PostDataOnList>()
        for (i in 0 until 10){
            postList.add(PostDataOnList("" + i + " title",""+i+"일", ""+i+"번째 유저") )
        }

        val adapter = ListAdapter(postList, LayoutInflater.from(this@PostListDessert))
        dessertFoodListView.adapter = adapter
        //////
        dessertFoodListView.setOnItemClickListener {parent, view, position, id ->
            val intent2 = Intent(this@PostListDessert, PostRead::class.java)
            startActivity(intent2)
        }
    }
}