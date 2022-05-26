package dev.amekwi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnone:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnone=findViewById(R.id.btnone)
        btnone.setOnClickListener {
            val intent =Intent(this,picturetwo::class.java )
            startActivity(intent )
        }
    }
}