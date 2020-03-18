package com.example.uts_mobile

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        penduduk.setOnClickListener {
            startActivity(Intent(this@Dashboard, Penduduk::class.java))
        }

        button.setOnClickListener{
            val sharedPreferences=getSharedPreferences("CEKLOGIN", Context.MODE_PRIVATE)
            val editor=sharedPreferences.edit()

            editor.putString("STATUS","0")
            editor.apply()

            startActivity(Intent(this@Dashboard,MainActivity::class.java))
            finish()
        }
    }
}
