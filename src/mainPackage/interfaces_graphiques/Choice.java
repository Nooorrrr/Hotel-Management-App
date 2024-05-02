package mainPackage.interfaces_graphiques;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Choice extends JFrame {

    private int posX, posY;
    private JPanel panel = new JPanel();
    private JButton guestButton = new JButton();
    private JButton adminButton = new JButton();
    private JLabel label1 = new JLabel();
    private JLabel logo = new JLabel();
    private JLabel label2 = new JLabel();
    private JLabel right = new JLabel();
    public Choice()  {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800,450));
        setLocationByPlatform(true);
        setUndecorated(true);
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        panel.setBackground(new Color(58, 25, 17));
        panel.setLayout(null);

        label1.setFont(new Font("Constantia", 0, 40));
        label1.setForeground(new Color(214, 178, 125));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setText("STEP INTO ");
        panel.add(label1);
        label1.setBounds(90, 40, 240, 51);

        logo.setHorizontalAlignment(SwingConstants.CENTER);
        logo.setIcon(new ImageIcon("src/mainPackage/images/logo.png"));
        panel.add(logo);
        logo.setBounds(20, 80, 380, 130);

        label2.setFont(new Font("Constantia", 0, 40));
        label2.setForeground(new Color(214, 178, 125));
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setText("AS :");
        panel.add(label2);
        label2.setBounds(100, 220, 240, 51);

        guestButton.setBackground(new Color(209, 174, 149));
        guestButton.setFont(new Font("Lucida Bright", 0, 24));
        guestButton.setForeground(new Color(64, 34, 25));
        guestButton.setText("GUEST");
        guestButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        guestButton.setFocusable(false);
        guestButton.setVerticalAlignment(SwingConstants.BOTTOM);
        guestButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        guestButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                guestMousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
                guestMouseReleased(evt);
            }
        });
        guestButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guestActionPerformed(evt);
            }
        });
        panel.add(guestButton);
        guestButton.setBounds(90, 290, 240, 40);

        adminButton.setBackground(new Color(209, 174, 149));
        adminButton.setFont(new Font("Lucida Bright", 0, 24));
        adminButton.setForeground(new Color(64, 34, 25));
        adminButton.setText("ADMINISTRATOR");
        adminButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        adminButton.setFocusable(false);
        adminButton.setVerticalAlignment(SwingConstants.BOTTOM);
        adminButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        adminButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                adminMousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
                adminMouseReleased(evt);
            }
        });
        adminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        panel.add(adminButton);
        adminButton.setBounds(90, 350, 240, 40);


        right.setIcon(new ImageIcon("src/mainPackage/images/7.png"));
        right.setBounds(420, 0, 380, 450);
        panel.add(right);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 800, 450);

        pack();
        setLocationRelativeTo(null);

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private void formMousePressed(MouseEvent evt) {
        posX = evt.getX();
        posY = evt.getY();
    }

    private void formMouseDragged(MouseEvent evt) {
        int newX = getLocation().x + evt.getX() - posX;
        int newY = getLocation().y + evt.getY() - posY;
        setLocation(newX, newY);
    }

    private void adminMousePressed(MouseEvent evt) {
        adminButton.setForeground(new Color(209, 174, 149));
        adminButton.setBackground(new Color(64, 34, 25));
    }

    private void adminMouseReleased(MouseEvent evt) {
        adminButton.setBackground(new Color(209, 174, 149));
        adminButton.setForeground(new Color(64, 34, 25));
    }

    private void adminActionPerformed(ActionEvent evt) {
        dispose(); // Fermer la fenêtre
        Login_Admin l = new Login_Admin(); // ouvrir la fenètre de login_admin
        l.setVisible(true);
    }

    private void guestMousePressed(java.awt.event.MouseEvent evt) {
        guestButton.setForeground(new Color(209, 174, 149));
        guestButton.setBackground(new Color(64, 34, 25));
    }

    private void guestMouseReleased(java.awt.event.MouseEvent evt) {
        guestButton.setBackground(new Color(209, 174, 149));
        guestButton.setForeground(new Color(64, 34, 25));
    }

    private void guestActionPerformed(java.awt.event.ActionEvent evt) {
        dispose(); // Fermer la fenêtre
        Login l = new Login(); // ouvrir la fenètre de login
        l.setVisible(true);
    }
}
