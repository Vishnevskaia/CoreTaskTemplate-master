package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

        User user1 = new User("Anastasiia", "Vishnya", (byte) 57);
        User user2 = new User("Alex", "Alexievich", (byte) 25);
        User user3 = new User("Irma", "Vasiiileva", (byte) 75);
        User user4 = new User("Fedor", "Romanov", (byte) 15);

        Util.getConnect();
        UserServiceImpl user = new UserServiceImpl();
        user.createUsersTable();

        user.saveUser("Anastasiia", "Vishnya", (byte) 57);
        user.saveUser("Alex", "Alexievich", (byte) 25);
        user.saveUser("Irma", "Vasiiileva", (byte) 75);
        user.saveUser("Fedor", "Romanov", (byte) 15);
        user.removeUserById(3);
        System.out.println(user.getAllUsers());
        System.out.println(user1);
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}
