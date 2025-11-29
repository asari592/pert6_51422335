/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert2_51422335;

/**
 *
 * @author rafli
 */
public class Main {
    public static void main(String[] args){
        User user = new User();
        
        user.login();
        user.logout();
        
         Buyer buyer = new Buyer();
        
        buyer.login();
        buyer.logout();
        
        Seller seller = new Seller();
        seller.addProduct("Nasi Gila");
        
        Admin admin = new Admin();
        admin.login();
        admin.logout();
    }
}
