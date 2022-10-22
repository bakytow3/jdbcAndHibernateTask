package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args)throws SQLException {
        // реализуйте алгоритм здесь
       UserDaoJdbcImpl userDaoJdbc = new UserDaoJdbcImpl();
//        userDaoJdbc.createUsersTable();
//        userDaoJdbc.dropUsersTable();
        userDaoJdbc.saveUser("argen ","gena",(byte)8 );
//        userDaoJdbc.saveUser("syimyk ","mena",(byte)8 );
//        userDaoJdbc.saveUser("Kanat ","Subanov",(byte)13 );
//        userDaoJdbc.removeUserById(1);
//        for (User u: userDaoJdbc.getAllUsers()) {
//            System.out.println(u);
//        }
//        userDaoJdbc.cleanUsersTable();

    }
}
