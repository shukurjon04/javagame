package algoritmlash;


public class Graph {
            private int[][] adjacencyMatrix;
            private int numVertices;

            // Graph konstruktori
            public Graph(int numVertices) {
                this.numVertices = numVertices;
                adjacencyMatrix = new int[numVertices][numVertices];
            }

            // Tugunlarni bog'lash
            public void addEdge(int i, int j) {
                adjacencyMatrix[i][j] = 1;
                adjacencyMatrix[j][i] = 1; // Undirected graf uchun
            }

            // Grafni chiqarish
            public void printGraph() {
                for (int i = 0; i < numVertices; i++) {
                    System.out.print("Tugun " + (i + 1) + " bog'langan tugunlar: ");
                    for (int j = 0; j < numVertices; j++) {
                        if (adjacencyMatrix[i][j] == 1) {
                            System.out.print((j + 1) + " ");
                        }
                    }
                    System.out.println();
                }
            }

            // Asosiy metod
            public static void main(String[] args) {
                Graph graph = new Graph(5); // 5 ta tugunli graf
                graph.addEdge(0, 1);
                graph.addEdge(0, 4);
                graph.addEdge(1, 2);
                graph.addEdge(1, 3);
                graph.addEdge(3, 4);
                // Grafni chiqarish
                graph.printGraph();
            }
}



