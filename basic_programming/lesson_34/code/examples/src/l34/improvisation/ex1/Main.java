package l34.improvisation.ex1;

import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> hashTable = new Hashtable<>();

        hashTable.put("key1", "value1");
        hashTable.put("key7", "value7");
        hashTable.put("key3", "value3");
        hashTable.put("key9", "value9");
        System.out.println(hashTable);

        hashTable.remove("key3");
        System.out.println(hashTable);
    }
}

/*

* implements Collection: списку продуктов, либо мешок коллекционных машин, либо очередью объектов
* implements Map:
 - картотека винного погреба (есть какая книжка в которой укзанно где лежит та или иная бутылка вина)
 - ключ: значение
 - база данных автомобильных номеров:
    - номер машины (ключ): физически та или иная машина (значение)

* */