package com.yusuf0080.manajementugasassessment3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yusuf0080.manajementugasassessment3.ui.screen.MainScreen
import com.yusuf0080.manajementugasassessment3.ui.theme.ManajemenTugasAssessment3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ManajemenTugasAssessment3Theme {
                MainScreen()
            }
        }
    }
}