package com.example.navigationbarpractice.ui.notes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notes Fragment"
    }
    val text: LiveData<String> = _text

    private val _textTwo = MutableLiveData<String>().apply {
        value = "You don't have any note"
    }
    val textTwo: LiveData<String> = _textTwo
}