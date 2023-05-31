/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement;

import DatabaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Dashboard
  {
    public static String SommeEmployer()
      {
        String  somme = "";
          try
            {
              DatabaseConnection db = new DatabaseConnection();
              Connection conn = db.getConnection();
               String query = "SELECT COUNT(*) AS sommeemployer FROM client";
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(query);
               if (rs.next())
                 {
                    somme = rs.getString("sommeemployer");
                 }
               stmt.close();
               conn.close();
            }
          catch (Exception e)
            {
            }
          return somme ;
      }
    public static String SommeEntreprise()
      {
        String  somme = "";
          try
            {
              DatabaseConnection db = new DatabaseConnection();
              Connection conn = db.getConnection();
               String query = "SELECT COUNT(*) AS sommeproduit FROM produit";
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(query);
               if (rs.next())
                 {
                    somme = rs.getString("sommeproduit");
                 }
               stmt.close();
               conn.close();
            }
          catch (Exception e)
            {
            }
          return somme ;
      }
  }
