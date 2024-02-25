import java.util.Scanner;

public class frmfrij {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String d  ="kjfnwefkjj";
        System.out.println(d.substring(0, 5));
        System.out.println(d.concat("nw"));
        System.out.println(d.charAt(5));
        System.out.println(d.chars());
        System.out.println(d.codePointAt(5));
        System.out.println(d.compareTo("e"));
        double g, x = input.nextInt(), z = input.nextInt(), y = input.nextInt(), c= input.nextInt();
         g= (Math.tan(Math.pow(x,4)-6)-Math.pow(Math.cos(z+x*y),3))/(Math.pow(Math.cos(Math.pow(x,3)),4)*Math.pow(c,2));
        System.out.println(g);
    }
}
