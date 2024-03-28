package com.declarativehibernate.declarativehibernate.dao;

import com.declarativehibernate.declarativehibernate.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserManagerDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void addUser(User user)
    {
        sessionFactory.getCurrentSession().save(user);
    }

    public void updateUser(User user)
    {
        sessionFactory.getCurrentSession().update(user);
    }

    public void deleteUser(User user)
    {
        sessionFactory.getCurrentSession().delete(user);
    }

    public List<User> getUser(Long userId)
    {
        Session session = sessionFactory.getCurrentSession();
        Query<User> query = session.createQuery("FROM hib_user WHERE userId = :userId", User.class);
        query.setParameter("userId",userId);
        return query.list();
    }
}
