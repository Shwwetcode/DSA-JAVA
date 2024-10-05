import java.util.Scanner;

public class reverse {
    public static int rev2(int n){
        int digit = (int)(Math.log10(n)+1);
        return helper(n, digit);
    }
    public static int helper(int n,int digit){
        if(n%10==n){
            return n;
        } 
        int rem = n%10;
        return rem*(int)(Math.pow(10, digit-1))+helper(n/10, digit-1);

        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number:- ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(rev2(n));
    }
    
}
