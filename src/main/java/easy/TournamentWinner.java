package easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Return the winner of the tournament
 * it takes 2 parameters competitions and results
 * each result represent the winner of competitions respectively
 * results[i] == 0 -> competitions[1] is a winner
 * results[i] == 1 -> competitions[0] is a winner
 * No ties, each wins get 3 points
 */
public class TournamentWinner {

    /**
     * O(n) time | O(k) space where n is the number of competition and k is the total teams
     * Iterate the competitions array, track of the score with hashmap
     */
    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        HashMap<String, Integer> score = new HashMap<>();
        String currentBestTeam = "";
        score.put(currentBestTeam, 0);
        for(int i=0; i < competitions.size(); i++){
            String winner = "";
            if(results.get(i) == 0){
                winner = competitions.get(i).get(1);
            }else{
                winner = competitions.get(i).get(0);
            }
            addScoreToTeams(score, winner);
            if(score.get(winner) > score.get(currentBestTeam)) currentBestTeam = winner;
        }
        return currentBestTeam;
    }

    public void addScoreToTeams(HashMap<String,Integer> score, String winner){
        if(!score.containsKey(winner)){
            score.put(winner, 0);
        }
        score.replace(winner, score.get(winner)+3);
    }
}
