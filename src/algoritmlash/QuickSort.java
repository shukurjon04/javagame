package algoritmlash;
import java.util.ArrayList;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        // Elementlarni arrayga qo'shish
        // Masalan: array.add(5); array.add(3); va hokazo.
        System.out.println(qsort(array));
    }

    static ArrayList<Integer> qsort(ArrayList<Integer> array) {
        if (array.size() < 2) {
            return array;
        } else {
            Random rand = new Random();
            int pivotIndex = rand.nextInt(array.size());
            int pivot = array.remove(pivotIndex);
            ArrayList<Integer> kichik = new ArrayList<>();
            ArrayList<Integer> katta = new ArrayList<>();

            for (int i : array) {
                if (i <= pivot) {
                    kichik.add(i);
                } else {
                    katta.add(i);
                }
            }

            ArrayList<Integer> sortedArray = qsort(kichik);
            sortedArray.add(pivot);
            sortedArray.addAll(qsort(katta));

            return sortedArray;
        }
    }
}

