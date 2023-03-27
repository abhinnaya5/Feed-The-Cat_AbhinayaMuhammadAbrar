package com.example.feedthecat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inc_value = 0;
        val feed = findViewById<Button>(R.id.btn_feed)
        val dis_value = findViewById<TextView>(R.id.dis_value)

        feed.setOnClickListener(View.OnClickListener {
            inc_value++;
            dis_value.text = "Satiety : " +inc_value.toString()
        })

    }
}