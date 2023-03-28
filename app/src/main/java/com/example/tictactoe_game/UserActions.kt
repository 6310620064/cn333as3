package com.example.tictactoe_game

sealed class UserActions {
    object PlayAgainButtonClicked: UserActions()
    data class BoardTapped(val cellNo: Int): UserActions()

}
