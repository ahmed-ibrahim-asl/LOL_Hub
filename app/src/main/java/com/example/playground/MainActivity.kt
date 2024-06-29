package com.example.playground

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


// MainActivity inheritance from AppCompatActivity
// AppCompatActivity is base class for activities (screens) for modern android components and features also compatible with older version of android
class MainActivity : AppCompatActivity() {

    // OnCreate called when the activity is first created, create view of our activity
    override fun onCreate(savedInstanceState: Bundle?) {

        // calls parent activity to setup basic view
        super.onCreate(savedInstanceState)

        // This custom method sets the app to use the entire screen, including the area behind the system bars
        enableEdgeToEdge()


        // here we set screen layout of that screen to use activity_main XML file that exists in
        // [res dir -> layout -> activity_main.xml]
        //      drawable -> here we set shapes we intended to use in our app
        //      mipmap   -> here we can have icon we have in our app, in different dimensions intended to for to ensure proper display in different phones
        //      colors   -> here we can set custom name for specific color if we need to change a color we only update it here instead of changing everywhere in code
        //      strings  -> storing all text we going to use in our app, by storing it in one place we can easily update (translate) in one place

        setContentView(R.layout.activity_main)

//
//        btnGetMoreMemes.setOnClickListener {
//            ivMeme.setImageResource(R.drawable.p1)
//        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}