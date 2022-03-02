package lesson8_clean_code.exercise;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String gameScore = "";
        int tempScore = 0;
        boolean isDeuce = player1Score == player2Score;
        if (isDeuce) {
            switch (player1Score) {
                case 0:
                    gameScore = "Love-All";
                    break;
                case 1:
                    gameScore = "Fifteen-All";
                    break;
                case 2:
                    gameScore = "Thirty-All";
                    break;
                case 3:
                    gameScore = "Forty-All";
                    break;
                default:
                    gameScore = "Deuce";
                    break;
            }
        } else if (player1Score >= 4 || player2Score >= 4) {
            gameScore = deuceSituation(player1Score, player2Score);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    gameScore += "-";
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case 0:
                        gameScore += "Love";
                        break;
                    case 1:
                        gameScore += "Fifteen";
                        break;
                    case 2:
                        gameScore += "Thirty";
                        break;
                    case 3:
                        gameScore += "Forty";
                        break;
                }
            }
        }
        return gameScore;
    }

    private static String deuceSituation(int player1Score, int player2Score) {
        String gameScore;
        int checkScore = player1Score - player2Score;
        boolean advantageP1 = checkScore == 1;
        if (advantageP1) gameScore = "Advantage player1";
        else {
            boolean advantageP2 = checkScore == -1;
            if (advantageP2) gameScore = "Advantage player2";
            else {
                boolean p1Win = checkScore >= 2;
                if (p1Win) gameScore = "Win for player1";
                else gameScore = "Win for player2";
            }
        }
        return gameScore;
    }
}
