import java.util.HashMap;

public class Fibonacci {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result;
        if (n <= 1) {
            result = n;
        } else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }

        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }
}

