package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.firstapp.databinding.ActivitySecondaryBinding

class SecondActivity : AppCompatActivity()/*, View.OnClickListener*/  {
    private lateinit var binding : ActivitySecondaryBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(applicationContext, "text", Toast.LENGTH_SHORT).show()
        super.onCreate(savedInstanceState)
        binding = ActivitySecondaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.button.setOnClickListener(this)
    }

//    override fun onClick(v: View) {
//        // code
//    }
}