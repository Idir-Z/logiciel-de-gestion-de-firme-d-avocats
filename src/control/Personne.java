/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.util.ArrayList;
import model.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Personne {
    private static final  String MALE = "male";
    private static final  String FEMELLE = "femelle";
   
    private String nom;
    private String prenom;
    private String adresse;
    private LocalDate dateNaissance;
    private String lieuNaissance;
    private String genre;
    private long numIdNationale;
    private ArrayList<Contact> contacts;

    public Personne(String nom, String prenom, String adresse, LocalDate dateNaissance, String lieuNaissance, String genre, long numIdNationale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.genre = genre;
        this.numIdNationale = numIdNationale;
    }
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getNumIdNationale() {
        return numIdNationale;
    }

    public void setNumIdNationale(long numIdNationale) {
        this.numIdNationale = numIdNationale;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
    
    
    



  private static class Contact{
      private static final String TYPE_NUM = "Numero";
      private static final String TYPE_EMAIL = "Email";
      private String type;
      private int valeur;

        public Contact(String type, int valeur) {
            this.type = type;
            this.valeur = valeur;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getValeur() {
            return valeur;
        }

        public void setValeur(int valeur) {
            this.valeur = valeur;
        }

        public static String getTYPE_NUM() {
            return TYPE_NUM;
        }

        public static String getTYPE_EMAIL() {
            return TYPE_EMAIL;
        }
        
      
      

      

      
      
      
  } 
 
}
