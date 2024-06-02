package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // implement algorithm here
        UserService userService = new UserServiceImpl();
        try {
            // Create Users table
            userService.createUsersTable();

            // Add 4 users to the table
            userService.saveUser("John", "Doe", (byte) 30);
            userService.saveUser("Jane", "Smith", (byte) 25);
            userService.saveUser("Alice", "Johnson", (byte) 28);
            userService.saveUser("Bob", "Brown", (byte) 35);

            // Get all users and print them
            List<User> users = userService.getAllUsers();
            users.forEach(System.out::println);

            // Clear the Users table
            userService.cleanUsersTable();

            // Drop the Users table
            userService.dropUsersTable();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
