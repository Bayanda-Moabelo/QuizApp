package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class ScorePage : AppCompatActivity() {

    //Enables edge to edge display (optional UI enchancement)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score_page)

        //Find UI elements by their ID from the layout
        val scoreTextView = findViewById<TextView>(R.id.score_text_view)
        val feedbackTextView = findViewById<TextView>(R.id.feedback_text_view)
        val reviewButton = findViewById<Button>(R.id.review_button)
        val exitButton = findViewById<Button>(R.id.exit_button)

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

        //Retrieve the score passed from the QuizPage activity
        val score = intent.getIntExtra("score", 0)
        scoreTextView.text = "Your score: $score/5"

        //Display feedback based on the user's score
        val feedback = if (score >= 3) {
            "Great job"

        } else {
            "Keep practicing"
        }
        feedbackTextView.text = feedback

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


        //When Review button is clicked go to the ReviewPage actvity
        reviewButton.setOnClickListener {
            val intent = (Intent(this, ReviewPage::class.java))
            intent.putExtra("questions", QuizPage.questions)
            intent.putExtra("answers", QuizPage.answers)
            startActivity(intent)
        }

        //When Exit button is clicked close the app
        exitButton.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }


    }
}