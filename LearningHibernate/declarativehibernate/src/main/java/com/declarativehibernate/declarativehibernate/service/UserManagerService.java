package com.declarativehibernate.declarativehibernate.service;

import com.declarativehibernate.declarativehibernate.dao.UserManagerDao;
import com.declarativehibernate.declarativehibernate.entities.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserManagerService {
    @Autowired
    private UserManagerDao userManagerDao;

    public void addUser(User user)
    {
        userManagerDao.addUser(user);
    }

    public void updateUser(User user)
    {
        userManagerDao.updateUser(user);
    }

    public void deleteUser(User user)
    {
        userManagerDao.deleteUser(user);
    }

    public List<User> getUser(Long userId)
    {
        return userManagerDao.getUser(userId);
    }
}
