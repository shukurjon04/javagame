package algoritmlash;

import java.util.LinkedList;
import java.util.Queue;

public class topshiriq7 {
    public static void main(String[] args) {
        Queue<Integer> sonlar = new LinkedList<>();
        sonlar.add(15);
        sonlar.add(17);
        sonlar.add(3);
        sonlar.add(5);
        sonlar.add(15);
        sonlar.add(18);
        if (sonlar.isEmpty()){
            System.out.println("Navbat : "+sonlar);
        }else {
            System.out.println("Navbatda "+sonlar.size()+" ta element bor");
        }
    }
}
