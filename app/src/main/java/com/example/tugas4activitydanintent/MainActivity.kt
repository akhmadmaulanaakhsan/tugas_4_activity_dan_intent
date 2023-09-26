package com.example.tugas4activitydanintent

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas4activitydanintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnRegister.setOnClickListener {
            // Mendapatkan data yang dimasukkan pengguna
            val username = binding.etUsername.text.toString()
            val email = binding.etEmail.text.toString()
            val phone = binding.etPhone.text.toString()
            val password = binding.etPassword.text.toString()
            val checkBoxChecked = binding.checkBox.isChecked


            // Validasi input
            if (!checkBoxChecked) {
                Toast.makeText(this, "Centang checkbox terlebih dahulu.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (username.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Isi semua field terlebih dahulu.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Berpindah ke ActivityHomepage dan mengirim data
            val intent = Intent(this, HomepageActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("email", email)
            intent.putExtra("phone", phone)
            startActivity(intent)
        }

        Log.d(TAG,"oncreate is called")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onstart is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onresume is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onpause is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onstop is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"ondestroy is called")
    }
}

