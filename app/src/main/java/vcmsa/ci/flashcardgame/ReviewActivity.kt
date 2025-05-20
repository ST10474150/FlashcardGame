package vcmsa.ci.flashcardgame

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReviewActivity : AppCompatActivity() {
    private val questions = arrayOf(
        "The Great Fire of London happened in 1666.",
        "Julius Caesar was the first emperor of Rome.",
        "The Berlin Wall fell in 1989.",
        "The Titanic sank in 1912.",
        "Nelson Mandela won the Nobel Peace Prize in 1993."
    )

    private val answers = booleanArrayOf(true, false, true, true, true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val reviewTextView = findViewById<TextView>(R.id.tvReview)
        val reviewText = StringBuilder("Flashcard Review:\n\n")

        for (i in questions.indices) {
            reviewText.append("${i + 1}. ${questions[i]}\nAnswer: ${if (answers[i]) "True" else "False"}\n\n")
        }

        reviewTextView.text = reviewText.toString()
    }
}