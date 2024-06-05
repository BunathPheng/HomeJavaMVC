package view;

import controller.UserController;
import model.User;

import java.util.Scanner;

public class View {

    private static final UserController userController = new UserController();

    public static void UI() {
        while (true) {
            System.out.println("******Menu*****");
            System.out.println("1.Show all user");
            System.out.println("2.Add user");
            System.out.println("3.Remove user");
            System.out.println("4.Exit");
            System.out.println("*****************");
            System.out.print("Option: ");
            int op = new Scanner(System.in).nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("This is view: ");
                    userController.getAllUser().forEach(System.out::println);
                }
                case 2 -> {
                    int id = userController.getAllUser().size() + 1;
                    System.out.print("UserName: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.print("Email: ");
                    String email = new Scanner(System.in).nextLine();
                    userController.addNewUser(new User(id, name, email));
                }
                case 3 -> {
                    System.out.print("Remove by UserID: ");
                    int id = new Scanner(System.in).nextInt();
                    userController.deleteUser(id);
                }
                case 4 -> System.exit(0);
            }
        }
    }
}
