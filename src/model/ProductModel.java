/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.Set;
import dao.ProductDao;
import java.util.ArrayList;

/**
 *
 * @author haurel
 */
public class ProductModel{
    private int id, quantity, finalQuantity;
    private String name, category, unitate;
    private float price;
    private float totalPrice;
    
    public ProductModel(){}
    
    public ProductModel(int id, String name, String category, String unitate, float price, int quantity){
        this.id = id;
        this.name = name;
        this.category = category;
        this.unitate = unitate;
        this.price = price;
        this.quantity = quantity;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getCategorie(){
        return category;
    }
    
    public void setCategorie(String categorie){
        this.category = categorie;
    }
    
    public String getUnitate(){
        return unitate;
    }
    
    public void setUnitate(String unitate){
        this.unitate = unitate;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    
    public float getPrice(){
        return price;
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
    public void calculatePrice(int quantity, float price){
        totalPrice = (float)quantity * price;
    }
    
    public float getTotalPrice(){
        return totalPrice;
    }
    
    public void calculateQuantity(int quantity, int quantityFromDB){
        finalQuantity = quantityFromDB - quantity;
    }
    
    public int getCalculateQuantity(){
        return finalQuantity;
    }
    
    public void calculateQuantityBack(int quantityFromDB){
        finalQuantity = quantityFromDB;
    }
   
    public void finalize(){
        this.id = 0;
        this.name = "";
        this.category = "";
        this.unitate = "";
        this.price = 0f;
        this.quantity = 0;
        this.totalPrice = 0;
    }
    
}
