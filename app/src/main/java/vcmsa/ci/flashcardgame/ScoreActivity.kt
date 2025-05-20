package vcmsa.ci.flashcardgame

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val score = intent.getIntExtra("score", 0)
        val scoreTextView = findViewById<TextView>(R.id.tvScore)
        val feedbackTextView = findViewById<TextView>(R.id.tvFeedback)
        val reviewButton = findViewById<Button>(R.id.btnreview)
        val exitButton = findViewById<Button>(R.id.btnExit)

        scoreTextView.text = "Your Score: $score / 5"
        feedbackTextView.text = if (score >= 3) getString(R.string.great_job) else getString(R.string.keep_practicing)

        reviewButton.setOnClickListener {
            startActivity(Intent(this, ReviewActivity::class.java))
        }

        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}
