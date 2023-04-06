import java.util.ArrayList;
import java.util.List;

class Lista {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int i;
        for (i = 0; i < 10000; i++) {
            lista.add(i);
        }
        
        long inicio = System.currentTimeMillis();
        for (i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("Limpando a lista...");
        lista.clear();

        if (lista.isEmpty()) System.out.println("Lista vazia");

        long fim = System.currentTimeMillis();

        long tempoDeLeitura = fim - inicio;

        System.out.println("Tempo de leitura: " + tempoDeLeitura + "ms");
    }
}
