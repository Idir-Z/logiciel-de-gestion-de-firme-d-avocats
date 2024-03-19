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
import java.time.LocalDate;
import model.DBConnection;

/**
 *
 * @author HP
 */
public class Avocat extends Employee {
    
    private long numeroPermis;
    private int idDepartement;
    

    public Avocat(long numeroPermis, int idDepartement, double salaire, LocalDate dateRecrutement, LocalDate dateFinService, String nom, String prenom, String adresse, LocalDate dateNaissance, String lieuNaissance, String genre, long numIdNationale) {
        super(salaire, dateRecrutement, dateFinService, nom, prenom, adresse, dateNaissance, lieuNaissance, genre, numIdNationale);
        this.numeroPermis = numeroPermis;
        this.idDepartement = idDepartement;
        
    }

    public Avocat(long numeroPermis, int idDepartement, double salaire, LocalDate dateRecrutement, String nom, String prenom, String adresse, LocalDate dateNaissance, String lieuNaissance, String genre, long numIdNationale) {
        super(salaire, dateRecrutement, nom, prenom, adresse, dateNaissance, lieuNaissance, genre, numIdNationale);
        this.numeroPermis = numeroPermis;
        this.idDepartement = idDepartement;
      
    }

    public Avocat(long numeroPermis, double salaire, LocalDate dateRecrutement, String nom, String prenom, String adresse, LocalDate dateNaissance, String lieuNaissance, String genre, long numIdNationale) {
        super(salaire, dateRecrutement, nom, prenom, adresse, dateNaissance, lieuNaissance, genre, numIdNationale);
        this.numeroPermis = numeroPermis;
    }
    

    public long getNumeroPermis() {
        return numeroPermis;
    }

    public void setNumeroPermis(long numeroPermis) {
        this.numeroPermis = numeroPermis;
    }

    public int getIdDepartement() {
        return idDepartement;
    }

    public void setDepartement(int idDepartement) {
        this.idDepartement = idDepartement;
    }
    public static long getIdAvocat(Avocat a){
        long id =0;
        try{
           Connection con = DBConnection.etablirConnection();
           String req = "SELECT `idAvocat` FROM `avocat` WHERE numeroPermis = "+a.getNumeroPermis();
           PreparedStatement statement = con.prepareStatement(req);
           ResultSet resultat= statement.executeQuery();
            while (resultat.next()) {                
                 return resultat.getLong("idAvocat");
            }
        }catch(SQLException e){
            
        }
        return id;
    }
    public static ResultSet getIdDesAvocats(){
        ResultSet res =null;
        try {
            Connection con = DBConnection.etablirConnection();
            String req = "SELECT `idAvocat` FROM `avocat` WHERE 1";
            PreparedStatement st = con.prepareStatement(req);
            res = st.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    public static int modifierAvocat(int id){
        try {
            Connection con = DBConnection.etablirConnection();
            String req = "UPDATE `avocat` SET `numeroPermis`=?,`numIdNationale`= ?,`salaire`=?,`prenom`=?,`nom`=?,`genre`=?,`dateFinService`=?,`dateNaissance`=?,`dateRecrutement`=?,`lieuNaissance`=?,`adresse`= ?,`idDepartement`= ? WHERE idAvocat = " + id;
            PreparedStatement statement = con.prepareStatement(req);
            statement.setLong(1, id);
        } catch (SQLException e) {
        }
        
        return 0;
    }
    public static ResultSet getAvocat(int id){
        ResultSet res = null;
        try{Connection con = DBConnection.etablirConnection();
            String req = "SELECT `idAvocat`, `numeroPermis`, `numIdNationale`, `salaire`, `prenom`, `nom`, `genre`, YEAR(dateFinService) AS anneeFinService,MONTH(dateFinService) AS moisFinService,DAY(dateFinService) AS jourFinService, YEAR(dateNaissance) AS anneeNaissance,MONTH(dateNaissance) AS moisNaissance,DAY(dateNaissance) AS jourNaissance,YEAR(dateRecrutement) AS anneeRecrutement,MONTH(dateRecrutement) AS moisRecrutement,DAY(dateRecrutement) AS jourRecrutement , `lieuNaissance`, `adresse`, `idDepartement` FROM `avocat` WHERE idAvocat = ?";
            PreparedStatement statement = con.prepareStatement(req);
            statement.setInt(1, id);
            res =statement.executeQuery();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return res;
    }

    public static int AjouterAvocat(Avocat c){
      boolean inserted = false;
      Connection connection =null;
      PreparedStatement statement = null;
      ResultSet resulta = null;
      
      try{
        connection = DBConnection.etablirConnection();
        if(connection == null) return Constants.PROBLEME_DE_CONNEXION_BDD;
      
        String requete = "SELECT  `numIdNationale` FROM `Avocat` WHERE numIdNationale = ? or numeroPermis = ? ";
      statement = connection.prepareStatement(requete);
      statement.setLong(1, c.getNumIdNationale());
      statement.setLong(2, c.getNumeroPermis());
       resulta =  statement.executeQuery();
          if (resulta.next()) {
              return Constants.ELEMENT_DEJA_DANS_BDD;
          }else{
              
              Date dateN = Date.valueOf(c.getDateNaissance());
              Date dateFS = Date.valueOf(c.getDateFinService());
              Date dateR = Date.valueOf(c.getDateRecrutement());
        
              PreparedStatement preparedStatement = null;
              String req = "INSERT INTO `avocat`( `numeroPermis`, `numIdNationale`, `salaire`, `prenom`, `nom`, `genre`, `dateFinService`, `dateNaissance`, `dateRecrutement`, `lieuNaissance`, `adresse`, `idDepartement`)VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
              preparedStatement = connection.prepareStatement(req);
              
             
              preparedStatement.setLong(1, c.getNumeroPermis()); // Set the first value
              preparedStatement.setLong(2, c.getNumIdNationale());
              preparedStatement.setDouble(3, c.getSalaire());
              preparedStatement.setString(4, c.getPrenom());
              preparedStatement.setString(5, c.getNom());
              preparedStatement.setString(6, c.getGenre());
              preparedStatement.setDate(7, dateFS);
              preparedStatement.setDate(8, dateN);
              preparedStatement.setDate(9, dateR);
              preparedStatement.setString(10, c.getLieuNaissance());
              preparedStatement.setString(11, c.getAdresse());
              preparedStatement.setInt(12, c.getIdDepartement());
              
              
              preparedStatement.executeUpdate();//executer la requete
              
              DBConnection.CloseConnection(connection);
              return Constants.AJOUTE_AVEC_SUCCEE;
          }   
      }catch(SQLException e ){
          e.printStackTrace();
          return Constants.PROBLEME_DE_CONNEXION_BDD;
      }

}
}
