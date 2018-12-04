/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import daoImplementation.ProductDaoImpl;
import java.util.ArrayList;
import model.ProductModel;


/**
 *
 * @author haurel
 */
public class MainPOS {
    
      public static void main(String[] args){
//          try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                        break;
//                    }   
//                }
//            } catch (ClassNotFoundException ex) {
//                java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (InstantiationException ex) {
//                java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//                java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            }           
//          java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new View().setVisible(true);
//            }
//        });
          View view = new View();
          //ProductModel productModel = new ProductModel();
          ProductDaoImpl productDaoImpl = new ProductDaoImpl();

          Controller controller= new Controller(view, productDaoImpl);
          controller.initController();
          
          //System.out.print(controller.getId());


}
      
      
//    public static void main(String[] args) {
//        ProductDaoImpl productDaoImpl = new ProductDaoImpl();
//        ProductModel productModel = new ProductModel();
//        
//        
//        productModel = productDaoImpl.getProduct(1);
//        System.out.print("Product ID: " + productModel.getId() + " | " +
//                "Product Name: " + productModel.getName() + " | " +
//                "Product Categorie: " + productModel.getCategorie() + " | " +
//                "Product Unitate: " + productModel.getUnitate() + " | " +
//                "Product Price: " + productModel.getPrice() + " | " +
//                "Product Quantity: " + productModel.getQuantity() + "\n");
//        
//        productModel = productDaoImpl.getProductByName("Coca Cola");
//        System.out.print("Product ID: " + productModel.getId() + " | "+
//                "Product Name: " + productModel.getName() + " | " +
//                "Product Categorie: " + productModel.getCategorie() + " | " +
//                "Product Unitate: " + productModel.getUnitate() + " | " +
//                "Product Price: " + productModel.getPrice() + " | " +
//                "Product Quantity: " + productModel.getQuantity() + "\n");
//        
//        ArrayList<ProductModel> productsList = new ArrayList<>();
//        productsList = productDaoImpl.setAllProducts();
//        for (ProductModel product : productsList) {
//        System.out.println("Product ID: " + product.getId() + " | "+
//                   "Product Name: " + product.getName() + " | " +
//                   "Product Categorie: " + product.getCategorie() + " | " +
//                   "Product Unitate: " + product.getUnitate() + " | " +
//                   "Product Price: " + product.getPrice() + " | " +
//                   "Product Quantity: " + product.getQuantity() + "\n");
//        }
//}     
}
