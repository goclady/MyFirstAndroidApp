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

        var createNAButton: Button = findViewById(R.id.logNow)

        createNAButton.setOnClickListener {
            var g = Intent(this, SignUpActivity::class.java)

            startActivity(g)

        }
        var loginButton: Button = findViewById(R.id.logNow)

        val userName: EditText = findViewById(R.id.starter)
        val passWord: EditText = findViewById(R.id.pass)

        loginButton.setOnClickListener {
            val username = EditText.text.toString()
            val password = EditText.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter both username and password", Toast.LENGTH_SHORT).show()
            }

        if (validCredentials(username, password)) {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        }


    }

    private fun validCredentials(username: String, password: String): Boolean {

        return true

    }
}