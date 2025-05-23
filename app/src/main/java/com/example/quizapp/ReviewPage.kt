package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class ReviewPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_review_page)

        //Get refrences to UI elements from the layout
        val reviewTextView = findViewById<TextView>(R.id.review_text_view)
        val restartBtn = findViewById<TextView>(R.id.restart_button)
        val exitBtn = findViewById<TextView>(R.id.exit_button)

        //Retrieve the array of questions and answers passed from the previos activity
        val questions = intent.getStringArrayExtra("questions")
        val answers = intent.getBooleanArrayExtra("answers")

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

        //Build the review text dynamically
        val reviewText = StringBuilder()
        if (questions != null && answers != null && questions.size == answers.size) {
            for (i in questions.indices) {
                reviewText.append("${i+1}. ${questions[i]}\n")
                reviewText.append("  Answer: ${if (answers[i]) "True" else "False"}\n\n")
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


           //Set the formatted review text to the TextView
            reviewTextView.text = reviewText.toString()
        } else {

            //Show the error message if data couldn't be loaded correctly
            reviewTextView.text = "Error loading review data."
        }

        //Restart button functionality: navigate back to QuizPage
        restartBtn.setOnClickListener {
            startActivity(Intent(this, QuizPage::class.java))
        }

        //Exit button functionality: close the app entirely
        exitBtn.setOnClickListener {
            finishAffinity()   //Finish all activities in the task
            exitProcess(0)     //Forcefully terminate the process
        }



    }
}