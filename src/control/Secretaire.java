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
public class Secretaire extends Employee{
    private Avocat avocat;

    public Secretaire(Avocat avocat, double salaire, LocalDate dateRecrutement, LocalDate dateFinService, String nom, String prenom, String adresse, LocalDate dateNaissance, String lieuNaissance, String genre, long numIdNationale) {
        super(salaire, dateRecrutement, dateFinService, nom, prenom, adresse, dateNaissance, lieuNaissance, genre, numIdNationale);
        this.avocat = avocat;
    }

    public Secretaire(Avocat avocat, double salaire, LocalDate dateRecrutement, String nom, String prenom, String adresse, LocalDate dateNaissance, String lieuNaissance, String genre, long numIdNationale) {
        super(salaire, dateRecrutement, nom, prenom, adresse, dateNaissance, lieuNaissance, genre, numIdNationale);
        this.avocat = avocat;
    }


    
    

    

    

    public Avocat getAvocat() {
        return avocat;
    }

    public void setAvocat(Avocat avocat) {
        this.avocat = avocat;
    }
    
    
    
    
    
}
