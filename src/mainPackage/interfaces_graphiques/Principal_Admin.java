package mainPackage.interfaces_graphiques;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import mainPackage.interfaces_graphiques.*;
public class Principal_Admin extends JFrame{
    private int posX, posY;
    private JPanel panel = new JPanel();
    private JLabel exit = new JLabel();
    private JLabel Background = new JLabel();

    public Principal_Admin() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setAutoRequestFocus(false);
        setFocusable(false);
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
        panel.setLayout(null);

        exit.setFont(new Font("Segoe Script", 0, 24));
        exit.setForeground(new Color(87, 47, 37));
        exit.setText("X");
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
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
        exit.setBounds(970, 10, 18, 39);
        panel.add(exit);

        Background.setIcon(new ImageIcon("src/mainPackage/images/2.png"));
        Background.setBounds(0, 0, 1000, 700);
        panel.add(Background);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 1000, 700);

        pack();
        setLocationRelativeTo(null);
    }

    private void exitMouseClicked(MouseEvent evt) {
        System.exit(0);
    }

    private void exitMouseEntered(MouseEvent evt) {
        exit.setForeground(new Color(207, 174, 149));
    }

    private void exitMouseExited(MouseEvent evt) {
        exit.setForeground(new Color(87, 47, 37));
    }

    private void formMousePressed(MouseEvent evt) {
        posX = evt.getX();
        posY = evt.getY();
        //tableau.clearSelection();
    }

    private void formMouseDragged(MouseEvent evt) {
        int newX = getLocation().x + evt.getX() - posX;
        int newY = getLocation().y + evt.getY() - posY;
        // Set the new position of the frame
        setLocation(newX, newY);
    }

    public static void main(String args[]) {

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
        new Principal_Admin().setVisible(true);

    }
}
