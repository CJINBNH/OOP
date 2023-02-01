package OOP_seminars.seminar_05.model.service;

import OOP_seminars.seminar_05.model.data.User;

public interface DataService<U extends User> {

    void addUser(U user);
    void saveUsers(String path);
    void loadUsers(String path);

}
