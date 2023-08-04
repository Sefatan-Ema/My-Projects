import java.sql.*;
import java.util.*;

public class App {
    Scanner sc = new Scanner(System.in);

    String add(String url, String username, String password) throws Exception {

        // connecting to database
        Connection dbConnect = DriverManager.getConnection(url, username, password);
        System.out.println("connected datadase successfully...");
        Statement stmt;
        // PreparedStatement stmt;
        stmt = dbConnect.createStatement();
        System.out.println("Enter Query to Insert a row to database");
        String query = sc.nextLine();
        // String query = "INSERT INTO
        // currency_exchange(`id`,`BDT`,`DOLLER`,`POUND`,`RUPEE`,`EURO`,`DINAR`)"
        // + " values('1','55','65','1','1','1','0')";
        // insert into
        // currency_exchange(`id`,`BDT`,`DOLLER`,`POUND`,`RUPEE`,`EURO`,`DINAR`)
        // values('1','55','65','1','1','1','0');
        stmt.executeUpdate(query);

        System.out.println("inserted successfully...");
        stmt.close();
        dbConnect.close();

        return (query);
    }

    String update(String url, String username, String password) throws Exception {

        Connection dbConnect = DriverManager.getConnection(url, username, password);
        System.out.println("connected datadase successfully...");
        Statement stmt = dbConnect.createStatement();
        System.out.println("Enter Query to update database");
        String query = sc.nextLine();
        // String query = "UPDATE currency_exchange SET DOLLER='2' where id=1";
        stmt.executeUpdate(query);
        System.out.println("updated successfully...");
        stmt.close();
        dbConnect.close();
        return (query);
    }

    String delete(String url, String username, String password) throws Exception {

        Connection dbConnect = DriverManager.getConnection(url, username, password);
        System.out.println("connected datadase successfully...");
        Statement stmt = dbConnect.createStatement();
        System.out.println("Enter Query to delete a row from database");
        String query = sc.nextLine();
        // String query = "delete from currency_exchange where id=9";
        // DELETE FROM `currency_exchange` WHERE `currency_exchange`.`id` = 1;
        stmt.executeUpdate(query);

        System.out.println("deleted successfully...");
        stmt.close();
        dbConnect.close();

        return (query);

    }

    String show(String url, String username, String password) throws Exception {

        Connection dbConnect = DriverManager.getConnection(url, username, password);
        System.out.println("connected datadase successfully...");
        Statement stmt = dbConnect.createStatement();
        System.out.println("Enter Query to Show database");
        String query = sc.nextLine();
        // String query = "select* from currency_exchange";
        ResultSet rs = stmt.executeQuery(query);
        System.out.println("BDT Doller pound Rupee Euro Dinar");
        while (rs.next()) {

            System.out.println(rs.getString(2) + " "
                    + rs.getString(2) + "     " + rs.getString(3) + "     " + rs.getString(4) + "     "
                    + rs.getString(5)
                    + "      " + rs.getString(6) + "      " + rs.getString(7));
        }
        stmt.close();
        dbConnect.close();
        return (query);
    }
}
