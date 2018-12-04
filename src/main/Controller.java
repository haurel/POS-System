/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import daoImplementation.ProductDaoImpl;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import model.ProductModel;



/**
 *
 * @author haurel
 */
public class Controller{
    private ProductModel productModel;
    private ProductDaoImpl productDaoImpl;
    private View view;
    private JTextArea jTextAreaProductsControll;
    private float totalPrice;
    private ArrayList<String> contentjTextAreaControll = new ArrayList<>();
    //private String categoryController;
    
    public Controller(){}
    
    public Controller(View view, ProductDaoImpl productDaoImpl){
        this.view = view;
        this.productDaoImpl = productDaoImpl;
    }
    
    public void initController(){
        view.getButtonForTextField().addActionListener(e -> saveTextFieldInputFromView());
        view.getButtonDone().addActionListener(e -> doneAllOperation());
        view.getBackButton().addActionListener(e -> deleteLastInput());
    }
    
    
    private void saveTextFieldInputFromView(){
        productModel = productDaoImpl.getProduct(view.getValueFromIdTextField());
        productModel.calculateQuantity(view.getValueFromQuantityTextField(), productModel.getQuantity());
        
        
        if(productModel.getCalculateQuantity() >= 0){
            productModel.calculatePrice(view.getValueFromQuantityTextField(), productModel.getPrice());
        
            jTextAreaProductsControll = view.getTextAreaProducts();
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(productModel.getName()); sb.append("            "); sb.append(view.getValueFromQuantityTextField()); sb.append("  BUC");
            sb.append(" x "); sb.append(productModel.getPrice());
            sb.append("            "); sb.append(productModel.getTotalPrice());
            sb.append("\n--------------------------------------------------------------------------\n");
            String addText = sb.toString();
            jTextAreaProductsControll.append(addText + "\n");
            productDaoImpl.updateProduct(productModel);
            contentjTextAreaControll.add(addText);
            totalPrice += productModel.getTotalPrice();
            
        }else{
            JOptionPane.showMessageDialog(null, "ERROR QUANTITY", "Info", JOptionPane.INFORMATION_MESSAGE);
        }   
    }
    
    private void doneAllOperation(){
        jTextAreaProductsControll.setText("");
        String totalPriceString = String.format("%.2f", totalPrice);
        JOptionPane.showMessageDialog(null, "Proces terminat cu success. \n" + "Aveti de achitat: " + totalPriceString + " LEI", "Info", JOptionPane.INFORMATION_MESSAGE);
        contentjTextAreaControll.clear();
        totalPrice = 0;
    }
    
    private void deleteLastInput(){
        //int lenghtContentjTextAreaControll = contentjTextAreaControll.get;
        contentjTextAreaControll.remove(contentjTextAreaControll.size() - 1);
        jTextAreaProductsControll.setText("");
        productModel.calculateQuantityBack(productModel.getQuantity());
        productDaoImpl.updateProduct(productModel);
        totalPrice -= productModel.getTotalPrice();
        
        productModel.finalize();
        for(String i : contentjTextAreaControll){
            jTextAreaProductsControll.append(i);
            
        //jTextAreaProductsControll
        }
    }
    
    
    
}
