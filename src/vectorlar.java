import java.util.Vector;

public class vectorlar {
    public static void main(String[] args) {
        Vector<Integer> hisob = new Vector<>() ;
        for (int i = 0; i <= 18; i++) {
            hisob.add(i);
        }
        System.out.println("vektorning o'lchami : "+hisob.size());
        System.out.println("vector uchun ajratilgan hotira miqdori =  "+hisob.capacity());

    }
}
