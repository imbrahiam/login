package loginproject;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Desktop;
import java.net.URI;

public class Login extends javax.swing.JFrame {

    private static Login single_instance = null;

    public Login() {
        initComponents();
    }

    public static Login Singleton() {
        if (single_instance == null) {

            single_instance = new Login();

        }
        return single_instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Panel = new javax.swing.JPanel();
        Main = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        Usuario = new javax.swing.JLabel();
        Clave = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        Firma = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        Logo = new javax.swing.JLabel();
        RecoverPassword = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setName(""); // NOI18N
        Panel.setPreferredSize(new java.awt.Dimension(500, 500));
        Panel.setLayout(null);

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setMinimumSize(new java.awt.Dimension(400, 500));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        Usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Usuario.setText("Usuario");

        Clave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Clave.setText("Contraseña");

        loginBtn.setText("Ingresar");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        registerBtn.setText("Registrar");
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        Firma.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Firma.setText("Brahiam ™");
        Firma.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Firma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginproject/Icon/log.png"))); // NOI18N
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        RecoverPassword.setForeground(new java.awt.Color(53, 133, 250));
        RecoverPassword.setText("Recuperar contraseña");
        RecoverPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RecoverPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RecoverPasswordMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addComponent(Firma)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MainLayout.createSequentialGroup()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(Logo))
                            .addComponent(Clave)
                            .addComponent(Usuario)
                            .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainLayout.createSequentialGroup()
                                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(RecoverPassword)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Clave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(RecoverPassword)
                .addGap(61, 61, 61)
                .addComponent(Firma)
                .addContainerGap())
        );

        Panel.add(Main);
        Main.setBounds(10, 0, 500, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Panel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RecoverPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecoverPasswordMousePressed

        try {

            Desktop desk = Desktop.getDesktop();
            desk.browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "¡" + "No se pudo recuperar la contraseña" + "!", "Recover", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RecoverPasswordMousePressed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        loginBtnActionPerformed(evt);
    }//GEN-LAST:event_passwordActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        this.dispose();
        HandlerMethods.SignUp();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String user = username.getText();
        String pass = "";

        for (char c : password.getPassword()) {
            pass += Character.toString(c);
        }

        if ((user.isEmpty() || user.isBlank()) && (pass.isEmpty() || pass.isBlank())) {
            showRequired("Debe ingresar su usuario y contraseña, si no está registrado debe registrarse");
        } else if (user.isEmpty() || user.isBlank()) {
            showRequired("Usuario requerido");
        } else if (pass.isEmpty() || pass.isBlank()) {
            showRequired("Contraseña requerida");
        } else {
            //System.out.println("Usuario: " + user + "\nContrasena: " + pass);
            boolean logged = DatabaseHandler.loginValidation(user, pass);

            if (logged) {
                this.dispose();
                HandlerMethods.Management();
            } else {

            }

            username.setText("");
            password.setText("");
        }

    }//GEN-LAST:event_loginBtnActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        loginBtnActionPerformed(evt);
    }//GEN-LAST:event_usernameActionPerformed

    private static void showRequired(String message) {
        JOptionPane.showMessageDialog(new JFrame(), "¡" + message + "!", "", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String args[]) {
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clave;
    private javax.swing.JLabel Firma;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel RecoverPassword;
    private javax.swing.JLabel Usuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
