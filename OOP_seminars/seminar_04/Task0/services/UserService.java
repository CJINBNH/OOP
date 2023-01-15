package OOP_seminars.seminar_04.Task0.services;

import OOP_seminars.seminar_04.Task0.models.User;

public class UserService<U extends User> {

    public U login (String username, String password) {
        return null;
    }

    public U register (String username, String password) {
        return null;
    }

    public void showProfile (U user) {
        System.out.println(user.getUsername());

    }
}
