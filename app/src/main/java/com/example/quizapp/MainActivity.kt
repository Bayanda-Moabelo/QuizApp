package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

//Import necessary Android and Kotlin classes
class MainActivity : AppCompatActivity() {

    //The onCreate()method is the entry point when this activity is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //I learnt this in class

//https://youtu.be/kNghEbknLs8?si=d-n1N7KcjrOPNQBM

//https://youtu.be/pXZR0QiwvrU?si=7ts2NcFRZaYdLHTQ

//https://youtu.be/W7IOCRIEKUQ?si=ous08K0il3RbWNIn

//https://youtu.be/PsiUw43qoQ0?si=WE-AuxMWPfs31Llm

//https://youtu.be/9aoUe0gPljY?si=D2l2NhmGWiAbIhmc

//https://youtu.be/6DH7rkXaXpw?si=4cOoquiWRzNqOXGP

//https://youtu.be/22IRpgUfv3k?si=_V2CiR-Vt-XsgxHZ

//https://youtu.be/yLZfyTZEivA?si=EQcJVMrQ_BwGKpJ5

//https://youtu.be/KEaAL6xsTNM?si=NDIzKNdaKznuMZsV

//https://youtu.be/tloFc8yarBA?si=t1qihjDc6HxuRuZ5


        //Find and link UI elements from the XML layout using their ID's
        val welcomeMessage = findViewById<TextView>(R.id.welcome_message)
        val appDescription = findViewById<TextView>(R.id.app_description)
        val startButton = findViewById<TextView>(R.id.start_button)
        val exitButton = findViewById<TextView>(R.id.exit_button)


        //Set welcome and description messages on the TextViews
        welcomeMessage.text = "Welcome to the True/False Quiz!"
        appDescription.text = "Test your knowledge with these fun flashcard"
        startButton.setOnClickListener {
            val intent = (Intent(this, QuizPage::class.java))
            startActivity(intent)
        }

        //I learnt this in class

//https://youtu.be/kNghEbknLs8?si=d-n1N7KcjrOPNQBM

//https://youtu.be/pXZR0QiwvrU?si=7ts2NcFRZaYdLHTQ

//https://youtu.be/W7IOCRIEKUQ?si=ous08K0il3RbWNIn

//https://youtu.be/PsiUw43qoQ0?si=WE-AuxMWPfs31Llm

//https://youtu.be/9aoUe0gPljY?si=D2l2NhmGWiAbIhmc

//https://youtu.be/6DH7rkXaXpw?si=4cOoquiWRzNqOXGP

//https://youtu.be/22IRpgUfv3k?si=_V2CiR-Vt-XsgxHZ

//https://youtu.be/yLZfyTZEivA?si=EQcJVMrQ_BwGKpJ5

//https://youtu.be/KEaAL6xsTNM?si=NDIzKNdaKznuMZsV

//https://youtu.be/tloFc8yarBA?si=t1qihjDc6HxuRuZ5

        //Set a click listener for the exit button to close the app
        exitButton.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }

    }
}