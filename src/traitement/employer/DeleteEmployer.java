/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.employer;

import DatabaseConnection.ConnectionSqlite;
import java.beans.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rijaa
 */
public class DeleteEmployer {
    
    
    public void delete(JTable table,int row){
       DefaultTableModel model = (DefaultTableModel)table.getModel() ;
       ConnectionSqlite sqlite = new ConnectionSqlite();
       String numero = model.getValueAt(row,0).toString(); 
       System.out.println(numero);
       String sql = "DELETE FROM employe WHERE numemployer = ?";

        
        
       try{
            sqlite.Connect();
            Connection cn = sqlite.conn;
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,numero);
            pst.executeUpdate();            
            pst.close();
            cn.close();
            AffichageEmployer afficher = new AffichageEmployer();
            afficher.affichage(table);


            //JOptionPane.ShowMessageDialog(null,"voafafa tsara");                    
           } catch(SQLException ex){
                System.out.println(ex.getMessage());

        }
    
    }
}
