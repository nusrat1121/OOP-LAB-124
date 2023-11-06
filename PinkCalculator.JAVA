package com.mycompany.mavenproject33;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PinkCalculatorGUI extends JFrame implements ActionListener {
    private JTextField firstNumber, secondNumber, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    @SuppressWarnings("LeakingThisInConstructor")
    public PinkCalculatorGUI() {
        setTitle("Pink Calculator");
        setLayout(new GridLayout(4, 2));

        JLabel label1 = new JLabel("First Number:");
        label1.setForeground(Color.PINK);
        add(label1);
        firstNumber = new JTextField();
        add(firstNumber);

        JLabel label2 = new JLabel("Second Number:");
        label2.setForeground(Color.PINK);
        add(label2);
        secondNumber = new JTextField();
        add(secondNumber);

        addButton = new JButton("Add");
        addButton.addActionListener(this);
        add(addButton);

        subtractButton = new JButton("Subtract");
        subtractButton.addActionListener(this);
        add(subtractButton);

        multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(this);
        add(multiplyButton);

        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        add(divideButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setForeground(Color.PINK);
        add(resultLabel);
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(firstNumber.getText());
            double num2 = Double.parseDouble(secondNumber.getText());
            double result = 0;

            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subtractButton) {
                result = num1 - num2;
            } else if (e.getSource() == multiplyButton) {
                result = num1 * num2;
            } else if (e.getSource() == divideButton) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    resultField.setText("Cannot divide by zero!");
                    return;
                }
            }
            
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
     public static void main(String[] args) {
        new PinkCalculatorGUI();
        
     }
}
    
     

   
