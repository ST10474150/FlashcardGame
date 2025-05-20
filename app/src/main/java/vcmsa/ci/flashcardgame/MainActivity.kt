package vcmsa.ci.flashcardgame

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.btnStart)
        startButton.setOnClickListener {
            startActivity(Intent(this, QuestionActivity::class.java))
        }
    }
}