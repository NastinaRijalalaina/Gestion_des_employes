/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.employer;

import DatabaseConnection.ConnectionSqlite;
import interfaces.Ajouter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author rijaa
 */
public class EmployerNum {
    Ajouter ajout;
    public String numeroemploye;
    public EmployerNum(Ajouter ajout){
     this.ajout = ajout;
    }
    
    public void recupereNum(){
        ConnectionSqlite sqlite = new ConnectionSqlite();

        try{
        sqlite.Connect();
        Connection cn = sqlite.conn;
        String sql1 = "SELECT numemployer FROM employe ORDER BY numemployer DESC LIMIT 1";
        PreparedStatement pstmt = cn.prepareStatement(sql1);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
                 String num = rs.getString("numemployer");
                 String resultString = num.substring(2);
                 int nume = Integer.parseInt(resultString);
                 int resultatInt = nume+1;
                 numeroemploye = "rr" + resultatInt;          
            }
            System.out.println("coucou"+ numeroemploye);
        
        ajout.numEmployer.setText(numeroemploye);
        }catch(Exception e){
        
        }
        
    }
}
