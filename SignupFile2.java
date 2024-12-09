package BMS;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignupFile2 extends JFrame implements ActionListener{

    JComboBox rel, cat, incm, qual, occ;
    JTextField pan, aadhar;
    JRadioButton scyes, scno, eayes, eano;
    JButton next;
    String formno;

    SignupFile2(String formno){
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        // Additional Detail 
        // ---------------------------------------------------------------------------------------------
        JLabel additionaldetails = new JLabel("Page 2: Additional Details");
        additionaldetails.setFont(new Font("Cambria", Font.BOLD, 20));
        additionaldetails.setBounds(300, 80, 400, 40);
        add(additionaldetails);


        // Religion
        // ---------------------------------------------------------------------------------------------
        JLabel religion = new JLabel("Religion: ");
        religion.setFont(new Font("Cambria", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);

        
        // Religion ComboBox Drop Down Menu
        String valreligion[] = {"", "Hindu", "Muslim", "Sikh", "Christian", "Others"};
        rel = new JComboBox(valreligion);
        rel.setBounds(300, 140, 400, 30);
        rel.setBackground(Color.WHITE);
        add(rel);


        // Category
        // ---------------------------------------------------------------------------------------------
        JLabel category = new JLabel("Category: ");
        category.setFont(new Font("Cambria", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);


        // Category ComboBox Drop Down Menu
        // ---------------------------------------------------------------------------------------------
        String valcategory[] = {"", "General", "OBC", "SC", "ST", "Others"};
        cat = new JComboBox<>(valcategory);
        cat.setBounds(300, 190, 400, 30);
        cat.setBackground(Color.WHITE);
        add(cat);


        // Income
        // ---------------------------------------------------------------------------------------------
        JLabel income = new JLabel("Income: ");
        income.setFont(new Font("Cambria", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);


        // Income ComboBox Drop Down Menu
        // ---------------------------------------------------------------------------------------------
        String valincome[] = {"", "NULL", "< 1,50,000", "< 2,50,000", "< 5,00,000", "< 10,00,000", "> 10,00,000"};
        incm = new JComboBox<>(valincome);
        incm.setBounds(300, 240, 400, 30);
        incm.setBackground(Color.WHITE);
        add(incm);


        // Qualification
        // ---------------------------------------------------------------------------------------------
        JLabel qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Cambria", Font.BOLD, 20));
        qualification.setBounds(100, 290, 200, 30);
        add(qualification);


        // Qualification ComboBox Drop Down Menu
        // ---------------------------------------------------------------------------------------------
        String valqualification[] = {"", "Non-Graduate", "Under-Graduate", "Post-Graduate", "Doctrate", "Others"};
        qual = new JComboBox<>(valqualification);
        qual.setBounds(300, 290, 400, 30);
        qual.setBackground(Color.WHITE);
        add(qual);


        // Occupation
        // ---------------------------------------------------------------------------------------------
        JLabel occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Cambria", Font.BOLD, 20));
        occupation.setBounds(100, 340, 200, 30);
        add(occupation);


        // Occupation ComboBox Drop Down Menu
        // ---------------------------------------------------------------------------------------------
        String valoccupation[] = {"", "Salaried", "Self-Employed", "Business", "Retired", "Student", "Others"};
        occ = new JComboBox<>(valoccupation);
        occ.setBounds(300, 340, 400, 30);
        occ.setBackground(Color.WHITE);
        add(occ);


        // PAN Number
        // ---------------------------------------------------------------------------------------------
        JLabel pannumber = new JLabel("PAN Number: ");
        pannumber.setFont(new Font("Cambria", Font.BOLD, 20));
        pannumber.setBounds(100, 390, 200, 30);
        add(pannumber);


        // PAN TextField
        // -------------------------------------------------------------------------------------------------
        pan = new JTextField();
        pan.setFont(new Font("Cambria", Font.BOLD, 16));
        pan.setBounds(300, 390, 400, 30);
        add(pan);         


        // Aadhar Number
        // ---------------------------------------------------------------------------------------------
        JLabel aadharnumber = new JLabel("Aadhar Number: ");
        aadharnumber.setFont(new Font("Cambria", Font.BOLD, 20));
        aadharnumber.setBounds(100, 440, 200, 30);
        add(aadharnumber);


        // City TextField
        // -------------------------------------------------------------------------------------------------
        aadhar = new JTextField();
        aadhar.setFont(new Font("Cambria", Font.BOLD, 16));
        aadhar.setBounds(300, 440, 400, 30);
        add(aadhar); 


        // Senior Citizen
        // ------------------------------------------------------------------------------------------------
        JLabel seniorcitizen = new JLabel("Senior Citizen: ");
        seniorcitizen.setFont(new Font("Cambria", Font.BOLD, 20));
        seniorcitizen.setBounds(100, 490, 200, 30);
        add(seniorcitizen);


        // Radio button YES
        // ----------------------------------------------------------------------------------------------
        scyes = new JRadioButton("YES");
        scyes.setBounds(300, 490, 100, 30);
        scyes.setFont(new Font("Cambria", Font.BOLD, 14));
        scyes.setBackground(Color.WHITE);
        add(scyes);


        // Radio button No
        // ----------------------------------------------------------------------------------------------
        scno = new JRadioButton("NO");
        scno.setBounds(450, 490, 100, 30);
        scno.setFont(new Font("Cambria", Font.BOLD, 14));
        scno.setBackground(Color.WHITE);
        add(scno);


        // Group Radio Button Senioe Citizen
        // ----------------------------------------------------------------------------------------------
        ButtonGroup scGroup = new ButtonGroup();
        scGroup.add(scyes);
        scGroup.add(scno);


        // Existing Account
        // ------------------------------------------------------------------------------------------------
        JLabel existingaccount = new JLabel("Existing Account: ");
        existingaccount.setFont(new Font("Cambria", Font.BOLD, 20));
        existingaccount.setBounds(100, 540, 200, 30);
        add(existingaccount);


        // Radio button YES
        // ----------------------------------------------------------------------------------------------
        eayes = new JRadioButton("YES");
        eayes.setBounds(300, 540, 100, 30);
        eayes.setFont(new Font("Cambria", Font.BOLD, 14));
        eayes.setBackground(Color.WHITE);
        add(eayes);


        // Radio button No
        // ----------------------------------------------------------------------------------------------
        eano = new JRadioButton("NO");
        eano.setBounds(450, 540, 100, 30);
        eano.setFont(new Font("Cambria", Font.BOLD, 14));
        eano.setBackground(Color.WHITE);
        add(eano);


        // Group Radio Button Senioe Citizen
        // ----------------------------------------------------------------------------------------------
        ButtonGroup eaGroup = new ButtonGroup();
        eaGroup.add(eayes);
        eaGroup.add(eano);


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
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String) rel.getSelectedItem();
        String scategory = (String) cat.getSelectedItem();
        String sincome = (String) incm.getSelectedItem();
        String socc = (String) occ.getSelectedItem();
        String squal = (String) qual.getSelectedItem();

        String scitizen = null;
        if(scyes.isSelected()){
            scitizen = "YES";
        }
        else if(scno.isSelected()){
            scitizen = "No";
        }

        String eaccount = null;
        if(eayes.isSelected()){
            eaccount = "Yes";
        }
        else if(eano.isSelected()){
            eaccount = "No";
        }

        String span = pan.getText();
        String saadhar = aadhar.getText();

        try {
            if(ae.getSource() == next){  
                if(sreligion.equals("")){
                    JOptionPane.showMessageDialog(null, "Religion is Required");
                }
                else if(scategory.equals("")){
                    JOptionPane.showMessageDialog(null, "Category is Required");
                }
                else if(sincome.equals("")){
                    JOptionPane.showMessageDialog(null, "Income is Required");
                }
                else if(socc.equals("")){
                    JOptionPane.showMessageDialog(null, "Occupation field is Empty");
                }
                else if(span.equals("")){
                    JOptionPane.showMessageDialog(null, "PAN Card Number is Required");
                }
                else if(saadhar.equals("")){
                    JOptionPane.showMessageDialog(null, "Aadhar Number is Required");
                }
                else if(scitizen == null){
                    JOptionPane.showMessageDialog(null, "Senior Citizen Info. is Required");
                }
                else if(eaccount == null){
                    JOptionPane.showMessageDialog(null, "Existing Account Status is Required");
                }
                else{
                    Connectivity c = new Connectivity();
                    String q2 = "insert into signup2 (Form_No, Religion, Category, Income, Qualification, Occupation, PAN_Card_No, Aadhar_Card_No, Senior_Citizen, Existing_Account) values ('"+formno+"', '"+sreligion+"' , '"+scategory+"' , '"+sincome+"' , '"+squal+"' , '"+socc+"' , '"+span+"' , '"+saadhar+"' , '"+scitizen+"' , '"+eaccount+"')";
                    c.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Successfully updated");

                    setVisible(false);
                    new SignupFile3(formno).setVisible(true);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupFile2("").setVisible(true);;
    }
}


