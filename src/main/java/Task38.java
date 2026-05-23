import java.util.Map;

public class Task38 {
    private static final Map<Integer, String> CALLS = Map.of(
            0, "Love",
            1, "Fifteen",
            2, "Thirty",
            3, "Forty"
    );

    /**
     * Evaluates and returns the current tennis score call based on the players' points.
     * The method parses a point string separated by a colon (e.g., "3:2"), calculates the
     * absolute point difference, and applies standard tennis scoring rules. It determines
     * whether a player has won the game, if the match is in a "Deuce" or "Advantage" state,
     * or if standard point calls (Love, Fifteen, Thirty, Forty) should be returned.
     *
     * @param score the current point score formatted as "points1:points2" (e.g., "4:2")
     * @param pl1   the name of player one
     * @param pl2   the name of player two
     * @return a string representing the official tennis call, or null if any input is null or empty
     */
    String tennisscore(String score, String pl1, String pl2){
        if (score == null || pl1 == null || pl2 == null
                || score.isEmpty() || pl1.isEmpty() || pl2.isEmpty()) {
            return null;
        }

        String[] scoreArray = score.split(":");
        int pl1Score = Integer.parseInt(scoreArray[0]);
        int pl2Score = Integer.parseInt(scoreArray[1]);

        int difference = Math.abs(pl1Score - pl2Score);
        if((pl1Score >= 4 || pl2Score >= 4) && difference >= 2){
            if (pl1Score > pl2Score)
                return "Game " + pl1;
            else
                return "Game " + pl2;
        }
        else if (pl1Score >= 3 && pl2Score >= 3) {
            if(difference == 1){
                if(pl1Score > pl2Score)
                    return "Advantage " + pl1;
                else
                    return "Advantage " + pl2;
            }
            else {
                return "Deuce";
            }
        }
        else {
            return CALLS.get(pl1Score) + " " + CALLS.get(pl2Score);
        }
    }
}
