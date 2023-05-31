package interfaces;

import controleur.Model_Card;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class Card
        extends javax.swing.JPanel
  {
    public Color getColor1()
      {
        return color1;
      }

    public void setColor1(Color color1)
      {
        this.color1 = color1;
      }

    public Color getColor2()
      {
        return color2;
      }

    public void setColor2(Color color2)
      {
        this.color2 = color2;
      }

    public Card(Color color1, Color color2, JLabel labelIcon, JLabel labelTitre, JLabel labelValeur)
      {
        this.color1 = color1;
        this.color2 = color2;
        this.labelIcon = labelIcon;
        this.labelTitre = labelTitre;
        this.labelValeur = labelValeur;
      }
    private  Color color1;
    private  Color color2;
    public Card()
      {
        initComponents();
        setOpaque(false);
       color1 = Color.BLACK;
       color2 = Color.WHITE;
      }

    public void setData(Model_Card data)
      {
        labelIcon.setIcon(data.getIcon());
        labelTitre.setText(data.getTitre());
        labelValeur.setText(data.getValeur());
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        labelIcon = new javax.swing.JLabel();
        labelTitre = new javax.swing.JLabel();
        labelValeur = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        labelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/entreprise.png"))); // NOI18N

        labelTitre.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTitre.setForeground(new java.awt.Color(255, 255, 255));
        labelTitre.setText("Titre");

        labelValeur.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelValeur.setForeground(new java.awt.Color(255, 255, 255));
        labelValeur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelValeur.setText("Valeur");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelValeur, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(labelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(labelIcon)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIcon)
                .addGap(15, 15, 15)
                .addComponent(labelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelValeur, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics graphics)
      {
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new  GradientPaint(0, 0, color1,0,getHeight(),color2);
        g2.setPaint(g);
        g2.fillRoundRect(0,0,getWidth(),getHeight(),15,15);
        g2.setColor(new Color(255,255,255,50));
        g2.fillOval( getWidth() - (getHeight() / 2) , 10, getHeight(), getHeight());
        g2.fillOval( getWidth() - (getHeight() / 2) - 20 , getHeight()/2 + 20,getHeight(), getHeight());
        super.paintComponent(graphics);
      }
    /*
     * Color1 = #c562c7
     * Color2 = #332fa9
     *
     *
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelTitre;
    private javax.swing.JLabel labelValeur;
    // End of variables declaration//GEN-END:variables
  }
