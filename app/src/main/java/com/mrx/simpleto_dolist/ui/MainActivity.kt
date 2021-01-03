package com.mrx.simpleto_dolist.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mrx.simpleto_dolist.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}