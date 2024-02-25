package algoritmlash;

import java.util.Deque;
import java.util.LinkedList;

public class topshiriq8 {
    public static void main(String[] args) {
                Deque<Integer> deque = new LinkedList<>();
                // Elementlarni qo'shamiz
                deque.addLast(14);
                deque.addLast(89);
                deque.addLast(99);
                deque.addLast(63);
                deque.addLast(25);
                deque.addLast(33);
                deque.pollFirst();
                deque.pollLast();
                System.out.println("Navbatning 2-elementi: " + deque.getFirst());
                System.out.println("Navbatning 5-elementi: " + deque.getLast());

    }
}
