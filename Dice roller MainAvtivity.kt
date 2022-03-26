package com.android.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView///performant and well-behaving app,
    // with high efficiency by store the dice ImageView in a field.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Assign button to a variable,
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's rolllll"
        //set onClickListener in order to know when the button is clicked.
        rollButton.setOnClickListener{
            //make the rollButton show a Toast message, once we know the button is functional. we don't need to Toast message no more.
            //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        //set a variable to randomly generate number from 1 to 6
        val randomInt = Random().nextInt(6) + 1
        //set a variable with image type to find different image
        val diceImage: ImageView = findViewById(R.id.dice_image)
        //use when to decide which image to show
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //assign the drawableResource from above to diceImage:
        diceImage.setImageResource(drawableResource)
    }

}
