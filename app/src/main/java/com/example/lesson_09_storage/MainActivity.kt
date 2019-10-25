package com.example.lesson_09_storage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Toast
import com.example.lesson_09_storage.handlers.SharedPreferences
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val pref = SharedPreferences(this);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // this button allow us to sava
        btnSave.setOnClickListener(View.OnClickListener {
            val k = editKey.text.toString()
            val v = editValue.text.toString()
            pref.save(k,v)
            Toast.makeText(this,
                "Data Stored", Toast.LENGTH_LONG).show()
        })

        // this button is allow us to load
        btn_Load.setOnClickListener(View.OnClickListener {
            val x = pref.getString(editKey.text.toString())
            editValue.text.replace(0,editValue.text.length, x)
            Toast.makeText(this,
                "Data Loaded", Toast.LENGTH_LONG).show()
        })

        // this button allow us to clear
        btnClear.setOnClickListener(View.OnClickListener {
            pref.clear()
            Toast.makeText(this,
                "Data Cleared", Toast.LENGTH_LONG).show()
        })
    }

}
