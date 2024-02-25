package algoritmlash;

import java.util.Vector;

public class topshiriq10 {
    public static void main(String[] args) {
        Vector<Integer> Vec = new Vector<>();
        for (int i = 0; i <= 18; i++) {
            Vec.add(i);
        }
        System.out.println("Vecning o'lchami: " + Vec.size());
        System.out.println("Vecning sig'imi: " + Vec.capacity());
    }
}
