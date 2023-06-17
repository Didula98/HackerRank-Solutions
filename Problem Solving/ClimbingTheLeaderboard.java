import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

   public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    // Write your code here
        ArrayList <Integer> leaderboard = (ArrayList<Integer>)ranked;
        ArrayList <Integer> playerScores = (ArrayList<Integer>)player;
        
        //for storing each player's ranking
        HashMap <Integer, Integer> rankings = new HashMap<>();
        ArrayList <Integer> ranks = new ArrayList<>();
        
        int rank = 1;
        for(int i = 0; i < leaderboard.size(); i++){
            if(!rankings.containsKey(leaderboard.get(i))){
                rankings.put(leaderboard.get(i), rank++);
            }
        }
        
        //to travers leaderboard list from last to first
        int initial = leaderboard.size() -1;
        
        //for iterating through player score one by one
        for(int score: playerScores){
            
            //nested loop for comparing players score with the others
            for(int i = initial; i >= 0; i--){
                if(score >= leaderboard.get(i)){
                    rank = rankings.get(leaderboard.get(i));
                    initial = i-1;
                }else{
                    break;
                }
            }
            ranks.add(rank);
        }
        
        return ranks;
    }

}

public class ClimbingTheLeaderboard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.climbingLeaderboard(ranked, player);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
