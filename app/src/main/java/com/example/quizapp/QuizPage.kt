package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.provider.CalendarContract
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

//Main class for the quiz activity screen
class QuizPage : AppCompatActivity() {

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


    //Declare UI elements
    private lateinit var questionTextView: TextView
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button
    private lateinit var feedbackTextView: TextView

    //Companion objects holds shared static-like variables
    companion object {
        val questions = arrayOf(
            "Humans have 206 bones in their body",
            "Humans can live up to the age of 300",
            "Humans are the apex predators out of all species",
            "Humans have the highest stamina out of all species",
            "Humans have have more than 3 brains and 2 hearts"
        )
        //Corresponding answers for each question
        val answers = booleanArrayOf(true, false, true, true, false)
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

    private var currentQuestionIndex = 0
    private var score = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_page)

        //Link UI elements from the layout to Kotlin code
        questionTextView = findViewById(R.id.question_text_view)
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        nextButton = findViewById(R.id.next_button)
        feedbackTextView = findViewById(R.id.feedback_text_view)

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

        displayQuestion()

        //Set up botton listeners
        trueButton.setOnClickListener { checkAnswer(true) }
        falseButton.setOnClickListener { checkAnswer(false) }

        nextButton.setOnClickListener {
            currentQuestionIndex++
            if (currentQuestionIndex < questions.size) {
                displayQuestion()
                feedbackTextView.text = ""
                trueButton.isEnabled = true
                falseButton.isEnabled = true
            } else {

                //If no more questions, go to the ScorePage

              //  val intent = Intent(this, ScorePage::class.java)

                val intent = (Intent(this, ScorePage::class.java))
                startActivity(intent)
                intent.putExtra("score", score)
                finish()

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

            }
        }

        //Disable the next button initially
        nextButton.isEnabled = false
    }
    //Display the current current question in the TestView
    private fun displayQuestion() {
        questionTextView.text = questions[currentQuestionIndex]
    }
    //Check if the user's answer is correct and give feedback
    private fun checkAnswer(userAnswer: Boolean) {
        val correctAnswer = answers[currentQuestionIndex]

        if (userAnswer == correctAnswer) {
            feedbackTextView.text = "Correct!"
            feedbackTextView.setTextColor(Color.GREEN)
            score++

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

        } else {

            //Disable answer buttons to prevent multiple submissions
            feedbackTextView.text = "Incorrect."
            feedbackTextView.setTextColor(Color.RED)
        }

        //Enable the next button to move on
        trueButton.isEnabled = false
        falseButton.isEnabled = false
        nextButton.isEnabled = true
}   }