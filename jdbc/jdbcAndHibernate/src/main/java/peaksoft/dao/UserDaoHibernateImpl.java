package peaksoft.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.model.User;
import peaksoft.util.UtilHibernate;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    private final SessionFactory sessionFactory = UtilHibernate.createSessionFactory();
    private final EntityManagerFactory entityManagerFactory = UtilHibernate.createEntityManagerFactory();

    public UserDaoHibernateImpl() {
    }


    @Override
    public void createUsersTable() {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            session.createSQLQuery("""
                create table ussers(
                id serial primary key,
                name varchar(50),
                lastName varchar(50),
                age int )""").executeUpdate();

            session.getTransaction().commit();
            session.close();
        } catch (Exception exception) {
            System.out.println("exception createTable");
        }

    }



    @Override
    public void dropUsersTable() {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            session.createSQLQuery("drop table ussers").executeUpdate();

            session.getTransaction().commit();
            session.close();
            System.out.println("SUCCESSFULLY");
        } catch (Exception exception) {
            System.out.println("exception dropTable");
        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            session.persist(new User(name, lastName, age));

            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println("error saveUsers!!!");
        }

    }

    @Override
    public void removeUserById(long id) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            User user = entityManager.find(User.class, id);
            entityManager.remove(user);
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (Exception e) {
            System.out.println("no such identifier!!!");
        }
    }

    @Override
    public List<User> getAllUsers() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        List<User> users = entityManager.createQuery("select c from User c ", User.class).getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();
        return users;
    }


    @Override
    public void cleanUsersTable() {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            session.createSQLQuery("truncate table ussers").executeUpdate();

            session.getTransaction().commit();
            session.close();

        } catch (Exception exception) {
            System.out.println("exception cleanUsersTable");
        }
    }
    }

