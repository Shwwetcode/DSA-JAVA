import java.util.Scanner;
public class Atoi {
    public int conversion(String s){
        if(s.length()==0){
            return 0;
        }
        s = s.trim();
        int sign = +1;
        long ans =0;
        if(s.charAt(0)=='-'){sign = -1;}
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        

        int i = ((s.charAt(0) == '+'||s.charAt(0)== '-') ? 1:0);
        while (i < s.length()) 
        {
            if(!Character.isDigit(s.charAt(i)) || s.charAt(i)==' ')break;
            ans = ans*10 + s.charAt(i) - '0';
            if (sign == -1 && -ans < min) return min;
            if (sign == 1 && ans > max) return max;
            i++;
            
        }
        
        
        return (int)(sign*ans);

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :- ");
        String s = sc.nextLine();
        sc.close();
        Atoi obj =new Atoi();
        int result = obj.conversion(s);
        
        System.out.println("here is your number :- "+result);
        
    }
    
}
