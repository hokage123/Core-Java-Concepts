package com.declarativehibernate.declarativehibernate.dao;
import com.declarativehibernate.declarativehibernate.entities.Role;
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
public class RoleManagerDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void addRole(Role role)
    {
        sessionFactory.getCurrentSession().save(role);
    }

    public void updateRole(Role role)
    {
        sessionFactory.getCurrentSession().update(role);
    }

    public void deleteRole(Role role)
    {
        sessionFactory.getCurrentSession().delete(role);
    }

    public List<User> getRole(Long roleId)
    {
        Session session = sessionFactory.getCurrentSession();
        Query<User> query = session.createQuery("FROM hib_role WHERE userId = :userId", User.class);
        query.setParameter("roleId",roleId);
        return query.list();
    }
}
