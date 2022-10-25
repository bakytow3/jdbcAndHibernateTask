package peaksoft.dao;

import peaksoft.model.User;
import peaksoft.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJdbcImpl implements UserDao {

//    public final Connection connection;


    public UserDaoJdbcImpl() throws SQLException {
//        connection = new Util().getConnection();

    }

    public void createUsersTable() {
//        String query = """
//                create table users(
//                id serial primary key,
//                name varchar(50),
//                lastName varchar(50),
//                age int )""";
//        try (Statement statement = connection.createStatement()) {
//            statement.execute(query);
//
//        } catch (SQLException sqlException) {
//            System.out.println(sqlException.getMessage());
//        }
    }

    public void dropUsersTable() {
//        String query = "drop table if exists users";
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate(query);
//
//        } catch (SQLException sqlException) {
//            System.out.println(sqlException.getMessage());
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        String SQL = "insert into users (name, lastName, age) values (?,?,?)";
//        try (PreparedStatement statement = connection.prepareStatement(SQL)) {
//            statement.setString(1, name);
//            statement.setString(2, lastName);
//            statement.setByte(3, age);
//            statement.executeUpdate();
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
    }

    public void removeUserById(long id) {
//        String SQL = "delete from users where id = ? ";
//        try (PreparedStatement statement = connection.prepareStatement(SQL)) {
//            statement.setLong(1, id);
//            statement.executeUpdate();
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
    }

    public List<User> getAllUsers() throws SQLException {
//       String sql = "select * from users;";
//       try (Statement statement = connection.createStatement()) {
//           ResultSet resultSet = statement.executeQuery(sql);
//            while (resultSet.next()) {
//               User user = new User();
//                user.setId(resultSet.getLong(1));
//                user.setName(resultSet.getString(2));
//               user.setLastName(resultSet.getString(3));
//               user.setAge(resultSet.getByte(4));
//                list.add(user);
//         }
//        } catch (SQLException e) {
//          System.out.println(e.getMessage());
//      }
      return getAllUsers();
    }



    public void cleanUsersTable() {
//        String SQL = "truncate table users ";
//        try (Statement stmt = connection.createStatement()) {
//            stmt.executeUpdate(SQL);
//        } catch (SQLException ex) {
//            System.out.println("Table not found !!!");
       }
    }

