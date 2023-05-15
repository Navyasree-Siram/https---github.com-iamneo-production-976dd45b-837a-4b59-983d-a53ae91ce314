package com.birthday.birthday_event.model;

import javax.persistence.*;
// import jakarta.persistence.*;
@Entity
@Table(name = "eventinfo")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eventid;

    @Column(name = "eventName")
    private String eventname;
    
    @Column(name = "applicantName")
    private String apptname;

    @Column(name = "applicantAddress")
    private String apptadd;

    @Column(name = "applicantMobile")
    private String apptmobile;

    @Column(name = "applicantMail")
    private String apptemail;

    @Column(name = "eventAddress")
    private String eventadd;

    @Column(name = "eventDate")
    private String eventdate;

    @Column(name = "eventTime")
    private String eventtime;

    @Column(name = "eventMenuId")
    private String eventmenuid;

    @Column(name = "addOnId")
    private String addonid;

    @Column(name = "eventCost")
    private String eventcost;
    
    public Event(){
        
    }
    public Event(long eventid, String eventname, String apptname, String apptadd, String apptmobile, String apptemail, String eventadd, String eventdate, String eventtime, String eventmenuid, String addonid, String eventcost) {
        this.eventid = eventid;
        this.eventname = eventname;
        this.apptname = apptname;
        this.apptadd = apptadd;
        this.apptmobile = apptmobile;
        this.apptemail = apptemail;
        this.eventadd = eventadd;
        this.eventdate = eventdate;
        this.eventtime = eventtime;
        this.eventmenuid = eventmenuid;
        this.addonid = addonid;
        this.eventcost = eventcost;
    }

    public long getEventid() {
        return this.eventid;
    }

    public void setEventid(long eventid) {
        this.eventid = eventid;
    }

    public String getEventname() {
        return this.eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getApptname() {
        return this.apptname;
    }

    public void setApptname(String apptname) {
        this.apptname = apptname;
    }

    public String getApptadd() {
        return this.apptadd;
    }

    public void setApptadd(String apptadd) {
        this.apptadd = apptadd;
    }

    public String getApptmobile() {
        return this.apptmobile;
    }

    public void setApptmobile(String apptmobile) {
        this.apptmobile = apptmobile;
    }

    public String getApptemail() {
        return this.apptemail;
    }

    public void setApptemail(String apptemail) {
        this.apptemail = apptemail;
    }

    public String getEventadd() {
        return this.eventadd;
    }

    public void setEventadd(String eventadd) {
        this.eventadd = eventadd;
    }

    public String getEventdate() {
        return this.eventdate;
    }

    public void setEventdate(String eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventtime() {
        return this.eventtime;
    }

    public void setEventtime(String eventtime) {
        this.eventtime = eventtime;
    }

    public String getEventmenuid() {
        return this.eventmenuid;
    }

    public void setEventmenuid(String eventmenuid) {
        this.eventmenuid = eventmenuid;
    }

    public String getAddonid() {
        return this.addonid;
    }

    public void setAddonid(String addonid) {
        this.addonid = addonid;
    }

    public String getEventcost() {
        return this.eventcost;
    }

    public void setEventcost(String eventcost) {
        this.eventcost = eventcost;
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

    
