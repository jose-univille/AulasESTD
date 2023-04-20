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

    public int size() {
        int cont = 0;

        Node current = head; 

        while(current !=null) {
            cont++;
            current = current.next;
        }

        return cont;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void removeFisrt() {
        if(head == null) {
            return;
        } else {
            head = head.next;
        }
    }

    public void removeNode(int index) {
        if(head ==  null) {
            return;
        }

        if (index == 0) {
            removeFisrt();
        } else {
            Node current = head;
            for (int i = 0; i < index -1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }
    }

    public void addAt(int index, int data) {
        Node newNode = new Node(data);

        if(index == 0) {
            addFirst(data);
        } else {

            Node current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
}
