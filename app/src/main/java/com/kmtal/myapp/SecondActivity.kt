package com.kmtal.myapp

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kmtal.myapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var ScAct: ActivitySecondBinding
    private var say1 =0
    private var say2 =0
    private var sonuc =0


    override fun onCreate(savedInstanceState: Bundle?) {
        ScAct = ActivitySecondBinding.inflate(layoutInflater)
        val view = ScAct.root


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    fun toplam(view: View){
        say1=ScAct.editTextText2.text.toString().toInt()
        say2=ScAct.editTextText.text.toString().toInt()
        ScAct.textView2.setText("Sonuc: ${say1 + say2}")
    }
}