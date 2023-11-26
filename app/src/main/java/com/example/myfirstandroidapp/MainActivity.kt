package com.example.myfirstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val joinButton: Button = this.findViewById(R.id.joinNowButton)

        joinButton.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)

            this.startActivity(intent)
        }
    }
}