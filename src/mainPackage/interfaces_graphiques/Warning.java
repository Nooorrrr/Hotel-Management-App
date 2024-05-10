package mainPackage.interfaces_graphiques;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Warning extends JDialog {

    private int posX, posY;
    private JButton ok = new JButton();
    private JLabel exit = new JLabel();
    private JLabel tryagain = new JLabel();
    private JLabel message = new JLabel();
    private JLabel icon = new JLabel();
    private JPanel panel = new JPanel();

    public Warning(Frame parent, boolean modal, String mess) {
        super(parent, modal);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
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

        panel.setBackground(new Color(87, 47, 37));
        panel.setLayout(null);
        panel.setBounds(-50, 0, 300, 200);
        getContentPane().add(panel);

        exit.setBackground(new Color(214, 178, 125));
        exit.setFont(new Font("Segoe Print", 0, 24));
        exit.setForeground(new Color(214, 178, 125));
        exit.setText("X");
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exit.setBounds(280, 0, 30, 30);
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
        });
        panel.add(exit);

        tryagain.setFont(new Font("Times New Roman", 0, 24));
        tryagain.setForeground(new Color(214, 178, 125));
        tryagain.setText("TRY AGAIN");
        tryagain.setBounds(70, 30, 140, 20);
        panel.add(tryagain);

        ok.setBackground(new Color(244, 226, 133));
        ok.setForeground(new Color(58, 25, 17));
        ok.setText("OK");
        ok.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ok.setFocusable(false);
        ok.setBounds(150, 130, 60, 30);
        ok.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                okMouseClicked(evt);
            }
            public void mousePressed(MouseEvent evt) {
                okMousePressed(evt);
            }
        });
        panel.add(ok);

        message.setFont(new Font("SimSun", 0, 14));
        message.setForeground(new Color(184, 153, 132));
        message.setText(mess);
        message.setBounds(90, 90, 200, 20);
        panel.add(message);

        icon.setIcon(new ImageIcon("src/mainPackage/images/erreur-60.png"));
        icon.setBounds(20, 60, 60, 60);
        panel.add(icon);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 300, 200);

        pack();
        setLocationRelativeTo(null);
    }

    private void exitMouseClicked(MouseEvent evt) {
        dispose();
    }

    private void okMouseClicked(MouseEvent evt) {
        dispose();
    }

    private void okMousePressed(MouseEvent evt) {
        ok.setBackground(new Color(217, 153, 88));
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

    private void exitMouseEntered(MouseEvent evt) {
        exit.setForeground(new Color(87, 47, 37));
    }

    private void exitMouseExited(MouseEvent evt) {
        exit.setForeground(new Color(214, 178, 125));
    }


}
