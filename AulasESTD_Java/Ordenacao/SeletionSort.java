package Ordenacao;

/**
 * SeletionSort
 */
public class SeletionSort {

    public static void main(String[] args) {
        int[] lista = {1, 5, 3, 2, 4, 7, 0, 6, 8, 9 };
        int i, j, min, aux, interacao = 0;

        for (i = 0; i < lista.length - 1; i++) {
            min = i;
            for (j = i + 1; j < lista.length; j++) {
                interacao++;
                if (lista[j] < lista[min]) {
                    min = j;
                }
            }
            if (lista[i] != lista[min]) {
                aux = lista[i];
                lista[i] = lista[min];
                lista[min] = aux;
            }
        }

        System.out.println("Interacoes: " + interacao);

        for (i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}