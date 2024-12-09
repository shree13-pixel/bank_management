package BMS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transactions extends JFrame implements ActionListener{

    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    Transactions(String pin){

        setLayout(null);

        this.pin = pin;


        // Background Image
        // -------------------------------------------------------------------------------------------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);


        // Heading
        // -------------------------------------------------------------------------------------------------
        l1 = new JLabel("Please Select Your Transaction");
        l1.setBounds(145,225,700,35);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        image.add(l1);
        

        // Deposite Button
        // -------------------------------------------------------------------------------------------------
        b1 = new JButton("DEPOSIT");
        b1.setBounds(125,300,130,25);
        b1.addActionListener(this);
        image.add(b1);


        // Cash Button
        // -------------------------------------------------------------------------------------------------
        b2 = new JButton("CASH WITHDRAWL");
        b2.setBounds(270,300,130,25);
        b2.addActionListener(this);
        image.add(b2);
        

        // PIN Change Button
        // -------------------------------------------------------------------------------------------------
	    b3 = new JButton("PIN CHANGE");
        b3.setBounds(125,330,130,25);
        b3.addActionListener(this);
        image.add(b3);
        

        // History Button
        // -------------------------------------------------------------------------------------------------
	    b4 = new JButton("BALANCE & LA.");
        b4.setBounds(270,330,130,25);
        b4.addActionListener(this);
        image.add(b4);
        

        // Exit Button
        // -------------------------------------------------------------------------------------------------
	    b5 = new JButton("EXIT");
        b5.setBounds(195,360,130,25);
        b5.addActionListener(this);
        image.add(b5);

        
        // set frame size
        // --------------------------------------------------------------------------------------------------
        setSize(700, 700);
        setUndecorated(true);
        setLocation(310, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){ 
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }else if(ae.getSource()==b2){ 
            setVisible(false);
            new Withdraw(pin).setVisible(true);
        }else if(ae.getSource()==b3){ 
            setVisible(false);
            new PinChange(pin).setVisible(true);
        }else if(ae.getSource()==b4){ 
            setVisible(false);
            new Balance(pin).setVisible(true);
        }else if(ae.getSource()==b5){ 
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        new Transactions("").setVisible(true);
    }
}
