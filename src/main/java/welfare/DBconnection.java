/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package welfare;

/**
 *
 * @author abdullah
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

    public static Connection connect() {
        Connection con = null;

        try {
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/welfare_system",
                "Abdullah",
                "1901fst2"
            );

            System.out.println("DB Connected!");

        } catch (Exception e) {
            System.out.println("DB Error:");
            e.printStackTrace();
        }

        return con;
    }
}