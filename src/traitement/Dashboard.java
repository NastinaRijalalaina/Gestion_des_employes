package traitement;

import DatabaseConnection.DatabaseConnection;
import controleur.ModelPieChart;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import interfaces.PieChart;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Dashboard
  {
    private static DefaultCategoryDataset dataset;
    private static JFreeChart chart;
    private static CategoryPlot categoryplot;
    private static ChartPanel chartpanel;
    
    //Mampiseho an'ilay Total employer eo @ DashBoard Interface
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
    
    //Mampiseho an'ilay Total Entreprise eo @ DashBoard Interface
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
    
    //Mampiseho an'ilay Graph boribory (Camembert)
    public static void showDataPieChart(PieChart pieChart)
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
    
    //Ny loko rehetra miasa @ ilay Camembert
    private static Color getColor(int index)
      {
        Color[] color = new Color[]{ new Color(255, 102,102),new Color(58, 55,227),new Color(206, 215,33),new Color(29, 184,85),new Color(94, 217,214),new Color(43, 45,250),new Color(200, 169,86),};
        return color[index];
      }
    
    //Mampiseho an'ilay Graph lavalava (Barchart) eo @ DashBoard Interface
    public static void showDataBarchart(JPanel panelBarChart)
      {

       String path = "C:\\Users\\Antsivaniaina\\Pictures\\back.png";
        try
          {
            Image image = ImageIO.read(new File(path));
            dataset = new DefaultCategoryDataset();
            dataset.addValue(120000.0, "Produit 1","2000"); 
            dataset.addValue(550000.0, "Produit 1","2001"); 
            dataset.addValue(180000.0, "Produit 1","2002"); 
       
            dataset.addValue(270000.0, "Produit 2","2000"); 
            dataset.addValue(600000.0, "Produit 2","2001"); 
            dataset.addValue(230000.0, "Produit 2","2008"); 
       
            dataset.addValue(900000.0, "Produit 3","2000"); 
            dataset.addValue(450000.0, "Produit 3","2001"); 
            dataset.addValue(170000.0, "Produit 3","2002");
       
       //create Chart
       chart = ChartFactory.createBarChart("Titre BarChart","", "Billions($)", dataset, PlotOrientation.VERTICAL,true,true,false);
       categoryplot = chart.getCategoryPlot();
       chartpanel = new ChartPanel(chart);
       chartpanel.setOpaque(true);
       chartpanel.setBackground(Color.red);
       categoryplot.setBackgroundImage(image);
       panelBarChart.removeAll();
       panelBarChart.add(chartpanel);
       panelBarChart.validate();
          }
        catch (IOException ex)
          {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
  }
