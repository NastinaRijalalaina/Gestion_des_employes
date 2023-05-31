package DatabaseConnection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author rijaa
 */
public class ConnectionSqlite {
    
    public Connection conn;

    public ConnectionSqlite() {
        this.conn = null;
    }
    public void Connect(){
         try {
            // Charger le pilote JDBC SQLite
            Class.forName("org.sqlite.JDBC");
            
             // Exécuter une requête SELECT et afficher les résultats
             // Établir une connexion à la base de données
             conn = DriverManager.getConnection("jdbc:sqlite:G:\\projetjava\\Gestion_des_employes\\gestionemployer.db");
             System.out.println("tena mety tsara ny connection");

              
               // Exécuter une requête SELECT et afficher les résultats
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("tsy mety");
        }
        
    }
    
}
