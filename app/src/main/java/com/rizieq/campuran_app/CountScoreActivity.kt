package com.rizieq.campuran_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class CountScoreActivity : AppCompatActivity() {

    var scoreTeamA: Int = 0
    var scoreTeamB: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count_score)
    }

    fun displayForTeamA(score: Int) {
        val scoreView = findViewById<View>(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
/*
Menampilkan score Team A di dalam TextView yang di tampilkan
Menset nilai score yang bertipe data integer

*/
    }


    fun tigaPointA(v: View?) {
        scoreTeamA = scoreTeamA + 3
        displayForTeamA(scoreTeamA)
//Menambah Point Team A 3
    }

    fun duaPointA(v: View?) {
        scoreTeamA = scoreTeamA + 2
        displayForTeamA(scoreTeamA)
//Menambah Point Team A 2
    }

    fun satuPointA(v: View?) {
        scoreTeamA = scoreTeamA + 1
        displayForTeamA(scoreTeamA)

//Menambah Point Team A 1
    }

    fun displayForTeamB(score: Int) {
        val scoreView = findViewById<View>(R.id.team_b_score) as TextView
        scoreView.text = score.toString()
/*
Menampilkan score Team B di dalam TextView yang di tampilkan
Menset nilai score yang bertipe data integer

*/
    }

    fun tigaPointB(v: View?) {
        scoreTeamB = scoreTeamB + 3
        displayForTeamB(scoreTeamB)
// Menambah Point Team B 3
    }

    fun duaPointB(v: View?) {
        scoreTeamB = scoreTeamB + 2
        displayForTeamB(scoreTeamB)
// Menambah Point Team B 2
    }

    fun satuPointB(v: View?) {
        scoreTeamB = scoreTeamB + 1
        displayForTeamB(scoreTeamB)
// Menambah Point Team B 1
    }


    fun resetPoint(v: View?) {
        scoreTeamA = 0
        scoreTeamB = 0
        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
//Reset point Team A dan Team B ke 0
    }


}