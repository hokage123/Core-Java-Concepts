package com.declarativehibernate.declarativehibernate.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "hib_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "USERID", nullable = false)
    private Long userID;

    @Column(name= "USERNAME", nullable = false)
    private String userName;

    @Column(name="USERPAN", nullable=false)
    private String userpan;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserpan() {
        return userpan;
    }

    public void setUserpan(String userpan) {
        this.userpan = userpan;
    }
}
