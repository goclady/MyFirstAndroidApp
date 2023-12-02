package com.example.myfirstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var createNAButton: Button = findViewById(R.id.createNew)

        createNAButton.setOnClickListener {

            var i = Intent(this, CreateNewAccountActivity:: class.java)

            this.startActivity(i)


        }

    }
}