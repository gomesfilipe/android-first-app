package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if(v.id == binding.button.id) {
//            Toast.makeText(applicationContext, "text", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
