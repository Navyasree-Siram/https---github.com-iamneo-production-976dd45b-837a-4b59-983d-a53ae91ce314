package com.birthday.birthday_event.model;
import javax.persistence.*;
// import jakarta.persistence.*;
@Entity
@Table(name = "AddOninfo")
public class AddOn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addOnid;

    @Column(name = "AddOnName")
    private String addOnName;

    @Column(name = "AddOnDescription")
    private String addOnDec;
    
    @Column(name = "AddOnPrice")
    private String addOnPrice;

    public AddOn(){
        
    }

    public AddOn(long addOnid, String addOnName, String addOnDec, String addOnPrice) {
        this.addOnid = addOnid;
        this.addOnName = addOnName;
        this.addOnDec = addOnDec;
        this.addOnPrice = addOnPrice;
    }


    public long getAddOnid() {
        return this.addOnid;
    }

    public void setAddOnid(long addOnid) {
        this.addOnid = addOnid;
    }

    public String getAddOnName() {
        return this.addOnName;
    }

    public void setAddOnName(String addOnName) {
        this.addOnName = addOnName;
    }

    public String getAddOnDec() {
        return this.addOnDec;
    }

    public void setAddOnDec(String addOnDec) {
        this.addOnDec = addOnDec;
    }

    public String getAddOnPrice() {
        return this.addOnPrice;
    }

    public void setAddOnPrice(String addOnPrice) {
        this.addOnPrice = addOnPrice;
    }

    public Object getEmail() {
        return null;
    }

    public Object getPassword() {
        return null;
    }

    public void setEmail(Object email) {
    }

    public void setPassword(Object password) {
    }
    
}
