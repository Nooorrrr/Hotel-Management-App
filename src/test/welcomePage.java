package test;

/**
 *
 * @author HP
 */
public class welcomePage extends javax.swing.JFrame {

    /**
     * Creates new form welcomePage
     */
    private int posX, posY;

    public welcomePage() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(welcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        EmailTxtField.setBackground(new java.awt.Color(255, 255, 255, 0));
        PswField.setBackground(new java.awt.Color(255, 255, 255, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        Left = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        right = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        pswLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EmailTxtField = new javax.swing.JTextField();
        pswIcon = new javax.swing.JLabel();
        emailIcon = new javax.swing.JLabel();
        SignUpLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        PswField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(834, 400));
        setUndecorated(true);

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setPreferredSize(new java.awt.Dimension(400, 400));

        image.setIcon(new javax.swing.ImageIcon("src\\images\\IMG_19531.jpg")); // NOI18N

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(image)
                                .addContainerGap(12, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(image)
                                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        right.setBackground(new java.awt.Color(51, 89, 38));
        right.setPreferredSize(new java.awt.Dimension(434, 400));
        right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(217, 153, 88));
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        right.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 6, -1, -1));

        loginLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(217, 153, 88));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Login");
        loginLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        right.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 423, -1));


        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(217, 153, 88));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome To Our Hotel");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        right.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 411, -1));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(217, 153, 88));
        emailLabel.setText("Email");
        emailLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        right.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 163, -1));

        pswLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pswLabel.setForeground(new java.awt.Color(217, 153, 88));
        pswLabel.setText("Password");
        pswLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        right.add(pswLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 394, -1));

        jLabel5.setForeground(new java.awt.Color(244, 226, 133));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("_________________________________________");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        right.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 300, 20));

        jLabel6.setForeground(new java.awt.Color(244, 226, 133));
        jLabel6.setText("_________________________________________");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        right.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 300, -1));

        EmailTxtField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        EmailTxtField.setForeground(new java.awt.Color(244, 226, 133));
        EmailTxtField.setBorder(null);
        EmailTxtField.setCaretColor(new java.awt.Color(244, 226, 133));
        EmailTxtField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        right.add(EmailTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 290, 30));

        pswIcon.setForeground(new java.awt.Color(255, 255, 255));
        pswIcon.setIcon(new javax.swing.ImageIcon("src\\images\\4830995_padlock_password_secure_security_signin_icon.png")); // NOI18N
        right.add(pswIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 50, 50));

        emailIcon.setIcon(new javax.swing.ImageIcon("src\\images\\211604_email_icon.png")); // NOI18N
        right.add(emailIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 40, 50));

        SignUpLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SignUpLabel.setForeground(new java.awt.Color(217, 153, 88));
        SignUpLabel.setText("Sign Up");
        SignUpLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUpLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUpLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SignUpLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SignUpLabelMouseReleased(evt);
            }
        });
        right.add(SignUpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        loginButton.setBackground(new java.awt.Color(244, 226, 133));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(51, 66, 38));
        loginButton.setText("LOGIN");
        loginButton.setBorder(null);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setFocusPainted(false);
        loginButton.setFocusable(false);
        loginButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginButtonMouseReleased(evt);
            }
        });
        right.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 140, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(217, 153, 88));
        jLabel10.setText("Don't have an account ?");
        right.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        PswField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        PswField.setForeground(new java.awt.Color(244, 226, 133));
        PswField.setBorder(null);
        PswField.setCaretColor(new java.awt.Color(244, 226, 133));
        PswField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        right.add(PswField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 290, 30));

        getContentPane().add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void exitMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        exit.setForeground(new java.awt.Color(51, 89, 38));
    }

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        System.exit(0);
    }

    private void loginButtonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        loginButton.setBackground(new java.awt.Color(51,89,38));
        loginButton.setForeground(new java.awt.Color(244, 226, 133));
    }

    private void loginButtonMouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        loginButton.setBackground(new java.awt.Color(244, 226, 133));
        loginButton.setForeground(new java.awt.Color(51,89,38));

    }

    private void SignUpLabelMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        SignUpLabel.setForeground(new java.awt.Color(244, 226, 133));
    }

    private void SignUpLabelMouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        SignUpLabel.setForeground(new java.awt.Color(217, 153, 88));
    }

    private void formMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        posX = evt.getX();
        posY = evt.getY();
    }

    private void formMouseDragged(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int newX = getLocation().x + evt.getX() - posX;
        int newY = getLocation().y + evt.getY() - posY;

        // Set the new position of the frame
        setLocation(newX, newY);
    }

    private void SignUpLabelMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        this.setVisible(false);
        SignUpPage s = new SignUpPage();
        s.setVisible(true);
    }

    private void SignUpLabelMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        SignUpLabel.setForeground(new java.awt.Color(244, 226, 133));
    }

    private void SignUpLabelMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        SignUpLabel.setForeground(new java.awt.Color(217, 153, 88));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(welcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcomePage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify
    private javax.swing.JTextField EmailTxtField;
    private javax.swing.JPanel Left;
    private javax.swing.JPasswordField PswField;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JLabel emailIcon;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel pswIcon;
    private javax.swing.JLabel pswLabel;
    private javax.swing.JPanel right;
    // End of variables declaration
}


