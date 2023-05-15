package com.birthday.birthday_event.model;
import javax.persistence.*;
@Entity
@Table(name = "Menuinfo")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long foodMenuID;

    @Column(name = "FoodMenuType")
    private String foodMenuType;

    @Column(name = "FoodMenuItems")
    private String foodMenuItems;

    @Column(name = "FoodMenuCost")
    private String foodMenuCost;

    public Menu(){
        
    }

    public Menu(long foodMenuID, String foodMenuType, String foodMenuItems, String foodMenuCost) {
        this.foodMenuID = foodMenuID;
        this.foodMenuType = foodMenuType;
        this.foodMenuItems = foodMenuItems;
        this.foodMenuCost = foodMenuCost;
    }

    public long getFoodMenuID() {
        return this.foodMenuID;
    }

    public void setFoodMenuID(long foodMenuID) {
        this.foodMenuID = foodMenuID;
    }

    public String getFoodMenuType() {
        return this.foodMenuType;
    }

    public void setFoodMenuType(String foodMenuType) {
        this.foodMenuType = foodMenuType;
    }

    public String getFoodMenuItems() {
        return this.foodMenuItems;
    }

    public void setFoodMenuItems(String foodMenuItems) {
        this.foodMenuItems = foodMenuItems;
    }

    public String getFoodMenuCost() {
        return this.foodMenuCost;
    }

    public void setFoodMenuCost(String foodMenuCost) {
        this.foodMenuCost = foodMenuCost;
    }

    public Object getEmail() {
        return null;
    }

    public void setEmail(Object email) {
    }

    public Object getPassword() {
        return null;
    }

    public void setPassword(Object password) {
    }

}
