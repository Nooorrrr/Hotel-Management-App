package mainPackage.interfaces_graphiques;

import mainPackage.model.Date;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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
    private JButton deletebutton = new JButton();
    private JButton editbutton = new JButton();
    private JButton addbutton = new JButton();
    private JComboBox<String> type = new JComboBox<String>();
    private JComboBox<String> category = new JComboBox<String>();
    private JComboBox<String> view = new JComboBox<String>();

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
        table_reservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_reservation_MouseClicked(evt);
            }
        });
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
        table_rooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_rooms_MouseClicked(evt);
            }
        });
        if (table_rooms.getColumnModel().getColumnCount() > 0) {
            table_rooms.getColumnModel().getColumn(0).setResizable(false);
            table_rooms.getColumnModel().getColumn(1).setResizable(false);
            table_rooms.getColumnModel().getColumn(2).setResizable(false);
            table_rooms.getColumnModel().getColumn(4).setResizable(false);
        }

        tablepane3.setBounds(360, 210, 520, 300);
        panel.add(tablepane3);

        addbutton.setIcon(new ImageIcon("src/mainPackage/images/add-37.png"));
        addbutton.setBackground(new Color(255, 255, 255,0));
        addbutton.setBorder(null);
        addbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addbutton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                addbuttonMousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                addbuttonMouseReleased(evt);
            }
        });
        addbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });
        addbutton.setBounds(820, 500, 50, 50);
        panel.add(addbutton);

        editbutton.setIcon(new ImageIcon("src/mainPackage/images/edit-40.png"));
        editbutton.setBackground(new Color(255, 255, 255,0));
        editbutton.setBorder(null);
        editbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        editbutton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                editbuttonMousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                editbuttonMouseReleased(evt);
            }
        });
        editbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });
        editbutton.setBounds(820, 545, 50, 50);
        panel.add(editbutton);

        deletebutton.setIcon(new ImageIcon("src/mainPackage/images/delete-32.png"));
        deletebutton.setBackground(new Color(255, 255, 255,0));
        deletebutton.setBorder(null);
        deletebutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        deletebutton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                deletebuttonMousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                deletebuttonMouseReleased(evt);
            }
        });
        deletebutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        deletebutton.setVisible(false);
        deletebutton.setBounds(820, 595, 50, 50);
        panel.add(deletebutton);

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

        type.setBackground(new Color(255, 255, 255,0));
        type.setForeground(new Color(147, 101, 70));
        type.setModel(new DefaultComboBoxModel<>(new String[]{"Single", "Double", "Triple", "Quadruple"}));
        type.setSelectedIndex(-1);
        type.setBorder(null);
        type.setRequestFocusEnabled(false);
        type.setBounds(400, 561, 91, 20);
        panel.add(type);

        category.setBackground(new Color(255, 255, 255,0));
        category.setForeground(new Color(147, 101, 70));
        category.setModel(new DefaultComboBoxModel<>(new String[]{"Standard", "Premium", "Executive", "Family"}));
        category.setSelectedIndex(-1);
        category.setBorder(null);
        category.setRequestFocusEnabled(false);
        category.setBounds(554, 561, 85, 20);
        panel.add(category);

        view.setBackground(new Color(109, 84, 70));
        view.setBackground(new Color(255, 255, 255,0));
        view.setForeground(new Color(147, 101, 70));
        view.setModel(new DefaultComboBoxModel<>(new String[]{"Beach", "Mountain", "City"}));
        view.setSelectedIndex(-1);
        view.setBorder(null);
        view.setRequestFocusEnabled(false);
        view.setBounds(703, 561, 83, 20);
        panel.add(view);

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
        deletebutton.setVisible(false);
    }

    private void reservations_buttonActionPerformed(ActionEvent evt) {
        tablepane1.setVisible(false);
        tablepane2.setVisible(true);
        tablepane3.setVisible(false);
        deletebutton.setVisible(false);
    }

    private void rooms_buttonActionPerformed(ActionEvent evt) {
        tablepane1.setVisible(false);
        tablepane2.setVisible(false);
        tablepane3.setVisible(true);
        deletebutton.setVisible(true);
    }

    private String [] addbuttonActionPerformed(ActionEvent evt) {
        return null;
    }

    private void addbuttonMousePressed(MouseEvent evt) {
        addbutton.setIcon(new ImageIcon("src/mainPackage/images/ajouter-37.png"));
    }
    private void addbuttonMouseReleased(MouseEvent evt) {
        addbutton.setIcon(new ImageIcon("src/mainPackage/images/add-37.png"));
    }

    private void table_rooms_MouseClicked(MouseEvent evt) {
        DefaultTableModel tab = (DefaultTableModel)table_rooms.getModel();
    }

    private void table_reservation_MouseClicked (MouseEvent evt) {
        DefaultTableModel tab = (DefaultTableModel)table_rooms.getModel();
    }

    private void editbuttonActionPerformed(ActionEvent evt) {
    }

    private void editbuttonMousePressed(MouseEvent evt) {
        editbutton.setIcon(new ImageIcon("src/mainPackage/images/modify-40.png"));

    }

    private void editbuttonMouseReleased(MouseEvent evt) {
        editbutton.setIcon(new ImageIcon("src/mainPackage/images/edit-40.png"));

    }

    private void deletebuttonActionPerformed(ActionEvent evt) {
    }

    private void deletebuttonMousePressed(MouseEvent evt) {
        deletebutton.setIcon(new ImageIcon("src/mainPackage/images/supprimer-32.png"));
    }

    private void deletebuttonMouseReleased(MouseEvent evt) {
        deletebutton.setIcon(new ImageIcon("src/mainPackage/images/delete-32.png"));
    }

}
