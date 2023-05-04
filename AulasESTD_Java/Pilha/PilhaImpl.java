package Pilha;

public class PilhaImpl {
    
    public static void main(String[] args) {
        
        Pilha pilha = new Pilha(5);

        pilha.push(5);
        pilha.push(4);
        pilha.push(2);
        pilha.push(9);
        pilha.push(7);
        pilha.display();
        pilha.peek();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.display();
        pilha.peek();


    }
}
