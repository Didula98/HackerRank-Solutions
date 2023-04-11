import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        List<Integer> newList = new ArrayList<>(ar);
        int flag1 = 0;
        int flag2 = 0;
        int pairCount = 0;
        
        for(int i = 0; i < ar.size(); i++){
            if(newList.contains(ar.get(i))){
                flag1 = 1;
                newList.remove(Integer.valueOf(ar.get(i)));
            }
            
            if(newList.contains(ar.get(i))){
                flag2 = 1;
                newList.remove(Integer.valueOf(ar.get(i)));
            }
            
            if(flag1 == 1 && flag2 == 1){
                pairCount++;
            }
            
            flag1 = flag2 = 0;
        }
        
        return pairCount;

    }

}

public class SalesbyMatch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
