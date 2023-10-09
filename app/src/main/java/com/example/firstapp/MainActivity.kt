package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import com.example.firstapp.databinding.ActivityMainBinding
import com.example.firstapp.utils.MyPreferences

class MainActivity : AppCompatActivity(), View.OnClickListener, TextWatcher {
    private lateinit var binding : ActivityMainBinding
    private lateinit var sp: MyPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        sp = MyPreferences(applicationContext)

        setContentView(binding.root)

        binding.button.setOnClickListener(this)
        binding.input.addTextChangedListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            binding.button.id -> this.onClickButton()
            else -> {
                val text: String = "Evento de click não tratado."
                Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun onClickButton() {
        if(sp.getString("input").isEmpty()) {
            val text: String = "Digite seu nome para continuar."
            Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
        } else {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun afterTextChanged(p0: Editable?) {}

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        sp.setString("input", s.toString())
    }
}
