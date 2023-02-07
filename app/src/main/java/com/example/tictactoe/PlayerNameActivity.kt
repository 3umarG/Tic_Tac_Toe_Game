package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tictactoe.databinding.ActivityPlayerNameBinding

class PlayerNameActivity : AppCompatActivity() {
    companion object {
        const val PLAYER_NAME = "player_name"
    }
    private lateinit var binding: ActivityPlayerNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayerNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartGame.setOnClickListener {
            val playerName = binding.editTextName.text.toString()
            if (playerName.isNotEmpty() && playerName.isNotBlank()) {
                val intent = Intent(this , MainActivity::class.java)
                intent.putExtra(PLAYER_NAME , playerName)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please Enter your Name", Toast.LENGTH_SHORT).show()
            }

        }
    }
}