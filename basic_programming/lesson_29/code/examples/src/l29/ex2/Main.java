package l29.ex2;


interface IntList {
    int get(int index);
    void add(int value);
    boolean remove(int index);
    int size();
//    void add(int value, int index);
//    void addLast(int value);
//    void addFirst(int value);
//    void clear();
// опционально: добавить итератор как в домашке 28
}


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


class DoublyLinkedList implements IntList {
    DoubleNode head;  // Начало списка
    DoubleNode tail;  // Конец списка
    int size;  // Конец списка

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private DoubleNode getNode(int index) {
        if (index >= this.size && index >= 0)
            return null;

        int i = 0;
        DoubleNode node = this.head;

        while (i < index) {
            node = node.next;
            i++;
        }

        return node;
    }

    @Override
    public int get(int index) {
        DoubleNode node = getNode(index);
        return node == null ? 0 : node.data;
    }

    @Override
    public void add(int value) {
        DoubleNode node = new DoubleNode(value);

        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }

        size++;
    }

    @Override
    public boolean remove(int index) {
        DoubleNode node = getNode(index);
        if (node == null)
            return false;

        size--;

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            return true;
        } else if (this.size == 2 && index == 1) {
            node.prev.next = null;
            this.tail = node.prev;
            return true;
        } else if (this.size == 2 && index == 0) {
            node.next.prev = null;
            this.head = node.next;
            return true;
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = null;
        node.prev = null;

        return true;
    }

    @Override
    public int size() {
        return size;
    }
}
