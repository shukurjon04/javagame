package algoritmlash;

// Daraxtning tuguni tasvirlash uchun class
class Node {
    int key;
    Node left, right;

    // Yangi tugun yaratish konstruktori
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// Daraxt yordamida saralash klassi
class TreeSort {
    // Daraxtning ildizini saqlash uchun o'zgaruvchi
    Node root;

    // Daraxtga yangi element qo'shish metodi
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Daraxtga yangi element qo'shish rekursiv metodi
    Node insertRec(Node root, int key) {
        // Agar daraxt bo'sh bo'lsa, yangi tugun qaytariladi
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Agar element daraxtning ildizidan kichik bo'lsa, chap tomonidagi o'g'ilga qo'shiladi
        if (key < root.key)
            root.left = insertRec(root.left, key);
            // Agar element daraxtning ildizidan katta bo'lsa, o'ng tomonidagi o'g'ilga qo'shiladi
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        // O'zgartirilmagan daraxtni qaytarish
        return root;
    }

    // Daraxtni in-order traversal usuli bilan chiqarish metodi
    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.key + " ");
            inOrderRec(root.right);
        }
    }

    // Daraxtni tartiblangan holda chiqarish metodi
    void inOrder() {
        inOrderRec(root);
    }

    // Asosiy metod
    public static void main(String[] args) {
        TreeSort tree = new TreeSort();

        // Berilgan ketma-ketlikni daraxtga aylantirish
        int arr[] = {4, 3, 5, 1, 7, 8, 6, 2};
        for (int i = 0; i < arr.length; i++)
            tree.insert(arr[i]);

        // Daraxtni tartiblangan holda chiqarish
        tree.inOrder();
    }
}

