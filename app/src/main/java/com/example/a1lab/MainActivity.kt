package com.example.a1lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userData: EditText = findViewById(R.id.user_data)
        val button: Button = findViewById(R.id.button)
        val listView: ListView = findViewById(R.id.listView)

        val todos: MutableList<String> = mutableListOf()
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, todos)
        listView.adapter = adapter

        button.setOnClickListener{
            val text = userData.text.toString().trim()
            if(text != "")
                adapter.insert(text, 0)


        }
    }
}