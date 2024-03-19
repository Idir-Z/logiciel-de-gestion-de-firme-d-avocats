/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class DBConnection {
    public DefaultTableModel remplirTableau(JTable jTable1, String table) {
        
        DefaultTableModel tabMod= null;
        try{
        Connection connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");//instance dynamique du driver de sqlite
            String url = "jdbc:mysql://localhost:3306/firme_avocat";// emplacement de la BDD dans mon projet
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
         Statement st = connection.createStatement();
         String req = "SELECT * FROM " + table;
         ResultSet result= st.executeQuery(req);
         tabMod = new DefaultTableModel();
            
            ResultSetMetaData resultMetaData = result.getMetaData();
            int nombreCol = resultMetaData.getColumnCount();//nombre de colones
            String[] nomCol = new String[nombreCol];
            for (int i = 0; i < nombreCol; i++) {
                nomCol[i] = resultMetaData.getColumnName(i+1);
                
            }
            tabMod.setColumnIdentifiers(nomCol);
            String nom,p,a;
            String[] row = new String[nombreCol];
            int i = 0;
            while(result.next()){
                for (int j = 0; j < nombreCol; j++) {
                   row[j] = result.getString(j+1); 
                }
                tabMod.addRow(row);
            }
            
            connection.close();
   
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
            
        }
        
        
        return tabMod;
                
    }
    public static Connection etablirConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//instance dynamique du driver de sqlite
            String url = "jdbc:mysql://localhost:3306/firme_avocat";// emplacement de la BDD dans mon projet
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
            
        }catch(SQLException|ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }
    public static void EstablishConnection(Connection connection){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//instance dynamique du driver de sqlite
            String url = "jdbc:mysql://localhost:3306/firme_avocat";// emplacement de la BDD dans mon projet
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
            if(connection != null ){// verifier si la connection est vraiment etablie
                System.out.println("connecte avec succes");
            }
            
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("failed to connect");
            e.printStackTrace();
        }
        
        
    }
    public static void CloseConnection(Connection connection){
        try {
                if (connection != null && !connection.isClosed()) { //ferme la connection  la fin
                    connection.close();
                    System.out.println("connection closed");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        
    }
    /*public static ResultSet retrieveData(String req){
         ResultSet resultat = null;
        Connection connection = null;
        try { //on ouvre la connection avec la BDD
            Class.forName("com.mysql.cj.jdbc.Driver");//instance dynamique du driver de sqlite
            String url = "jdbc:mysql://localhost:3306/firme_avocat";// emplacement de la BDD dans mon projet
            String user = "root";
            String password = "";
            
            connection = DriverManager.getConnection(url, user, password);// etablit la connection
            if(connection != null ){// verifier si la connection est vraiment etablie
                System.out.println("connecte avec succes");
            }
            //start of request processing
            Statement statement = connection.createStatement();//creation d'une requet qui va etre envoyée par le driver cree 
            statement
            resultat = statement.executeQuery(req);
            
            while(resultat.next()){
                
                
            }
           
            
            
            
            
            
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
            
        }
            try {
                if (connection != null && !connection.isClosed()) { //ferme la connection  la fin
                    connection.close();
                    System.out.println("connection closed");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            
            
        }
            
        
        
        return resultat ;
        
    }
    public static Statement MakeRetrievalStatement(String req){
        
        Connection connection = null;
        Statement statement = null;
        
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");//instance dynamique du driver de sqlite
            String url = "jdbc:mysql://localhost:3306/firme_avocat";// emplacement de la BDD dans mon projet
            String user = "root";
            String password = "";
            
            connection = DriverManager.getConnection(url, user, password);// etablit la connection
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
           
            
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        
        return statement;
        
    }
    
    
    
    
    public static PreparedStatement PrepareStatement(String req){
         Connection connection = null;
         PreparedStatement preparedStatement = null;
        try { //on ouvre la connection avec la BDD
            Class.forName("com.mysql.cj.jdbc.Driver");//instance dynamique du driver de sqlite
            String url = "jdbc:mysql://localhost:3306/firme";// emplacement de la BDD dans mon projet
            String user = "root";
            String password = "";
            
            connection = DriverManager.getConnection(url, user, password);// etablit la connection
            if(connection != null ){// verifier si la connection est vraiment etablie
                System.out.println("connecte avec succes");
            }
            //start of request processing
            preparedStatement = connection.prepareStatement(req);//creation d'une requet qui va etre envoyée par le driver cree 
            //ResultSet resultSet = statement.executeQuery(req);
            /*preparedStatement.setString(1, "value1"); // Replace with your data
            preparedStatement.setInt(2, 123); // Replace with your data
            preparedStatement.setDouble(3, 45.67);
            
           
            
            
            
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
            
        }
            try {
                if (connection != null && !connection.isClosed()) { //ferme la connection  la fin
                    connection.close();
                    System.out.println("connection closed");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            
            
        }
            
        return  preparedStatement;
    }*/
    
    
    
    
}
