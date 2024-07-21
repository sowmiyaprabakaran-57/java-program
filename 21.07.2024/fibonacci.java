import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to generate Fibonacci series up to: ");
        int number = scanner.nextInt();
        scanner.close();
        generateFibonacciSeries(number);
    }
    public static void generateFibonacciSeries(int number) {
        int first = 0, second = 1;
        System.out.print("Fibonacci series up to " + number + ": ");
        while (first <= number) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
