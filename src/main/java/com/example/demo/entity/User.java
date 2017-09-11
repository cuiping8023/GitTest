package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017/8/2.
 */
@Entity
public class User {
    @Id
    private int id;
    private String name;
    private String password;
    private String salt;
    private String head_url;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setHead_url(String head_url) {
        this.head_url = head_url;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public String getHead_url() {
        return head_url;
    }

    @Override
    public String toString() {
        return this.getId()+"  "+this.getName()+"  " + this.getPassword()+"  "+this.getSalt()+"  "+this.getHead_url();
    }
}
