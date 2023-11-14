package com.example.recreciondeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recreciondeapp.databinding.ActivityMainBinding
import com.example.recreciondeapp.databinding.ActivityMainPartidoBinding

class MainActivityPartido : AppCompatActivity() {
    lateinit var binding: ActivityMainPartidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainPartidoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            //txtInicio.setOnClickListener { CambiarInicio() }
            imgInicio.setOnClickListener { CambiarInicio() }
            lyInicio.setOnClickListener { CambiarInicio() }
            lyPerfil.setOnClickListener { CambiarPerfil() }
            imgPerfil.setOnClickListener { CambiarPerfil() }
        }
    }
    fun CambiarInicio(){
        startActivity(Intent(this,ActivityMainBinding::class.java))
    }
    fun CambiarPerfil(){
        startActivity(Intent(this,ActivityPerfil::class.java))
    }
}