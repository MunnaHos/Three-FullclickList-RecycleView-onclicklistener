package com.example.fullclicklist

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        val image =findViewById<ImageView>(R.id.img)
        val name = findViewById<TextView>(R.id.name)
        val price = findViewById<TextView>(R.id.price)

        val bundle:Bundle?=intent.extras

        val txt= bundle!!.getString("title")
        val images = bundle.getInt("image")
        val prices= bundle.getString("price")

        image.setImageResource(images)
        name.text=txt
        price.text=prices


    }
}