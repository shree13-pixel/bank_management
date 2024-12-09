package BMS;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class PinChange extends JFrame implements ActionListener{
    
    
    JPasswordField t1,t2;
    JButton b1,b2;                               
    JLabel l1,l2,l3;
    String pin;

    PinChange(String pin){
        this.pin = pin;
    
        // Background Image
        // --------------------------------------------------------------------------------------------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l4 = new JLabel(i3);
        l4.setBounds(0, 0, 700, 700);
        add(l4);


        // PIN Change Text at Top
        // --------------------------------------------------------------------------------------------------
        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.WHITE);
        l1.setBounds(180,225,700,35);
        l4.add(l1);


        // New PIN
        // --------------------------------------------------------------------------------------------------
        l2 = new JLabel("New PIN:");
        l2.setFont(new Font("System", Font.BOLD, 12));
        l2.setForeground(Color.WHITE);
        l2.setBounds(120,270,150,15);
        l4.add(l2);


        // Re-Enter New PIN Text
        // --------------------------------------------------------------------------------------------------
        l3 = new JLabel("Re-Enter New PIN:");
        l3.setFont(new Font("System", Font.BOLD, 12));
        l3.setForeground(Color.WHITE);
        l3.setBounds(120,300,200,15);
        l4.add(l3);


        // New PIN Text Field
        // --------------------------------------------------------------------------------------------------
        t1 = new JPasswordField();
        t1.setFont(new Font("Raleway", Font.BOLD, 25));
        t1.setBounds(240,260,150,20);
        l4.add(t1);


        // Re-Enter New PIN Text Field
        // --------------------------------------------------------------------------------------------------
        t2 = new JPasswordField();
        t2.setFont(new Font("Raleway", Font.BOLD, 25));
        t2.setBounds(240,300,150,20);
        l4.add(t2);


        // Change Button
        // --------------------------------------------------------------------------------------------------
        b1 = new JButton("CHANGE");
	    b1.setBounds(290,370,100,25);
        b1.addActionListener(this);
        l4.add(b1);        


        // Back Button
        // --------------------------------------------------------------------------------------------------
	    b2 = new JButton("BACK");
        b2.setBounds(290,400,100,25);
        b2.addActionListener(this);
        l4.add(b2);
        
        setLayout(null);

        // set frame size
        // --------------------------------------------------------------------------------------------------
        setSize(700, 700);
        setUndecorated(true);
        setLocation(310, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        try{        
            String npin = t1.getText();
            String rpin = t2.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            
            if(ae.getSource()==b1){
                if (t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (t2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
                }
                
                Connectivity c1 = new Connectivity();
                String q1 = "update bank set PIN = '"+rpin+"' where PIN = '"+pin+"' ";
                String q2 = "update login set PIN = '"+rpin+"' where PIN = '"+pin+"' ";
                String q3 = "update signup3 set PIN = '"+rpin+"' where PIN = '"+pin+"' ";

                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                c1.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
            
            }else if(ae.getSource()==b2){
                new Transactions(pin).setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }

}
