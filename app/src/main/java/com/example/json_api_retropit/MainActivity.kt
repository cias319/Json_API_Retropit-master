package com.example.json_api_retropit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.json_api_retropit.ViewModels.ProductVieModel
import com.example.json_api_retropit.ViewModels.UserVieModel
import com.example.json_api_retropit.Views.userScreen
import com.example.json_api_retropit.ui.theme.Json_API_RetropitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            val productVM: ProductVieModel by viewModels()
            val userVM: UserVieModel by viewModels()
            Json_API_RetropitTheme {
                //productScreen(productVM = productVM)
                userScreen(userVM = userVM)
            }
        }
    }
}

