package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/*
* This activity allows user to roll a dice and get a random result on the screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        // Create new Dice object with 6 sides then roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // find the id of the textView so the next line could put value to it
        val resultTextView: TextView = findViewById(R.id.textView)
        // put the result of converted string to the id resolved by the prev line
        resultTextView.text = diceRoll.toString()

        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll()

        val resultTextView2: TextView = findViewById(R.id.textView4)
        resultTextView2.text = diceRoll2.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
