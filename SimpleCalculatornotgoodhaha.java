/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author Administrator
 */
public class SimpleCalculator {
  
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        JTextField display = new JTextField();
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener((ActionListener) new ButtonClickListener(display, label));
            panel.add(button);
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}

class ButtonClickListener implements ActionListener {
    private final JTextField display;
    private String currentInput = "";
    private String currentOperator = "";
    private double result = 0;

    public ButtonClickListener(JTextField display, String label) {
        this.display = display;
        currentInput = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonLabel = ((JButton) e.getSource()).getText();

        switch (buttonLabel) {
            case "+", "-", "*", "/" -> {
                if (!currentInput.isEmpty()) {
                    if (!currentOperator.isEmpty()) {
                        calculateResult();
                        currentOperator = "";
                    } else {
                        result = Double.parseDouble(currentInput);
                    }
                    currentOperator = buttonLabel;
                    currentInput = "";
                }
            }
            case "=" -> {
                calculateResult();
                currentOperator = "";
            }
            case "C" -> {
                currentInput = "";
                currentOperator = "";
                result = 0;
            }
            default -> currentInput += buttonLabel;
        }
        display.setText(currentInput);
    }

    private void calculateResult() {
        double secondOperand = Double.parseDouble(currentInput);
        switch (currentOperator) {
            case "+" -> result += secondOperand;
            case "-" -> result -= secondOperand;
            case "*" -> result *= secondOperand;
            case "/" -> result /= secondOperand;
        }
        currentInput = String.valueOf(result);
    }
}

