package com.example.randomquoteapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var tvQuote: TextView
    private lateinit var tvAuthor: TextView
    private lateinit var btnNewQuote: Button

    private val quotes = listOf(
        Pair("The best way to get started is to quit talking and begin doing.", "Walt Disney"),
        Pair("Success is not final, failure is not fatal: It is the courage to continue that counts.", "Winston Churchill"),
        Pair("Don’t let yesterday take up too much of today.", "Will Rogers"),
        Pair("You learn more from failure than from success. Don’t let it stop you.", "Unknown"),
        Pair("If you are working on something that you really care about, you don’t have to be pushed.", "Steve Jobs"),
        Pair("Dream bigger. Do bigger.", "Unknown"),
        Pair("Do what you can with all you have, wherever you are.", "Theodore Roosevelt"),
        Pair("Hardships often prepare ordinary people for an extraordinary destiny.", "C.S. Lewis")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvQuote = findViewById(R.id.tvQuote)
        tvAuthor = findViewById(R.id.tvAuthor)
        btnNewQuote = findViewById(R.id.btnNewQuote)

        btnNewQuote.setOnClickListener {
            showRandomQuote()
            btnNewQuote.text = "New Quote"   // 🔥 Change button text after first click
        }
    }


    private fun showRandomQuote() {
        val randomIndex = Random.nextInt(quotes.size)
        val (quote, author) = quotes[randomIndex]

        tvQuote.text = "\"$quote\""
        tvAuthor.text = "- $author"
    }
}
