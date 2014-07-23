package kduraj;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import model.MySQLConnection;


public class Main 
{
    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Simple MySQL" );
        MySQLConnection conn = new MySQLConnection();
        ResultSet rs = conn.query("SELECT * FROM scounter ORDER BY count DESC LIMIT 50;");
        
        ResultSetMetaData rsmd = rs.getMetaData();
        int columns = rsmd.getColumnCount();
        
        while (rs.next()) {            
            
            for (int i = 1; i <= columns; i++) {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }
        
        conn.close();
    }
}

