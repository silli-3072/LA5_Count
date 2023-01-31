package com.haruta.harutyan.count

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haruta.harutyan.count.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(this.root)
        }

        var number: Int = 0
        updateText(number)

        binding.plusButton.setOnClickListener {
            number = number + 1
            updateText(number)
        }

        binding.minusButton.setOnClickListener {
            number = number - 1
            updateText(number)
        }

        binding.clearButton.setOnClickListener {
            number = 0
            updateText(number)
        }

    }

    fun updateText(resultNumber: Int) {
        binding.numberTextView.text = resultNumber.toString()

        if (resultNumber != 0 && resultNumber % 3 == 0) {
            binding.numberTextView.setTextColor(Color.GREEN)
        } else {
            binding.numberTextView.setTextColor(Color.BLACK)
        }

    }

}