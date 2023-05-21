package hw1;

import java.util.Scanner;

public class Work3 {
    //    3) Реализовать простой калькулятор
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = number.nextInt();
        System.out.println("Введите действие: + - / * ");
        String symbol = number.next();
        System.out.println("Введите второе число: ");
        int b = number.nextInt();
        getCalculator(a, symbol, b);
    }
    public static void getCalculator(int a, String symbol, int b) {
        if ("+".equals(symbol)) {
            System.out.println(a+b);
        } else if ("-".equals(symbol)) {
            System.out.println(a-b);
        } else if ("*".equals(symbol)) {
            System.out.println(a * b);
        } else if ("/".equals(symbol)) {
            System.out.println(a/b);
        } else {
            System.out.println("Ввели неверное действие!");
        }

    }
}
