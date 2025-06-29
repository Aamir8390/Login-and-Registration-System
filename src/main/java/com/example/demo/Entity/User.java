package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name = "user_Id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_Id;

    @Column(name = "userName",length = 255)
    private String userName;

    @Column(name ="email", length = 255)
    private String email;

    @Column(name = "password", length = 255)
    private String password;


    public User(String password, String email, String userName, int user_Id) {
        this.password = password;
        this.email = email;
        this.userName = userName;
        this.user_Id = user_Id;
    }

    public User() {
    }


    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "user_Id=" + user_Id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
