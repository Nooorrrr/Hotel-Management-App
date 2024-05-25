package mainPackage.interfaces_graphiques;

import mainPackage.model.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import mainPackage.model.ReservationRequest;




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
    private JButton logoutadmin = new JButton();
    private JComboBox<String> type = new JComboBox<String>();
    private JComboBox<String> category = new JComboBox<String>();
    private JComboBox<String> view = new JComboBox<String>();
    private JLabel Type = new JLabel();
    private JLabel Category = new JLabel();
    private JLabel View = new JLabel();

    public Principal_Admin(Hotel hotel) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1000, 700));
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

        logoutadmin.setIcon(new ImageIcon("src/mainPackage/images/logout2-40.png"));
        logoutadmin.setBackground(new Color(255, 255, 255,0));
        logoutadmin.setBounds(800, 70, 40, 40);
        logoutadmin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logoutadmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               logoutActionPerformed(evt,hotel);
            }
        });
        panel.add(logoutadmin);

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
        table_client.setModel(new DefaultTableModel(
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

        this.fillTableWithUsers(table_client, hotel.users);
        tablepane1.setBackground(new Color(255, 255, 255,0));
        table_client.setFocusable(false);
        table_client.setSelectionBackground(new Color(87, 47, 37));
        table_client.setSelectionForeground(new Color(255, 255, 255));
        table_client.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table_client.getTableHeader().setReorderingAllowed(false);
        tablepane1.setViewportView(table_client);
        table_client.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (table_client.getColumnModel().getColumnCount() > 0) {
            table_client.getColumnModel().getColumn(0).setMinWidth(175);
            table_client.getColumnModel().getColumn(0).setPreferredWidth(175);
            table_client.getColumnModel().getColumn(1).setMinWidth(125);
            table_client.getColumnModel().getColumn(1).setPreferredWidth(125);
            table_client.getColumnModel().getColumn(2).setMinWidth(220);
            table_client.getColumnModel().getColumn(2).setPreferredWidth(220);
            table_client.getColumnModel().getColumn(0).setResizable(false);
            table_client.getColumnModel().getColumn(1).setResizable(false);
            table_client.getColumnModel().getColumn(2).setResizable(false);
        }

        tablepane1.setBounds(360, 210, 520, 402);
        panel.add(tablepane1);

        table_reservation.setBackground(new Color(184, 153, 132));
        table_reservation.setModel(new DefaultTableModel(
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
        table_reservation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table_reservation.getTableHeader().setReorderingAllowed(false);
        tablepane2.setViewportView(table_reservation);
        table_reservation.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
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
        table_rooms.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID Room", "Type", "Category", "View", "Status"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

        });
        this.fillTableWithRooms(table_rooms, hotel.rooms);
        tablepane3.setBackground(new Color(255, 255, 255,0));
        table_rooms.setFocusable(false);
        table_rooms.setSelectionBackground(new Color(87, 47, 37));
        table_rooms.setSelectionForeground(new Color(255, 255, 255));
        table_rooms.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table_rooms.getTableHeader().setReorderingAllowed(false);
        tablepane3.setViewportView(table_rooms);
        table_rooms.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
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
                addbuttonActionPerformed(evt,hotel);
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
                editbuttonActionPerformed(evt,hotel);
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
                deletebuttonActionPerformed(evt,hotel);
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
                rooms_buttonActionPerformed(evt,hotel);
            }
        });
        panel.add(rooms_button);
        rooms_button.setBounds(120,510,110,90);



        this.fillTableWithReservationRequests(table_reservation, (HashMap<Integer, ReservationRequest>) hotel.reservationsRequestWaitlist);
        reservations_button.setIcon(new ImageIcon("src/mainPackage/images/calendar-70.png"));
        reservations_button.setBackground(new Color(255,255,255,0));
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
                clients_buttonActionPerformed(evt,hotel);
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

        Type.setFont(new Font("Segoe Print", 0, 14));
        Type.setForeground(new Color(87, 47, 37));
        Type.setText("Type");
        Type.setBounds(430, 530, 40, 26);
        panel.add(Type);

        Category.setFont(new Font("Segoe Print", 0, 14));
        Category.setForeground(new Color(87, 47, 37));
        Category.setText("Category");
        Category.setBounds(564, 530, 75, 26);
        panel.add(Category);

        View.setFont(new Font("Segoe Print", 0, 14));
        View.setForeground(new Color(87, 47, 37));
        View.setText("View");
        View.setBounds(725, 530, 40, 26);
        panel.add(View);

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
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void logoutActionPerformed(ActionEvent evt,Hotel hotel) {
        dispose();
        Choice c = new Choice(hotel);
        c.setVisible(true);
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

    private void clients_buttonActionPerformed(ActionEvent evt,Hotel hotel) {
        tablepane1.setVisible(true);
        tablepane2.setVisible(false);
        tablepane3.setVisible(false);
        deletebutton.setVisible(false);
        this.fillTableWithUsers(table_client,hotel.users);
    }

    private void reservations_buttonActionPerformed(ActionEvent evt) {
        tablepane1.setVisible(false);
        tablepane2.setVisible(true);
        tablepane3.setVisible(false);
        deletebutton.setVisible(false);
    }

    private void rooms_buttonActionPerformed(ActionEvent evt,Hotel hotel) {
        tablepane1.setVisible(false);
        tablepane2.setVisible(false);
        tablepane3.setVisible(true);
        deletebutton.setVisible(true);
        this.fillTableWithRooms(table_rooms,hotel.rooms);
    }

    private void addbuttonActionPerformed(ActionEvent evt,Hotel hotel) {
        if(type.getSelectedIndex() == -1 || category.getSelectedIndex() == -1 || view.getSelectedIndex() == -1){
            Warning d = new Warning(this , true,"Enter all fields");
            d.setVisible(true);
        }
        else{
            Room r = new Room(Room.getroomtype(type.getSelectedItem().toString()), Room.getroomview(view.getSelectedItem().toString()),Room.getroomcategory(category.getSelectedItem().toString()),Room_status.Available);
            hotel.rooms.put(r.getID_Room(),r);
            String data[] ={Integer.toString(r.getID_Room()),(String) type.getSelectedItem(),(String) category.getSelectedItem(),(String) view.getSelectedItem(),"Available"};
                    DefaultTableModel tab = (DefaultTableModel) table_rooms.getModel();
                    tab.addRow(data);

        }
    }

    private void addbuttonMousePressed(MouseEvent evt) {
        addbutton.setIcon(new ImageIcon("src/mainPackage/images/ajouter-37.png"));
    }
    private void addbuttonMouseReleased(MouseEvent evt) {
        addbutton.setIcon(new ImageIcon("src/mainPackage/images/add-37.png"));
    }

    private void table_rooms_MouseClicked(MouseEvent evt) {
        DefaultTableModel tab = (DefaultTableModel)table_rooms.getModel();

            int id  = Integer.parseInt(tab.getValueAt(table_rooms.getSelectedRow(), 0).toString());
            String t = tab.getValueAt(table_rooms.getSelectedRow(),1).toString();
            String c = tab.getValueAt(table_rooms.getSelectedRow(),2).toString();
            String v = tab.getValueAt(table_rooms.getSelectedRow(),3).toString();
            type.setSelectedItem(t);
            category.setSelectedItem(c);
            view.setSelectedItem(v);
    }

    private void fillTableWithReservationRequests(JTable table_reservation, HashMap<Integer, ReservationRequest> reservationRequests) {
        DefaultTableModel model = (DefaultTableModel) table_reservation.getModel();
        //model.setRowCount(0);
 
        for (Map.Entry<Integer, ReservationRequest> entry : reservationRequests.entrySet()) {
            ReservationRequest reservationRequest = entry.getValue();
            model.addRow(new Object[]{reservationRequest.getUser().getEmail(),"NULL", reservationRequest.getCheckinDate(), reservationRequest.getCheckoutDate(), reservationRequest.getStatus()});}
        
        
    }

    private void table_reservation_MouseClicked (MouseEvent evt) {
        DefaultTableModel tab = (DefaultTableModel)table_rooms.getModel();
    }

    private void editbuttonActionPerformed(ActionEvent evt,Hotel hotel) {
        DefaultTableModel tab = (DefaultTableModel)table_rooms.getModel();
        if(table_rooms.getSelectedRowCount()==1){
            if(table_rooms.getValueAt(table_rooms.getSelectedRow(), 4) == Room_status.Available) {
                String t = (String) type.getSelectedItem();
                String c = (String) category.getSelectedItem();
                String v = (String) view.getSelectedItem();

                tab.setValueAt(t, table_rooms.getSelectedRow(), 1);
                tab.setValueAt(c, table_rooms.getSelectedRow(), 2);
                tab.setValueAt(v, table_rooms.getSelectedRow(), 3);
                Room r = new Room(Integer.parseInt(tab.getValueAt(table_rooms.getSelectedRow(), 0).toString()),Room.getroomtype(tab.getValueAt(table_rooms.getSelectedRow(),1).toString()), Room.getroomcategory(tab.getValueAt(table_rooms.getSelectedRow(),2).toString()), Room.getroomview(tab.getValueAt(table_rooms.getSelectedRow(),3).toString()));
                hotel.rooms.replace(Integer.parseInt(tab.getValueAt(table_rooms.getSelectedRow(), 0).toString()),r);
                }else{
                Warning d = new Warning(this, true,"This room is reserved");
                d.setVisible(true);
            }
        } else {
            if (table_rooms.getRowCount() == 0) {
                Warning d = new Warning(this, true,"Select a row to edit");
                d.setVisible(true);
            } else {
                Warning d = new Warning(this, true,"");
                d.setVisible(true);
            }
        }
    }

    private void editbuttonMousePressed(MouseEvent evt) {
        editbutton.setIcon(new ImageIcon("src/mainPackage/images/modify-40.png"));

    }

    private void editbuttonMouseReleased(MouseEvent evt) {
        editbutton.setIcon(new ImageIcon("src/mainPackage/images/edit-40.png"));

    }

    private void deletebuttonActionPerformed(ActionEvent evt,Hotel hotel) {
        DefaultTableModel tab = (DefaultTableModel) table_rooms.getModel();
        if (table_rooms.getSelectedRowCount() == 1) {
            if(table_rooms.getValueAt(table_rooms.getSelectedRow(), 4) == Room_status.Available){
                hotel.rooms.remove(Integer.parseInt(table_rooms.getValueAt(table_rooms.getSelectedRow(), 0).toString()));
            tab.removeRow(table_rooms.getSelectedRow());
            }
            else{
                Warning d = new Warning(this, true,"You can't delete room reserved");
                d.setVisible(true);
            }
        } else {
            if (table_rooms.getRowCount() == 0) {
                Warning d = new Warning(this, true,"Select a row to delete");
                d.setVisible(true);
            } else {
                Warning d = new Warning(this, true,"");
                d.setVisible(true);
            }
        }
    }
    private void deletebuttonMousePressed(MouseEvent evt) {
        deletebutton.setIcon(new ImageIcon("src/mainPackage/images/supprimer-32.png"));
    }
    private void deletebuttonMouseReleased(MouseEvent evt) {
        deletebutton.setIcon(new ImageIcon("src/mainPackage/images/delete-32.png"));
    }
    public void fillTableWithUsers(JTable table_client, HashMap<String, User> users) {
        DefaultTableModel model = (DefaultTableModel) table_client.getModel();
        //model.setRowCount(0);

        for (Map.Entry<String, User> entry : users.entrySet()) {
            User user = entry.getValue();
            model.addRow(new Object[]{user.getFullName(), user.getTelephone(), user.getEmail()});
        }
    }
    public void fillTableWithRooms(JTable table_rooms, HashMap<Integer, Room> rooms){
        DefaultTableModel model = (DefaultTableModel) table_rooms.getModel();
        //model.setRowCount(0);

        for (Map.Entry<Integer, Room> entry : rooms.entrySet()) {
            Room room= entry.getValue();
            model.addRow(new Object[]{room.getID_Room(), room.getTypeChambre(), room.getCategory(),room.getVue(),room.getStatus()});
        }
    }
}
