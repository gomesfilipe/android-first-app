package com.example.firstapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondViewModel: ViewModel() {
    private var curiosityText = MutableLiveData<String>()
    private var helloText = MutableLiveData<String>()
    fun curiosityText(): LiveData<String> {
        return curiosityText
    }

    fun setCuriosityText(text: String) {
        curiosityText.value = text
    }

    fun helloText(): LiveData<String> {
        return helloText
    }

    fun setHelloText(text: String) {
        helloText.value = text
    }
}