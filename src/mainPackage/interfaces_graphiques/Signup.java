package mainPackage.interfaces_graphiques;

import mainPackage.model.Hotel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static mainPackage.Controllers.Authentification.registerUser;



public class Signup extends JFrame {

    private int posX, posY;
    private JPanel panel = new JPanel();
    private JLabel exit = new JLabel();
    private JLabel title = new JLabel();
    private JLabel line1 = new JLabel();
    private JLabel message = new JLabel();
    private JLabel login = new JLabel();
    private JButton SignUp = new JButton();
    private JLabel person = new JLabel();
    private JLabel telephone = new JLabel();
    private JLabel mail = new JLabel();
    private JLabel lock = new JLabel();
    private JLabel fullname = new JLabel();
    private JTextField Name = new JTextField();
    private JLabel phonelabel = new JLabel();
    private JTextField phone = new JTextField();
    private JLabel emaillabel = new JLabel();
    private JTextField email = new JTextField();
    private JLabel pswlabel = new JLabel();
    private JPasswordField psw = new JPasswordField();
    private JCheckBox view = new JCheckBox();
    private JLabel right = new JLabel();
    private JLabel left = new JLabel();
    private JLabel logo = new JLabel();


    public Signup(Hotel hotel) {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new Dimension(980,550));
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
        panel.setBounds(-50, 0, 1030, 550);
        getContentPane().add(panel);

        exit.setFont(new Font("Segoe Script", 0, 24));
        exit.setForeground(new Color(209, 174, 149));
        exit.setText("X");
        exit.setCursor(new Cursor(HAND_CURSOR));
        exit.setBounds(1000, 0, 30, 50);
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
        panel.add(exit);

        title.setFont(new Font("Constantia", 0, 36));
        title.setForeground(new Color(214, 178, 125));
        title.setText("CREATE YOUR ACCOUNT");
        title.setVerticalAlignment(SwingConstants.BOTTOM);
        title.setBounds(320, 130, 430, 50);
        panel.add(title);

        line1.setForeground(new Color(214, 178, 125));
        line1.setText("_________________________________________________________________");
        line1.setBounds(310, 170, 460, 20);
        panel.add(line1);

        message.setFont(new Font("Segoe UI Historic", 0, 13));
        message.setForeground(new Color(209, 174, 149));
        message.setText("Already have an account ? ");
        message.setBounds(450, 520, 160, 17);
        panel.add(message);

