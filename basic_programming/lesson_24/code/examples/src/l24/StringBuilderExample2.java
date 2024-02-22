package l24;

public class StringBuilderExample2 {
    public static void main(String[] args) {
        // Создаем объект StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // Добавляем строки к объекту StringBuilder
        stringBuilder.append("Привет, ");
        stringBuilder.append("мир!");

        // Выводим результат
        System.out.println("Результат после добавления строк: " + stringBuilder.toString());

        // Вставляем строку в определенную позицию
        stringBuilder.insert(7, "дорогой ");

        // Выводим результат
        System.out.println("Результат после вставки строки: " + stringBuilder.toString());

        // Заменяем подстроку в объекте StringBuilder
        stringBuilder.replace(0, 7, "Здравствуй");

        // Выводим результат
        System.out.println("Результат после замены подстроки: " + stringBuilder.toString());

        // Удаляем часть строки из объекта StringBuilder
        stringBuilder.delete(11, 19);

        // Выводим результат
        System.out.println("Результат после удаления части строки: " + stringBuilder.toString());

        // Обратное удаление части строки
        stringBuilder.deleteCharAt(5);

        // Выводим результат
        System.out.println("Результат после удаления символа: " + stringBuilder.toString());

        // Переворачиваем строку
        stringBuilder.reverse();

        // Выводим результат
        System.out.println("Результат после переворота строки: " + stringBuilder.toString());
    }
}
