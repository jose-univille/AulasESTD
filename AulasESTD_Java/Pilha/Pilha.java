package Pilha;

public class Pilha implements IPilha {

    private int capacity;

    private int top;

    private int[] stack;

    public Pilha(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.stack = new int[capacity];
    }

    @Override
    public void display() {
        if(isEmpty()) {
            System.out.println("Erro: pilha está vazia");
        } else {
            System.out.println("Pilha: ");
            for(int i = 0; i <=top; i++) {
                System.out.println(stack[i] + " ");
            }
            System.out.println();
        }
        
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == capacity - 1);
    }

    @Override
    public void peek() {
        if(isEmpty()) {
            System.out.println("Erro: pilha está vazia");
            return;
        }
        System.out.println("Topo: " + stack[top]);
        
    }

    @Override
    public int pop() {
        if(isEmpty()){
            System.out.println("Erro: pilha está vazia");
            return -1;
        }
        int value = stack[top];
        top--;
        return value;
    }

    @Override
    public void push(int elemento) {
        if(isFull()) {
            System.out.println("Erro: pilha está cheia");
            return;
        }
        top++;
        stack[top] = elemento;
        
    }

    
    
}
