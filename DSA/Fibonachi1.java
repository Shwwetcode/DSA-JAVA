import java.util.Scanner;
import java.util.HashMap;
public class Fibonachi1 {
    public static int fibo(int n){
        return fibo(n, new HashMap<>());

    }

    public static int fibo(int n , HashMap<Integer,Integer> memo){
        
        if(n==1){
            return 0;
        }
        if(n==0){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int result = fibo(n-1, memo) + fibo(n-2, memo) + fibo(n-3, memo);
        memo.put(n,result);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no :- ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(Fibonachi1.fibo(n));
    }

    
}
