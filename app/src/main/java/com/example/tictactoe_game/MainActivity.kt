package com.example.tictactoe_game

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tictactoe.ui.theme.GameScreen
import com.example.tictactoe_game.ui.theme.GameViewModel
import com.example.tictactoe_game.ui.theme.TicTacToe_GameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TicTacToe_GameTheme {
                val viewModel = viewModel<GameViewModel>()
                GameScreen(
                    viewModel = viewModel
                )
            }
        }
    }
}
