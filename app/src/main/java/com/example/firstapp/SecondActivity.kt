package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.firstapp.databinding.ActivitySecondaryBinding

class SecondActivity : AppCompatActivity(), View.OnClickListener  {
    private lateinit var binding : ActivitySecondaryBinding
    private lateinit var sp: MyPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondaryBinding.inflate(layoutInflater)
        sp = MyPreferences(applicationContext)

        setContentView(binding.root)

        binding.generateButton.setOnClickListener(this)
        binding.helloMessage.text = "Olá, ${sp.getString("input")}!"
    }

    override fun onClick(v: View) {
        if(v.id == binding.generateButton.id) {
            Toast.makeText(applicationContext, "text", Toast.LENGTH_SHORT).show()
        }
    }
}