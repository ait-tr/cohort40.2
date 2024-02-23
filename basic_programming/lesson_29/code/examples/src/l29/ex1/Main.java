package l29.ex1;

class Node {
    int data;   // Данные, хранимые в узле
    Node next;  // Ссылка на следующий узел в списке

    public Node(int data) {
        this.data = data;
        this.next = null;  // По умолчанию следующий узел не задан
    }
}

class Main {
    public static void main(String[] args) {
        Node N1 = new Node(67);
        Node N2 = new Node(54);
        Node N3 = new Node(12);

        N1.next = N2;
        N2.next = N3;
    }
}