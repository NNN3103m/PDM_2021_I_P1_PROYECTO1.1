package hn.edu.ujcv.pdm_2021_i_p1_proyecto11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCrearPalabra.setOnClickListener{crearPalabra()}
        btnAdivinarPalabra.setOnClickListener{adivinarPalabra()}
    }

    fun adivinarPalabra() {
        val intent = Intent(this, AdivinarPalabraActivity::class.java)
        startActivity(intent)
    }

    fun crearPalabra(){
        val intent = Intent(this, CrearPalabraActivity::class.java)
        startActivity(intent)
    }
}