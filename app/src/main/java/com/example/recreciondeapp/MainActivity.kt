package com.example.recreciondeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.recreciondeapp.databinding.ActivityMainBinding
import java.sql.Time

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Timer()
        hideSystemUI()
    }
    fun Timer(){
        var time=5
        var timer=object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                time--
            }
            override fun onFinish() {
                startActivity(Intent(this@MainActivity,MainScreen::class.java))
            }
        }
        timer.start()
    }
    fun hideSystemUI(){
        //quita actionBar
        WindowCompat.setDecorFitsSystemWindows(window,false)
        //obtiene la ventana
        WindowInsetsControllerCompat(window, window.decorView).apply {
            //oculta los botones nferiores y actionbar
            hide(WindowInsetsCompat.Type.systemBars())
            //permite volver a la pantalla completa cuando se muestran los botones
            systemBarsBehavior= WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
        WindowInsetsControllerCompat(window,window.decorView).hide(WindowInsetsCompat.Type.systemBars())
    }
}