import java.util.Scanner;

public class kvadratnihisobla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b= 0;
        int c =0;
        while (b<=a){
            for (int i = 0; i < 3; i++) {
                b+=3;

            }
            for (int i = 0; i < 3; i++) {
                c+=b;
            }
        }
        System.out.println(c);

    }
}
