package model;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.DriverManager;

/*------------------------------------------------------------------------------------------------*/
public class MySQLConnection {

    protected Connection connection;
    protected Statement statement;
    protected ResultSet result;

    /*--------------------------------------------------------------------------------------------*/
    public MySQLConnection() {

        String url      = "jdbc:mysql://127.0.0.1:3306/";
        String database = "engine3";
        String driver   = "com.mysql.jdbc.Driver";
        String user     = "root";
        String password = "password";

        try {
            Class.forName(driver).newInstance();
            this.connection = (Connection) DriverManager.getConnection(url + database
                                                                     , user, password);
        } catch (Exception ex) {
            System.err.println("MySQLConnection(): " + ex.getMessage());
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    public ResultSet query(String query) {
        
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(query);
        } catch (SQLException ex) {
            System.err.println("query(): " + ex.getMessage());
        }
        return result;
    }

    /*--------------------------------------------------------------------------------------------*/
    public int insert(String insertQuery) {

        int total = 0;
        try {
            statement = connection.createStatement();
            total = statement.executeUpdate(insertQuery);

        } catch (SQLException ex) {
            System.err.println("insert(): " + ex.getMessage());            
        }
        return total;

    }
    /*--------------------------------------------------------------------------------------------*/

    public void close() {

        try {
            if (result != null) {
                result.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }

        } catch (SQLException ex) {
            System.err.println("close(): " + ex.getMessage());      
        }
    }
    /*--------------------------------------------------------------------------------------------*/
}

