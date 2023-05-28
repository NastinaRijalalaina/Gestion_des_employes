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
                Object row[] = new Object[3];
                row[0] = rs.getString("numemployer");
                row[1] = rs.getString("nom");
                row[2] = rs.getString("adresse");
                
                System.out.println(row[0]);
                System.out.println(row[1]);
                
                model.addRow(row);
                
//                String numemployer = rs.getString("numemployer");
//           
//                String nom = rs.getString("nom");
//                String adresse = rs.getString("adresse");
//                
//                
//                model.addRow(new Object[]{numemployer, nom, adresse});
//                tst.teste1.setText("cocou");
                
                //
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(JLabel.CENTER);
                table.setDefaultRenderer(Object.class, centerRenderer);
            
                table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
               // i++;           
        
            }
            
            table.setModel(model);
            model.fireTableDataChanged();
        }catch(Exception e){
        
            System.out.println("misy ts mety n affichage");
        }

    
        }
}
