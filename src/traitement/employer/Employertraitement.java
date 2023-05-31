/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.employer;

import DatabaseConnection.ConnectionSqlite;
//import DatabaseConnection.DatabaseConnection;
import java.sql.*;

/**
 *
 * @author Antsivaniaina
 */
public class Employertraitement{
  
    private String numEmployer;
    private String nom;
    private String adresse;
    public String i;
    
    public Employertraitement(){
        this.numEmployer = null;
        this.nom = null;
        this.adresse = null;
    }
    public String getNumEmployer(){
       return numEmployer;
    }
    public String getNom(){
       return nom;
    }
     public String getAdresse(){
       return adresse;
    }
    
    public void setManipulationDon(String numEmployer, String nom,String adresse){
        this.numEmployer = numEmployer;
        this.nom = nom;
        this.adresse = adresse;
    }
    
   public void envoyeDonn(){
        ConnectionSqlite sqlite = new ConnectionSqlite();
        try{
            sqlite.Connect();
            Connection cn = sqlite.conn;
            String sql = "INSERT INTO employe(numemployer,nom,adresse) VALUES ('"+numEmployer+"','"+nom+"','"+adresse+"')";
//            Statement st = cn.prepareStatement(sql);
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            
      //      ************** maka anle anaty base *****
//            String sql1 = "SELECT numemployer FROM employe ORDER BY numemployer DESC LIMIT 1";
//            PreparedStatement pstmt = cn.prepareStatement(sql1);
//            ResultSet rs = pstmt.executeQuery();
//            while(rs.next()){
//                 i = rs.getString("numemployer");               
//            }
//            System.out.println("coucou"+i);



            st.close();
            cn.close();
        }catch(Exception e){
            
        }
   }
  }
