package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var contador:String = "0"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numberText =findViewById<TextView>(R.id.number)


        // RECOGER BOTONES
        val boton0: Button =findViewById<Button>(R.id.tec0)
        val boton1: Button =findViewById<Button>(R.id.tec1)
        val boton2: Button =findViewById<Button>(R.id.tec2)
        val boton3: Button =findViewById<Button>(R.id.tec3)
        val boton4: Button =findViewById<Button>(R.id.tec4)
        val boton5: Button =findViewById<Button>(R.id.tec5)
        val boton6: Button =findViewById<Button>(R.id.tec6)
        val boton7: Button =findViewById<Button>(R.id.tec7)
        val boton8: Button =findViewById<Button>(R.id.tec8)
        val boton9: Button =findViewById<Button>(R.id.tec9)
        val botonPoint: Button =findViewById<Button>(R.id.tecPoint)
        val botonMax: Button =findViewById<Button>(R.id.tecMax)
        val botonMin: Button =findViewById<Button>(R.id.tecMin)
        val botonDiv: Button =findViewById<Button>(R.id.tecDiv)
        val botonIntro: Button =findViewById<Button>(R.id.tecIntro)
        val botonMul: Button =findViewById<Button>(R.id.tecMul)
        val botonAC: Button =findViewById<Button>(R.id.tecAC)
//

        //EVENTO
        boton1.setOnClickListener{
            numberText.text=  "1"
            contador = "1"
        }
        boton2.setOnClickListener{
            numberText.text=  "2"
            contador = "2"
        }
        boton3.setOnClickListener{
            numberText.text=  "3"
            contador = "3"
        }
        boton4.setOnClickListener{
            numberText.text=  "4"
            contador = "4"
        }
        boton5.setOnClickListener{
            numberText.text=  "5"
            contador = "5"
        }
        boton6.setOnClickListener{
            numberText.text=  "6"
            contador = "6"

        }
        boton7.setOnClickListener{
            numberText.text=  "7"
            contador = "7"
        }
        boton8.setOnClickListener{
            numberText.text=  "8"
            contador = "8"
        }
        boton9.setOnClickListener{
            numberText.text=  "9"
            contador = "9"
        }
        boton0.setOnClickListener{
            numberText.text=  "0"
            contador = "0"
        }

        botonPoint.setOnClickListener{
            numberText.text=  "."
            contador = "."
        }
        botonMax.setOnClickListener{
            numberText.text=  "+"
            contador = "+"
        }
        botonMin.setOnClickListener { numberText.text = "-" }
        botonDiv.setOnClickListener{
            numberText.text=  "/"
            contador = "/"
        }
        botonIntro.setOnClickListener{
            numberText.setText(R.string.intro)
        }
        botonMul.setOnClickListener{
            numberText.text=  "*"
            contador = "*"
        }

        botonAC.setOnClickListener{
            numberText.setText(R.string.insNum)
        }



    }

    override fun onResume(){

        super.onResume()
        Log.d("Debug","onResume")
        val numberText: TextView = findViewById(R.id.number)
        numberText.text = contador.toString()
    }
    override fun onSaveInstanceState(outState: Bundle) {
// Save the user's current game state.
        outState?.run {
            putString("contador", contador)
        }
// Always call the superclass so it can save the view hierarchy.
        super.onSaveInstanceState(outState)
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        // Always call the superclass so it can restore the view hierarchy.
        super.onRestoreInstanceState(savedInstanceState)
        // Restore state members from saved instance.
        savedInstanceState?.run {
            contador = savedInstanceState.getString("contador", contador)
        }
    }
}