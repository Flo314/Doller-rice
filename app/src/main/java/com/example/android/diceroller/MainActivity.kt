package com.example.android.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

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
            // afficher par le bouton un message Toast.(3 args context, text, durée)
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