        login.setFont(new Font("Segoe UI", 1, 13));
        login.setForeground(new Color(209, 174, 149));
        login.setText("Login");
        login.setCursor(new Cursor(HAND_CURSOR));
        login.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                loginMouseClicked(evt,hotel);
            }
            public void mouseEntered(MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                loginMouseExited(evt);
            }
            public void mousePressed(MouseEvent evt) {
                loginMousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
                loginMouseReleased(evt);
            }
        });
        login.setBounds(610, 520, 60, 17);
        panel.add(login);

        SignUp.setBackground(new Color(209, 174, 149));
        SignUp.setFont(new Font("Lucida Bright", 0, 24));
        SignUp.setForeground(new Color(64, 34, 25));
        SignUp.setText("SIGN UP");
        SignUp.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SignUp.setFocusable(false);
        SignUp.setBounds(480, 460, 140, 40);
        SignUp.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                SignUpMousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
                SignUpMouseReleased(evt);
            }
        });
        SignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SignUpActionPerformed(evt,hotel);
            }
        });
        panel.add(SignUp);

        person.setFont(new Font("Lucida Calligraphy", 0, 18));
        person.setForeground(new Color(225, 191, 155));
        person.setIcon(new ImageIcon("src/mainPackage/images/personne-30.png"));
        person.setBounds(390, 220, 30, 30);
        panel.add(person);

        telephone.setFont(new Font("Lucida Calligraphy", 0, 18));
        telephone.setForeground(new Color(225, 191, 155));
        telephone.setIcon(new ImageIcon("src/mainPackage/images/phone-30.png"));
        telephone.setBounds(390, 270, 30, 30);
        panel.add(telephone);

        mail.setFont(new Font("Lucida Calligraphy", 0, 18));
        mail.setForeground(new Color(225, 191, 155));
        mail.setIcon(new ImageIcon("src/mainPackage/images/email-30.png"));
        mail.setBounds(390, 320, 30, 30);
        panel.add(mail);

        lock.setFont(new Font("Lucida Calligraphy", 0, 18));
        lock.setForeground(new Color(225, 191, 155));
        lock.setIcon(new ImageIcon("src/mainPackage/images/m-d-p-30.png"));
        lock.setBounds(390, 370, 30, 30);
        panel.add(lock);

        fullname.setFont(new Font("Segoe UI Emoji", 2, 16));
        fullname.setForeground(new Color(209, 174, 149, 60));
        fullname.setText("Full Name");
        fullname.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        fullname.setBounds(440, 220, 80, 30);
        panel.add(fullname);

        Name.setFont(new Font("Nirmala UI", 0, 16));
        Name.setBackground(new Color(255, 255, 255, 0));
        Name.setForeground(new Color(242, 204, 143));
        Name.setBorder(null);
        Name.setCaretColor(new Color(242, 204, 143));
        Name.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        Name.setBounds(440, 220, 250, 30);
        Name.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                NameFocusGained(evt);
            }
            public void focusLost(FocusEvent evt) {
                NameFocusLost(evt);
            }
        });
        panel.add(Name);

        phonelabel.setFont(new Font("Segoe UI Emoji", 2, 16));
        phonelabel.setForeground(new Color(209, 174, 149, 60));
        phonelabel.setText("Phone");
        phonelabel.setVerticalAlignment(SwingConstants.TOP);
        phonelabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        phonelabel.setBounds(440, 280, 50, 20);
        phone.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                phoneFocusGained(evt);
            }
            public void focusLost(FocusEvent evt) {
                phoneFocusLost(evt);
            }
        });
        panel.add(phonelabel);

        phone.setFont(new Font("Nirmala UI", 0, 16));
        phone.setBackground(new Color(255, 255, 255, 0));
        phone.setForeground(new Color(242, 204, 143));
        phone.setBorder(null);
        phone.setCaretColor(new Color(242, 204, 143));
        phone.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        phone.setBounds(440, 272, 250, 30);
        panel.add(phone);

        emaillabel.setFont(new Font("Segoe UI Emoji", 2, 16));
        emaillabel.setForeground(new Color(209, 174, 149, 60));
        emaillabel.setText("Email");
        emaillabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        emaillabel.setBounds(440, 320, 50, 30);
        panel.add(emaillabel);

        email.setFont(new Font("Nirmala UI", 0, 16));
        email.setBackground(new Color(255, 255, 255, 0));
        email.setForeground(new Color(242, 204, 143));
        email.setBorder(null);
        email.setCaretColor(new Color(242, 204, 143));
        email.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        email.setBounds(440, 320, 250, 30);
        email.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        panel.add(email);

        pswlabel.setFont(new Font("Segoe UI Emoji", 2, 16));
        pswlabel.setForeground(new Color(209, 174, 149, 60));
        pswlabel.setText("Password");
        pswlabel.setVerticalAlignment(SwingConstants.TOP);
        pswlabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pswlabel.setBounds(440, 380, 70, 20);
        panel.add(pswlabel);

        psw.setFont(new Font("Nirmala UI", 0, 16));
        psw.setBackground(new Color(255, 255, 255, 0));
        psw.setForeground(new Color(242, 204, 143));
        psw.setBorder(null);
        psw.setCaretColor(new Color(242, 204, 143));
        psw.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        psw.setBounds(440, 372, 250, 30);
        psw.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                pswFocusGained(evt);
            }
            public void focusLost(FocusEvent evt) {
                pswFocusLost(evt);
            }
        });
        panel.add(psw);

        view.setForeground(new Color(209, 174, 149));
        view.setText("View Password ");
        view.setBorder(null);
        view.setCursor(new Cursor(Cursor.HAND_CURSOR));
        view.setFocusable(false);
        view.setBounds(660, 420, 110, 20);
        view.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        panel.add(view);

        right.setIcon(new ImageIcon("src/mainPackage/images/5.png"));
        right.setBounds(50, 0, 240, 550);
        panel.add(right);

        left.setIcon(new ImageIcon("src/mainPackage/images/6.png"));
        left.setBounds(800, 0, 230, 550);
        panel.add(left);

        logo.setIcon(new ImageIcon("src/mainPackage/images/logo.png"));
        logo.setToolTipText("");
        logo.setPreferredSize(new Dimension(316, 90));
        logo.setBounds(380, 20, 316, 90);
        panel.add(logo);


        pack();
        setLocationRelativeTo(null);

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

    private void loginMouseEntered(MouseEvent evt) {
        login.setForeground(new Color(64, 34, 25));
    }
    private void loginMouseExited(MouseEvent evt) {
        login.setForeground(new Color(209, 174, 149));
    }
    private void loginMousePressed(MouseEvent evt) {
        login.setForeground(new Color(64, 34, 25));
    }
    private void loginMouseReleased(MouseEvent evt) {
        login.setForeground(new Color(209, 174, 149));
    }
    private void loginMouseClicked(MouseEvent evt,Hotel hotel) {
        this.setVisible(false);
        Login l = new Login(hotel);
        l.setVisible(true);
    }

    private void viewActionPerformed(ActionEvent evt) {
        if(view.isSelected()){
            psw.setEchoChar((char)0);
        }
        else{
            psw.setEchoChar('*');
        }
    }
    private void NameFocusGained(FocusEvent evt) {
        fullname.setText("");
    }

    private void NameFocusLost(FocusEvent evt) {
        if("".equals(Name.getText()))
            fullname.setText("Full Name");
    }
    private void phoneFocusGained(FocusEvent evt) {
        phonelabel.setText("");
    }

    private void phoneFocusLost(FocusEvent evt) {
        if("".equals(phone.getText()))
            phonelabel.setText("Phone");
    }
    private void emailFocusGained(FocusEvent evt) {
        emaillabel.setText("");
    }
    private void emailFocusLost(FocusEvent evt) {
        if("".equals(email.getText()))
            emaillabel.setText("Email");
    }
    private void pswFocusGained(FocusEvent evt) {
        pswlabel.setText("");
    }

    private void pswFocusLost(FocusEvent evt) {
        if("".equals(String.valueOf(psw.getPassword())))
            pswlabel.setText("Password");
    }

    private void SignUpMousePressed(MouseEvent evt) {
        SignUp.setForeground(new Color(209, 174, 149));
        SignUp.setBackground(new Color(64, 34, 25));
    }

    private void SignUpMouseReleased(MouseEvent evt) {
        SignUp.setBackground(new Color(209, 174, 149));
        SignUp.setForeground(new Color(64, 34, 25));
    }
    private void SignUpActionPerformed(ActionEvent evt,Hotel hotel) {
        registerUser(this,Name.getText(),phone.getText(),email.getText(),String.valueOf(psw.getPassword()),hotel);
    }
}
