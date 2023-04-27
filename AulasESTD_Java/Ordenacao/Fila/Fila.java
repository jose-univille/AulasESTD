package Ordenacao.Fila;

public class Fila {
    
    private Integer[] elementos;

    private int front, rear, size;

    public Fila(int size) {
        elementos = new Integer[size];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return front == 0 && rear == elementos.length -1; 
    }

    public void enfileirar(int elemento) {
        if(isFull()) {
            System.out.println("Fila cheia");
        } else {
            if(front == -1) {
                front = 0;
            }

            rear++;
            elementos[rear] = elemento;
            size++;
            System.out.println("Elemento inserido: " + elemento);

        }
    }

    public int desfileirar() {
        int elemento;
        if (isEmpty()) {
            System.out.println("Fila vazia");
            return (-1);
        } else {
            elemento = elementos[front];
            if(front >= rear) {
                front = rear = -1;
            } else {
                front++;
            }

            System.out.println("Elemento removido: " + elemento);
            return (elemento);
        }
    }

    public void display() {
        int i;
        if(isEmpty()) {
            System.out.println("Fila vazia");
        } else {
            System.out.println("Fila: ");
            for( i = front; i <= rear; i++) {
                System.out.println(elementos[i] + " ");
            }
        }
    }

}
