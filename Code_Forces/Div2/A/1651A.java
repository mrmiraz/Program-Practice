
import java.util.*;

public class Solution {
   
    public void print(Object o){
        System.out.print(""+o);
    }
    public void println(Object o){
        System.out.println(""+o);
    }
    public void solver(){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t--> 0){
            int n = in.nextInt();
            println((int)Math.pow(2, n)-1);
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        sol.solver();
   }
}
