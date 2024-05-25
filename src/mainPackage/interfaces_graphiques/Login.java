package mainPackage.interfaces_graphiques;


import java.awt.*;
import javax.swing.*;
import mainPackage.model.User;
import mainPackage.model.Hotel;
import java.util.HashMap;

import java.awt.event.*;
import static mainPackage.Controllers.Authentification.AuthentificationClient;

public class Login extends JFrame {

    private int posX, posY;
    private JTextField email = new JTextField();
    private JLabel email_icon = new JLabel();
    private JLabel exit = new JLabel();
    private JLabel Return = new JLabel();
    private JLabel email_label = new JLabel();
    private JLabel psw_label = new JLabel();
    private JPanel panel = new JPanel();
    private JLabel line1 = new JLabel();
    private JLabel line2 = new JLabel();
    private JLabel line3 = new JLabel();
    private JButton login = new JButton();
    private JLabel message = new JLabel();
    private JPasswordField psw = new JPasswordField();
    private JLabel psw_icon = new JLabel();
    private JLabel signup = new JLabel();
    private JLabel title = new JLabel();
    private JLabel logo = new JLabel();
    private JLabel left = new JLabel();


    public Login() {
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

        email_icon.setIcon(new ImageIcon("src/mainPackage/images/email-25.png"));
        email_icon.setBounds(750, 210, 25, 25);
        panel.add(email_icon);

        psw_icon.setIcon(new ImageIcon("src/mainPackage/images/m-d-p-25.png"));
        psw_icon.setBounds(750, 280, 25, 25);
        panel.add(psw_icon);

        line1.setForeground(new Color(209, 174, 149));
        line1.setHorizontalAlignment(SwingConstants.CENTER);
        line1.setText("_____________________________________________________");
        line1.setBounds(400, 150, 380, 14);
        panel.add(line1);

        email_label.setFont(new Font("Lucida Calligraphy", 0, 16));
        email_label.setForeground(new Color(209, 174, 149));
        email_label.setHorizontalAlignment(SwingConstants.CENTER);
        email_label.setText("E-mail : ");
        email_label.setBounds(429, 190, 80, 30);
        email.setBackground(new Color(255, 255, 255, 0));
        panel.add(email_label);


        psw_label.setFont(new Font("Lucida Calligraphy", 0, 16));
        psw_label.setForeground(new Color(209, 174, 149));
        psw_label.setText("Password : ");
        psw_label.setBounds(410, 270, 95, 20);
        psw.setBackground(new Color(255, 255, 255, 0));
        panel.add(psw_label);

        line2.setForeground(new Color(214, 178, 125));
        line2.setText("________________________________");
        line2.setBounds(510, 230, 260, 24);
        panel.add(line2);

        line3.setForeground(new Color(214, 178, 125));
        line3.setText("________________________________");
        line3.setBounds(510, 303, 260, 24);
        panel.add(line3);

        message.setFont(new Font("Segoe UI Historic", 0, 13));
        message.setForeground(new Color(209, 174, 149));
        message.setText("Don't have an account ?");
        message.setBounds(490, 400, 150, 20);
        panel.add(message);

        signup.setFont(new Font("Segoe UI", 1, 13));
        signup.setForeground(new Color(209, 174, 149));
        signup.setText("Sign Up");
        signup.setCursor(new Cursor(HAND_CURSOR));
        signup.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                signupMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                signupMouseExited(evt);
            }
            public void mousePressed(MouseEvent evt) {
                signupMousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
                signupMouseReleased(evt);
            }
        });
        signup.setBounds(640, 400, 60, 20);
        panel.add(signup);

        email.setFont(new Font("Segoe UI Semilight", 0, 15));
        email.setForeground(new Color(209, 174, 149));
        email.setBorder(null);
        email.setCaretColor(new Color(209, 174, 149));
        email.setBounds(510, 210, 230, 30);
        panel.add(email);

        psw.setFont(new Font("Segoe UI Semilight", 0, 16));
        psw.setForeground(new Color(209, 174, 149));
        psw.setBorder(null);
        psw.setCaretColor(new Color(209, 174, 149));
        psw.setBounds(510, 290, 230, 20);
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
        login.setBounds(530, 340, 140, 40);
        panel.add(login);

        title.setFont(new Font("Constantia", 0, 40));
        title.setForeground(new Color(214, 178, 125));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setText("LOGIN");
        title.setBounds(510, 120, 180, 50);
        panel.add(title);

        left.setIcon(new ImageIcon("src/mainPackage/images/4.png"));
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

    private void signupMouseClicked(MouseEvent evt) {
        this.setVisible(false);
        Signup s = new Signup();
        s.setVisible(true);
    }
    private void signupMousePressed(MouseEvent evt) {
        signup.setForeground(new Color(64, 34, 25));
    }
    private void signupMouseReleased(MouseEvent evt) {
        signup.setForeground(new Color(209, 174, 149));
    }

    private void signupMouseEntered(MouseEvent evt) {
        signup.setForeground(new Color(64, 34, 25));
    }
    private void signupMouseExited(MouseEvent evt) {
        signup.setForeground(new Color(209, 174, 149));
    }
    private void loginActionPerformed(ActionEvent evt) {
        /*Hotel hotel = new Hotel();
        HashMap <String, User> users = new HashMap<>();
        users = hotel.users;*/
        AuthentificationClient(new Hotel().users,this,email.getText(),String.valueOf(psw.getPassword()));
    }
    private void loginMousePressed(MouseEvent evt) {
        login.setForeground(new Color(209, 174, 149));
        login.setBackground(new Color(64, 34, 25));
    }
    private void loginMouseReleased(MouseEvent evt) {
        login.setBackground(new Color(209, 174, 149));
        login.setForeground(new Color(64, 34, 25));
    }
}
