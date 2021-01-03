package com.rizieq.campuran_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hitung_bb.*


class HitungBbActivity : AppCompatActivity() {

    private var mEtBerat: EditText? = null
    private var mEtTinggi: EditText? = null

    private var mTvHasil: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_bb)

        mEtBerat = findViewById(R.id.etBerat)
        mEtTinggi = findViewById(R.id.etTinggi)

        mTvHasil = findViewById(R.id.tvHasil)
        btnHitung.setOnClickListener {
            hitungIMT()
        }

    }

    fun hitungIMT() {
        val berat = mEtBerat!!.text.toString().toDouble()
        val tinggi = mEtTinggi!!.text.toString().toDouble()
        val tingiDalamMeter = tinggi / 100.0
        val imt = berat / (tingiDalamMeter * tingiDalamMeter)
        var keterangan = ""
        keterangan = if (imt <= 18.4) {
            "Berat Badan Kurang"
        } else if (imt >= 18.5 && imt <= 24.9) {
            "Berat Badan Ideal"
        } else if (imt >= 25 && imt <= 29.9) {
            "Berat Badan Lebih"
        } else if (imt >= 30 && imt <= 39.9) {
            "Gemuk"
        } else {
            "Sangat Gemuk"
        }
        val hasil = "Nilai IMT adalah $imt Yaitu $keterangan"
        mTvHasil!!.text = hasil
    }
}