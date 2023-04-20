package Ordenacao;

public class InsertionSort {
    

    public static void main(String[] args) {
        

        int vetor[] = { 5,3,2,4,7,1,0,6 };

        for(int i = 1; i < vetor.length; i++) {
            int valorAtual = vetor[i]; 
            int j = i - 1;

            while(j >=0 && vetor[j] > valorAtual) {
                vetor[j +1] = vetor[j];
                j--;
            }
            vetor[j + 1] = valorAtual;
        }

    }
}
