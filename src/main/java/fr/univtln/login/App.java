package fr.univtln.login;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        String dbURL = "";
        String user = "";
        String password = "";
        java.sql.Connection dbConnect = null;
        java.sql.Statement dbStatement = null;
        //dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
        dbConnect = DriverManager.getConnection(" jdbc:postgresql://postgres1:5432/mydb?user=postgres&password=mysecretpassword");
        dbStatement = dbConnect.createStatement();
        /*String sql = "CREATE TABLE REGISTRATION " +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " +
                " last VARCHAR(255), " +
                " age INTEGER, " +
                " PRIMARY KEY ( id ))";

        dbStatement.executeUpdate(sql);*/
      /*  String sql2 = "INSERT INTO REGISTRATION VALUES (2, 'PapeMor', 'CISSE', 25)";
        dbStatement.executeUpdate(sql2);
        ResultSet rs = dbStatement.executeQuery("SELECT * FROM REGISTRATION") ;
        if (rs != null) {
            while (rs.next()) {
                System.out.println("Valeur: " + rs.getString(2));
            }
        }*/
        System.out.println( "Hello World!" );
    }
}