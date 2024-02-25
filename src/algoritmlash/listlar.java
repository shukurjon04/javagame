package algoritmlash;

import java.util.*;

public class listlar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // ro'yxatlar oddiy royxat
       /* ArrayList<Integer> sonlar = new ArrayList<>();
        for (int i = 0; i < 99; i+=2) {
            sonlar.add(i);
            i++;
        }
        sonlar.removeIf(n->n%2==0);
        sonlar.ensureCapacity(5);
        System.out.println(sonlar);*/


        System.out.println("---------------------------------------------------------------");




          // navbat birinchi kirgan birinchi chiqadi
      /* Queue<Integer> son = new LinkedList<>();

       Stack<Integer> b = new Stack<>();
       int g;
        for (int i = 0; i < 6; i++) {
            System.out.print("Sonni kiriting : ");
            g= input.nextInt();
            son.add(g);
            b.add(g);
        }
        System.out.println("navbat birinchi kirgan birinchi chiqadi -> "+son+"\nnavbat oxirgi kirgan birinchi chiqadi -> "+b);
        // ikki tomonlama navbat birinchi kiirgan birinchi chiqadi va oxiri kirgan birinchi chiqadi
        Deque<Integer> ikki = new ArrayDeque<>();
        for (int i = 0; i < 6; i++) {
            System.out.print("ikki tomonlama royxat lementlarini kiriting : ");
            g=input.nextInt();
            ikki.add(g);
        }
        System.out.println("ikki tomonlama navbat -> "+ikki);
        System.out.println("ikki tomonlama navbat 2-elementi -> "+ikki.getFirst());*/





       /* Deque<Integer> dq = new ArrayDeque<>(); // Integer tipidagi ikki tomonlama navbat yaratamiz
        dq.add(14); // navbatga 14 qiymatini kiritamiz
        dq.add(89); // navbatga 89 qiymatini kiritamiz
        dq.add(99); // navbatga 99 qiymatini kiritamiz
        dq.add(63); // navbatga 63 qiymatini kiritamiz
        dq.add(25); // navbatga 25 qiymatini kiritamiz
        dq.add(33); // navbatga 33 qiymatini kiritamiz
        System.out.println("Ikki tomonlama navbat: " + dq); // ikki tomonlama navbatni ekranga chiqaramiz
        System.out.println("Navbatning 2-elementi: " + dq.add(1)); // at() funksiyasi yordamida navbatning 2-elementini olib chiqaramiz
        System.out.println("Navbatning 5-elementi: " + dq.add(4)); // at() funksiyasi yordamida navbatning 5-elementini olib chiqaramiz*/





        // oxiri kirgan birinchi chiqadi
        /*Stack<Integer> son = new Stack<>();
        for (int i = 0; i < 10; i+=3) {
            son.push(i);
        }
        son.peek();
        son.pop();
        System.out.println(son.search(3));
        System.out.println(son.capacity());
        System.out.println(son);
        System.out.println(son.isEmpty());*/



        //vector bilan ishlash
        Vector<Integer> son = new Vector<>();
        for (int i = 0; i < 18; i++) {
            son.add(i);
        }
        Integer[] a  = new Integer[son.size()];
        System.out.println(son);
        System.out.println(son.size());
        son.copyInto(a);
        System.out.println(Arrays.toString(a));
        System.out.println(son.elementAt(4));
    }

}
