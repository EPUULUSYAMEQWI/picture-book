package dev.amekwi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class picturetwo : AppCompatActivity() {
    lateinit var btntwo: Button
    lateinit var button3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picturetwo)
        btntwo=findViewById(R.id.btntwo)
        btntwo.setOnClickListener {
            val intent = Intent(this,MainActivity ::class.java )
            startActivity(intent )

        }
        btntwo=findViewById(R.id.btntwo)
        btntwo.setOnClickListener {
            val intent = Intent(this,Activitythree ::class.java )
            startActivity(intent )
    }
}
}