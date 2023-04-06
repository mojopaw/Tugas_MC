package com.example.tuags4_20411001

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val linkButton = findViewById<Button>(R.id.link_button)
        val url = "https://food.detik.com/kue/d-6469590/5-resep-kue-kering-klasik-natal-yang-jadi-favorit-sepanjang-masa/amp"
        linkButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }
}