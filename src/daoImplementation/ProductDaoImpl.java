/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImplementation;

import dao.ProductDao;
import dbconnection.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ProductModel;

/**
 *
 * @author haurel
 */
public class ProductDaoImpl implements ProductDao{

    MySqlConnection conn = new MySqlConnection();
    ProductModel ProductModel;
    ArrayList<ProductModel> productList;
    
    public ProductDaoImpl() {    } 

    @Override
    public ArrayList<ProductModel> getAllProducts() {
        return productList;
    }
    
    @Override
    public ArrayList<ProductModel> setAllProducts(){
        try{
            String sql = "SELECT * FROM product WHERE TRUE";
            PreparedStatement statement = conn.connect().prepareStatement(sql);
            productList = new ArrayList<>();
            ResultSet rs ;
            rs = statement.executeQuery();

            while(rs.next()){
                int id = rs.getInt("productId");
                String name = rs.getString("name");
                String category = rs.getString("category");
                String unitate = rs.getString("unitate");
                float price = rs.getFloat("price");
                int quantity = rs.getInt("quantity");
                
                ProductModel = new ProductModel(id, name, category, unitate, price, quantity);
                
//                ProductModel = new ProductModel(rs.getInt("productId"),
//                                    rs.getString("name"), rs.getString("category"),
//                rs.getString("unitate"), rs.getFloat("price"), rs.getInt("quantity"));
                productList.add(ProductModel);
            }
            return productList;
        }catch(SQLException s){
            s.printStackTrace();
        }finally{
            conn.disconnect();
            System.out.println("Disconnected!");
        }
        return null;
    }

    @Override
    public ProductModel getProduct(int id){
        try{
            String sql = "SELECT * FROM product WHERE ProductId = ?;";
            PreparedStatement statement = conn.connect().prepareStatement(sql);
            ProductModel = new ProductModel();
            
            statement.setInt(1, id);
            
            ResultSet rs ;
            rs = statement.executeQuery();
            
            if(rs.next()){
                ProductModel.setId(rs.getInt("productId"));
                ProductModel.setName(rs.getString("name"));
                ProductModel.setCategorie(rs.getString("category"));
                ProductModel.setUnitate(rs.getString("unitate"));
                ProductModel.setPrice(rs.getFloat("price"));
                ProductModel.setQuantity(rs.getInt("quantity"));
            }
            return ProductModel;
        }catch(SQLException s){
            s.printStackTrace();
        }finally{
            conn.disconnect();
            System.out.println("Disconnected!");
        }
        return null;
    }

    @Override
    public ProductModel getProductByName(String productName) {
        try{
            String sql = "SELECT * FROM product WHERE Name = ?;";
            PreparedStatement statement = conn.connect().prepareStatement(sql);
            ProductModel = new ProductModel();
            
            statement.setString(1, productName);
            
            ResultSet rs ;
            rs = statement.executeQuery();
            
            if(rs.next()){
                ProductModel.setId(rs.getInt("productId"));
                ProductModel.setName(rs.getString("name"));
                ProductModel.setCategorie(rs.getString("category"));
                ProductModel.setUnitate(rs.getString("unitate"));
                ProductModel.setPrice(rs.getFloat("price"));
                ProductModel.setQuantity(rs.getInt("quantity"));
            }
            return ProductModel;
        }catch(SQLException s){
            s.printStackTrace();
        }finally{
            conn.disconnect();
            System.out.println("Disconnected!");
        }
        return null;
    }

    @Override
    public void updateProduct(ProductModel product) {
        try{
            String sql = "UPDATE product SET quantity = ? WHERE productId = ?;";
            int id = product.getId();
            PreparedStatement statement = conn.connect().prepareStatement(sql);
            statement.setInt(1, product.getCalculateQuantity());
            statement.setInt(2, id);
            
            statement.executeUpdate();
            System.out.println("Update Complete!");
        }catch(SQLException s){
            s.printStackTrace();
        }finally{
            conn.disconnect();
            System.out.println("Disconnected!");
        }
    }

    @Override
    public void decreaseProduct(ProductModel product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
