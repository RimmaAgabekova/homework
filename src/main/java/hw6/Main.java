package hw6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//    Создать множество ноутбуков (Set).
//    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
//    Критерии фильтрации можно хранить в Map или в Сет. Например:
//            “Введите цифру, соответствующую необходимому критерию:
//            1 - цвет
//            2 - бренд

        Notebook notebook1 = new Notebook("MSI", "black");
        Notebook notebook2 = new Notebook("Huawei", "gray");
        Notebook notebook3 = new Notebook("Aser", "blue");
        Notebook notebook5 = new Notebook("Aser", "blue");
        Notebook notebook6 = new Notebook("MSI", "red");
        Notebook notebook7 = new Notebook("Apple", "white");
        Notebook notebook8 = new Notebook("HP", "black");
        Notebook notebook9 = new Notebook("Aser", "gray");
        Notebook notebook10 = new Notebook("Apple", "gray");

        Set<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(notebook1);
        notebookSet.add(notebook2);
        notebookSet.add(notebook3);
        notebookSet.add(notebook5);
        notebookSet.add(notebook6);
        notebookSet.add(notebook7);
        notebookSet.add(notebook8);
        notebookSet.add(notebook9);
        notebookSet.add(notebook10);

        Scanner console = new Scanner(System.in);
        System.out.println("Введите по какому критерию хотите отфильтровать ноутбуки: 1) по бренду 2) по цвету");
        int sort = console.nextInt();
        if (sort == 1) {
            System.out.println("Введите бренд из предложенного: MSI, Huawei, Aser, Apple, HP ");
            Scanner console1 = new Scanner(System.in);
            String brand = console1.nextLine().toUpperCase();

            notebookSet.forEach((notebook -> {
                if(notebook.getBrand().equals(brand)) {
                    System.out.println(notebook.getColour());
                }
            }));
        }
        if (sort == 2) {
            System.out.println("Введите цвет из предложенного: black, white, gray, blue, red  ");
            Scanner console2 = new Scanner(System.in);
            String colour = console2.nextLine().toLowerCase();

            notebookSet.forEach((notebook -> {
                if(notebook.getColour().equals(colour)) {
                    System.out.println(notebook.getBrand());
                }
            }));
/*

            } else System.out.println("Такого цвета нет!");
 */
        }
    }
}

