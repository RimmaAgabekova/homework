package hw1;

import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите первую цифру первого числа: ");
        int q = number.nextInt();
        System.out.println("Введите вторую цифру второго числа: ");
        int w = number.nextInt();
        System.out.println("Введите сумму чисел: ");
        int e = number.nextInt();
        System.out.println(q + "?" + "+" +  "?" + w + "=" + e + "- восстановите выражение");
        getCalculator(q, w, e);
    }
    public static void getCalculator(int q, int w, int e) {

        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((q*10 + i) + (j *10 + w) == e){
                    count +=1;
                    System.out.println(q + ""+ i +"+"+  j +"" +w +"="+ e);
                }
            }
        } if (count == 0){
            System.out.println("Такого решения нет");
        }
    }
}
