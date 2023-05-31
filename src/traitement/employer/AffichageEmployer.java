/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.employer;

import DatabaseConnection.ConnectionSqlite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rijaa
 */
public class AffichageEmployer {
   
   
    
    public AffichageEmployer(){
        
  }
    
    
    public void affichage(JTable table){
    
        ConnectionSqlite sqlite = new ConnectionSqlite();
        
        try{
            sqlite.Connect();
            Connection con = sqlite.conn;
            String sql = "SELECT * FROM employe";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            while(rs.next()){
                int i = 0;
                Object [] row = new Object[3];
                row[0] = rs.getString("numemployer");
                row[1] = rs.getString("nom");
                row[2] = rs.getString("adresse");
                
                model.addRow(row);

                model.fireTableDataChanged();

                System.out.println(row[0]);
                System.out.println(row[1]);
                                
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(JLabel.CENTER);
                table.setDefaultRenderer(Object.class, centerRenderer);
                table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
               
            }

             table.setModel(model);
            model.fireTableDataChanged();
             rs.close();
             con.close();       
            
        }catch(SQLException ex){
        
            System.out.println(ex.getMessage());
        }

    
        }
}
