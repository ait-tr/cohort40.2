package cons_14.example01.controller;

import cons_14.example01.model.UserModel;
import cons_14.example01.view.UserView;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserController {
    private static UserController controller = null;
    private Map<Integer, UserModel> users = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    // view тоже где-то здесь есть

    public static UserController getInstance() {
        if (controller == null) {
            controller = new UserController();
        }
        return controller;
    }

    private UserController() {}

    public void showUser(int id) {
        UserModel user = users.get(id);
        if (user == null) {
            System.out.println("No user found with id " + id);
        } else {
            UserView view = new UserView(user);
            view.showUser();
        }
    }

    public boolean register() {
        // используем view чтобы показать форму регистрации
        System.out.println("Enter login: ");
        String login = scanner.next();
        System.out.println("Enter password: ");
        String pass = scanner.next();
        // валидация логина..
        // проверяем символы, длинну и т.д.

        // а потом уникальность
        for (UserModel user : users.values()) {
            if (user.getLogin().equalsIgnoreCase(login)) {
                // вывести сообщение что такой пользователь уже зарегистрирован
                return false;
            }
        }
        // валидация пароля (наличие букв, цифр и т.д.)
        if (pass.length() < 8 || pass.length() > 63) {
            // вывести сообщение что пароль слишком короткий / длинный
            return false;
        }
        // INSERT INTO Users (login, password) VALUES (?, ?)
        // через PreparedStatement заполнить знаки вопроса и выполнить запрос....
        int newId = users.size();
        UserModel user = new UserModel(newId, login, pass);
        users.put(newId, user);
        return true;
    }

    public boolean logIn() {
        // используем view чтобы показать форму регистрации
        System.out.println("Enter your login: ");
        String login = scanner.next();
        System.out.println("Enter your password: ");
        String pass = scanner.next();
        UserModel user = null;
        for (UserModel u : users.values()) {
            if (u.getLogin().equalsIgnoreCase(login)) {
                user = u;
                break;
            }
        }

        if (user.getPassword().equals(pass)) {
            return true;
        }

        // говорим что пароль указан не верно, удобно будет использовать исключения
        return false;

        /*
        for (UserModel user : users.values()) {
            if (user.getLogin().equals(login) && user.getPassword().equals(pass)) {
                 return true;
            }
        }
         */
    }

    public int getUserId(String login) {
        for (UserModel u : users.values()) {
            if (u.getLogin().equals(login)) {
                return u.getId();
            }
        }
        return -1;
    }

    public String getUserLogin(int id) {
        UserModel user = users.get(id);
        if (user == null) {
            return null;
        }
        return user.getLogin();
    }
}
