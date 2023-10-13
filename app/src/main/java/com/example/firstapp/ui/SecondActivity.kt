package com.example.firstapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.firstapp.R
import com.example.firstapp.databinding.ActivitySecondaryBinding
import com.example.firstapp.utils.Curiosities
import com.example.firstapp.utils.MyPreferences
import com.example.firstapp.viewModel.SecondViewModel

class SecondActivity : AppCompatActivity(), View.OnClickListener  {
    private lateinit var binding : ActivitySecondaryBinding
    private lateinit var sp: MyPreferences
    private lateinit var secondVM: SecondViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondaryBinding.inflate(layoutInflater)
        sp = MyPreferences(applicationContext)
        secondVM = ViewModelProvider(this)[SecondViewModel::class.java]

        setContentView(binding.root)

        binding.generateButton.setOnClickListener(this)
        this.setObserver()

        secondVM.setHelloText("${resources.getString(R.string.hello)}, ${sp.getString("input").trim()}!")
        this.onClickGenerateButton()
    }

    override fun onClick(v: View) {
        if(v.id == binding.generateButton.id) {
            this.onClickGenerateButton()
        }
    }

    private fun onClickGenerateButton() {
        if(binding.radio0.isChecked) {
            secondVM.setCuriosityText(Curiosities.getRandomDogCuriosity())
        } else if(binding.radio1.isChecked) {
            secondVM.setCuriosityText(Curiosities.getRandomCatCuriosity())
        }
    }

    private fun setObserver() {
        secondVM.curiosityText().observe(this) {
            binding.curiosity.text = it
        }

        secondVM.helloText().observe(this) {
            binding.helloMessage.text = it
        }
    }
}
