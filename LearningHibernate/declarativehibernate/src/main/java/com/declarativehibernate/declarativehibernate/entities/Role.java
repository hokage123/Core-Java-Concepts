package com.declarativehibernate.declarativehibernate.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="hib_role")
public class Role implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ROLEID", nullable = false)
    private Long roleID;

    @Column(name="ROLENAME", nullable=false)
    private String roleName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "hib_role")
    @Fetch(FetchMode.SUBSELECT)
    private Set<User> users;

    @Column(name="ISPREMIUM", nullable=false)
    private boolean isPremium;

    @Column(name="ISBUISNESS", nullable=false)
    private boolean isBuisness;

    public Role() {
        this.users = users;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public boolean isBuisness() {
        return isBuisness;
    }

    public void setBuisness(boolean isBuisness) {
        this.isBuisness = isBuisness;
    }
