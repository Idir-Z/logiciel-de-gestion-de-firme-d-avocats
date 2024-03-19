/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projet_gl;

import control.Avocat;
import javax.swing.JOptionPane;
import model.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import java.lang.Double;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
/**
 *
 * @author HP
 */
public class ModAvocat extends javax.swing.JFrame {
   private static DefaultComboBoxModel<String> model = null;
   public static ModAvocat fentre;
 public static  String[] mois = {
    "Janvier", "Février", "Mars", "Avril", "Mai", "Juin",
    "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"
};
    public static String[] jours = {
    "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"
};
    /**
     * Creates new form AjoutAvocat
     */
    public JComboBox getDeptComboBox(){
        return this.departementCombBox;
    }
    public void setNom(String nom){
      nomTextField10.setText(nom);
    }
    public void setPrenom(String pnom){
        PrenomTetxField3.setText(pnom);
    }
    public void setLieuNaissance(String l){
        lieuNaissanceTextField.setText(l);
    }
    public void setAdresse(String a){
        adresseTextField.setText(a);
    }
    public void setSalaire(String s){
        salaireTextField.setText(s);
    }
    public void setNumeroPermis(String n){
        numeroPermisTextField.setText(n);
    }
    public void setNumeroIdNational(String n){
        numeroIdTextField3.setText(""+n);
    }
    public void setJourNaissance(String m){
        DNJour.setText(m);  
    }
    public void setAnneeNaissance(String a){
        dNAnnee.setText(a);
    }
    public void setJourRecrutement(String m){
        DRJour.setText(m);  
    }
    public void setAnneeRecrutement(String a){
        dRAnnee.setText(a);
    }
    public void setJourFinService(String m){
        dFSJour.setText(m);  
    }
    public void setAnneeFinService(String a){
        dFSAnnee.setText(a);
    }
    public void setMoisNaissance(int i){
        dateNMois.setSelectedIndex(i-1);
    }
    public void setMoisRecrutement(int i){
        dRMois.setSelectedIndex(i-1);
    }
    public void setMoisFinService(int i){
        dFSMois.setSelectedIndex(i-1);
    }
    public void setDepartement(String d){
        departementCombBox.setSelectedItem(d);
    }
    public void setContacts(control.Contact[] c){
        
    }
    
    
    
    
    public String getNom(){
        return nomTextField10.getText();
    }
    public String getPrenom(){
        return PrenomTetxField3.getText();
    }
    public String getAdresse(){
        return adresseTextField.getText();
    }
    public String getLieuNaissance(){
    return lieuNaissanceTextField.getText();
}
    public String getNumeroPermis(){
        return numeroPermisTextField.getText();
    }
    public String getNumIdNational(){
        return numeroIdTextField3.getText();
    }
    public String getSalaire(){
        return salaireTextField.getText();
    }
    public String getJourNaissance(){
        return DNJour.getText();
    }
    public String getMoisNaissance(){
        return (String)dateNMois.getSelectedItem();
    }
    public String getAnneeNaissance(){
        return dNAnnee.getText();
    }
    public String getJourRecrutement(){
        return DRJour.getText();
    }
    public String getMoisRecrutement(){
        return (String)dRMois.getSelectedItem();
    }
    public String getAnneeRecrutement(){
        return dRAnnee.getText();
    }
    public String getJourFinService(){
        return dFSJour.getText();
    }
    public String getMoisFinServicet(){
        return (String)dFSMois.getSelectedItem();
    }
    public String getAnneeFinService(){
        return dFSAnnee.getText();
    }
    public String getDepartement(){
        return (String) departementCombBox.getSelectedItem();
    }
    
    
    public static ModAvocat ouvrirFenetreAjoutAvocat(){
        if(fentre == null){
            fentre = new ModAvocat();
           
        }
        fentre.getDeptComboBox().setModel(model);
        return fentre;
    }
    private ModAvocat() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModAvocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModAvocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModAvocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModAvocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        
        
    }
    
    public static void remplirComboBoxDept(){
        Connection con = DBConnection.etablirConnection();
        
        try{
            String req = "SELECT  `libelle` FROM `departement`";
            PreparedStatement statement = con.prepareStatement(req);
            ResultSet resultat = statement.executeQuery();
            Vector<String> items = new Vector<>();
            while(resultat.next()){
                String item = resultat.getString("libelle");
                items.add(item);
            }
             model = new DefaultComboBoxModel<>(items);
           
                    
        }catch(SQLException e){
            e.printStackTrace();
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        fenetreAjout = new javax.swing.JPanel();
        nomTextField10 = new javax.swing.JTextField();
        numeroIdTextField3 = new javax.swing.JTextField();
        PrenomTetxField3 = new javax.swing.JTextField();
        lieuNaissanceTextField = new javax.swing.JTextField();
        dateNMois = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        dNAnnee = new javax.swing.JTextField();
        homme = new javax.swing.JRadioButton();
        femme = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        adresseTextField = new javax.swing.JTextField();
        salaireTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        dFSAnnee = new javax.swing.JTextField();
        dFSMois = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        dRAnnee = new javax.swing.JTextField();
        dRMois = new javax.swing.JComboBox<>();
        numeroPermisTextField = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        ajoutAvocatConfirmer = new javax.swing.JButton();
        departementCombBox = new javax.swing.JComboBox<>();
        dFSJour = new javax.swing.JTextField();
        DNJour = new javax.swing.JTextField();
        DRJour = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fenetreAjout.setBackground(new java.awt.Color(255, 255, 255));
        fenetreAjout.setFocusable(false);

        nomTextField10.setBackground(new java.awt.Color(255, 255, 255));
        nomTextField10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nom", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(51, 51, 51))); // NOI18N
        nomTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTextField10ActionPerformed1(evt);
            }
        });

        numeroIdTextField3.setBackground(new java.awt.Color(255, 255, 255));
        numeroIdTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numer d'idenité Nationale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(51, 51, 51))); // NOI18N
        numeroIdTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroIdTextField3ActionPerformed1(evt);
            }
        });

        PrenomTetxField3.setBackground(new java.awt.Color(255, 255, 255));
        PrenomTetxField3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prenom", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(51, 51, 51))); // NOI18N
        PrenomTetxField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrenomTetxField3ActionPerformed1(evt);
            }
        });

        lieuNaissanceTextField.setBackground(new java.awt.Color(255, 255, 255));
        lieuNaissanceTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lieu de naissance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(51, 51, 51))); // NOI18N
        lieuNaissanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lieuNaissanceTextFieldActionPerformed1(evt);
            }
        });

        dateNMois.setBackground(new java.awt.Color(255, 255, 255));
        dateNMois.setModel(new javax.swing.DefaultComboBoxModel<>(mois));
        dateNMois.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "mois", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        dateNMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateNMoisActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Date de naissance");

        dNAnnee.setBackground(new java.awt.Color(255, 255, 255));
        dNAnnee.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "année", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        homme.setBackground(new java.awt.Color(255, 255, 255));
        homme.setText("Homme");
        buttonGroup2.add(homme);
        homme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hommeActionPerformed(evt);
            }
        });

        femme.setBackground(new java.awt.Color(255, 255, 255));
        femme.setText("Femme");
        buttonGroup2.add(femme);

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Genre");

        adresseTextField.setBackground(new java.awt.Color(255, 255, 255));
        adresseTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adresse", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(51, 51, 51))); // NOI18N
        adresseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresseTextFieldActionPerformed1(evt);
            }
        });

        salaireTextField.setBackground(new java.awt.Color(255, 255, 255));
        salaireTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salaire", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(51, 51, 51))); // NOI18N
        salaireTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaireTextFieldActionPerformed1(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Date fin de service");

        dFSAnnee.setBackground(new java.awt.Color(255, 255, 255));
        dFSAnnee.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "année", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        dFSMois.setBackground(new java.awt.Color(255, 255, 255));
        dFSMois.setModel(new javax.swing.DefaultComboBoxModel<>(mois));
        dFSMois.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "mois", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Date de recrutement");

        dRAnnee.setBackground(new java.awt.Color(255, 255, 255));
        dRAnnee.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "année", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        dRMois.setBackground(new java.awt.Color(255, 255, 255));
        dRMois.setModel(new javax.swing.DefaultComboBoxModel<>(mois));
        dRMois.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "mois", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        dRMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dRMoisActionPerformed(evt);
            }
        });

        numeroPermisTextField.setBackground(new java.awt.Color(255, 255, 255));
        numeroPermisTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numéro de permis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(51, 51, 51))); // NOI18N
        numeroPermisTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroPermisTextFieldActionPerformed1(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(165, 41, 41));
        jButton13.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButton13.setText("Annuler");
        jButton13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        jButton13.setFocusable(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        ajoutAvocatConfirmer.setBackground(new java.awt.Color(45, 116, 66));
        ajoutAvocatConfirmer.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ajoutAvocatConfirmer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/confirm.png"))); // NOI18N
        ajoutAvocatConfirmer.setText("Confirmer");
        ajoutAvocatConfirmer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        ajoutAvocatConfirmer.setFocusable(false);
        ajoutAvocatConfirmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutAvocatConfirmerActionPerformed(evt);
            }
        });

        departementCombBox.setBackground(new java.awt.Color(255, 255, 255));
        departementCombBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        remplirComboBoxDept();
        departementCombBox.setModel(model);
        departementCombBox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Departement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        departementCombBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departementCombBoxActionPerformed(evt);
            }
        });

        dFSJour.setBackground(new java.awt.Color(255, 255, 255));
        dFSJour.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "jour", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        DNJour.setBackground(new java.awt.Color(255, 255, 255));
        DNJour.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "jour", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        DRJour.setBackground(new java.awt.Color(255, 255, 255));
        DRJour.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "jour", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton1.setText("Ajouter des contacs");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fenetreAjoutLayout = new javax.swing.GroupLayout(fenetreAjout);
        fenetreAjout.setLayout(fenetreAjoutLayout);
        fenetreAjoutLayout.setHorizontalGroup(
            fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fenetreAjoutLayout.createSequentialGroup()
                .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fenetreAjoutLayout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(ajoutAvocatConfirmer, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fenetreAjoutLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lieuNaissanceTextField)
                                .addComponent(PrenomTetxField3)
                                .addComponent(nomTextField10)
                                .addComponent(numeroIdTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fenetreAjoutLayout.createSequentialGroup()
                                .addComponent(dNAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateNMois, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(DNJour, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fenetreAjoutLayout.createSequentialGroup()
                                .addComponent(homme, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(femme, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adresseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(numeroPermisTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salaireTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(fenetreAjoutLayout.createSequentialGroup()
                                    .addComponent(dRAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dRMois, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(DRJour, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(fenetreAjoutLayout.createSequentialGroup()
                                    .addComponent(dFSAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dFSMois, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(dFSJour, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(departementCombBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        fenetreAjoutLayout.setVerticalGroup(
            fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fenetreAjoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaireTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrenomTetxField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dRAnnee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dRMois, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DRJour, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(numeroIdTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dFSAnnee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dFSMois, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dFSJour, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateNMois, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DNJour, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dNAnnee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lieuNaissanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroPermisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fenetreAjoutLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homme)
                            .addComponent(femme))
                        .addGap(38, 38, 38)
                        .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adresseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(56, 56, 56))
                    .addGroup(fenetreAjoutLayout.createSequentialGroup()
                        .addComponent(departementCombBox, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(fenetreAjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajoutAvocatConfirmer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fenetreAjout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fenetreAjout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomTextField10ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTextField10ActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTextField10ActionPerformed1

    private void numeroIdTextField3ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroIdTextField3ActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroIdTextField3ActionPerformed1

    private void PrenomTetxField3ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrenomTetxField3ActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenomTetxField3ActionPerformed1

    private void lieuNaissanceTextFieldActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lieuNaissanceTextFieldActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_lieuNaissanceTextFieldActionPerformed1

    private void hommeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hommeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hommeActionPerformed

    private void adresseTextFieldActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresseTextFieldActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_adresseTextFieldActionPerformed1

    private void salaireTextFieldActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaireTextFieldActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_salaireTextFieldActionPerformed1

    private void dRMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dRMoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dRMoisActionPerformed

    private void numeroPermisTextFieldActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroPermisTextFieldActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroPermisTextFieldActionPerformed1

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModAvocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModAvocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModAvocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModAvocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void ajoutAvocatConfirmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutAvocatConfirmerActionPerformed
        // TODO add your handling code here:
        String nom,prenom,lieuNaissance,adresse,genre = null,nomDept;
        long idNat =0,numPermis =0;
        int anneeNaissance =0,jourNaissance=0,anneeRecrutement=0,jourRecrutement = 0,anneeFinService = 0,jourFinService = 0,idDept = 0;
        double salaire = 0;
        
             
        nom = nomTextField10.getText();
        prenom = PrenomTetxField3.getText();
        lieuNaissance = lieuNaissanceTextField.getText();
        adresse = adresseTextField.getText();
        nomDept =departementCombBox.getSelectedItem().toString();
        idDept = control.Departement.getIdDepartement(nomDept);
        System.out.println(nomDept);
        
        
        
        
        if(!nom.isBlank()){
            if(!prenom.isBlank()){
            if(!numeroIdTextField3.getText().isBlank()){
                try{
                idNat = Integer.parseInt(numeroIdTextField3.getText());
                if(!dNAnnee.getText().isBlank() && !DNJour.getText().isBlank()){
                    try{
                        anneeNaissance = Integer.parseInt(dNAnnee.getText());
                        jourNaissance = Integer.parseInt(DNJour.getText());
                        if(jourNaissance>31) throw new java.lang.NumberFormatException();
                        
            if(!lieuNaissance.isBlank()){
            if(!adresse.isBlank()){
            if(!salaireTextField.getText().isBlank()){
                try{
                    salaire = Double.parseDouble(salaireTextField.getText());
                if((!dRAnnee.getText().isBlank() && !DRJour.getText().isBlank())){
                    try {
                        anneeRecrutement = Integer.parseInt(dRAnnee.getText());
                        jourRecrutement = Integer.parseInt(DRJour.getText());
                        if(jourRecrutement>31) throw new java.lang.NumberFormatException();
                        if(!numeroPermisTextField.getText().isBlank()){
                            try{
                                numPermis = Integer.parseInt(numeroPermisTextField.getText());
                                if(!dFSAnnee.getText().isBlank()&&!dFSJour.getText().isBlank()){
                                    try {
                                        anneeFinService = Integer.parseInt(dFSAnnee.getText());
                                        jourFinService = Integer.parseInt(dFSJour.getText());
                                        if(homme.isSelected() || femme.isSelected()){
                                            genre = homme.isSelected()? homme.getText() : femme.getText();
                                            
                                            LocalDate dateNaissance = LocalDate.of(anneeNaissance, (dateNMois.getSelectedIndex()+1), jourNaissance);
                                            LocalDate dateRecrutement = LocalDate.of(anneeRecrutement, (dRMois.getSelectedIndex()+1), jourRecrutement);
                                            LocalDate dateFinService = LocalDate.of(anneeFinService, (dFSMois.getSelectedIndex()+1), jourFinService);
                                            Avocat a = new Avocat(numPermis, idDept, salaire, dateRecrutement, dateFinService, nom, prenom, adresse, dateNaissance, lieuNaissance, genre, idNat);
                                            int resultat = Avocat.AjouterAvocat(a);
                                            
                                            switch (resultat) {
                                                    case control.Constants.AJOUTE_AVEC_SUCCEE:
                                                    control.Contact[] c = f.getContactsAjoute();
                                                    int[] idContacts = new int[c.length];
                                                    for(int i = 0;i<c.length;i++){
                                                    idContacts[i]= control.Contact.ajouterContact(c[i]);
                                                    try{
                                                        Connection con = DBConnection.etablirConnection();
                                                        String req = "INSERT INTO `avocat_contact`(`idAvocat`, `idContact`) VALUES (?,?)";
                                                        
                                                        PreparedStatement sta = con.prepareStatement(req);
                                                        sta.setLong(1,Avocat.getIdAvocat(a));
                                                        sta.setInt(2, idContacts[i]);
                                                        sta.executeUpdate();
                                                    }catch(SQLException exe){
                                                        exe.printStackTrace();
                                                    }
                                                        }
                                                    
                                                    f.viderTableau();
                                                    JOptionPane.showMessageDialog(rootPane, "Avocat ajouté avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                                                    
                                                    break;
                                                case control.Constants.ELEMENT_DEJA_DANS_BDD:
                                                    JOptionPane.showMessageDialog(rootPane, "L'avocat est déja dans la base de données", "", JOptionPane.ERROR_MESSAGE);
                                                    break;
                                                case control.Constants.PROBLEME_DE_CONNEXION_BDD:
                                                    JOptionPane.showMessageDialog(rootPane, "Probleme de connexion à la base de données ", "Probleme de connexion", JOptionPane.ERROR_MESSAGE);
                                                    break;
                                                default:
                                                    throw new AssertionError();
                                            }
                                            
                                            
                                        }else JOptionPane.showMessageDialog(rootPane, "veuillez specifier le genre", "un champ manquant", JOptionPane.ERROR_MESSAGE);
                                    } catch (java.lang.NumberFormatException e) {
                                        JOptionPane.showMessageDialog(rootPane, "veuillez saisir une date de fin de service correcte", "un champ incorrecte", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                
                            }catch(java.lang.NumberFormatException e){
                                JOptionPane.showMessageDialog(rootPane, "veuillez saisir un numero de permis correcte", "un champ incorrecte", JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                        JOptionPane.showMessageDialog(rootPane, "veuillez remplir la date de recrutement", "un champ manquant", JOptionPane.ERROR_MESSAGE);
                        }
                        
                        
                        
                    } catch (java.lang.NumberFormatException e) {
                        JOptionPane.showMessageDialog(rootPane, "veuillez saisir une date de recrutement correcte", "un champ incorrecte", JOptionPane.ERROR_MESSAGE);
                    }
                }else JOptionPane.showMessageDialog(rootPane, "veuillez remplir la date de recrutement", "un champ manquant", JOptionPane.ERROR_MESSAGE);
                }
                catch(java.lang.NumberFormatException e){
                    JOptionPane.showMessageDialog(rootPane, "veuillez saisir un Salaire correcte", "un champ incorrecte", JOptionPane.ERROR_MESSAGE);
                }
            
        }else JOptionPane.showMessageDialog(rootPane, "veuillez remplir le salaire", "un champ manquant", JOptionPane.ERROR_MESSAGE);
        }else JOptionPane.showMessageDialog(rootPane, "veuillez remplir l'adresse", "un champ manquant", JOptionPane.ERROR_MESSAGE);
        }else JOptionPane.showMessageDialog(rootPane, "veuillez remplir le lieu de naissance", "un champ manquant", JOptionPane.ERROR_MESSAGE);
                    }catch(Exception e){
                        
                    }
        }else JOptionPane.showMessageDialog(rootPane, "veuillez remplir la date de naissance", "un champ manquant", JOptionPane.ERROR_MESSAGE);
                }catch(java.lang.NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane, "veuillez saisir un Numéro d'identité correcte", "un champ incorrecte", JOptionPane.ERROR_MESSAGE);
                }
                
            
        }else JOptionPane.showMessageDialog(rootPane, "veuillez remplir le numero d'identité", "un champ manquant", JOptionPane.ERROR_MESSAGE);
        }else JOptionPane.showMessageDialog(rootPane, "veuillez remplir le prenom", "un champ manquant", JOptionPane.ERROR_MESSAGE);
        }else JOptionPane.showMessageDialog(rootPane, "veuillez remplir le nom", "un champ manquant", JOptionPane.ERROR_MESSAGE);
        
        
       
    }//GEN-LAST:event_ajoutAvocatConfirmerActionPerformed
    ModContact f = ModContact.ouvrirFnetreModContact();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        f = ModContact.ouvrirFnetreModContact();
        f.setVisible(true);
        f.setAlwaysOnTop(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void departementCombBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departementCombBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departementCombBoxActionPerformed

    private void dateNMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateNMoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateNMoisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModAvocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModAvocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModAvocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModAvocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ModAvocat().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNJour;
    private javax.swing.JTextField DRJour;
    private javax.swing.JTextField PrenomTetxField3;
    private javax.swing.JTextField adresseTextField;
    private javax.swing.JButton ajoutAvocatConfirmer;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField dFSAnnee;
    private javax.swing.JTextField dFSJour;
    private javax.swing.JComboBox<String> dFSMois;
    private javax.swing.JTextField dNAnnee;
    private javax.swing.JTextField dRAnnee;
    private javax.swing.JComboBox<String> dRMois;
    private javax.swing.JComboBox<String> dateNMois;
    private javax.swing.JComboBox<String> departementCombBox;
    private javax.swing.JRadioButton femme;
    private javax.swing.JPanel fenetreAjout;
    private javax.swing.JRadioButton homme;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JTextField lieuNaissanceTextField;
    private javax.swing.JTextField nomTextField10;
    private javax.swing.JTextField numeroIdTextField3;
    private javax.swing.JTextField numeroPermisTextField;
    private javax.swing.JTextField salaireTextField;
    // End of variables declaration//GEN-END:variables
}
