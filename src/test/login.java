package test;

import org.netbeans.lib.awtextra.AbsoluteLayout;

import javax.swing.*;
import java.awt.*;

public class login extends javax.swing.JFrame {

    private int posX,posY;
    private JTextField email;
    private JLabel exit;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JLabel line1;
    private JLabel line2;
    private JLabel line3;
    private JButton login;
    private JLabel message;
    private JPasswordField psw;
    private JLabel signup;
    private JLabel title;

    public login() {
        initComponents();
        email.setBackground(new Color(255, 255, 255, 0));
        psw.setBackground(new Color(255, 255, 255, 0));
    }


    private void initComponents() {

        jPanel1 = new JPanel();
        exit = new JLabel();
        jLabel10 = new JLabel();
        jLabel2 = new JLabel();
        title = new JLabel();
        line1 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        line2 = new JLabel();
        line3 = new JLabel();
        message = new JLabel();
        signup = new JLabel();
        email = new JTextField();
        psw = new JPasswordField();
        login = new JButton();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new Font("Segoe Script", 0, 24)); // NOI18N
        exit.setForeground(new Color(209, 174, 149));
        exit.setText("X");
        exit.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon("src/images/email_25.png")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("src/images/m_d_p_25.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));

        title.setFont(new Font("Constantia", 0, 40)); // NOI18N
        title.setForeground(new Color(214, 178, 125));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setText("LOGIN");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 180, -1));

        line1.setForeground(new Color(209, 174, 149));
        line1.setHorizontalAlignment(SwingConstants.CENTER);
        line1.setText("_____________________________________________________");
        jPanel1.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 380, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(209, 174, 149));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("E-mail : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 190, 80, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        jLabel5.setForeground(new Color(209, 174, 149));
        jLabel5.setText("Password : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, 20));

        line2.setForeground(new Color(214, 178, 125));
        line2.setText("_______________________________");
        jPanel1.add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 260, -1));

        line3.setForeground(new Color(214, 178, 125));
        line3.setText("_______________________________");
        jPanel1.add(line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 260, -1));

        message.setFont(new Font("Segoe UI Historic", 0, 13)); // NOI18N
        message.setForeground(new Color(209, 174, 149));
        message.setText("Don't have an account ?");
        jPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        signup.setFont(new Font("Segoe UI", 1, 13)); // NOI18N
        signup.setForeground(new Color(209, 174, 149));
        signup.setText("Sign Up");
        signup.setVerticalAlignment(SwingConstants.TOP);
        signup.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signupMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signupMouseReleased(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 60, 20));

        email.setFont(new Font("Segoe UI Semilight", 0, 15)); // NOI18N
        email.setForeground(new Color(209, 174, 149));
        email.setBorder(null);
        email.setCaretColor(new Color(209, 174, 149));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 230, 30));

        psw.setFont(new Font("Segoe UI Semilight", 0, 16)); // NOI18N
        psw.setForeground(new Color(209, 174, 149));
        psw.setBorder(null);
        psw.setCaretColor(new Color(209, 174, 149));
        jPanel1.add(psw, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 230, 20));

        login.setBackground(new Color(209, 174, 149));
        login.setFont(new Font("Lucida Bright", 0, 24)); // NOI18N
        login.setForeground(new Color(64, 34, 25));
        login.setText("LOGIN");
        login.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setFocusable(false);
        login.setVerticalAlignment(SwingConstants.BOTTOM);
        login.setVerticalTextPosition(SwingConstants.BOTTOM);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginMouseReleased(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 140, 40));

        jLabel1.setIcon(new ImageIcon("src/images/2.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void exitMousePressed(java.awt.event.MouseEvent evt) {
        exit.setForeground(new Color(64, 34, 25));
    }

    private void signupMousePressed(java.awt.event.MouseEvent evt) {
        signup.setForeground(new Color(64, 34, 25));
    }

    private void loginMousePressed(java.awt.event.MouseEvent evt) {
        login.setForeground(new Color(209, 174, 149));
        login.setBackground(new Color(64, 34, 25));
    }

    private void loginMouseReleased(java.awt.event.MouseEvent evt) {
        login.setBackground(new Color(209, 174, 149));
        login.setForeground(new Color(64, 34, 25));
    }

    private void signupMouseReleased(java.awt.event.MouseEvent evt) {
        signup.setForeground(new Color(209, 174, 149));
    }

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

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {
        signup.setForeground(new Color(64, 34, 25));
    }

    private void signupMouseExited(java.awt.event.MouseEvent evt) {
        signup.setForeground(new Color(209, 174, 149));
    }

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {
        exit.setForeground(new java.awt.Color(64, 34, 25));
    }

    private void exitMouseExited(java.awt.event.MouseEvent evt) {
        exit.setForeground(new Color(209, 174, 149));
    }

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        signup s = new signup();
        s.setVisible(true);
    }


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

}

