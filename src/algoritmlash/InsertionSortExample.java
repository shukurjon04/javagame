package algoritmlash;


public class InsertionSortExample {

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

    public static void main(String a[]){
        int[] arr1 = {68,43,11,32,71,57,84,45,36};
        System.out.println("Sıralanmamış siyahı:");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        insertionSort(arr1);

        System.out.println("Sıralanmış siyahı:");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}

