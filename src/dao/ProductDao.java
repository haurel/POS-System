/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbconnection.MySqlConnection;
import java.util.ArrayList;
import model.ProductModel;

/**
 *
 * @author haurel
 */
public interface ProductDao {
    
    public ArrayList<ProductModel> getAllProducts();
    public ArrayList<ProductModel> setAllProducts();
    public ProductModel getProduct(int id);
    public ProductModel getProductByName(String productName);
    public void updateProduct(ProductModel product);
    public void decreaseProduct(ProductModel product);
    
}
