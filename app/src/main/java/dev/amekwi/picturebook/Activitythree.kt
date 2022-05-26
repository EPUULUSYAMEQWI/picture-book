package dev.amekwi.picturebook

import android.content.Intent
import android.graphics.Picture
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activitythree : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitythree)
        button=findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this,picturetwo::class.java )
            startActivity(intent )
        }
        button2=findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this,Activityfour::class.java )
            startActivity(intent )
        }
    }
}