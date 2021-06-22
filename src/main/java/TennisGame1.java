
public class TennisGame1 implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String name) {
        if (name == player1.name()) {
            player1.wonPoint();
            return;
        }
        player2.wonPoint();
    }

    public String getScore() {
        if (player1.score() == player2.score()) {
            return getScoreIfEven();
        } else if (player1.score() >= 4 || player2.score() >= 4) {
            return getScoreIfOdd();
        } else {
            return getScoreIfTemp();
        }
    }

    private String getScoreIfTemp() {
        String tempScore;
        tempScore = validateTempScore(player1.score());
        tempScore += "-";
        tempScore += validateTempScore(player2.score());
        return tempScore;
    }

    private String validateTempScore(int tempScore) {
        switch (tempScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return null;
        }
    }

    private String getScoreIfOdd() {
        int minusResult = player1.score() - player2.score();
        switch (minusResult) {
            case 1:
                return "Advantage player1";
            case -1:
                return "Advantage player2";
            default:
                return minusResult >= 2 ? "Win for player1" : "Win for player2";
        }
    }

    private String getScoreIfEven() {
        switch (player1.score()) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            default:
                return "Deuce";
        }
    }
}

