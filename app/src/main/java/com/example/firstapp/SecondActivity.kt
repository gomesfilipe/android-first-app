package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.firstapp.databinding.ActivitySecondaryBinding
import com.example.firstapp.utils.Curiosities
import com.example.firstapp.utils.MyPreferences

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
        this.onClickGenerateButton()
    }

    override fun onClick(v: View) {
        if(v.id == binding.generateButton.id) {
//            Toast.makeText(applicationContext, "text", Toast.LENGTH_SHORT).show()
            this.onClickGenerateButton()
        }
    }

    private fun onClickGenerateButton() {
        if(binding.radio0.isChecked) {
            binding.curiosity.text = Curiosities.getRandomDogCuriosity()
        } else if(binding.radio1.isChecked) {
            binding.curiosity.text = Curiosities.getRandomCatCuriosity()
        }
    }
}