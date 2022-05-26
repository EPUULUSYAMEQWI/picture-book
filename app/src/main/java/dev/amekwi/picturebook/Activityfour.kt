package dev.amekwi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activityfour : AppCompatActivity() {
    lateinit var button4: Button
    lateinit var button5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activityfour)
        button4=findViewById(R.id.button4)
        button4.setOnClickListener {

        val intent = Intent(this,Activitythree::class.java )
        startActivity(intent )
    }
        button5=findViewById(R.id.button5)
        button5.setOnClickListener {

            val intent = Intent(this,Activityfive ::class.java )
            startActivity(intent )
        }
}
}