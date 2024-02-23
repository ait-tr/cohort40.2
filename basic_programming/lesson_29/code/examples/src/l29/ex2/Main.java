package l29.ex2;


class DoubleNode {
    int data;
    DoubleNode prev;  // Ссылка на предыдущий узел
    DoubleNode next;  // Ссылка на следующий узел

    public DoubleNode(int data) {
        this.data = data;
        this.prev = null;  // По умолчанию предыдущий узел не задан
        this.next = null;  // По умолчанию следующий узел не задан
    }
}


class DoublyLinkedList {
    DoubleNode head;  // Начало списка
    DoubleNode tail;  // Конец списка

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Методы для добавления, удаления и других операций...
}


