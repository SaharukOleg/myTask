package app;

import logicForMetods.Logic;
//import printScanner.PrintScanner;
import user.User;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Show {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String s;
    int i;

    public static final Scanner sc = new Scanner(System.in);
    Logic logic = new Logic();
    public User user = new User();

    public void menu() {

        while (true) {
            System.out.println(">1 Add User");
            System.out.println(">2 Print All User");
            System.out.println(">3 Change surname");
            System.out.println(">4 Change year of birth");
            System.out.println(">5 Change e-mail");
            System.out.println(">0 Завершити програму ");
            try {
                s = reader.readLine();
                i = Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("mistake");
                menu();
            }
            switch (i) {
                case 1:
                    logic.addUser(user);
                    break;
                case 2:
                    logic.printUser(user);
                    break;
                case 3:
                    logic.changeSurname(user);
                    break;
                case 4:
                    logic.changeYear(user);
                    break;
                case 5:
                    logic.changeEmail(user);
                    break;
                case 0:
                default:
                    System.exit(0);
            }
        }
    }
}
