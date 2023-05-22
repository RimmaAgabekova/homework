package hw1;

import java.util.Scanner;
public class Work2 {
//  n! (произведение чисел от 1 до n)

    public static void main(String[] args) {
        System.out.println("Введите факториал: ");
        Scanner factorial = new Scanner(System.in);
        int f = factorial.nextInt();
        System.out.println(getFactorial(f));
    }
    public static int getFactorial(int f) {
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res = res * i;
        }
        return res;
    }
}
