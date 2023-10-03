package www.uzmd.matritsa.domain

data class GameNatija(
    var win: Boolean,
    var gameSettings: GameSettings,
    var userRightAnswer: Int,
    var userPracent: Int,
    var userBall: Int
)