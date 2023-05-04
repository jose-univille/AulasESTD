package Pilha;

public interface IPilha {
    
    public boolean isEmpty();

    public boolean isFull();

    public void push(int elemento);

    public int pop();

    public void peek();

    public void display();

}
