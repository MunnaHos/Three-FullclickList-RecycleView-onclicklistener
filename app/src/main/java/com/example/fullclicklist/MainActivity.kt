package com.example.fullclicklist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(),OnclickListener {

    lateinit var title:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      title = arrayOf(
          getString(R.string.txt),
          getString(R.string.txt2),
          getString(R.string.txt3),
          getString(R.string.txt4),
          getString(R.string.txt5),
          getString(R.string.txt6),
          getString(R.string.txt7),
          getString(R.string.txt8),
          getString(R.string.txt9),
          getString(R.string.txt10),
          getString(R.string.txt11)

        )
        val rcView= findViewById<RecyclerView>(R.id.rcView)

        val adapter = Adapter(list,this)
        val lm = LinearLayoutManager(this)

        rcView.adapter=adapter
        rcView.layoutManager=lm

    }

    override fun imageClick(position: Int) {
        val intent= Intent(this,ShowActivity::class.java)
        intent.putExtra("image", list[position].Image)
        intent.putExtra("title", title[position])
        intent.putExtra("price", list[position].price)
        startActivity(intent)
    }
}