import java.util.Scanner; 

class Main {

    public static void main (String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas: ");
        int linhas = scanner.nextInt();

        System.out.println("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");

        // Loop para preencher a matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento ["+i+"]["+j+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nA matriz digitada foi:");

        // Loop para imprimir a matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        scanner.close();

    }

}