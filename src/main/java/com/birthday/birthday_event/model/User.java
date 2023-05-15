package com.birthday.birthday_event.model;

import javax.persistence.*;
// import jakarta.persistence.*;
@Entity
@Table(name = "userinfo")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "mailid")
    private String mailid;

    @Column(name = "pwd")
    private String password;

    @Column(name = "userName")
    private String username;

    @Column(name = "mobileNumber")
    private String mobileno;

    @Column(name = "userRole")
    private String userrole;
    
    public User(){
        
    }


    public User(long id, String mailid, String password, String username, String mobileno, String userrole) {
        this.id = id;
        this.mailid = mailid;
        this.password = password;
        this.username = username;
        this.mobileno = mobileno;
        this.userrole = userrole;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMailid() {
        return this.mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobileno() {
        return this.mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getUserrole() {
        return this.userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }


    public Object getEmail() {
        return null;
    }


    public void setEmail(Object email) {
    }

}
