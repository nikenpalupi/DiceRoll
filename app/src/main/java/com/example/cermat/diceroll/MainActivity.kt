package com.example.cermat.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            setIdentity()
        }
    }

    fun setIdentity(){
        val name: TextView = findViewById(R.id.nama)
        val NIM: TextView = findViewById(R.id.nim)
        val kls: TextView = findViewById(R.id.kelas)

        name.text = "Niken Palupi"
        NIM.text = "223307077"
        kls.text = "2C"
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView3)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}