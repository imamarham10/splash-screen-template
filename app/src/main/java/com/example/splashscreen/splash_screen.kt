@file:Suppress("DEPRECATION")

package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splashscreen.*

class splash_screen : AppCompatActivity() {
    //variables


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen)

        //Animations
        var topAnims = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        var bottomAnims = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        //hooks
        ivView.animation = topAnims
        textView.animation = bottomAnims
        textView2.animation = bottomAnims

        Handler(Looper.getMainLooper()).postDelayed( {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        },2500)
    }


}