import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 số: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci normal: ");
        fibonacci(n);

        System.out.println("\nFibonacci recursion");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }
    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static int fibonacciRecursion(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }
}
