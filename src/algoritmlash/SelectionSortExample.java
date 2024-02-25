package algoritmlash;
public class SelectionSortExample {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String a[]){
        int[] arr1 = {68,43,11,32,71,57,84,45,36};
        System.out.println("Sıralanmamış siyahı:");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1);

        System.out.println("Sıralanmış siyahı:");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
