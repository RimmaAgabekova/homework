package hw3;

import java.util.LinkedList;
import java.util.Collections;

/**
 * 1)Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class Work1 {
    public static void main(String[] args){
        String str1 = new String("Hello World!");
        String str2 = new String("My name is Rimma");
        String str3 = new String("I love Java");
        String str4 = new String("I'm from Saratov");

        LinkedList<String> ll = new LinkedList<>();
        ll.add(str1);
        ll.add(str2);
        ll.add(str3);
        ll.add(str4);

        System.out.println(ll);

        Collections.reverse(ll);
        System.out.print("\n“перевернутый” список: " + ll);

    }
}
