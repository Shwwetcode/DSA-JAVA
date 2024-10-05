import java.util.Scanner;

public class factorial {

   
    public int Fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * Fact(n - 1); // Recursive call for factorial
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int n = sc.nextInt(); 

        factorial factobj = new factorial(); 
        
        System.out.println("Factorial of " + n + " is: " + factobj.Fact(n));

        sc.close(); 
    }
}