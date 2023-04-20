public class Listas {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.addNode(10);
        lista.addNode(100);
        lista.addNode(65);
        lista.addNode(5);


        lista.addFirst(50);


        lista.printList();

        long inicio = System.currentTimeMillis();

        long fim = System.currentTimeMillis();


        long tempoDeLeitura = fim - inicio;

        System.out.println("Tempo de leitura: " + tempoDeLeitura + "ms");
    }
}

