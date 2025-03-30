package com.example.comeat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val liste_Repas : Button = findViewById(R.id.listeRepas)
        liste_Repas.setOnClickListener{
            val intent = Intent( this , RepasActivity::class.java )
            startActivity( intent )
        }
        val select_Date : Button = findViewById(R.id.selectDate)
        select_Date.setOnClickListener{
            val intent = Intent( this , RechercheRepasActivity::class.java )
            startActivity( intent )
        }
    }
}