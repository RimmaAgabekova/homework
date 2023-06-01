package hw3;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 2)Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Work2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(55);
        queue.add(45);
        queue.add(24);
        queue.add(18);
        System.out.println("очередь элементов: " + queue);

        System.out.println(enqueue((LinkedList<Integer>) queue));
        System.out.println("переместили элемент в конец очереди " + queue);

        System.out.println(dequeue((LinkedList<Integer>) queue));
        System.out.println("удалили первый элемент " + queue);

        System.out.println(first((LinkedList<Integer>) queue)); // вывели первый элемент
        System.out.println("вывели первый элемент " + queue);
    }
    public static boolean enqueue (LinkedList<Integer > queue){// помещает элемент в конец очереди
        return queue.offerLast(7);
    }
    public static int dequeue (LinkedList<Integer> queue) { // возвращает первый элемент из очереди и удаляет его
        return queue.remove();
    }
    public static int first (LinkedList<Integer> queue) { // возвращает первый элемент из очереди, не удаляя
        return queue.get(0);
    }
}

