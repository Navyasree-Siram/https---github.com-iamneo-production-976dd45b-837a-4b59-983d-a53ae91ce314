package com.birthday.birthday_event.model;

import javax.persistence.*;
// import jakarta.persistence.*;
@Entity
@Table(name = "login")

public class LoginModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "pwd")
    private String password;

    // @Column(name = "name")
    // private String name;
    
    public LoginModel(){
        
    }

    public LoginModel(int id, String email, String password
    // , String name
    ) {
        this.id = id;
        this.email = email;
        this.password = password;
        // this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // public String getName() {
    //     return this.name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

   
    

}
