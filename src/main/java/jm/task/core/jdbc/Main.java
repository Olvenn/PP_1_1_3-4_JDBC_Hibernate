package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Lewis", "Hamilton", (byte) 39);
        userService.saveUser("Michael", "Michael", (byte) 49);
        userService.saveUser("Ayrton", "Senna", (byte) 29);
        userService.saveUser("Alain", "Prost", (byte) 34);
        List<User> users = userService.getAllUsers();
        System.out.println(users);
        userService.removeUserById(4);
        userService.cleanUsersTable();
        userService.dropUsersTable();



    }
}
