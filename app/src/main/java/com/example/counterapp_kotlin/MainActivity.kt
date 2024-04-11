package com.example.counterapp_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count:Int=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //step 2
        val textView:TextView=findViewById(R.id.textView)
        val button:TextView=findViewById(R.id.btn)

        //step functionality
        button.setOnClickListener {

            textView.setText(""+increment())
        }
    }

    fun increment():Int{
        count++
        return count
    }
}