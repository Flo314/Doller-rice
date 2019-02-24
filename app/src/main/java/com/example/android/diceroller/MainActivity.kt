package com.example.android.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  findViewById : pour obtenir une référence au bouton et l'affecter à une variable
        val rollButton: Button = findViewById(R.id.roll_button);
        // Modifie dynamiquement la vue Bouton
        rollButton.text = "Lets Roll";

        // ajout d'un écouteru de click
        rollButton.setOnClickListener{
            //  obtenir un nombre aléatoire compris entre 1 et 6
            rollDice();
        }
    }

    // au click : obtenir un nombre aléatoire compris entre 1 et 6
    private fun rollDice() {
        val resultText : TextView = findViewById(R.id.result_text);
        val randomInt = java.util.Random().nextInt(6) + 1;
        resultText.text = randomInt.toString();
    }
}
