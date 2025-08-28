package Java_Practices.Label2;

import java.util.Scanner;

public class EvenOdd {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
            System.out.println("---------------------------");
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);

        if (result == 0) {
            System.out.println("First and Last numbers are Equal");
        } else if (result == 1) {
            System.out.println("First number is Greater than Last number");
        } else {
            System.out.println("First number is Less than Last number");
        }

        sc.close();
    }
}
