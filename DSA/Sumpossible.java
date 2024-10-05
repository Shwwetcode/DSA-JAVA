import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Sumpossible {
    static boolean possible(int amount, List<Integer> numbers) {
        return possible(amount, numbers, new HashMap<>());
    }

    static boolean possible(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo) {
        if (amount == 0) {
            return true;
        }
        if (amount < 0) {
            return false;
        }
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        for (int num : numbers) {
            int subAmount = amount - num;
            if (possible(subAmount, numbers, memo)) {
                memo.put(amount, true);
                return true;
            }
        }

        memo.put(amount, false);
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target amount: ");
        int amount = sc.nextInt();

        System.out.println("Enter the number of elements in the list: ");
        int n = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        sc.close();

        boolean result = possible(amount, numbers);
        System.out.println("Is it possible to form the amount? " + result);
    }
}