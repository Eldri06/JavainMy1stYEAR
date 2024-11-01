/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginguiref;

/**
 *
 * @author Administrator
 */
public class Validator {
   
    
    String username = "admin";
    String password = "gwapoko123";
    
    String enteredUsername;
    String enteredPassword;

    public Validator(String enteredUsername, String enteredPassword) {
        this.enteredUsername = enteredUsername;
        this.enteredPassword = enteredPassword;
    }
    
    public boolean validate() {
        return (enteredUsername.equals(username) && enteredPassword.equals(password));
    }
    
}


