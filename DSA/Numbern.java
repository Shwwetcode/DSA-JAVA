import java.util.Scanner;
public class Numbern {
    public static int numb(int n){
            if(n==0){
                return 0;
            }
            numb(n-1);
            return numb(n);
            
        }
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the number:- ");
            int n=sc.nextInt();
            numb(n);
            sc.close();
    }
    
}
