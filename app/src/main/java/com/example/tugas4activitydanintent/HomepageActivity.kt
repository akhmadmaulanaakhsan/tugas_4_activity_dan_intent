package com.example.tugas4activitydanintent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas4activitydanintent.databinding.ActivityHomepageBinding

class HomepageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Menerima data dari Intent
        val username = intent.getStringExtra("username")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")

        // Menampilkan data di TextViews
        binding.tvUsername.text = " $username"
        binding.tvEmail.text = " $email"
        binding.tvPhone.text = " $phone"

        binding.btnLogout.setOnClickListener {
            // Kembali ke MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
