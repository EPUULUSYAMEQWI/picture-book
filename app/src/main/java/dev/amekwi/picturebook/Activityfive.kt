package dev.amekwi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activityfive : AppCompatActivity() {
    lateinit var btnback:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activityfive)
        btnback=findViewById(R.id.btnback)
        btnback.setOnClickListener {
            val intent = Intent(this,Activityfour  ::class.java )
            startActivity(intent )
        }
    }
}