/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleur;

import interfaces.Ajouter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import traitement.employer.Employertraitement;

/**
 *
 * @author rijaa
 */
public class AjoutEmployer implements ActionListener{
    
    public Ajouter ajt;
    public Employertraitement empl;
   

    public AjoutEmployer(Ajouter ajt,Employertraitement empl){
        this.ajt = ajt;
        this.empl = empl;
        this.ajt.Valider.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String numEmployer = ajt.numEmployer.getText();       
        String nom = ajt.nom.getText();
        String adresse = ajt.adresse.getText();
        
        empl.setManipulationDon(numEmployer, nom, adresse);
        empl.envoyeDonn();
        
        
        System.out.println(empl.getAdresse()); 
        
        //ts.teste1.setText("coucouPanel");
        //ts.setVisible(true);
        
        
//        System.out.println(numEmployer);
//        System.out.println(nom);
//        System.out.println("Coucou");
        


    }
    
}
