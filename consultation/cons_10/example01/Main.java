package cons_10.example01;

import java.util.LinkedList;

public class Main {
    public static final int length = 8;
    static LinkedList<String>[] hashTable;

    public static void addElem(String text) {
        int hash = text.hashCode();
        int index = Math.abs(hash % length);
        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
        }
        hashTable[index].add(text);
        System.out.println("Added string '" + text + "' on index " + index);
    }

    public static void main(String[] args) {
        hashTable = new LinkedList[length];
        addElem("Java");
        addElem("Hello");

        int counter = 0;
        for (LinkedList<String> list : hashTable) {
            if (list == null) {
                continue;
            }
            for (String item : list) {
                System.out.println(counter++ + ": " + item);
            }
        }
    }
}
