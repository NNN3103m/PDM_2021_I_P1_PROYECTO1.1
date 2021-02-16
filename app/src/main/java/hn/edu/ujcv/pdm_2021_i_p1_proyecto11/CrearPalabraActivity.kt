package hn.edu.ujcv.pdm_2021_i_p1_proyecto11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_crear_palabra.*

class CrearPalabraActivity : AppCompatActivity() {
    var numero = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_palabra)
        btnGuardarPalabra.setOnClickListener{guardar()}
        btnAtrasInserte.setOnClickListener{onBackPressed()}
    }
    private fun guardar() {
        val dato = StringBuilder()
        numero = ""
        dato.append(txtPalabra.text.toString().trim()).append("|")
    }
}