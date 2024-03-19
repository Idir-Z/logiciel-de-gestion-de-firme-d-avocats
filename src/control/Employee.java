/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Employee extends Personne {
    private double salaire;
    private LocalDate dateRecrutement;
    private LocalDate dateFinService;

    public Employee(double salaire, LocalDate dateRecrutement, LocalDate dateFinService, String nom, String prenom, String adresse, LocalDate dateNaissance, String lieuNaissance, String genre, long numIdNationale) {
        super(nom, prenom, adresse, dateNaissance, lieuNaissance, genre, numIdNationale);
        this.salaire = salaire;
        this.dateRecrutement = dateRecrutement;
        this.dateFinService = dateFinService;
    }

    public Employee(double salaire, LocalDate dateRecrutement, String nom, String prenom, String adresse, LocalDate dateNaissance, String lieuNaissance, String genre, long numIdNationale) {
        super(nom, prenom, adresse, dateNaissance, lieuNaissance, genre, numIdNationale);
        this.salaire = salaire;
        this.dateRecrutement = dateRecrutement;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public LocalDate getDateRecrutement() {
        return dateRecrutement;
    }

    public void setDateRecrutement(LocalDate dateRecrutement) {
        this.dateRecrutement = dateRecrutement;
    }

    public LocalDate getDateFinService() {
        return dateFinService;
    }

    public void setDateFinService(LocalDate dateFinService) {
        this.dateFinService = dateFinService;
    }
    
    
    
    
    

    
    
    
    
    
}
