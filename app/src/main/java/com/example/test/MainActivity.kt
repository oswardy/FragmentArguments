package com.example.test

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btnAbout)

        btn.setOnClickListener(){
            //call the aboutactivity
            //val intent : Intent = Intent(this, AboutActivity::class.java)

            //open google map
            //val geo = Uri.parse("geo: 3.1390, 101.6869")
            //val intent : Intent = Intent(Intent.ACTION_VIEW,geo)

            //share
            //val intent = Intent(Intent.ACTION_SEND)
            //intent.setType("text/plain")
            //intent.putExtra(Intent.EXTRA_TEXT,"hello")

            //phone call
            val tel= Uri.parse("tel:012345678")
            val intent: Intent = Intent(Intent.ACTION_DIAL,tel)

            startActivity(intent)
        }
    }
}