package mainPackage.interfaces_graphiques;

import mainPackage.model.Hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RequestHandle extends JDialog{

    private int posX, posY;
    private JButton Accept = new JButton();
    private JButton Refuse = new JButton();
    private JLabel exit = new JLabel();
    private JLabel Decision = new JLabel();
    private JLabel message = new JLabel();
    private JPanel panel = new JPanel();

    public RequestHandle(/*Frame parent, boolean modal*/) {
        //super(parent, modal);

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

        Decision.setFont(new Font("Times New Roman", 0, 26));
        Decision.setForeground(new Color(214, 178, 125));
        Decision.setText("Decision");
        Decision.setBounds(80, 30, 140, 20);
        panel.add(Decision);

        Accept.setBackground(new Color(244, 226, 133));
        Accept.setForeground(new Color(58, 25, 17));
        Accept.setText("Accept");
        Accept.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Accept.setFocusable(false);
        Accept.setBounds(150, 130, 90, 30);
        Accept.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                AcceptMouseClicked(evt);
            }
            public void mousePressed(MouseEvent evt) {
                AcceptMousePressed(evt);
            }
        });
        panel.add(Accept);

        Refuse.setBackground(new Color(244, 226, 133));
        Refuse.setForeground(new Color(58, 25, 17));
        Refuse.setText("Refuse");
        Refuse.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Refuse.setFocusable(false);
        Refuse.setBounds(30, 130, 90, 30);
        Refuse.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                RefuseMouseClicked(evt);
            }
            public void mousePressed(MouseEvent evt) {
                RefuseMousePressed(evt);
            }
        });
        panel.add(Refuse);


        getContentPane().add(panel);
        panel.setBounds(0, 0, 300, 200);

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
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void exitMouseClicked(MouseEvent evt) {
        dispose();
    }

    private void AcceptMouseClicked(MouseEvent evt) {
        dispose();
    }

    private void AcceptMousePressed(MouseEvent evt) {
        Accept.setBackground(new Color(217, 153, 88));
    }

    private void RefuseMouseClicked(MouseEvent evt) {
        dispose();
    }

    private void RefuseMousePressed(MouseEvent evt) {
        Accept.setBackground(new Color(217, 153, 88));
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

    public static void main(String[] args) {
        new RequestHandle().setVisible(true);
    }
}
