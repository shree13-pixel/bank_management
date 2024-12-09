package BMS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Balance extends JFrame implements ActionListener{
 
    JButton b1, b2;
    JLabel l1;
    String pin;

    Balance(String pin){

        this.pin = pin;
        setLayout(null);

        // set frame size
        // --------------------------------------------------------------------------------------------------
        getContentPane().setBackground(Color.WHITE);
        setSize(600, 400);
        setVisible(true);
        setLocation(310, 110);

        // Label to display Transactions
        // -------------------------------------------------------------------------------------------------
        l1 = new JLabel();
        l1.setBounds(50, 110, 500, 30);
        add(l1);
        

        // Heading
        // -------------------------------------------------------------------------------------------------
        JLabel l2 = new JLabel("Indian Bank");
        l2.setBounds(250, 30, 100, 20);
        add(l2);
        

        // Label to display Card Number
        // -------------------------------------------------------------------------------------------------
        JLabel l3 = new JLabel();
        l3.setBounds(50, 80, 300, 20);
        add(l3);

        try{
            Connectivity c = new Connectivity();
                ResultSet rs = c.s.executeQuery("select * from login where PIN = '"+pin+"'");
                while(rs.next()){
                    l3.setText("Card Number:    " + rs.getString("Card_No").substring(0, 4) + "XXXXXXXX" + rs.getString("Card_No").substring(12));
                }
        }catch(Exception e){
            System.out.println(e);
        }
        

        // Label to display Total Balance
        // -------------------------------------------------------------------------------------------------
        JLabel l4 = new JLabel();
        l4.setBounds(50, 150, 300, 30);
        add(l4);
        
        	 
        try{
            int balance = 0;
            Connectivity c1  = new Connectivity();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM bank where PIN = '"+pin+"'");
            int p = 150;
            while(rs.next()){
                l1.setText("Your Last Activity " + rs.getString("Date")+ "      " + rs.getString("Type") + "        " + rs.getString("Amount"));
                if(rs.getString("Type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("Amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("Amount"));
                }
            }
            l4.setText("Your total Balance is Rs "+balance);
        }catch(Exception e){
            System.out.println(e);
        }
        
        setLayout(null);
        

        // Exit Button
        // -------------------------------------------------------------------------------------------------
        b1 = new JButton("Exit");
        b1.setBounds(450, 300, 100, 30);
        b1.addActionListener(this);
        add(b1);
        

        // Back button
        // -------------------------------------------------------------------------------------------------
        b2 = new JButton("BACK");
        b2.setBounds(50, 300, 100, 30);
        b2.addActionListener(this);
        add(b2);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){ 
            System.exit(0);
        }
        else if(ae.getSource()==b2){ 
            setVisible(false);
                new Transactions(pin).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Balance("").setVisible(true);
    }
    
}

