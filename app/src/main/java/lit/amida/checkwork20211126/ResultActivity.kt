package lit.amida.checkwork20211126

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        findViewById<TextView>(R.id.result_text)

    }

    override fun onPause() {
        Toast.makeText(applicationContext, "Result画面を終了", Toast.LENGTH_LONG)
        super.onPause()
        finish()
    }
}