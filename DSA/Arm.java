import java.util.Scanner;
public class Arm {
public int arnno() 
{
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    System.out.println("enter an number:- ");
    int n = sc.nextInt();
    sc.close();

    int originalN = n;
    int dc = 0;

    while (n > 0) {
        dc = dc + 1;
        n = n / 10;
    }

    
    n = originalN;

    // Calculate the sum of the digits
    while (n != 0) {
        double rem = n % 10;
        int power = (int) Math.pow(rem, dc);
        sum = sum + power;
        n = n / 10;
    }

    // Check if the sum is equal to the original number
    if (sum == originalN) {
        System.out.println("The number is an Armstrong number");
    } else {
        System.out.println("Not an Armstrong number");
    }

    return dc;
}
    public static void main(String[]args){
        Arm a = new Arm();
        a.arnno();
    }
}
