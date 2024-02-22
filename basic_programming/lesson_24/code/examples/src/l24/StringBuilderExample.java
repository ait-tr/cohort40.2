package l24;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Создаем объект StringBuilder
        StringBuilder shoppingList;
        shoppingList = new StringBuilder();  // 1 объект типа StringBuilder

        // Добавляем пункты в список покупок
        shoppingList.append("Молоко");  // 1 объект типа String + 1 объект типа StringBuilder
        shoppingList.append(", Яйца");  // 1+1=2 объект типа String + 1 объект типа StringBuilder
        shoppingList.append(", Хлеб");  // 2+1=3 объект типа String + 1 объект типа StringBuilder
        shoppingList.append(", Шоколад");  // 3+1=4 объект типа String + 1 объект типа StringBuilder

        // Выведем итоговый список покупок
        System.out.println(
            "Список покупок: " +
            shoppingList.toString()
        );
    }
}
