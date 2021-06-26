package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var  iv_dice:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBtn=findViewById<Button>(R.id.btn_Roll)
        rollBtn.setOnClickListener {
            rollDice()
        }
        iv_dice=findViewById(R.id.iv_dice)
    }

    private fun rollDice() {

        val rondomNumber= Random().nextInt(6)+1
        val drawableResource=when(rondomNumber){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else
                ->R.drawable.dice_6
        }
        iv_dice.setImageResource(drawableResource)
    }
}