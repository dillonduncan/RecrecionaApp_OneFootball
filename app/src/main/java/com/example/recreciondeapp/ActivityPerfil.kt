package com.example.recreciondeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recreciondeapp.databinding.ActivityMainBinding
import com.example.recreciondeapp.databinding.ActivityPerfilBinding

class ActivityPerfil : AppCompatActivity() {
    lateinit var binding:ActivityPerfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            LYPartidos.setOnClickListener { CambiarPartido() }
            imgPartidos.setOnClickListener { CambiarPartido() }
            LYinicio.setOnClickListener { CambiarInicio() }
            imgInicio.setOnClickListener { CambiarInicio() }
        }
    }
    fun CambiarInicio(){
        startActivity(Intent(this,MainScreen::class.java))
    }
    fun CambiarPartido(){
        startActivity(Intent(this,MainActivityPartido::class.java))
    }
}