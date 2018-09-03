package SwordOffer;

public class P009Fibonacci {
    public static void main(String[] args) {
        P009Fibonacci main = new P009Fibonacci();
        System.out.println(main.Fibonacci(39));
    }

    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
