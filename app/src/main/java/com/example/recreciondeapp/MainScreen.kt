package com.example.recreciondeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recreciondeapp.databinding.ActivityMainBinding
import com.example.recreciondeapp.databinding.ActivityMainScreenBinding

class MainScreen : AppCompatActivity() {
    lateinit var binding:ActivityMainScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            LYPartidos.setOnClickListener { CambiarACTPartiddo() }
            txtPartidos.setOnClickListener { CambiarACTPartiddo() }
            imgPartidos.setOnClickListener { CambiarACTPartiddo() }
            lyPerfil.setOnClickListener { CambiarPerfil() }
            imgPerfil.setOnClickListener { CambiarPerfil() }
        }
    }
    fun CambiarACTPartiddo(){
        startActivity(Intent(this,MainActivityPartido::class.java))
    }
    fun CambiarPerfil(){
        startActivity(Intent(this,ActivityPerfil::class.java))
    }
}