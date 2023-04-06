public class ListaEncadeada {
    
    Node head;
    
    public void addNode(int data) {
        Node newNode = new Node(data);
    
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public Node search(int data) {
         Node current = head;
    
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
    
        return null;
    }
    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
