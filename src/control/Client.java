/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.DBConnection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.sql.Date;
/**
 *
 * @author HP
 */
public class Client extends Personne {

    public Client(String nom, String prenom, String adresse, LocalDate dateNaissance, String lieuNaissance, String genre, long numIdNationale) {
        super(nom, prenom, adresse, dateNaissance, lieuNaissance, genre, numIdNationale);
    }
    
public static void AjouterClient(Client c){
      boolean inserted = false;
      Connection connection =null;
      Statement statement = null;
      ResultSet resulta = null;
      
      try{
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
      
      statement = connection.createStatement();
      String requete = "SELECT  `numIdNationale` FROM `client` WHERE numIdNationale = " +c.getNumIdNationale();
      
      resulta = statement.executeQuery(requete);
          if (resulta.next()) {
              System.out.println("client already in DB");
          }else{
              
              Date sqlDate = Date.valueOf(c.getDateNaissance());
              PreparedStatement preparedStatement = null;
              String req = "INSERT INTO `client`( `numIdNationale`, `Nom`, `Prenom`, `dateNaissance`, `lieuNaissance`, `genre`, `adresse`) VALUES (?,?,?,?,?,?,?)";
              preparedStatement = connection.prepareStatement(req);
              preparedStatement.setLong(1, c.getNumIdNationale()); // Set the first value
              preparedStatement.setString(2, c.getNom());
              preparedStatement.setString(3, c.getPrenom());
              preparedStatement.setDate(4, sqlDate);
              preparedStatement.setString(5, c.getLieuNaissance());
              preparedStatement.setString(6, c.getGenre());
              preparedStatement.setString(7, c.getAdresse());
              
              preparedStatement.executeUpdate();//executer la requete
            
          }
          
          
          
          
      }catch(SQLException e ){
          e.printStackTrace();
      }
      

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
        /*Statement statement =  DBConnection.MakeRetrievalStatement("SELECT * FROM Client WHERE numIdNationale = ?");// COMPLETE LATER
        statement.setString(1, c.getNumIdNationale());
        
        try{
              if (result.next()) {
                  System.out.println("the person you are trying to register is already in the database according to the national id you used");
                  
        }else{
               String nom = c.getNom();
               String prenom = c.getPrenom();
               String adresse = c.getAdresse();
               String dateNaissance = c.getDateNaissance();
               String lieuNaissance = c.getLieuNaissance();
               String genre = c.getGenre();
               long numIdNationale = c.getNumIdNationale();
               
               PreparedStatement statement = DBConnection.PrepareStatement("INSERT INTO Client (`numIdNationale`, `Nom`, `Prenom`, `dateNaissance`, `lieuNaissance`, `genre`, `adresse`) VALUES (?,?,?,?,?,?,? )");//insert into person the person
               statement.setLong(1, c.getNumIdNationale());
               statement.setString(2, c.getNom());
               statement.setString(3, c.getPrenom());
               statement.setString(4, c.getDateNaissance());
               statement.setString(5, c.getLieuNaissance());
               statement.setString(6, c.getGenre());
               statement.setString(7, c.getAdresse());

               statement.executeUpdate();
               System.out.println("inserted succesfully");
              }
        }catch(SQLException e){
            if (e.getSQLState().equals("23000")) {// code d'erreur qui correspond a l'insertion d'une valeur deja existante dans une colonne unique
                System.out.println("you are trying to insert a person with a nationale id number that is already registred in the system");
            }
            e.printStackTrace();
        }
      
         
        */
        
        }
    
    
    
}
