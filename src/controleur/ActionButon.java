 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleur;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author rijaa
 */
public class ActionButon extends JButton {
    
    private boolean mousePress;
    
    public ActionButon(){
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(3,3,3,3));  
        addMouseListener(new MouseAdapter(){
        
        @Override
        public void mousePressed(MouseEvent me){
            mousePress = true;
        }
        
        @Override
        public void mouseReleased(MouseEvent me){
            mousePress = false;
        }
        });
    }
    
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D)grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        int width = getWidth();
        int height = getHeight();
        int size = Math.min(width, height);
        int x = (width-height)/2;
        int y = (height-width)/2;
        if(mousePress){
            g2.setColor(new Color(137,137,137));

        }else{
            g2.setColor(new Color(199,199,199));
        }

        g2.fill(new Ellipse2D.Double(x,y,size,size));
        g2.dispose();
        super.paintComponent(grphcs);
    }
}
