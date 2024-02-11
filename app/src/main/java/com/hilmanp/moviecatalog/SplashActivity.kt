package com.hilmanp.moviecatalog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val time_duration: Long = 2000;

        Handler().postDelayed(
            {
                val mainIntent = Intent(this, MainActivity::class.java);
                startActivity(mainIntent);
                finish();
            }, time_duration
        )
    }
}
