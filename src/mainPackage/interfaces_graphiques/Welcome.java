package mainPackage.interfaces_graphiques;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame {

    private JLabel Background = new JLabel();

    public Welcome() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800,450));
        setUndecorated(true);

        getContentPane().setLayout(null); // Set null layout
        Background.setIcon(new javax.swing.ImageIcon("src/mainPackage/images/1.png")); // NOI18N

        Background.setBounds(0, 0, 800, 450);
        getContentPane().add(Background);

        pack();
        setLocationRelativeTo(null);
        // Créer un Timer pour fermer la fenêtre après 4 secondes
        Timer timer = new Timer(4000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fermer la fenêtre
                Choice c = new Choice(); // ouvrir la fenètre de login
                c.setVisible(true);
            }
        });
        timer.setRepeats(false); // Ne pas répéter le timer
        timer.start(); // Démarrer le timer
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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

}

