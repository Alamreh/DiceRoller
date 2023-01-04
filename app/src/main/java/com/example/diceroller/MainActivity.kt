package com.example.diceroller

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import org.w3c.dom.Text
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll_btn=findViewById<Button>(R.id.btn_roll)
        val roll_image=findViewById<ImageView>(R.id.roll_image)
        val conatiner=findViewById<ConstraintLayout>(R.id.container)

        //ImageView imageViewIcon = (ImageView) listItem.findViewById(R.id.imageViewIcon);
      //  imageViewIcon.setColorFilter(getContext().getResources().getColor(R.color.blue));
        roll_btn.setOnClickListener(View.OnClickListener {
            val diceRange=1..6  //IntRange type
           val randomNumber=diceRange.random()
            print("Random Number: ${randomNumber}")
//            roll_number.text=randomNumber.toString()
            if(randomNumber==1|| randomNumber==5)
            {
                conatiner.setBackgroundColor(Color.parseColor("#ff1a1a"))

            }
            else if (randomNumber==2 || randomNumber==6)
            {
                conatiner.setBackgroundColor(Color.parseColor("#ffff00"))
            }
            else if (randomNumber==3)
            {
                conatiner.setBackgroundColor(Color.parseColor("#66ff66"))

            }
            else
            {
                conatiner.setBackgroundColor(Color.parseColor("#4db8ff"))
            }


            when (randomNumber){
                1-> roll_image.setImageResource(R.drawable.dice1)
                2-> roll_image.setImageResource(R.drawable.dice2)
                3-> roll_image.setImageResource(R.drawable.dice3)
                4-> roll_image.setImageResource(R.drawable.dice4)
                5-> roll_image.setImageResource(R.drawable.dice5)
                6-> roll_image.setImageResource(R.drawable.dice6)
            }

        })


    }
}