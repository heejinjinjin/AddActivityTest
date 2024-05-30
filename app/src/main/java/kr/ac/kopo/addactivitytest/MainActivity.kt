package kr.ac.kopo.addactivitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rg = findViewById<RadioGroup>(R.id.rg)
        var intent = Intent(applicationContext, SecondActivity::class.java)
        rg.check(R.id.radioSecond)

        var btnMain = findViewById<Button>(R.id.btnMain)
        rg.setOnCheckedChangeListener{group, checkedId ->
            btnMain.setOnClickListener {
                when(rg.checkedRadioButtonId){
                    R.id.radioSecond -> intent = Intent(this@MainActivity, SecondActivity::class.java)
                    R.id.radioThird ->  intent = Intent(this@MainActivity, ThirdActivity::class.java)
                }
                startActivity(intent)
            }
        }

    }
}