package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MyAppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;

    private String email;

    private String password;

   public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
