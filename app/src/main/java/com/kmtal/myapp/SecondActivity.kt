package com.kmtal.myapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kmtal.myapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var ScAct: ActivitySecondBinding
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
}