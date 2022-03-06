package me.twinkle.chatapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {

    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var buttonLogin: Button
    private lateinit var btnSignup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtEmail = findViewById(R.id.email)
        edtPassword = findViewById(R.id.password)
        btnSignup = findViewById(R.id.button_signup)
        buttonLogin = findViewById(R.id.button_login)

        btnSignup.setOnClickListener(){
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }
}