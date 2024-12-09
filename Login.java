package BMS;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {


        
        // Logo and Background
        // --------------------------------------------------------------------------------------------------
        setTitle("Bank Login/Signup Machine");

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(165, 30, 100, 120);
        add(label);
        
        
        // Welcome Statement 
        // --------------------------------------------------------------------------------------------------
        JLabel text = new JLabel("WELCOME TO BANK");
        text.setFont(new Font("Cambria", Font.BOLD, 36));
        text.setBounds(270, 70, 400, 50);
        add(text);
        
        
        // Card No. 
        // --------------------------------------------------------------------------------------------------
        JLabel card = new JLabel("CARD NO. :");
        card.setFont(new Font("Cambria", Font.BOLD, 24));
        card.setBounds(180, 170, 150, 30);
        add(card);


        // Card No TextField
        // -------------------------------------------------------------------------------------------------
        cardTextField = new JTextField();
        cardTextField.setBounds(310, 170, 250, 30);
        add(cardTextField);


        // PIN 
        // --------------------------------------------------------------------------------------------------
        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Cambria", Font.BOLD, 24));
        pin.setBounds(180, 220, 400, 30);
        add(pin);


        // Card No TextField
        // -------------------------------------------------------------------------------------------------
        pinTextField = new JPasswordField();
        pinTextField.setBounds(310, 220, 250, 30);
        add(pinTextField);


        // SIGN IN button
        // ------------------------------------------------------------------------------------------------
        login = new JButton("SIGN IN");
        login.setBounds(310, 285, 120, 40);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);


        // CLEAR button
        // ------------------------------------------------------------------------------------------------
        clear = new JButton("CLEAR");
        clear.setBounds(440, 285, 120, 40);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);


        // Signup button
        // ------------------------------------------------------------------------------------------------
        signup = new JButton("SIGN UP");
        signup.setBounds(310, 335, 250, 40);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);


        // White Background
        // --------------------------------------------------------------------------------------------------
        getContentPane().setBackground(Color.WHITE);


        // set frame size
        // --------------------------------------------------------------------------------------------------
        setSize(800, 500);
        setVisible(true);
        setLocation(310, 110);
    }


    // What to do after click on buttons
    // ----------------------------------------------------------------------------------------------------
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource() == signup){
            setVisible(false);
            new SignupFile().setVisible(true);
        }
        else if(ae.getSource() == login){
            Connectivity Connectivity = new Connectivity();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where Card_No = '"+ cardnumber +"' and PIN = '"+pinnumber+"'";
            try {
                ResultSet rs = Connectivity.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect cardnumber or PIN");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
