package test;

import java.awt.*;

public class signup extends javax.swing.JFrame {

    private int posX,posY;

    public signup() {
        initComponents();

        Name.setBackground(new Color(255, 255, 255, 0));
        phone.setBackground(new Color(255, 255, 255, 0));
        email.setBackground(new Color(255, 255, 255, 0));
        psw.setBackground(new Color(255, 255, 255, 0));

        fullname.setForeground(new java.awt.Color(209, 174, 149,60));
        phonelabel.setForeground(new java.awt.Color(209, 174, 149,60));
        emaillabel.setForeground(new java.awt.Color(209, 174, 149,60));
        pswlabel.setForeground(new java.awt.Color(209, 174, 149,60));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        SignUp = new javax.swing.JButton();
        icon1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        icon4 = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        phonelabel = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        emaillabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        pswlabel = new javax.swing.JLabel();
        psw = new javax.swing.JPasswordField();
        view = new javax.swing.JCheckBox();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jPanel1.setPreferredSize(new java.awt.Dimension(980, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(209, 174, 149));
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 30, 50));

        title.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(214, 178, 125));
        title.setText("CREATE YOUR ACCOUNT");
        title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 430, 50));

        line1.setForeground(new java.awt.Color(214, 178, 125));
        line1.setText("_________________________________________________________________");
        jPanel1.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 460, -1));

        message.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N
        message.setForeground(new java.awt.Color(209, 174, 149));
        message.setText("Already have an account ? ");
        jPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, -1));

        login.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        login.setForeground(new java.awt.Color(209, 174, 149));
        login.setText("Login");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginMouseReleased(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, -1, -1));

        SignUp.setBackground(new java.awt.Color(209, 174, 149));
        SignUp.setFont(new java.awt.Font("Lucida Bright", 0, 24)); // NOI18N
        SignUp.setForeground(new java.awt.Color(64, 34, 25));
        SignUp.setText("SIGN UP");
        SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUp.setFocusable(false);
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SignUpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SignUpMouseReleased(evt);
            }
        });
        jPanel1.add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 140, 40));

        icon1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        icon1.setForeground(new java.awt.Color(225, 191, 155));
        icon1.setIcon(new javax.swing.ImageIcon("src/images/personne-30.png")); // NOI18N
        jPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        icon2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        icon2.setForeground(new java.awt.Color(225, 191, 155));
        icon2.setIcon(new javax.swing.ImageIcon("src/images/phone-30.png")); // NOI18N
        jPanel1.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        icon3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        icon3.setForeground(new java.awt.Color(225, 191, 155));
        icon3.setIcon(new javax.swing.ImageIcon("src/images/m-d-p-30.png")); // NOI18N
        jPanel1.add(icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        icon4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        icon4.setForeground(new java.awt.Color(225, 191, 155));
        icon4.setIcon(new javax.swing.ImageIcon("src/images/email-30.png")); // NOI18N
        jPanel1.add(icon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        fullname.setFont(new java.awt.Font("Segoe UI Emoji", 2, 16)); // NOI18N
        fullname.setForeground(new java.awt.Color(244, 226, 133));
        fullname.setText("Full Name");
        fullname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 80, 30));

        Name.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        Name.setForeground(new java.awt.Color(242, 204, 143));
        Name.setBorder(null);
        Name.setCaretColor(new java.awt.Color(242, 204, 143));
        Name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Name.setFocusable(false);
        Name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameFocusLost(evt);
            }
        });
        Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameMouseClicked(evt);
            }
        });
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 250, 30));

        phonelabel.setFont(new java.awt.Font("Segoe UI Emoji", 2, 16)); // NOI18N
        phonelabel.setForeground(new java.awt.Color(244, 226, 133));
        phonelabel.setText("Phone");
        phonelabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        phonelabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(phonelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 50, 20));

        phone.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        phone.setForeground(new java.awt.Color(242, 204, 143));
        phone.setBorder(null);
        phone.setCaretColor(new java.awt.Color(242, 204, 143));
        phone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        phone.setFocusable(false);
        phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneFocusLost(evt);
            }
        });
        phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneMouseClicked(evt);
            }
        });
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 272, 250, 30));

        emaillabel.setFont(new java.awt.Font("Segoe UI Emoji", 2, 16)); // NOI18N
        emaillabel.setForeground(new java.awt.Color(244, 226, 133));
        emaillabel.setText("Email");
        emaillabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(emaillabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 50, 30));

        email.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        email.setForeground(new java.awt.Color(242, 204, 143));
        email.setBorder(null);
        email.setCaretColor(new java.awt.Color(242, 204, 143));
        email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        email.setFocusable(false);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 250, 30));

        pswlabel.setFont(new java.awt.Font("Segoe UI Emoji", 2, 16)); // NOI18N
        pswlabel.setForeground(new java.awt.Color(244, 226, 133));
        pswlabel.setText("Password");
        pswlabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pswlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(pswlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 70, 20));

        psw.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        psw.setForeground(new java.awt.Color(242, 204, 143));
        psw.setBorder(null);
        psw.setCaretColor(new java.awt.Color(242, 204, 143));
        psw.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        psw.setFocusable(false);
        psw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pswFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pswFocusLost(evt);
            }
        });
        psw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pswMouseClicked(evt);
            }
        });
        jPanel1.add(psw, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 372, 250, 30));

        view.setForeground(new java.awt.Color(209, 174, 149));
        view.setText("View Password ");
        view.setBorder(null);
        view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view.setFocusable(false);
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\java\\MyHotel\\src\\3.png")); // NOI18N
        background.setText("background");
        background.setPreferredSize(new java.awt.Dimension(980, 550));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 1048, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1030, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void formMousePressed(java.awt.event.MouseEvent evt) {
        posX = evt.getX();
        posY = evt.getY();
    }

    private void formMouseDragged(java.awt.event.MouseEvent evt) {
        int newX = getLocation().x + evt.getX() - posX;
        int newY = getLocation().y + evt.getY() - posY;
        // Set the new position of the frame
        setLocation(newX, newY);
    }

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {
        exit.setForeground(new Color(64, 34, 25));
    }

    private void exitMouseExited(java.awt.event.MouseEvent evt) {
        exit.setForeground(new Color(209, 174, 149));
    }

    private void exitMousePressed(java.awt.event.MouseEvent evt) {
        exit.setForeground(new Color(64, 34, 25));
    }

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {
        login.setForeground(new Color(64, 34, 25));
    }

    private void loginMouseExited(java.awt.event.MouseEvent evt) {
        login.setForeground(new Color(209, 174, 149));
    }

    private void loginMousePressed(java.awt.event.MouseEvent evt) {
        login.setForeground(new Color(64, 34, 25));
    }

    private void loginMouseReleased(java.awt.event.MouseEvent evt) {
        login.setForeground(new Color(209, 174, 149));
    }

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        login l = new login();
        l.setVisible(true);
    }

    private void SignUpMousePressed(java.awt.event.MouseEvent evt) {
        SignUp.setForeground(new Color(209, 174, 149));
        SignUp.setBackground(new Color(64, 34, 25));
    }

    private void SignUpMouseReleased(java.awt.event.MouseEvent evt) {
        SignUp.setBackground(new Color(209, 174, 149));
        SignUp.setForeground(new Color(64, 34, 25));
    }

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {
        if(view.isSelected()){
            psw.setEchoChar((char)0);
        }
        else{
            psw.setEchoChar('*');
        }
    }




    private void emailFocusGained(java.awt.event.FocusEvent evt) {
        emaillabel.setText("");
    }

    private void emailFocusLost(java.awt.event.FocusEvent evt) {
        if("".equals(email.getText()))
            emaillabel.setText("Email");
    }

    private void phoneFocusGained(java.awt.event.FocusEvent evt) {
        phonelabel.setText("");
    }

    private void phoneFocusLost(java.awt.event.FocusEvent evt) {
        if("".equals(phone.getText()))
            phonelabel.setText("Phone");
    }

    private void NameFocusGained(java.awt.event.FocusEvent evt) {
        fullname.setText("");
    }

    private void NameFocusLost(java.awt.event.FocusEvent evt) {
        if("".equals(Name.getText()))
            fullname.setText("Full Name");
    }

    private void pswFocusGained(java.awt.event.FocusEvent evt) {
        pswlabel.setText("");
    }

    private void pswFocusLost(java.awt.event.FocusEvent evt) {
        if("".equals(String.valueOf(psw.getPassword())))
            pswlabel.setText("Password");
    }




    private void NameMouseClicked(java.awt.event.MouseEvent evt) {
        Name.setFocusable(true);
        Name.requestFocus();
    }

    private void phoneMouseClicked(java.awt.event.MouseEvent evt) {
        phone.setFocusable(true);
        phone.requestFocus();
    }

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {
        email.setFocusable(true);
        email.requestFocus();
    }

    private void pswMouseClicked(java.awt.event.MouseEvent evt) {
        psw.setFocusable(true);
        psw.requestFocus();
    }






    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField Name;
    private javax.swing.JButton SignUp;
    private javax.swing.JLabel background;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel login;
    private javax.swing.JLabel message;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phonelabel;
    private javax.swing.JPasswordField psw;
    private javax.swing.JLabel pswlabel;
    private javax.swing.JLabel title;
    private javax.swing.JCheckBox view;
    // End of variables declaration
}
