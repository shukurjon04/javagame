package algoritmlash;

import java.util.LinkedList;
import java.util.List;

public class topshiriiq6 {
    public static void main(String[] args) {
//        List<Integer> sonlar = new LinkedList<>();
//        sonlar.add(10);
//        sonlar.add(20);
//        sonlar.add(30);
//        sonlar.add(40);
//        sonlar.add(0,34);
//        sonlar.add(sonlar.size(),58);
//        System.out.println(sonlar);
        System.out.println(fibonachi(50));
    }
    static int fibonachi(int n){
        if (n <= 1) {
            return n ;
        }
       return fibonachi(n-1)+fibonachi(n-2);
    }
}
