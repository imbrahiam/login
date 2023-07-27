package loginproject;

import java.lang.reflect.Field;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    private static Register single_instance = null;
    private static boolean mngt = false;

    private Register() {
        initComponents();
    }

    public static Register Instanciate(boolean nuevo) {
        if (single_instance == null) {
            single_instance = new Register();
        }

        if (nuevo) {
            mngt = nuevo;
        }

        return single_instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Main = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        Usuario = new javax.swing.JLabel();
        Clave = new javax.swing.JLabel();
        RegisterBtn = new javax.swing.JButton();
        Firma = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        Logo = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        confirmPasswordText = new javax.swing.JLabel();
        NombreText = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        ApellidoText = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        TelephoneText = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        EmailText = new javax.swing.JLabel();
        email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setName(""); // NOI18N
        Panel.setPreferredSize(new java.awt.Dimension(500, 750));
        Panel.setLayout(null);

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setMinimumSize(new java.awt.Dimension(400, 500));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        Usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Usuario.setText("Nombre de usuario");

        Clave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Clave.setText("Contraseña");

        RegisterBtn.setText("Registrar");
        RegisterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
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

        Back.setForeground(new java.awt.Color(53, 133, 250));
        Back.setText("← Regresar");
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        confirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordActionPerformed(evt);
            }
        });

        confirmPasswordText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirmPasswordText.setText("Confirmar contraseña");

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

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addComponent(Firma)
                .addGap(0, 445, Short.MAX_VALUE))
            .addGroup(MainLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(EmailText)
                        .addComponent(TelephoneText)
                        .addComponent(ApellidoText)
                        .addComponent(confirmPasswordText)
                        .addComponent(Clave)
                        .addComponent(username)
                        .addComponent(password)
                        .addComponent(Usuario)
                        .addGroup(MainLayout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(Logo))
                        .addComponent(confirmPassword)
                        .addComponent(NombreText)
                        .addComponent(nombre)
                        .addComponent(apellido)
                        .addComponent(telephone)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MainLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(Back)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clave)
                .addGap(5, 5, 5)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordText)
                .addGap(3, 3, 3)
                .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(RegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(Back)
                .addGap(18, 18, 18)
                .addComponent(Firma)
                .addContainerGap())
        );

        Panel.add(Main);
        Main.setBounds(10, 0, 500, 750);

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

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        RegisterBtnActionPerformed(evt);
    }//GEN-LAST:event_usernameActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed

        Usuario user = new Usuario();
        user.setUsername(username.getText());
        user.setNombre(nombre.getText());
        user.setApellido(apellido.getText());
        user.setPhone(telephone.getText());
        user.setEmail(email.getText());

        String password = "";

        for (Character c : this.password.getPassword()) {
            password += c;
        }
        user.setPassword(password);

        String confirmPass = "";

        for (Character c : confirmPassword.getPassword()) {
            confirmPass += c;
        }

        //System.out.println(confirmPass);
        Class<?> clazz = user.getClass();
        Field[] fields = clazz.getDeclaredFields();

        int count = 0;

        for (Field field : fields) {

            field.setAccessible(true);
            String attributeName = field.getName();
            String attributeValue = "";

            if (attributeName.equals("id")) {
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

        boolean[] correctData = new boolean[6];
        int truth = 0;

        if (count > 0) {
            throwError("No pueden haber campos vacíos");
        } else if (count == 0) {

            for (Field field : fields) {

                field.setAccessible(true);
                String attributeName = field.getName();
                String attributeValue = "";

                if (attributeName.equals("id")) {
                    continue;
                }

                try {

                    attributeValue = field.get(user).toString();

                    if (attributeName == "username") {

                        boolean already = DatabaseHandler.usernameValidation(attributeValue);

                        if (already) {
                            throwError("Ese nombre de usuario ya existe");
                        } else {
                            correctData[0] = true;
                        }
                    } else if (attributeName == "nombre") {
                        if (!checkLetters(attributeValue)) {
                            throwError("El nombre solo debe contener letras");
                        } else {
                            correctData[1] = true;
                        }
                    } else if (attributeName == "apellido") {
                        if (!checkLetters(attributeValue)) {
                            throwError("El apellido solo debe contener letras");
                        } else {
                            correctData[2] = true;
                        }
                    } else if (attributeName == "phone") {
                        if (!checkNumbers(attributeValue)) {
                            throwError("El teléfono solo debe contener números");
                        } else {
                            correctData[3] = true;
                        }
                    } else if (attributeName == "email") {
                        if (!attributeValue.contains("@") || !attributeValue.contains(".")) {
                            throwError("El correo electrónico debe ser válido");
                        } else {
                            correctData[4] = true;
                        }
                    }
                    else if (attributeName == "password") {
                        if (!confirmPass.equals(attributeValue)) {
                            throwError("Las contraseñas deben coincidir");
                        } else {
                            correctData[5] = true;
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

            if (truth == 6) {

                boolean registered = DatabaseHandler.create(user);

                /*if (registered) {
                    System.out.println(user.getNombre() + " registrado exitosamente en la base de datos");
                }*/

                this.dispose();

                if (mngt) {
                    HandlerMethods.Management();
                    mngt = false;
                } else {

                    HandlerMethods.Home();
                }

                this.username.setText("");
                this.nombre.setText("");
                this.apellido.setText("");
                this.telephone.setText("");
                this.email.setText("");
                this.password.setText("");
                this.confirmPassword.setText("");
            }
        }


    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();

        if (mngt) {
            HandlerMethods.Management();
            mngt = false;
        } else
            HandlerMethods.Home();
    }//GEN-LAST:event_BackMouseClicked

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        RegisterBtnActionPerformed(evt);
    }//GEN-LAST:event_nombreActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        RegisterBtnActionPerformed(evt);
    }//GEN-LAST:event_apellidoActionPerformed

    private void telephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telephoneActionPerformed
        RegisterBtnActionPerformed(evt);
    }//GEN-LAST:event_telephoneActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        RegisterBtnActionPerformed(evt);
    }//GEN-LAST:event_emailActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        RegisterBtnActionPerformed(evt);
    }//GEN-LAST:event_passwordActionPerformed

    private void confirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordActionPerformed
        RegisterBtnActionPerformed(evt);
    }//GEN-LAST:event_confirmPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
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
    private javax.swing.JLabel Clave;
    private javax.swing.JLabel EmailText;
    private javax.swing.JLabel Firma;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Main;
    private javax.swing.JLabel NombreText;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JLabel TelephoneText;
    private javax.swing.JLabel Usuario;
    private javax.swing.JTextField apellido;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JLabel confirmPasswordText;
    private javax.swing.JTextField email;
    private javax.swing.JTextField nombre;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField telephone;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
