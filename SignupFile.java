package BMS;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.awt.event.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class SignupFile extends JFrame implements ActionListener{

    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    JButton next;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser dateChooser;

    SignupFile(){

        setLayout(null);


        // Generate 4 digit Random numbers
        // --------------------------------------------------------------------------------------------
        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 9000L + 1000L);


        // Application form number head
        // ---------------------------------------------------------------------------------------------
        JLabel formno = new JLabel("APPLICATION FORM NO. : " + random);
        formno.setFont(new Font("Cambria", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);


        // Personal Detail head
        // ---------------------------------------------------------------------------------------------
        JLabel personaldetails = new JLabel("Page 1: Personal Details");
        personaldetails.setFont(new Font("Cambria", Font.BOLD, 20));
        personaldetails.setBounds(300, 80, 400, 40);
        add(personaldetails);


        // Name
        // ---------------------------------------------------------------------------------------------
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Cambria", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        
        // Name TextField
        // -------------------------------------------------------------------------------------------------
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Cambria", Font.BOLD, 16));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);


        // Father's Name
        // ---------------------------------------------------------------------------------------------
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Cambria", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);


        // Father Name TextField
        // -------------------------------------------------------------------------------------------------
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Cambria", Font.BOLD, 16));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);


        // Date of Birth
        // ---------------------------------------------------------------------------------------------
        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Cambria", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);


        // Date Calender
        // ---------------------------------------------------------------------------------------------
        dateChooser = new JDateChooser();
        dateChooser.setFont(new Font("Cambria", Font.BOLD, 20));
        dateChooser.setBounds(300, 240, 400, 30);
        add(dateChooser);
        

        // Gender
        // ---------------------------------------------------------------------------------------------
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Cambria", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);


        // Radio button Male
        // ----------------------------------------------------------------------------------------------
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 100, 30);
        male.setFont(new Font("Cambria", Font.BOLD, 14));
        male.setBackground(Color.WHITE);
        add(male);


        // Radio button FeMale
        // ----------------------------------------------------------------------------------------------
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 100, 30);
        female.setFont(new Font("Cambria", Font.BOLD, 14));
        female.setBackground(Color.WHITE);
        add(female);


        // Group Radio Button Gender
        // ----------------------------------------------------------------------------------------------
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);


        // Email
        // ---------------------------------------------------------------------------------------------
        JLabel email = new JLabel("Email: ");
        email.setFont(new Font("Cambria", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);


        // Email TextField
        // -------------------------------------------------------------------------------------------------
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Cambria", Font.BOLD, 16));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);        


        // Marital Status
        // ---------------------------------------------------------------------------------------------
        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Cambria", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);


        // Radio button Married
        // ----------------------------------------------------------------------------------------------
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setFont(new Font("Cambria", Font.BOLD, 14));
        married.setBackground(Color.WHITE);
        add(married);


        // Radio button Unmarried
        // ----------------------------------------------------------------------------------------------
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setFont(new Font("Cambria", Font.BOLD, 14));
        unmarried.setBackground(Color.WHITE);
        add(unmarried);


        // Radio button Other
        // ----------------------------------------------------------------------------------------------
        other = new JRadioButton("Other");
        other.setBounds(600, 390, 100, 30);
        other.setFont(new Font("Cambria", Font.BOLD, 14));
        other.setBackground(Color.WHITE);
        add(other);


        // Group Radio Button Marital
        // ----------------------------------------------------------------------------------------------
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);


        // Address
        // ---------------------------------------------------------------------------------------------
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Cambria", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);


        // Address TextField
        // -------------------------------------------------------------------------------------------------
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Cambria", Font.BOLD, 16));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);         


        // City
        // ---------------------------------------------------------------------------------------------
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Cambria", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);


        // City TextField
        // -------------------------------------------------------------------------------------------------
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Cambria", Font.BOLD, 16));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField); 


        // State
        // ------------------------------------------------------------------------------------------------
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Cambria", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);


        // State TextField
        // -------------------------------------------------------------------------------------------------
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Cambria", Font.BOLD, 16));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField); 


        // PIN Code
        // ------------------------------------------------------------------------------------------------
        JLabel pin = new JLabel("PIN Code: ");
        pin.setFont(new Font("Cambria", Font.BOLD, 20));
        pin.setBounds(100, 590, 200, 30);
        add(pin);


        // PIN TextField
        // -------------------------------------------------------------------------------------------------
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Cambria", Font.BOLD, 16));
        pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField); 


        // Next Button
        // -------------------------------------------------------------------------------------------------
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 630, 80, 30);
        add(next);

        next.addActionListener(this);

        
        // Background white
        // -------------------------------------------------------------------------------------------------
        getContentPane().setBackground(Color.WHITE);


        // Set Frame Size
        // -------------------------------------------------------------------------------------------------
        setSize(750, 800);
        setLocation(310, 0);
        setVisible(true);
    }

    // What to do after click on buttons
    // ----------------------------------------------------------------------------------------------------
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
    
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }
    
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pincodeTextField.getText();
    
        try {
            if (ae.getSource() == next) {
                if (name.equals("")) {
                    JOptionPane.showMessageDialog(null, "Name is Required");
                } else if (fname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Father name is Required");
                } else if (dob.equals("")) {
                    JOptionPane.showMessageDialog(null, "Date Of Birth is Required");
                } else if (!male.isSelected() && !female.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Gender is Required");
                } else if (email.equals("")) {
                    JOptionPane.showMessageDialog(null, "Email is Required");
                } else if (marital == null) {
                    JOptionPane.showMessageDialog(null, "Marital Status is Required");
                } else if (address.equals("")) {
                    JOptionPane.showMessageDialog(null, "Address is Required");
                } else if (city.equals("")) {
                    JOptionPane.showMessageDialog(null, "City is Required");
                } else if (state.equals("")) {
                    JOptionPane.showMessageDialog(null, "State is Required");
                } else if (pin.equals("")) {
                    JOptionPane.showMessageDialog(null, "PIN Code is Required");
                } else {
                    Connectivity c = new Connectivity();
                    String q1 = "insert into signup (Form_No, Name, Father_Name, Date_Of_Birth, Gender, Email, Marital_Status, Address, City, State, PIN_Code) values ('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + state + "','" + pin + "')";
                    c.s.executeUpdate(q1);
                    JOptionPane.showMessageDialog(null, "Successfully updated");
    
                    setVisible(false);
                    new SignupFile2(formno).setVisible(true);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new SignupFile().setVisible(true);;
    }
}


