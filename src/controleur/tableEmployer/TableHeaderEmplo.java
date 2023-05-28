/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleur.tableEmployer;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author rijaa
 */
public class TableHeaderEmplo extends JTable {
    
    public TableHeaderEmplo(String text){
//        super(text);
        setOpaque(true);
        setBackground(Color.white);
        setFont(new Font("sansserif",1,12));
        setForeground(new Color(102,102,102));
        setBorder(new EmptyBorder(0,0,0,0));
        
        
        
    }

//    private TableHeaderEmplo(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
