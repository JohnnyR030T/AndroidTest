package dev.johnnyrobot.androidtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var occupation = "developer"
        var name = "JohnnyV"
        var age = "Don't ask..."
    }
}