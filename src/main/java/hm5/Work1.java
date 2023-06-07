package hm5;


public class Work1 {
//    Реализуйте структуру телефонной книги с помощью HashMap.
//    Программа также должна учитывать, что во входной структуре будут повторяющиеся
//    имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
public static void main(String[] args) {
    PhoneBook phoneBook = new PhoneBook();
    phoneBook.fill();
    System.out.println(phoneBook);
    phoneBook.sort();
    System.out.println(phoneBook);
    }
}
