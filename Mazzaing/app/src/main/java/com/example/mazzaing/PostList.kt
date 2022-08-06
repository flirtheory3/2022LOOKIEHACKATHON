package com.example.mazzaing

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_post_list.*
import kotlinx.android.synthetic.main.activity_post_list.mazzainglogo
import kotlinx.android.synthetic.main.list_model.view.*

class PostList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_list)

        mazzainglogo.setOnClickListener{
            val intent = Intent(this@PostList, MainActivity::class.java)
            startActivity(intent)
        }

        //테스트용 배열
        val postList = ArrayList<PostDataOnList>()
        for (i in 0 until 10){
            postList.add(PostDataOnList("" + i + " title",""+i+"일", ""+i+"번째 유저") )
        }

        val adapter = ListAdapter(postList, LayoutInflater.from(this@PostList))
        koreanfoodListView.adapter = adapter
        //////
        koreanfoodListView.setOnItemClickListener {parent, view, position, id ->
            val intent2 = Intent(this@PostList, PostRead::class.java)
            startActivity(intent2)
        }
    }
}

class ListAdapter(
    //할당된 데이터 자리
    val postList: ArrayList<PostDataOnList>,
    val layoutInflater : LayoutInflater) : BaseAdapter(){
    override fun getCount(): Int {
        return postList.size
    }

    override fun getItem(p0: Int): Any {
        return postList.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = layoutInflater.inflate(R.layout.list_model, null)
        //데이터 가져오기, 데이터 setText하기
        val title = view.findViewById<TextView>(R.id.title)
        val postDate = view.findViewById<TextView>(R.id.postDate)
        val name = view.findViewById<TextView>(R.id.name)

        title.setText(postList.get(p0).title)
        postDate.setText(postList.get(p0).postDate)
        name.setText(postList.get(p0).userName)

        return view
    }
}

class PostDataOnList(
    val title :String,
    val postDate:String,
    val userName:String
){
}
