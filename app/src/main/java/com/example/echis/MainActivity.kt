package com.example.echis

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {

    private lateinit var cardHome: CardView
    private lateinit var cardChat: CardView
    private lateinit var cardProfile: CardView
    private lateinit var cardWidget: CardView
    private lateinit var cardSettings: CardView
    private lateinit var cardLogout: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardHome = findViewById(R.id.cardHome)
        cardChat = findViewById(R.id.cardChat)
        cardProfile = findViewById(R.id.cardProfile)
        cardWidget = findViewById(R.id.cardWidget)
        cardSettings = findViewById(R.id.cardSettings)
        cardLogout = findViewById(R.id.cardLogout)

        cardHome.setOnClickListener{
            showToast("Home Clicked!")
        }
        cardChat.setOnClickListener{
            showToast("Messages Clicked!")
        }
        cardProfile.setOnClickListener{
            showToast("Profile Clicked!")
        }
        cardWidget.setOnClickListener{
            showToast("Widget Clicked!")
        }
        cardSettings.setOnClickListener{
            showToast("Settings Clicked!")
        }
        cardLogout.setOnClickListener{
            showToast("Logout Clicked!")
        }
    }

    private fun showToast(message: String){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }

}