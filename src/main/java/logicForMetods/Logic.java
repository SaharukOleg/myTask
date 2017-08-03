package logicForMetods;

import app.Show;
import user.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logic {

    public void addUser(User user) {
        System.out.println("Enter surname of user");
        String surName = Show.sc.next();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter year user");
        int year;
        while (true) {
            try {
                year = Integer.parseInt(reader.readLine());
                break;
            } catch (IOException e) {
                System.out.println("Hello!");
            } catch (NumberFormatException e) {
                System.out.println("mistake enter Year!!");
                continue;
            }
        }

        System.out.println("Enter e-mail of user");
        String mail = Show.sc.next();
        user.setSurname(surName);
        user.setYearOfBirthday(year);
        user.setEmail(mail);

    }

    public void printUser(User user) {
        System.out.println(user);
    }

    public void changeSurname(User user) {
        System.out.println("Enter new surname for user");
        String newSurname = Show.sc.nextLine();
        user.setSurname(newSurname);
    }

    public void changeYear(User user) {
        System.out.println("Enter new year for user");
        int newYear = Show.sc.nextInt();
        user.setYearOfBirthday(newYear);
    }

    public void changeEmail(User user) {
        System.out.println("enter new e-mail for user");
        String newEmail = Show.sc.nextLine();
        user.setEmail(newEmail);
    }


}





