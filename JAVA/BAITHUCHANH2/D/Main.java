package BAITHUCHANH2.D;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] adj = new int[n][n];
        for(int i = 0;i < n; i++){
            for(int j = 0;j < n; j++){
                adj[i][j] = sc.nextInt();
            }
        }
        List<Pair<Integer,Integer>> new_lít=new ArrayList<>();
        for(int i=0; i < n ;i++){
            for(int j = i+1;j < n ; j++){
                if(adj[i][j]==1){
                    new_lít.add(new Pair<Integer,Integer>(i+1, j+1));
                }
            }
        }
        for(Pair<Integer,Integer> val:new_lít){
            System.out.println(val);
        }
    }
}
