package com.example.mazzaing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_post_list_snackbar.*
import kotlinx.android.synthetic.main.activity_post_list_snackbar.mazzainglogo


class PostListSnackbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_list_snackbar)

        mazzainglogo.setOnClickListener{
            val intent = Intent(this@PostListSnackbar, MainActivity::class.java)
            startActivity(intent)
        }

        //테스트용 배열
        val postList = ArrayList<PostDataOnList>()
        for (i in 0 until 10){
            postList.add(PostDataOnList("" + i + " title",""+i+"일", ""+i+"번째 유저") )
        }

        val adapter = ListAdapter(postList, LayoutInflater.from(this@PostListSnackbar))
        snackbarListView.adapter = adapter
        //////
        snackbarListView.setOnItemClickListener {parent, view, position, id ->
            val intent2 = Intent(this@PostListSnackbar, PostRead::class.java)
            startActivity(intent2)
        }
    }
}