package Fila;

public class FilaImpl {
    

    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.enfileirar(5);
        fila.enfileirar(4);
        fila.enfileirar(3);
        fila.enfileirar(6);
        fila.enfileirar(9);
        fila.enfileirar(11);
        fila.display();
        fila.desfileirar();
        fila.desfileirar();
        fila.desfileirar();
        fila.desfileirar();
        fila.desfileirar();
        fila.desfileirar();
        fila.display();
    }

}
