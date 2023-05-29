package hw2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


//Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение
public class Work {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 500; i++) {
            array.add(random.nextInt(500));
        }
        System.out.println(array);
        System.out.println();
//      1)
        for (int i = array.size() - 1; i >= 0; i--) {
                int even = array.get(i) % 2;
                if (even == 0) {
                    array.remove(i);
                }
            }
            System.out.println("Список с удаленными четными числами: \n " + array);

//      2)
        System.out.println("Максимальное число: " + Collections.max(array));
//      3)
        System.out.println("Минимальное число: " + Collections.min(array));
//      4)
        int sum = 0;
        for(Integer integer : array){
            sum += integer.intValue();
        }
        double average = sum * 1.0 / array.size();
        System.out.println("Среднее значение чисел: " + Math.round(average));
        }
    }

