package com.rizieq.campuran_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_count.setOnClickListener {
            startActivity(Intent(this,CountScoreActivity::class.java))
        }
        btn_konversi.setOnClickListener {
            startActivity(Intent(this,SuhuConvertionActivity::class.java))
        }

        btn_web.setOnClickListener {
            startActivity(Intent(this,WebViewActivity::class.java))
        }

        btn_kalkulator.setOnClickListener {
            startActivity(Intent(this,KalkulatorActivity::class.java))
        }

        btn_hitung_bb.setOnClickListener {
            startActivity(Intent(this,HitungBbActivity::class.java))
        }

    }

}