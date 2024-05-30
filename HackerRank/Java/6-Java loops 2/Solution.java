import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int q = Integer.parseInt(reader.readLine());
        
        int [][] inputs = new int[q][3];
        
        for (int i = 0; i < q; i++){
            String[] inputString = reader.readLine().split(" ");
            
            inputs[i][0] = Integer.parseInt(inputString[0]);
            inputs[i][1] = Integer.parseInt(inputString[1]);
            inputs[i][2] = Integer.parseInt(inputString[2]);
        }
        
        for (int i = 0; i < q; i++){
            int s = inputs[i][0];
            for (int j = 0; j < inputs[i][2]; j++){
                s += Math.pow(2,j) * inputs[i][1];
                System.out.print(s+" ");
            }
            System.out.println();
        }
        reader.close();
    }
}