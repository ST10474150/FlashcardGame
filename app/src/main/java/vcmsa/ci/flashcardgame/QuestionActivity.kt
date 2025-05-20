package vcmsa.ci.flashcardgame

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*

class QuestionActivity : AppCompatActivity() {
    private val questions = arrayOf(
        "The Great Fire of London happened in 1666.",
        "Julius Caesar was the first emperor of Rome.",
        "The Berlin Wall fell in 1989.",
        "The Titanic sank in 1912.",
        "Nelson Mandela won the Nobel Peace Prize in 1993."
    )

    private val answers = booleanArrayOf(true, false, true, true, true)
    private var currentIndex = 0
    private var score = 0

    private lateinit var questionText: TextView
    private lateinit var feedbackText: TextView
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        questionText = findViewById(R.id.tvQuestion)
        feedbackText = findViewById(R.id.tvFeedback)
        trueButton = findViewById(R.id.btnTrue)
        falseButton = findViewById(R.id.btnFalse)
        nextButton = findViewById(R.id.btnNext)

        loadQuestion()

        trueButton.setOnClickListener { checkAnswer(true) }
        falseButton.setOnClickListener { checkAnswer(false) }

        nextButton.setOnClickListener {
            currentIndex++
            if (currentIndex < questions.size) {
                loadQuestion()
            } else {
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun loadQuestion() {
        questionText.text = questions[currentIndex]
        feedbackText.text = ""
        trueButton.isEnabled = true
        falseButton.isEnabled = true
        nextButton.isEnabled = false
    }

    private fun checkAnswer(userAnswer: Boolean) {
        val correctAnswer = answers[currentIndex]
        if (userAnswer == correctAnswer) {
            feedbackText.text = "Correct!"
            score++
        } else {
            feedbackText.text = "Incorrect"
        }
        trueButton.isEnabled = false
        falseButton.isEnabled = false
        nextButton.isEnabled = true
    }
}
