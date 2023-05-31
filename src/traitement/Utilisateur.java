package traitement;
import DatabaseConnection.DatabaseConnection;
import java.io.IOException;
import java.sql.*;
import javax.swing.JFrame;

public class Utilisateur
  {
    private String nomuser;

    public String getNomuser() {
        return nomuser;
    }

    public void setNomuser(String nomuser) {
        this.nomuser = nomuser;
    }
    
    //Se Connecter
    public static Boolean seconnecter(String username, String password, JFrame loginForm, JFrame dashboard) throws IOException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Boolean reponse;
        try {
            DatabaseConnection db = new DatabaseConnection();
            conn = db.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM utilisateur WHERE nomutil = ? AND mdp = ?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if (rs.next()) {
                reponse = true;
                loginForm.dispose(); // Fermer la fenêtre de connexion actuelle
                dashboard.setVisible(true); // Afficher la fenêtre principale de l'application
            } else {
                reponse = false;
                /*JOptionPane.showMessageDialog(null, "Veuiller verifier le nom 'utilisateur ou votre mot de passe.", "Information", JOptionPane.INFORMATION_MESSAGE);*/
            }
            return reponse;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    
  }}
