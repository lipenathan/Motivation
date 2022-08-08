package com.github.lipenathan.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.bt_nova_frase).setOnClickListener({
            Toast.makeText(this, "Botão Clicado", LENGTH_LONG).show()
        })
        findViewById<TextView>(R.id.main_text).text = getString(R.string.ib)
        var b: Button
    }
}