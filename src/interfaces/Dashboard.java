package interfaces;

import DatabaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import controleur.*;
import java.awt.Color;

public class Dashboard
        extends javax.swing.JPanel
  {

    /**
     * Creates new form dashboard
     */
    public Dashboard()
      {
        initComponents();
        showData();
        cardemployer.setData(new  Model_Card(new ImageIcon(getClass().getResource("/icon/entreprise.png")),"Entreprise", traitement.Dashboard.SommeEntreprise()));
        cardentreprise.setData(new  Model_Card(new ImageIcon(getClass().getResource("/icon/employer.png")),"Employées", traitement.Dashboard.SommeEmployer()));

      }
    // manao anle Border Radius
    /*protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(grphcs);
    }*/
    private void showData()
      {
          try
            {
              pieChart.clearData();
              DatabaseConnection db = new DatabaseConnection();
              Connection conn = db.getConnection();
               String query = "SELECT libelle,pu FROM produit;";
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(query);
               int index = 0;
               while (rs.next())
                 {
                   String libelle = rs.getString(1);
                   Double pu = rs.getDouble(2);
                   pieChart.addData(new ModelPieChart(libelle, pu, getColor(index++)));
                 }
               stmt.close();
               conn.close();
            }
          catch (Exception e)
            {
            }
      }
    
    //Les Couleurs de la Camembert
    private Color getColor(int index)
      {
        Color[] color = new Color[]{ new Color(255, 102,102),new Color(58, 55,227),new Color(206, 215,33),new Color(29, 184,85),new Color(94, 217,214),new Color(43, 45,250),new Color(200, 169,86),};
        return color[index];
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        cardemployer = new interfaces.Card();
        cardentreprise = new interfaces.Card();
        pieChart = new interfaces.PieChart();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        cardemployer.setColor1(new java.awt.Color(51, 102, 255));
        cardemployer.setColor2(new java.awt.Color(0, 51, 204));

        cardentreprise.setColor1(new java.awt.Color(153, 51, 255));
        cardentreprise.setColor2(new java.awt.Color(153, 102, 255));

        pieChart.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Salaire global des Employées");
        jLabel1.setInheritsPopupMenu(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cardemployer, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                        .addComponent(pieChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(cardentreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cardentreprise, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(cardemployer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(pieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private interfaces.Card cardemployer;
    private interfaces.Card cardentreprise;
    private javax.swing.JLabel jLabel1;
    private interfaces.PieChart pieChart;
    // End of variables declaration//GEN-END:variables
  }
