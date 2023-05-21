package hw1;
import java.util.Scanner;

//  Вычислить n-ое треугольного число (сумма чисел от 1 до n),
//  n! (произведение чисел от 1 до n)
public class Work1 {
        public static void main(String[] args) {
            System.out.println("Введите число n: ");
            Scanner number = new Scanner(System.in);
            int n = number.nextInt();
            getNumber(n);
        }
        public static void getNumber(int n) {
            int composition = n*(n+1)/2;
            System.out.println(composition);
        }
    }

