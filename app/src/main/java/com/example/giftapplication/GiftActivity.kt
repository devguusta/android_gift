package com.example.giftapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GiftActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, ) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_gift);
        val textView = findViewById<TextView
                >(R.id.textView);
        textView.text = "Flamengo vai tomar uma surra hoje";
    val giftList = GiftBox.getGifts();
        giftList.forEach {
            textView.append("$it\n\n");
        }

    }
}