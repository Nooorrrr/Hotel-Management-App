package mainPackage.interfaces_graphiques;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal_Admin extends JFrame{
    private int posX, posY;
    private JPanel panel = new JPanel();
    private JLabel exit = new JLabel();
    private JLabel Background = new JLabel();
    private JLabel reservations = new JLabel();
    private JLabel rooms = new JLabel();
    private JLabel clients = new JLabel();
    private JScrollPane tablepane1 = new JScrollPane();
    private JTable table_client = new JTable();
    private JScrollPane tablepane2 = new JScrollPane();
    private JTable table_reservation = new JTable();
    private JScrollPane tablepane3 = new JScrollPane();
    private JTable table_rooms = new javax.swing.JTable();
    private JButton rooms_button = new JButton();
    private JButton reservations_button = new JButton();
    private JButton clients_button = new JButton();

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

        reservations.setFont(new Font("Georgia", 2, 32));
        reservations.setForeground(new Color(255, 255, 255));
        reservations.setText("Reservations ");
        reservations.setBounds(80, 440, 220, 37);
        panel.add(reservations);

        rooms.setFont(new Font("Georgia", 2, 32));
        rooms.setForeground(new Color(255, 255, 255));
        rooms.setText("Rooms");
        rooms.setBounds(130, 600, 120, 37);
        panel.add(rooms);

        clients.setFont(new Font("Georgia", 2, 32));
        clients.setForeground(new Color(255, 255, 255));
        clients.setText("Clients");
        clients.setBounds(120, 270, 130, 40);
        panel.add(clients);

        //table_client.setAutoCreateRowSorter(true);
        table_client.setBackground(new Color(184, 153, 132));
        table_client.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Full Name", "Phone", "Email"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        tablepane1.setBackground(new Color(255, 255, 255,0));
        table_client.setFocusable(false);
        table_client.setSelectionBackground(new Color(87, 47, 37));
        table_client.setSelectionForeground(new Color(255, 255, 255));
        table_client.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_client.getTableHeader().setReorderingAllowed(false);
        tablepane1.setViewportView(table_client);
        table_client.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (table_client.getColumnModel().getColumnCount() > 0) {
            table_client.getColumnModel().getColumn(0).setResizable(false);
            table_client.getColumnModel().getColumn(1).setResizable(false);
            table_client.getColumnModel().getColumn(2).setResizable(false);
        }

        tablepane1.setBounds(360, 210, 520, 402);
        panel.add(tablepane1);

        table_reservation.setBackground(new Color(184, 153, 132));
        table_reservation.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Email Client", "Room ID", "Check in", "Check out", "Status"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

        });
        tablepane2.setBackground(new Color(255, 255, 255,0));
        table_reservation.setFocusable(false);
        table_reservation.setSelectionBackground(new Color(87, 47, 37));
        table_reservation.setSelectionForeground(new Color(255, 255, 255));
        table_reservation.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_reservation.getTableHeader().setReorderingAllowed(false);
        tablepane2.setViewportView(table_reservation);
        if (table_reservation.getColumnModel().getColumnCount() > 0) {
            table_reservation.getColumnModel().getColumn(0).setResizable(false);
            table_reservation.getColumnModel().getColumn(1).setResizable(false);
            table_reservation.getColumnModel().getColumn(2).setResizable(false);
            table_reservation.getColumnModel().getColumn(4).setResizable(false);
        }

        tablepane2.setBounds(360, 210, 520, 402);
        panel.add(tablepane2);


        table_rooms.setBackground(new Color(184, 153, 132));
        table_rooms.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID Room", "Type", "Category", "View", "Status"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

        });
        tablepane3.setBackground(new Color(255, 255, 255,0));
        table_rooms.setFocusable(false);
        table_rooms.setSelectionBackground(new Color(87, 47, 37));
        table_rooms.setSelectionForeground(new Color(255, 255, 255));
        table_rooms.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_rooms.getTableHeader().setReorderingAllowed(false);
        tablepane3.setViewportView(table_rooms);
        if (table_rooms.getColumnModel().getColumnCount() > 0) {
            table_rooms.getColumnModel().getColumn(0).setResizable(false);
            table_rooms.getColumnModel().getColumn(1).setResizable(false);
            table_rooms.getColumnModel().getColumn(2).setResizable(false);
            table_rooms.getColumnModel().getColumn(4).setResizable(false);
        }

        tablepane3.setBounds(360, 210, 520, 402);
        panel.add(tablepane3);

        rooms_button.setIcon(new ImageIcon("src/mainPackage/images/bed-75.png"));
        rooms_button.setBackground(new Color(255,255,255,0));
        rooms_button.setBorder(null);
        rooms_button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rooms_button.setFocusable(false);
        rooms_button.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                rooms_buttonMousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
                rooms_buttonMouseReleased(evt);
            }
        });
        rooms_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rooms_buttonActionPerformed(evt);
            }
        });
        panel.add(rooms_button);
        rooms_button.setBounds(120, 510, 110, 90);

        reservations_button.setIcon(new ImageIcon("src/mainPackage/images/calendar-70.png"));
        reservations_button.setBackground(new Color(255,255,255,0));
        reservations_button.setBorder(null);
        reservations_button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        reservations_button.setFocusable(false);
        reservations_button.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                reservations_buttonMousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
                reservations_buttonMouseReleased(evt);
            }
        });
        reservations_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                reservations_buttonActionPerformed(evt);
            }
        });
        panel.add(reservations_button);
        reservations_button.setBounds(130, 350, 90, 90);

        clients_button.setIcon(new ImageIcon("src/mainPackage/images/clients-100.png"));
        clients_button.setBackground(new Color(255,255,255,0));
        clients_button.setBorder(null);
        clients_button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        clients_button.setFocusable(false);
        clients_button.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                clients_buttonMousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
                clients_buttonMouseReleased(evt);
            }
        });
        clients_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clients_buttonActionPerformed(evt);
            }
        });
        panel.add(clients_button);
        clients_button.setBounds(120, 210, 100, 70);

        Background.setIcon(new ImageIcon("src/mainPackage/images/2.png"));
        Background.setBounds(0, 0, 1000, 700);
        panel.add(Background);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 1000, 700);

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
    private void clients_buttonMousePressed(MouseEvent evt) {
        clients_button.setIcon(new ImageIcon("src/mainPackage/images/personnes-100.png"));
    }

    private void clients_buttonMouseReleased(MouseEvent evt) {
        clients_button.setIcon(new ImageIcon("src/mainPackage/images/clients-100.png"));

    }

    private void reservations_buttonMousePressed(MouseEvent evt) {
        reservations_button.setIcon(new ImageIcon("src/mainPackage/images/calendrier-70.png"));
    }

    private void reservations_buttonMouseReleased(MouseEvent evt) {
        reservations_button.setIcon(new ImageIcon("src/mainPackage/images/calendar-70.png"));
    }

    private void rooms_buttonMousePressed(MouseEvent evt) {
        rooms_button.setIcon(new ImageIcon("src/mainPackage/images/lit-75.png"));
    }

    private void rooms_buttonMouseReleased(MouseEvent evt) {
        rooms_button.setIcon(new ImageIcon("src/mainPackage/images/bed-75.png"));
    }

    private void clients_buttonActionPerformed(ActionEvent evt) {
        tablepane1.setVisible(true);
        tablepane2.setVisible(false);
        tablepane3.setVisible(false);
    }

    private void reservations_buttonActionPerformed(ActionEvent evt) {
        tablepane1.setVisible(false);
        tablepane2.setVisible(true);
        tablepane3.setVisible(false);
    }

    private void rooms_buttonActionPerformed(ActionEvent evt) {
        tablepane1.setVisible(false);
        tablepane2.setVisible(false);
        tablepane3.setVisible(true);
    }


}
