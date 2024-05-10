package mainPackage.interfaces_graphiques;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static mainPackage.Controllers.Authentification.AuthentificationPassword;

public class Login_Admin extends JFrame {
    private int posX, posY;
    private JLabel exit = new JLabel();
    private JLabel Return = new JLabel();
    private JLabel psw_label = new JLabel();
    private JPanel panel = new JPanel();
    private JLabel line1 = new JLabel();
    private JLabel line2 = new JLabel();
    private JButton login = new JButton();
    private JPasswordField psw = new JPasswordField();
    private JLabel psw_icon = new JLabel();
    private JLabel title = new JLabel();
    private JLabel logo = new JLabel();
    private JLabel left = new JLabel();


    public Login_Admin() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800,450));
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

        getContentPane().setLayout(new BorderLayout());
        panel.setLayout(null);

        exit.setFont(new Font("Segoe Script", 0, 24));
        exit.setForeground(new Color(209, 174, 149));
        exit.setText("X");
        exit.setCursor(new Cursor(HAND_CURSOR));
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        exit.setBounds(770, 0, 30, 50);
        panel.add(exit);

        Return.setIcon(new ImageIcon("src/mainPackage/images/flèche-32.png"));
        Return.setCursor(new Cursor(HAND_CURSOR));
        Return.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ReturnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                ReturnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                ReturnMouseExited(evt);
            }
            public void mousePressed(MouseEvent evt) {
                ReturnMousePressed(evt);
            }
        });
        Return.setBounds(390, 0, 50, 50);
        panel.add(Return);


        psw_icon.setIcon(new ImageIcon("src/mainPackage/images/m-d-p-25.png"));
        psw_icon.setBounds(720, 260, 25, 25);
        panel.add(psw_icon);

        line1.setForeground(new Color(209, 174, 149,80));
        line1.setHorizontalAlignment(SwingConstants.CENTER);
        line1.setText("_____________________________________________________");
        line1.setBounds(400, 160, 380, 14);
        panel.add(line1);


        psw_label.setFont(new Font("Lucida Calligraphy", 0, 18));
        psw_label.setForeground(new Color(209, 174, 149));
        psw_label.setText("Password");
        psw.setBackground(new Color(255, 255, 255, 0));
        psw_label.setBounds(550, 230, 95, 20);
        panel.add(psw_label);

        line2.setForeground(new Color(214, 178, 125));
        line2.setText("__________________________");
        line2.setBounds(505, 280, 260, 24);
        panel.add(line2);


        psw.setFont(new Font("Segoe UI Semilight", 0, 18));
        psw.setForeground(new Color(209, 174, 149));
        psw.setBorder(null);
        psw.setCaretColor(new Color(209, 174, 149));
        psw.setHorizontalAlignment(JTextField.CENTER);
        psw.setBounds(480, 273, 230, 20);
        panel.add(psw);

        login.setBackground(new Color(209, 174, 149));
        login.setFont(new Font("Lucida Bright", 0, 24));
        login.setForeground(new Color(64, 34, 25));
        login.setText("LOGIN");
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.setFocusable(false);
        login.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                loginMousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
                loginMouseReleased(evt);
            }
        });
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        login.setBounds(530, 360, 140, 40);
        panel.add(login);

        title.setFont(new Font("Constantia", 0, 40));
        title.setForeground(new Color(214, 178, 125));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setText("LOGIN");
        title.setBounds(510, 130, 180, 50);
        panel.add(title);

        left.setIcon(new ImageIcon("src/mainPackage/images/8.png"));
        left.setBounds(0, 0, 380, 450);
        panel.add(left);

        logo.setIcon(new ImageIcon("src/mainPackage/images/logo.png"));
        logo.setPreferredSize(new Dimension(360, 90));
        logo.setBounds(430, 10, 320, 90);
        panel.add(logo);


        panel.setBackground(new Color(58, 25, 17));
        getContentPane().add(panel);

        pack();
        setLocationRelativeTo(null);

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    private void formMousePressed(MouseEvent evt) {
        posX = evt.getX();
        posY = evt.getY();
    }
    private void formMouseDragged(MouseEvent evt) {
        int newX = getLocation().x + evt.getX() - posX;
        int newY = getLocation().y + evt.getY() - posY;
        // Set the new position of the frame
        setLocation(newX, newY);
    }

    private void exitMouseClicked(MouseEvent evt) {
        System.exit(0);
    }
    private void exitMouseEntered(MouseEvent evt) {
        exit.setForeground(new Color(64, 34, 25));
    }
    private void exitMouseExited(MouseEvent evt) {
        exit.setForeground(new Color(209, 174, 149));
    }
    private void exitMousePressed(MouseEvent evt) {
        exit.setForeground(new Color(64, 34, 25));
    }
    private void ReturnMouseClicked(MouseEvent evt) {
        dispose();
        Choice c = new Choice ();
        c.setVisible(true);
    }
    private void ReturnMouseEntered(MouseEvent evt) {
        Return.setIcon(new ImageIcon("src/mainPackage/images/flèche-32-1.png"));
    }
    private void ReturnMouseExited(MouseEvent evt) {
        Return.setIcon(new ImageIcon("src/mainPackage/images/flèche-32.png"));
    }
    private void ReturnMousePressed(MouseEvent evt) {
        Return.setIcon(new ImageIcon("src/mainPackage/images/flèche-32-1.png"));
    }
    private void loginActionPerformed(ActionEvent evt) {
        login();
    }
    private void loginMousePressed(MouseEvent evt) {
        login.setForeground(new Color(209, 174, 149));
        login.setBackground(new Color(64, 34, 25));
    }
    private void loginMouseReleased(MouseEvent evt) {
        login.setBackground(new Color(209, 174, 149));
        login.setForeground(new Color(64, 34, 25));
    }

    private void login() {
        String password = String.valueOf(psw.getPassword());

        if (password.isEmpty()){
            Warning d = new Warning(this , true,"Please enter password");
            d.setVisible(true);
        }else{
            AuthentificationPassword(this,password);
        }
    }
}
