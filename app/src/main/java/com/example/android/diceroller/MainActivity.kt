package com.example.android.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    // la variable sera initialisée avant d'être appelé
    lateinit var diceImage: ImageView;

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

        diceImage = findViewById(R.id.dice_image);
    }

    // Choisir la bonne ressource pouvant être dessinée en fonction de la valeur de randomInt
    private fun rollDice() {
        val randomInt = java.util.Random().nextInt(6) + 1;
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        // affecter la ressource drawableResource d’en haut à diceImage
        diceImage.setImageResource(drawableResource);
    }
}
