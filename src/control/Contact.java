/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.Connection;
import java.sql.SQLException;
import model.DBConnection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
/**
 *
 * @author HP
 */
public class Contact {
    private String Type;
    private String valeur;

    public Contact(String Type, String valeur) {
        this.Type = Type;
        this.valeur = valeur;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }
    
    public static int ajouterContact(Contact c){
        int generatedId = 0 ;
        try{
            Connection connection = DBConnection.etablirConnection();
            String requete = "INSERT INTO `contact`( `type`, `valeur`) VALUES (?,?)";
            PreparedStatement statement = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, c.getType());
            statement.setString(2, c.getValeur());
            statement.executeUpdate();
             ResultSet generatedKeys = statement.getGeneratedKeys();
             while(generatedKeys.next())
             generatedId =  generatedKeys.getInt(1);
            connection.close();
        }catch(SQLIntegrityConstraintViolationException e){
            Connection connection = DBConnection.etablirConnection();
            String requete = "SELECT `idContact` FROM `contact` WHERE valeur = ?";
            try{
            PreparedStatement statement = connection.prepareStatement(requete);
            statement.setString(1, c.getValeur());
            ResultSet resultat= statement.executeQuery();
            while(resultat.next()){
                return resultat.getInt(1);
            }
            
            }
            catch(SQLException ex){
                e.printStackTrace();
            }
            return Constants.ELEMENT_DEJA_DANS_BDD;
        }
        catch(SQLException  e){
            e.printStackTrace();      
        }
        return generatedId ;
      
    }
    
}
