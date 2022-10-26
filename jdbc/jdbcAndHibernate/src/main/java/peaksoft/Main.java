package peaksoft;
import peaksoft.dao.UserDaoHibernateImpl;

import java.sql.SQLException;
public class Main {

    public static void main(String[] args) throws SQLException {
        UserDaoHibernateImpl userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();

    }
    }


