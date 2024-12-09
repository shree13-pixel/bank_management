package BMS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JFrame;

public class Withdraw extends JFrame implements ActionListener{

    JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    String pin;
    
    Withdraw(String pin){
        
        setLayout(null);
        
        this.pin = pin;


        // Background Image
        // -------------------------------------------------------------------------------------------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 700, 700);
        add(l3);


        // Heading
        // -------------------------------------------------------------------------------------------------
        l1 = new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAW");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 12));
        l1.setBounds(150,220,400,30);
        l3.add(l1);


        // Heading Text Field
        // -------------------------------------------------------------------------------------------------
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
	    t1.setBounds(150,250,230,25);
        l3.add(t1); 


        // Withdraw Button
        // -------------------------------------------------------------------------------------------------
        b1 = new JButton("WITHDRAW");
	    b1.setBounds(280,350,100,25);
        b1.addActionListener(this);
        l3.add(b1);


        // Back button
        // -------------------------------------------------------------------------------------------------
        b2 = new JButton("BACK");
        b2.setBounds(280,380,100,25);
        b2.addActionListener(this);
        l3.add(b2);


        // set frame size
        // --------------------------------------------------------------------------------------------------
        setSize(700, 700);
        setUndecorated(true);
        setLocation(310, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        try{        
            String amount = t1.getText();
            Date date = new Date();
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
                }else{
                    Connectivity c1 = new Connectivity();
                    c1.s.executeUpdate("insert into bank (PIN, Date, Type, Amount) values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Withdrawl Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
            }else if(ae.getSource()==b2){
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
    
    public static void main(String[] args) {
        new Withdraw("").setVisible(true);;
    }
}
