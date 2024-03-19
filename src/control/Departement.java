/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.DBConnection;
import static control.Constants.AJOUTE_AVEC_SUCCEE;
import static control.Constants.ELEMENT_DEJA_DANS_BDD;
import static control.Constants.PROBLEME_DE_CONNEXION_BDD;

/**
 *
 * @author HP
 */
public class Departement {
    private String libelle;
    private int idDepartement;
    

    public Departement(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getIdDepartement() {
        return idDepartement;
    }

    public  void setIdDepartement(int idDepartement) {
        this.idDepartement = idDepartement;
    }
    
    public static int AjouterDepartement(Departement d){
         boolean inserted = false;
      Connection connection =null;
      Statement statement = null;
      ResultSet resulta = null;
      
      
        try {
            connection = DBConnection.etablirConnection();
            if (connection == null) {
                return PROBLEME_DE_CONNEXION_BDD;
            }
      statement = connection.createStatement();
      String requete = "SELECT  `libelle` FROM `departement` WHERE libelle =  \""+d.getLibelle()+"\"";
      
      resulta = statement.executeQuery(requete);
          if (resulta.next()) {
              return ELEMENT_DEJA_DANS_BDD;
          }else{
              PreparedStatement preparedStatement = null;
              String req = "INSERT INTO `departement`( `libelle`) VALUES (?)";
              preparedStatement = connection.prepareStatement(req);
              
             
              preparedStatement.setString(1, d.getLibelle()); // Set the first value
              
              
              
              preparedStatement.executeUpdate();//executer la requete
              
              connection.close();
            return AJOUTE_AVEC_SUCCEE;
          }
      }catch(SQLException e ){
          e.printStackTrace();
      }
        return 0;
      
    }
    public static void modifierDept(int id ,String libelle){
        try{
            Connection con = DBConnection.etablirConnection();
            String req = "UPDATE `departement` SET `libelle`= ? WHERE idDepartement = ?";
            PreparedStatement statement = con.prepareStatement(req);
            statement.setString(1, libelle);
            statement.setInt(2, id);
            statement.executeUpdate();
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static int getIdDepartement(String nom){
        try {
            Connection con = DBConnection.etablirConnection();
            String req = "SELECT `idDepartement` FROM `departement` WHERE libelle = ?";
            PreparedStatement statement = con.prepareStatement(req);
            statement.setString(1, nom);
            ResultSet res = statement.executeQuery();
            while(res.next()){
                return res.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        
        return 0;
    }
    public static String getLibelleDepartement(int id){
        try{ Connection con = DBConnection.etablirConnection();
        String req ="Select `libelle` from `departement` WHERE idDepartement =? ";
        PreparedStatement statement = con.prepareStatement(req);
        statement.setInt(1, id);
        ResultSet res= statement.executeQuery();
        while(res.next())
            return res.getString("libelle");
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return "not found";
    }
    
    
    
    
}
