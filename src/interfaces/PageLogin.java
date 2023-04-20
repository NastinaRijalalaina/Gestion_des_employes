package interfaces;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import traitement.Utilisateur;

public class PageLogin
        extends javax.swing.JFrame
  {
    private static final long serialVersionUID = 1L;
    MenuPrincipal menu;
    public PageLogin()
      {
        initComponents();  
        menu = new MenuPrincipal();
        champutilisateur.setOpaque(false);
        champmdp.setOpaque(false);
        btnconnecter.setOpaque(false);
        labelmdpvide.setVisible(false);
        labelnomvide.setVisible(false);
        champutilisateur.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                updateTable();
            }
            @Override
             public void removeUpdate(DocumentEvent e) {
                 updateTable();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateTable();
            }
            public void updateTable() {
                if ( champutilisateur.getText().isEmpty())
                   {
                    labelnomvide.setVisible(true);
                    panelnom.setBackground(Color.decode("#CC0000"));
                   }
                else
                  {
                    labelnomvide.setVisible(false);
                    panelnom.setBackground(Color.decode("#FFFFFF"));
                  }
            }
        });
        champmdp.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                updateTable();
            }
            @Override
             public void removeUpdate(DocumentEvent e) {
                 updateTable();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateTable();
            }
            public void updateTable() {
                if ( champmdp.getText().isEmpty())
                   {
                    labelmdpvide.setVisible(true);
                    panelmdp.setBackground(Color.decode("#FF3333"));
                   }
                else
                  {
                    labelmdpvide.setVisible(false);
                    panelmdp.setBackground(Color.decode("#FFFFFF"));
                  }
            }
        });
       
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loginFond1 = new interfaces.LoginFond();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        champutilisateur = new javax.swing.JTextField(){
            private static final long serialVersionUID = 1L; // nécessite une version sérialisée

            @Override
            public void paint(Graphics g) {
                super.paint(g);
                if (getText().length() == 0 ) {
                    int h = getHeight();
                    ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                    Insets ins = getInsets();
                    FontMetrics fm = g.getFontMetrics();
                    g.setColor(Color.decode("#C0C0C0"));
                    g.drawString("Nom d'utilisateur", ins.left + 5, h / 2 + fm.getAscent() / 2 );
                }
            }
        };
        panelnom = new javax.swing.JPanel();
        panelmdp = new javax.swing.JPanel();
        btnconnecter = new interfaces.Button();
        disable = new javax.swing.JLabel();
        champmdp = new javax.swing.JPasswordField(){
            private static final long serialVersionUID = 1L; // nécessite une version sérialisée

            @Override
            public void paint(Graphics g) {
                super.paint(g);
                if (getText().length() == 0 ) {
                    int h = getHeight();
                    ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                    Insets ins = getInsets();
                    FontMetrics fm = g.getFontMetrics();
                    g.setColor(Color.decode("#C0C0C0"));
                    g.drawString("Mot de passe", ins.left + 5, h / 2 + fm.getAscent() / 2 );
                }
            }
        };
        labelnomvide = new javax.swing.JLabel();
        labelmdpvide = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login_clipart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fermer.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Se connecter");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password.png"))); // NOI18N

        champutilisateur.setBackground(java.awt.SystemColor.windowBorder);
        champutilisateur.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        champutilisateur.setForeground(new java.awt.Color(255, 255, 255));
        champutilisateur.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        panelnom.setBackground(new java.awt.Color(255, 255, 255));
        panelnom.setFocusable(false);
        panelnom.setPreferredSize(new java.awt.Dimension(0, 1));

        javax.swing.GroupLayout panelnomLayout = new javax.swing.GroupLayout(panelnom);
        panelnom.setLayout(panelnomLayout);
        panelnomLayout.setHorizontalGroup(
            panelnomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        panelnomLayout.setVerticalGroup(
            panelnomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        panelmdp.setBackground(new java.awt.Color(255, 255, 255));
        panelmdp.setPreferredSize(new java.awt.Dimension(0, 1));

        javax.swing.GroupLayout panelmdpLayout = new javax.swing.GroupLayout(panelmdp);
        panelmdp.setLayout(panelmdpLayout);
        panelmdpLayout.setHorizontalGroup(
            panelmdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        panelmdpLayout.setVerticalGroup(
            panelmdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        btnconnecter.setBackground(new java.awt.Color(51, 102, 255));
        btnconnecter.setForeground(new java.awt.Color(255, 255, 255));
        btnconnecter.setText("Connecter");
        btnconnecter.setFocusable(false);
        btnconnecter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnconnecter.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnconnecterMouseClicked(evt);
            }
        });

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/invisible.png"))); // NOI18N
        disable.setAlignmentX(8.0F);
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                disableMouseClicked(evt);
            }
        });

        champmdp.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        champmdp.setForeground(new java.awt.Color(255, 255, 255));
        champmdp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        labelnomvide.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelnomvide.setForeground(new java.awt.Color(204, 0, 0));
        labelnomvide.setText("*Veuiller entrer un nom d'utilisateur.");

        labelmdpvide.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelmdpvide.setForeground(new java.awt.Color(255, 51, 51));
        labelmdpvide.setText("*Veuillez saisir votre mot de passe.");

        javax.swing.GroupLayout loginFond1Layout = new javax.swing.GroupLayout(loginFond1);
        loginFond1.setLayout(loginFond1Layout);
        loginFond1Layout.setHorizontalGroup(
            loginFond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFond1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(loginFond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFond1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginFond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginFond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(loginFond1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addGroup(loginFond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFond1Layout.createSequentialGroup()
                                    .addComponent(champmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(disable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(panelmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelmdpvide, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(loginFond1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addGroup(loginFond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelnomvide, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(loginFond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(champutilisateur)
                                .addComponent(panelnom, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(53, 53, 53))
        );
        loginFond1Layout.setVerticalGroup(
            loginFond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFond1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(loginFond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(champutilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(panelnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelnomvide)
                .addGap(37, 37, 37)
                .addGroup(loginFond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(disable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(champmdp))
                .addGap(0, 0, 0)
                .addComponent(panelmdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelmdpvide, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginFond1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginFond1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("deprecation")
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseClicked
    {//GEN-HEADEREND:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    
    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        for (double i = 0.0; i <=1.0; i = i+0.2){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(30);
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void disableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_disableMouseClicked
    {//GEN-HEADEREND:event_disableMouseClicked
      ImageIcon visible = new  ImageIcon(getClass().getResource("/icon/visible.png"));
      ImageIcon invisible = new  ImageIcon(getClass().getResource("/icon/invisible.png"));
      if (champmdp.getEchoChar() == (char)0)
        {
          disable.setIcon(visible);
          champmdp.setEchoChar((char)8226);
        }
      else
        {
          disable.setIcon(invisible);
          champmdp.setEchoChar((char)0);
        }
    }//GEN-LAST:event_disableMouseClicked

        /**** Se connecter ****/
    
    private void btnconnecterMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnconnecterMouseClicked
    {//GEN-HEADEREND:event_btnconnecterMouseClicked
       if ( champutilisateur.getText().isEmpty())
          {
          }
        if ( champmdp.getText().isEmpty())
          {
          }
        else 
          {
            char[] password = champmdp.getPassword();
            String valeurPassword = String.valueOf(password);
            try
              {
                if ( Utilisateur.seconnecter(champutilisateur.getText().trim(), valeurPassword , this, menu) == false)
                  {
                    labelmdpvide.setText("*Mot de passe incorrect.");
                    panelmdp.setBackground(Color.decode("#FF3333"));
                    labelnomvide.setText("*Vérifier le nom d'utilisateur.");
                    panelnom.setBackground(Color.decode("#CC0000"));
                    labelmdpvide.setVisible(true);                    
                    labelnomvide.setVisible(true);
                    
                  }
              }
            catch (IOException ex)
              {
                Logger.getLogger(PageLogin.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
    }//GEN-LAST:event_btnconnecterMouseClicked
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
      {
          
          MenuPrincipal pcp = new MenuPrincipal();
//        java.awt.EventQueue.invokeLater(new Runnable()
//          {
//            
//            public void run()
//              {
//               new FenetreDemarrage().setVisible(true);
//              }
//          });
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private interfaces.Button btnconnecter;
    private javax.swing.JPasswordField champmdp;
    private javax.swing.JTextField champutilisateur;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelmdpvide;
    private javax.swing.JLabel labelnomvide;
    private interfaces.LoginFond loginFond1;
    private javax.swing.JPanel panelmdp;
    private javax.swing.JPanel panelnom;
    // End of variables declaration//GEN-END:variables
  }
