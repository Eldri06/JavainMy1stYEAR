/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginguiref;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class LoginGUIref implements ActionListener {

    JFrame loginFrame;
    JPanel loginPanel;
    JLabel loginTitleLabel, loginUsernameLabel, loginPasswordLabel;
    JTextField loginUsernameField;
    JPasswordField loginPasswordField;
    JButton loginButton;

    public LoginGUIref() {
        loginFrame = new JFrame();
        loginPanel = new JPanel();
        loginTitleLabel = new JLabel();
        loginUsernameLabel = new JLabel();
        loginPasswordLabel = new JLabel();
        loginUsernameField = new JTextField();
        loginPasswordField = new JPasswordField();
        loginButton = new JButton();
    }

    public void setLoginGUIrefProperties() {
        //Labels
        loginTitleLabel.setText("LOGIN YOUR ACCOUNT");
        loginTitleLabel.setForeground(Color.black);
        loginTitleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        loginTitleLabel.setBounds(130, 15, 300, 50);

        loginUsernameLabel.setText("USERNAME");
        loginUsernameLabel.setForeground(Color.black);
        loginUsernameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        loginUsernameLabel.setBounds(100, 75, 300, 50);

        loginPasswordLabel.setText("PASSWORD");
        loginPasswordLabel.setForeground(Color.black);
        loginPasswordLabel.setFont(new Font("Arial", Font.BOLD, 15));
        loginPasswordLabel.setBounds(100, 125, 300, 50);

        //textfields
        loginUsernameField.setBounds(200, 90, 200, 25);

        //password field
        loginPasswordField.setBounds(200, 135, 200, 25);
        loginPasswordField.setEchoChar('*');

        //buttons 
        loginButton.setText("LOGIN");
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Arial", Font.BOLD, 18));
        loginButton.setBounds(100, 170, 300, 40);
        loginButton.addActionListener(this);

        //panels
        loginPanel.setBackground(Color.LIGHT_GRAY);
        loginPanel.setLayout(null);

        //adding of components to jpanel
        loginPanel.add(loginTitleLabel);
        loginPanel.add(loginUsernameLabel);
        loginPanel.add(loginPasswordLabel);
        loginPanel.add(loginUsernameField);
        loginPanel.add(loginPasswordField);
        loginPanel.add(loginButton);

        //adding jpanel to frame      
        loginFrame.add(loginPanel);

        loginFrame.setTitle("Login");
        loginFrame.setSize(500, 300);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setResizable(false);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String enteredUsername = loginUsernameField.getText();
            String enteredPassword = new String(loginPasswordField.getPassword());

            if (enteredUsername.isBlank() || enteredPassword.isBlank()) {
                JOptionPane.showMessageDialog(loginPanel, "Please Enter A Username And Password", "Empty Fields", 0);
            } else {
                Validator validator = new Validator(enteredUsername, enteredPassword);
                if (validator.validate()) {
                    // Create and display the HomeFrame
                    HomeFrame homeFrame = new HomeFrame();
                    homeFrame.setHomeFrameProperties();
                    loginFrame.setVisible(false); 
                } else {
                    JOptionPane.showMessageDialog(loginPanel, "Incorrect Username Or Password", "Invalid Login Credentials", 0);
                }
            }
        }
    }

    public static void main(String[] args) {
        LoginGUIref login = new LoginGUIref();
        login.setLoginGUIrefProperties();
    }
}

class HomeFrame {
    JFrame homeFrame;
    JPanel homePanel;
    JLabel welcomeLabel;

    public HomeFrame() {
        homeFrame = new JFrame();
        homePanel = new JPanel();
        welcomeLabel = new JLabel();
    }

    public void setHomeFrameProperties() {
        welcomeLabel.setText("Welcome to your Home Page!");
        welcomeLabel.setForeground(Color.black);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeLabel.setBounds(100, 50, 300, 50);

        homePanel.add(welcomeLabel);

        homePanel.setBackground(Color.LIGHT_GRAY);
        homePanel.setLayout(null);

        homeFrame.add(homePanel);

        homeFrame.setTitle("Home");
        homeFrame.setSize(400, 200);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setResizable(false);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setVisible(true);
    }
}