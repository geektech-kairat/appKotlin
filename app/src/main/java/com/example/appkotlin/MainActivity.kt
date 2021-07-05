package com.example.appkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appkotlin.presentation.MainFragment
import pro.mitapp.muslimroad.base.replaceFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(this, R.id.container_for_fragment, MainFragment(), "MainFragment")
    }
}