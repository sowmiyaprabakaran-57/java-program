import java.util.Scanner;
public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int numberOfDigits = String.valueOf(number).length();
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        return result == originalNumber;
    }
}
