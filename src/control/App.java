/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control;
import java.time.LocalDate;
import java.time.Month;


/**
 *
 * @author HP
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*LocalDate date = LocalDate.of(2000, Month.MARCH, 28);
        Client c = new Client("Hddddase", "yuruk", "valhalla", date, "mesopotamia", "male", 3453555453l);
        Client.AjouterClient(c);
        
        Departement d = new Departement("forensic affairs");
        Departement.AjouterDepartement(d);*/
        LocalDate date = LocalDate.of(2000, Month.MARCH, 3);
        
        //Avocat a = new Avocat(456999989, 555, 33,date , date, "d,csdc", "dcbdch", "kdbcsc", date, "hdbsdhcs", "male", 342234232);
        //System.out.println(Avocat.AjouterAvocat(a));
         //System.out.println(Avocat.AjouterAvocat(a));*/
        /*Contact c = new Contact("email", "366hhBV");
            int id = Contact.ajouterContact(c);
            System.out.println(id);*/
        //System.out.println(Avocat.getIdAvocat(a));;
        //Departement.modifierDept(15, "idir");
        System.out.println(Departement.getIdDepartement("3"));;
        
    }
    
}
