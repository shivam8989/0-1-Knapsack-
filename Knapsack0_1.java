package Dynamic_Programming;
import java.util.*;
public class Knapsack0_1 {
    public static int Knapsack(int val[], int wt[], int Wt, int n){
        if(Wt == 0 || n ==0 ){
            return 0;
        }
        if(wt[n-1] <= Wt){
            // include
           int ans =  val[n-1]+Knapsack(val,wt,Wt-wt[n-1],n-1);
           // exclude
            int ans1 = Knapsack(val,wt,Wt,n-1);
            return Math.max(ans,ans1);
        }else{
            return Knapsack(val,wt,Wt,n-1);
        }
    }
    public static  void main(String args[]){
        int val [] = {15,14,10,45,30};
        int wt[] = {2,5,1,4,3};
        int maxwt = 7;
        System.out.println(Knapsack(val,wt,maxwt,5));

    }
}
