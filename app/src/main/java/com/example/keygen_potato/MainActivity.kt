package com.example.keygen_potato
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import kotlin.random.Random
import kotlin.random.nextInt


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val senha_ger = findViewById<TextView>(R.id.senha_gerada)
        val b_gerar = findViewById<ImageButton>(R.id.gerar_key)
        val b_ncaracter = findViewById<Button>(R.id.capturar_caracter)
        var input_ncaracter = findViewById<TextInputEditText>(R.id.n_caracter)
        var numero_car = 0

        b_ncaracter.setOnClickListener {
            val texto: String = input_ncaracter.text.toString()
            numero_car = texto.toInt()

        }
        b_gerar.setOnClickListener {
            val alfabeto = arrayOf(
                "A","B","C","D","E","F","G","H",
                "I","J","K","L","M","N","O","P",
                "Q","R","S","T","U","V","W","X",
                "Y","Z"
            )
            val car_especial = arrayOf(
                "!","@","#","$","%","&","*","_"
            )
            var senha_final = ""
            for (i in 1..numero_car){
                var letra_random = alfabeto.random()
                var letra_random2 = alfabeto.random()
                var especial_random = car_especial.random()
                var especial_random2 = car_especial.random()
                var formado = arrayOf(letra_random,letra_random2,especial_random,especial_random2)
                senha_final += formado.random()

            }
            println("passei aqui huuuuu")
            senha_ger.text = "$senha_final"

        }

    }
}