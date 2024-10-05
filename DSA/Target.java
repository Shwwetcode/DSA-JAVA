import java.util.Scanner;
import java.util.*;
public class Target {
    public static void main(String[] args) 

    {
        int [] arr ={1,23,4,4,33,243,413,43,43,43,4231,31,1,1,3,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num:- ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(find(arr,n , 0));
        findallindex(arr,n , 0);
        System.out.println(list);
        
    }
    public static boolean find(int [] arr ,  int target , int index )
    {
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);

    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findallindex(int [] arr ,  int target , int index )
    {
        if(index == arr.length){
            return;
            
        }
        if(index==target){
            list.add(index);
        }
        findallindex(arr, target, index+1);

    }
    
}
