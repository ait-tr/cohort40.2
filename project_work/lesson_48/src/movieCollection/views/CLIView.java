package movieCollection.views;

import movieCollection.controllers.MovieController;
import movieCollection.models.Movie;

import java.util.*;

public class CLIView {
    MovieController movieController;

    public void startIntro() { //начальное сообщение с приглашением к выбору команды
        System.out.println(
                "Выберите команду из списка. \n\n" +
                        "show\n" +
                        "save\n"
        );
        System.out.print("Введите выбранную команду: ");
    }

    public void run(String filepath) {
        //создан объект класса Manager
        movieController = new MovieController(filepath);

        //начало работы с пользовательским вводом
        Scanner scanner = new Scanner(System.in);
        String usersLine;// строка ввода пользователя

        System.out.println("Вас приветствует MovieCollection!\n");

        do { // работу цикла надо проверить, когда напишем методы
            this.startIntro();// выводим приветствие и набор команд. ожидаем ввод пользователя
            usersLine = scanner.nextLine();// считывание ввода пользователя
            String[] lineInParts = null;//вводим переменные для последующей обработки строк с пробелами
            String argIn = null;

            if (usersLine.contains(" ")) { //если строка с командой пользователя содержит пробел,
                lineInParts = usersLine.split(" ");//делим строку на части до и после пробела с помощью метода split.
                // Метод возвращает String[]
                // 1я часть - команда, 2я - аргумент
            }

            if (lineInParts != null && lineInParts.length == 2) {
                usersLine = lineInParts[0];// 1я часть - команда
                argIn = lineInParts[1];// 2я часть - аргумент (например, id)
            }

            switch (usersLine) {
                case "save":
                    this.startSaveCommand();
                    break;

                case "show":
                    this.startShowCommand();
                    break;

                default:
                    System.out.println("Вы ввели неверную команду. Попробуйте ещё раз: ");
                    continue;
            }

        } while (!usersLine.equals("exit"));
    }

    private void startShowCommand() {
        Collection<Movie> movies = movieController.handleShowCommand();
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public void startSaveCommand() {
        System.out.println("Сохраняем элементы...");
        this.movieController.handleSaveCommand();
    }
}
