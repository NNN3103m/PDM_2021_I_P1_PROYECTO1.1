package hn.edu.ujcv.pdm_2021_i_p1_proyecto11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_adivinar_palabra.*

class AdivinarPalabraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adivinar_palabra)
        btnAtrasAdivinar.setOnClickListener{onBackPressed()}

        btnA.setOnClickListener{appendOnClick(true,"A")}
        btnB.setOnClickListener{appendOnClick(true,"B")}
        btnC.setOnClickListener{appendOnClick(true,"C")}
        btnD.setOnClickListener{appendOnClick(true,"D")}
        btnE.setOnClickListener{appendOnClick(true,"E")}
        btnF.setOnClickListener{appendOnClick(true,"F")}
        btnG.setOnClickListener{appendOnClick(true,"G")}
        btnH.setOnClickListener{appendOnClick(true,"H")}
        btnI.setOnClickListener{appendOnClick(true,"I")}
        btnJ.setOnClickListener{appendOnClick(true,"J")}
        btnK.setOnClickListener{appendOnClick(true,"K")}
        btnL.setOnClickListener{appendOnClick(true,"L")}
        btnÑ.setOnClickListener{appendOnClick(true,"M")}
        btnN.setOnClickListener{appendOnClick(true,"N")}
        btnÑ.setOnClickListener{appendOnClick(true,"Ñ")}
        btnO.setOnClickListener{appendOnClick(true,"O")}
        btnP.setOnClickListener{appendOnClick(true,"P")}
        btnQ.setOnClickListener{appendOnClick(true,"Q")}
        btnR.setOnClickListener{appendOnClick(true,"R")}
        btnS.setOnClickListener{appendOnClick(true,"S")}
        btnT.setOnClickListener{appendOnClick(true,"T")}
        btnU.setOnClickListener{appendOnClick(true,"U")}
        btnV.setOnClickListener{appendOnClick(true,"V")}
        btnW.setOnClickListener{appendOnClick(true,"W")}
        btnX.setOnClickListener{appendOnClick(true,"X")}
        btnY.setOnClickListener{appendOnClick(true,"Y")}
        btnZ.setOnClickListener{appendOnClick(true,"Z")}
    }
    private fun appendOnClick(limpiar:Boolean, texto: String){
        if (limpiar){
            wordTv.text = ""
            wordTv.append(texto)
        }
        else{
            wordTv.append(wordTv.text)
            wordTv.append(texto)
            wordTv.text = ""
        }
    }
}