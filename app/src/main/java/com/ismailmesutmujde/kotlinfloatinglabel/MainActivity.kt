package com.ismailmesutmujde.kotlinfloatinglabel

import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ismailmesutmujde.kotlinfloatinglabel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.buttonMake.setOnClickListener {
            val name = bindingMain.editTextName.text.toString().trim()
            val phone = bindingMain.editTextPhone.text.toString().trim()

            if(TextUtils.isEmpty(name)) {
                Toast.makeText(this@MainActivity, "Name is empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (TextUtils.isEmpty(phone)) {
                Toast.makeText(this@MainActivity, "Phone is empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (phone.length < 6 ) {
                Toast.makeText(this@MainActivity, "The phone number must be at least 6 digits.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this@MainActivity, "$name - $phone", Toast.LENGTH_SHORT).show()

        }

    }
}