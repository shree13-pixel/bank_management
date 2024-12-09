package BMS;

import java.sql.*;

public class Connectivity {
    
    // Steps
    // 1. Register the driver
    // 2. Create Connection
    // 3. Create Statement
    // 4. Execute Query
    // 5. Close Connection

    /**
     * 
     */

    Connection c;
    Statement s;

    public Connectivity(){

        try {

            // 1. Register the driver
            // --------------------------------------------------------------------------------------------------------------------
            c = DriverManager.getConnection("jdbc:mysql:///Bank_Management", "root", "singh07");
            s = c.createStatement();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}

