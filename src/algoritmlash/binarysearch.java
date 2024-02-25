package algoritmlash;

import java.util.Scanner;

public class binarysearch {
    static int binary( int[] a , int key){
        int min =0;
        int max =a.length-1;
        while (min <= max){
            int mid = (min+max)/2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid]<key) {
                min = mid+1;

            }else {
                max = mid -1;
            }
        }
        return -1;
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        System.out.print("ismingizni yoki biron narsani kiriting : ");
        String ism = kirit.nextLine();
        System.out.print("qidirilayotgan belgini kiriting : ");
        char kalit = kirit.next().charAt(0);
        int kal = (int)kalit;
        char[] harf = ism.toCharArray();
        for (int i = harf.length-1; i >=0; i--) {
            System.out.print(harf[i]+" ");
        }
        System.out.println();
        int[] raqam =  new int[harf.length];
        for (int i = 0; i < harf.length; i++) {
            raqam[i] = (int)harf[i];
        }
        System.out.print("alifbo bo'yicha ismingizni saralanish tartibi : ");
        insertionSort(raqam);
        for (int i:raqam) {
            System.out.print((char)i+" ");

        }
        System.out.println();
        System.out.println(binary(raqam,kal));
    }
}
