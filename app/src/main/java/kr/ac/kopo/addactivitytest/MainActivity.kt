package kr.ac.kopo.addactivitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnMain = findViewById<Button>(R.id.btnMain)
        btnMain.setOnClickListener {
            var intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}