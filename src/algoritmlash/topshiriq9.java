package algoritmlash;

import java.util.Stack;

public class topshiriq9 {
    public static void main(String[] args) {
        Stack<Integer> sonlar = new Stack<>();
        sonlar.push(10);
        sonlar.push(20);
        sonlar.push(30);
        System.out.println("Stekdan o'chirilgan element: " + sonlar.pop());
        System.out.println("Stekdan o'chirilgan element: " + sonlar.pop());
        System.out.println("Stekdan o'chirilgan element: " + sonlar.pop());
        System.out.println("Stek bo'shmi? " + sonlar.empty());
    }
}
