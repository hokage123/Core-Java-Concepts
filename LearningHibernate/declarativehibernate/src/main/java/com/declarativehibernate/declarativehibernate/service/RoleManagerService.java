package com.declarativehibernate.declarativehibernate.service;

import com.declarativehibernate.declarativehibernate.dao.RoleManagerDao;
import com.declarativehibernate.declarativehibernate.dao.UserManagerDao;
import com.declarativehibernate.declarativehibernate.entities.Role;
import com.declarativehibernate.declarativehibernate.entities.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleManagerService {
    @Autowired
    private RoleManagerDao roleManagerDao;

    public void addRole(Role role)
    {
        roleManagerDao.addRole(role);
    }

    public void updateRole(Role role)
    {
        roleManagerDao.updateRole(role);
    }

    public void deleteRole(Role role)
    {
        roleManagerDao.deleteRole(role);
    }

    public List<User> getRole(Long roleId)
    {
        return roleManagerDao.getRole(roleId);
    }
}
