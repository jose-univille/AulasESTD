package Ordenacao.BubbleSort;

public class BubbleSort {
    
    public static void main(String[] args) {
        int[] lista = { 5, 3, 2, 4, 7, 1, 0, 6 };
        int aux, interacao = 0;

        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - i - 1; j++) {
                interacao++;
                if (lista[j] > lista[j+1]) {
                    aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                }
            }
        }

        System.out.println("Interacoes: " + interacao);

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}

