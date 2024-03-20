package cons_14.example01;

import cons_14.example01.controller.UserController;

public class Main {
    public static void main(String[] args) {
        UserController userController = UserController.getInstance(); // singleton
        boolean success = userController.register();

        if (success) {
            System.out.println("Successfully registered!");
        } else {
            System.out.println("Failed to register");
            return;
        }

        success = userController.logIn();
        if (success) {
            System.out.println("Successfully loged in!");
        } else {
            System.out.println("Failed to log in");
        }
    }
}
