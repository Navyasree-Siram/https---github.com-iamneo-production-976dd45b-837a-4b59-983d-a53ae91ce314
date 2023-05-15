package com.birthday.birthday_event.model;

import javax.persistence.*;
// import jakarta.persistence.*;
@Entity
@Table(name = "themeinfo")
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long themeid;

    @Column(name = "ThemeName")
    private String themename;

    @Column(name = "themeImageURL")
    private String themeimgurl;

    @Column(name = "themeDescription")
    private String themedes;

    @Column(name = "themePhotographer")
    private String themephtgrphr;

    @Column(name = "themeVideographer")
    private String themevidgrphr;

    @Column(name = "themeReturnGift")
    private String themeretgft;

    @Column(name = "themeCost")
    private String themecst;
    
    public Theme(){
        
    }


    public Theme(long themeid, String themename, String themeimgurl, String themedes, String themephtgrphr, String themevidgrphr, String themeretgft, String themecst) {
        this.themeid = themeid;
        this.themename = themename;
        this.themeimgurl = themeimgurl;
        this.themedes = themedes;
        this.themephtgrphr = themephtgrphr;
        this.themevidgrphr = themevidgrphr;
        this.themeretgft = themeretgft;
        this.themecst = themecst;
    }

    public long getThemeid() {
        return this.themeid;
    }

    public void setThemeid(long themeid) {
        this.themeid = themeid;
    }

    public String getThemename() {
        return this.themename;
    }

    public void setThemename(String themename) {
        this.themename = themename;
    }

    public String getThemeimgurl() {
        return this.themeimgurl;
    }

    public void setThemeimgurl(String themeimgurl) {
        this.themeimgurl = themeimgurl;
    }

    public String getThemedes() {
        return this.themedes;
    }

    public void setThemedes(String themedes) {
        this.themedes = themedes;
    }

    public String getThemephtgrphr() {
        return this.themephtgrphr;
    }

    public void setThemephtgrphr(String themephtgrphr) {
        this.themephtgrphr = themephtgrphr;
    }

    public String getThemevidgrphr() {
        return this.themevidgrphr;
    }

    public void setThemevidgrphr(String themevidgrphr) {
        this.themevidgrphr = themevidgrphr;
    }

    public String getThemeretgft() {
        return this.themeretgft;
    }

    public void setThemeretgft(String themeretgft) {
        this.themeretgft = themeretgft;
    }

    public String getThemecst() {
        return this.themecst;
    }

    public void setThemecst(String themecst) {
        this.themecst = themecst;
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
