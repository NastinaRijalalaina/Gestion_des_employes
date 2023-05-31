package controleur;

import javax.swing.Icon;

public class Model_Card
  {
    
    public Icon getIcon()
      {
        return icon;
      }

    public void setIcon(Icon icon)
      {
        this.icon = icon;
      }

    public String getTitre()
      {
        return titre;
      }

    public void setTitre(String titre)
      {
        this.titre = titre;
      }

    public String getValeur()
      {
        return valeur;
      }

    public void setValeur(String valeur)
      {
        this.valeur = valeur;
      }
    
    public  Model_Card(Icon icon, String titre, String valeur)
      {
        this.icon = icon;
        this.valeur = valeur;
        this.titre = titre;
      }
    private Icon icon;
    private String titre;
    private String valeur;
  }
