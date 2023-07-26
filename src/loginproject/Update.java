package loginproject;

import java.lang.reflect.Field;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Update extends javax.swing.JFrame {

    private static Update single_instance = null;
    private static Usuario selectedUser;
    private static int countf = 0;

    private Update() {
        initComponents();
        username.setText(selectedUser.getUsername());
        nombre.setText(selectedUser.getNombre());
        apellido.setText(selectedUser.getApellido());
        telephone.setText(selectedUser.getPhone());
        email.setText(selectedUser.getEmail());
    }

    public static Update Instanciate(Usuario user) {

        selectedUser = user;
        return new Update();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Main = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        Usuario = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        NombreText = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        ApellidoText = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        TelephoneText = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        EmailText = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        Firma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setName(""); // NOI18N
        Panel.setPreferredSize(new java.awt.Dimension(500, 600));
        Panel.setLayout(null);

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setMinimumSize(new java.awt.Dimension(400, 500));
        Main.setPreferredSize(new java.awt.Dimension(500, 650));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        Usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Usuario.setText("Nombre de usuario");

        UpdateBtn.setText("Actualizar");
        UpdateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\brahiam\\Documents\\NetBeansProjects\\LoginProject\\src\\Icon\\log.png")); // NOI18N
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Back.setForeground(new java.awt.Color(53, 133, 250));
        Back.setText("← Regresar");
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        NombreText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NombreText.setText("Nombre");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        ApellidoText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ApellidoText.setText("Apellido");

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        TelephoneText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TelephoneText.setText("Teléfono");

        telephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephoneActionPerformed(evt);
            }
        });

        EmailText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmailText.setText("Correo Electrónico");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        Firma.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Firma.setText("Brahiam ™");
        Firma.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Firma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Back)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MainLayout.createSequentialGroup()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EmailText)
                            .addComponent(TelephoneText)
                            .addComponent(ApellidoText)
                            .addComponent(username)
                            .addComponent(Usuario)
                            .addGroup(MainLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(Logo))
                            .addComponent(NombreText)
                            .addComponent(nombre)
                            .addComponent(apellido)
                            .addComponent(telephone)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Firma)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logo)
                .addGap(18, 18, 18)
                .addComponent(Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ApellidoText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TelephoneText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(Back)
                .addGap(17, 17, 17)
                .addComponent(Firma)
                .addContainerGap())
        );

        Panel.add(Main);
        Main.setBounds(0, 0, 500, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        Panel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        UpdateBtnActionPerformed(evt);
    }//GEN-LAST:event_usernameActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed

        Usuario user = new Usuario();
        user.setUsername(username.getText());
        user.setNombre(nombre.getText());
        user.setApellido(apellido.getText());
        user.setPhone(telephone.getText());
        user.setEmail(email.getText());

        Class<?> clazz = user.getClass();
        Field[] fields = clazz.getDeclaredFields();

        int count = 0;

        for (Field field : fields) {

            field.setAccessible(true);
            String attributeName = field.getName();
            String attributeValue = "";

            if (attributeName.equals("id") || attributeName.equals("password")) {
                continue;
            }

            try {

                attributeValue = field.get(user).toString();

                if (attributeValue.isBlank() || attributeValue.isEmpty()) {
                    count += 1;
                }
            } catch (IllegalAccessException e) {
                attributeValue = null;
            }
            //System.out.println(attributeName + ": " + attributeValue);
        }

        boolean[] correctData = new boolean[4];
        int truth = 0;

        if (count > 0) {
            throwError("No pueden haber campos vacíos");
        } else if (count == 0) {

            for (Field field : fields) {

                field.setAccessible(true);
                String attributeName = field.getName();
                String attributeValue = "";

                if (attributeName.equals("id") || attributeName.equals("password")) {
                    continue;
                }

                try {

                    attributeValue = field.get(user).toString();

                    if (attributeName == "nombre") {
                        if (!checkLetters(attributeValue)) {
                            throwError("El nombre solo debe contener letras");
                        } else {
                            correctData[0] = true;
                        }
                    } else if (attributeName == "apellido") {
                        if (!checkLetters(attributeValue)) {
                            throwError("El apellido solo debe contener letras");
                        } else {
                            correctData[1] = true;
                        }
                    } else if (attributeName == "phone") {
                        if (!checkNumbers(attributeValue)) {
                            throwError("El teléfono solo debe contener números");
                        } else {
                            correctData[2] = true;
                        }
                    } else if (attributeName == "email") {
                        if (!attributeValue.contains("@") || !attributeValue.contains(".")) {
                            throwError("El correo electrónico debe ser válido");
                        } else {
                            correctData[3] = true;
                        }
                    }

                } catch (IllegalAccessException e) {
                    attributeValue = null;
                }
            }

            for (boolean t : correctData) {
                if (t == true) {
                    truth += 1;
                }
            }

            if (truth == 4) {

                if (Management.activeSession.getId() == DatabaseHandler.getUsernameId(selectedUser.getUsername())) {
                    Management.activeSession.setUsername(user.getUsername());
                }

                boolean updated = DatabaseHandler.update(user, selectedUser.getUsername());

                if (updated) {
                    //System.out.println(user.getNombre() + "Usuario actualizado exitosamente en la base de datos");
                    JOptionPane.showMessageDialog(new JFrame(), "¡" + selectedUser.getUsername() + " actualizado exitosamente!", "", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "¡Error, " + selectedUser.getUsername() + " no pudo ser actualizado!", "", JOptionPane.ERROR_MESSAGE);
                }

                this.dispose();
                HandlerMethods.Management();

                this.username.setText("");
                this.nombre.setText("");
                this.apellido.setText("");
                this.telephone.setText("");
                this.email.setText("");

            }

        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        HandlerMethods.Management();
    }//GEN-LAST:event_BackMouseClicked

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        UpdateBtnActionPerformed(evt);
    }//GEN-LAST:event_nombreActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        UpdateBtnActionPerformed(evt);
    }//GEN-LAST:event_apellidoActionPerformed

    private void telephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telephoneActionPerformed
        UpdateBtnActionPerformed(evt);
    }//GEN-LAST:event_telephoneActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        UpdateBtnActionPerformed(evt);
    }//GEN-LAST:event_emailActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    private static boolean checkLetters(String s) {

        int len = s.length();

        for (int i = 0; i < len; i++) {
            if ((Character.isLetter(s.charAt(i)) == false) && !(s.charAt(i) == ' ')) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkNumbers(String s) {

        int len = s.length();

        for (int i = 0; i < len; i++) {
            if ((Character.isDigit(s.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }

    private static void throwError(String msg) {
        JOptionPane.showMessageDialog(new JFrame(), "¡" + msg + "!", "", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoText;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel EmailText;
    private javax.swing.JLabel Firma;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Main;
    private javax.swing.JLabel NombreText;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel TelephoneText;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel Usuario;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField email;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telephone;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
