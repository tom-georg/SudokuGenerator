package com.company;
//import javax.swing.JFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster implements ActionListener {
    JFrame frame = new JFrame("MatheTest");
    JTextField textField = new JTextField();
    JButton button = new JButton();
    JPanel panel = new JPanel();
    JLabel label = new JLabel();

    public Fenster(String s){
        frame.setSize(200,200);
        panel.add(label);
        panel.add(textField);
        label.setText(s);
        panel.add(label);
            textField.setColumns(5);
        button.addActionListener(this);
        panel.add(button);
        button.setText("Test");
        button.setLocation(100,150);
        frame.add(panel);
        frame.setVisible(true);
// test
    }

    public void actionPerformed(ActionEvent e){
        panel.removeAll();
        label.setText("kkkkk");
        panel.add(label);
    }
    public void checkAnswer(){

    }

}