package com.birthday.birthday_event.model;

import javax.persistence.*;
// import jakarta.persistence.*;
@Entity
@Table(name = "admininfo")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "mailid")
    private String mailid;

    @Column(name = "pwd")
    private String password;

    @Column(name = "mobileNumber")
    private String mobilenumber;

    @Column(name = "userRole")
    private String userrole;
    
    public Admin(){
        
    }

    public Admin(long id, String mailid, String password, String mobilenumber, String userrole) {
        this.id = id;
        this.mailid = mailid;
        this.password = password;
        this.mobilenumber = mobilenumber;
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

    public String getMobilenumber() {
        return this.mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getUserrole() {
        return this.userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

}
