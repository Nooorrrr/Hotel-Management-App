package mainPackage.interfaces_graphiques;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;


public class Principal_client extends JFrame {

    private int posX, posY;
    private JPanel panel = new JPanel();
    private JLabel exit = new JLabel();
    private JTextField name = new JTextField();
    private JLabel title = new JLabel();
    private JLabel addicon = new JLabel();
    private JLabel deleteicon = new JLabel();
    private JLabel editicon = new JLabel();
    private JLabel person = new JLabel();
    private JLabel your_label = new JLabel();
    private JLabel reservation_label = new JLabel();
    private JLabel options_label = new JLabel();
    private JLabel jLabel14 = new JLabel();
    private JLabel jLabel12 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel13 = new JLabel();
    private JLabel jLabel10 = new JLabel();
    private JLabel jLabel1 = new JLabel();
    private JComboBox<String> day_checkout = new JComboBox<String>();
    private JComboBox<String> month_checkout = new JComboBox<String>();
    private JComboBox<String> year_checkout = new JComboBox<String>();
    private JComboBox<String> day_checkin = new JComboBox<String>();
    private JComboBox<String> month_checkin = new JComboBox<String>();
    private JComboBox<String> year_checkin = new JComboBox<String>();
    private JComboBox<String> type = new JComboBox<String>();
    private JComboBox<String> category = new JComboBox<String>();
    private JComboBox<String> view = new JComboBox<String>();
    private JButton deletebutton = new JButton();
    private JButton editbutton = new JButton();
    private JButton addbutton = new JButton();
    private JLabel checkin = new JLabel();
    private JLabel checkout = new JLabel();
    private JLabel Type = new JLabel();
    private JLabel Category = new JLabel();
    private JLabel View = new JLabel();
    private JLabel Daylabel = new JLabel();
    private JLabel Monthlabel = new JLabel();
    private JLabel Yearlabel = new JLabel();
    private JScrollPane tablepane = new JScrollPane();
    private JTable table = new JTable();
    private JLabel jLabel15 = new JLabel();

    public Principal_client() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(900,700));
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

            public void mousePressed(MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        exit.setBounds(866, 15, 20, 20);
        panel.add(exit);

        person.setIcon(new ImageIcon("src/mainPackage/images/utilisateur-60.png"));
        person.setBounds(70, 60, 70, 70);
        panel.add(person);

        name.setFont(new Font("Segoe Print", 0, 14));
        name.setForeground(new Color(87, 47, 37));
        name.setBorder(null);
        //name.setCaretColor(new Color(184, 153, 132));
        name.setFocusable(false);
        name.setBackground(new Color(255, 255, 255,0));
        name.setText("yasmine maroua behih ");
        name.setBounds(130, 70, 180, 50);
        panel.add(name);

        title.setFont(new Font("High Tower Text", 1, 18));
        title.setForeground(new Color(255, 255, 255));
        title.setText("YOUR RESERVATION LIST");
        title.setBounds(400, 180, 260, 30);
        panel.add(title);

        addicon.setIcon(new ImageIcon("src/mainPackage/images/add-60.png"));
        addicon.setBounds(50, 320, 60, 50);
        panel.add(addicon);

        editicon.setIcon(new ImageIcon("src/mainPackage/images/edit-55.png"));
        editicon.setBounds(50, 420, 55, 55);
        panel.add(editicon);

        deleteicon.setIcon(new ImageIcon("src/mainPackage/images/delete-48.png"));
        deleteicon.setBounds(58, 520, 50, 60);
        panel.add(deleteicon);

        your_label.setFont(new Font("High Tower Text", 1, 18));
        your_label.setForeground(new Color(255, 255, 255));
        your_label.setText("YOUR  ");
        your_label.setBounds(100, 200, 70, 30);
        panel.add(your_label);

        reservation_label.setFont(new Font("High Tower Text", 1, 18));
        reservation_label.setForeground(new Color(255, 255, 255));
        reservation_label.setText("RESERVATION");
        reservation_label.setBounds(60, 230, 150, 30);
        panel.add(reservation_label);

        options_label.setFont(new Font("High Tower Text", 1, 18));
        options_label.setForeground(new Color(255, 255, 255));
        options_label.setText("OPTIONS :");
        options_label.setBounds(80, 260, 100, 30);
        panel.add(options_label);

        jLabel14.setFont(new Font("Segoe Print", 1, 14));
        jLabel14.setForeground(new Color(255, 255, 255));
        jLabel14.setText("ADD NEW");
        jLabel14.setBounds(120, 320, 90, 30);
        panel.add(jLabel14);

        jLabel12.setFont(new Font("Segoe Print", 1, 14));
        jLabel12.setForeground(new Color(255, 255, 255));
        jLabel12.setText(" RESERVATION ");
        jLabel12.setBounds(100, 340, 130, 30);
        panel.add(jLabel12);

        jLabel7.setFont(new Font("Segoe Print", 1, 14));
        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText("EDIT");
        jLabel7.setBounds(130, 420, 50, 30);
        panel.add(jLabel7);

        jLabel13.setFont(new Font("Segoe Print", 1, 14));
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setText("RESERVATION ");
        jLabel13.setBounds(100, 440, 120, 30);
        panel.add(jLabel13);

        jLabel10.setFont(new Font("Segoe Print", 1, 14));
        jLabel10.setForeground(new Color(255, 255, 255));
        jLabel10.setText("DELETE");
        jLabel10.setBounds(130, 530, 70, 30);
        panel.add(jLabel10);

        jLabel1.setFont(new Font("Segoe Print", 1, 14));
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText(" RESERVATION ");
        jLabel1.setBounds(100, 550, 120, 30);
        panel.add(jLabel1);

        //day_checkout.setBackground(new Color(109, 84, 70));
        day_checkout.setBackground(new Color(255, 255, 255,0));
        day_checkout.setForeground(new Color(255, 255, 255));
        day_checkout.setModel(new DefaultComboBoxModel<>(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        day_checkout.setSelectedIndex(-1);
        day_checkout.setBorder(null);
        day_checkout.setRequestFocusEnabled(false);
        day_checkout.setBounds(410, 560, 72, 20);
        panel.add(day_checkout);

        //month_checkout.setBackground(new Color(109, 84, 70));
        month_checkout.setBackground(new Color(255, 255, 255,0));
        month_checkout.setForeground(new Color(255, 255, 255));
        month_checkout.setModel(new DefaultComboBoxModel<>(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        month_checkout.setSelectedIndex(-1);
        month_checkout.setBorder(null);
        month_checkout.setRequestFocusEnabled(false);
        month_checkout.setBounds(500, 560, 72, 20);
        panel.add(month_checkout);

        //year_checkout.setBackground(new Color(109, 84, 70));
        year_checkout.setBackground(new Color(255, 255, 255,0));
        year_checkout.setForeground(new Color(255, 255, 255));
        year_checkout.setModel(new DefaultComboBoxModel<>(new String[]{"2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        year_checkout.setSelectedIndex(-1);
        year_checkout.setToolTipText("");
        year_checkout.setBorder(null);
        year_checkout.setRequestFocusEnabled(false);
        year_checkout.setBounds(600, 560, 72, 20);
        panel.add(year_checkout);


        day_checkin.setBackground(new Color(255, 255, 255,0));
        day_checkin.setForeground(new Color(255, 255, 255));
        day_checkin.setModel(new DefaultComboBoxModel<>(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        day_checkin.setSelectedIndex(-1);
        day_checkin.setBorder(null);
        day_checkin.setRequestFocusEnabled(false);
        day_checkin.setBounds(410, 530, 72, 20);
        panel.add(day_checkin);


        month_checkin.setBackground(new Color(255, 255, 255,0));
        month_checkin.setForeground(new Color(255, 255, 255));
        month_checkin.setModel(new DefaultComboBoxModel<>(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        month_checkin.setSelectedIndex(-1);
        month_checkin.setBorder(null);
        month_checkin.setRequestFocusEnabled(false);
        month_checkin.setBounds(500, 530, 72, 20);
        panel.add(month_checkin);


        year_checkin.setBackground(new Color(255, 255, 255,0));
        year_checkin.setForeground(new Color(255, 255, 255));
        year_checkin.setModel(new DefaultComboBoxModel<>(new String[]{"2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        year_checkin.setSelectedIndex(-1);
        year_checkin.setBorder(null);
        year_checkin.setRequestFocusEnabled(false);
        year_checkin.setBounds(600, 530, 72, 20);
        panel.add(year_checkin);


        type.setBackground(new Color(255, 255, 255,0));
        type.setForeground(new Color(147, 101, 70));
        type.setModel(new DefaultComboBoxModel<>(new String[]{"single", "double", "triple", "quadruple"}));
        type.setSelectedIndex(-1);
        type.setBorder(null);
        type.setRequestFocusEnabled(false);
        type.setBounds(360, 620, 90, 20);
        panel.add(type);

        //category.setBackground(new Color(109, 84, 70));
        category.setBackground(new Color(255, 255, 255,0));
        category.setForeground(new Color(147, 101, 70));
        category.setModel(new DefaultComboBoxModel<>(new String[]{"Standard", "Premium", "Executive", "Family"}));
        category.setSelectedIndex(-1);
        category.setBorder(null);
        category.setRequestFocusEnabled(false);
        category.setBounds(480, 620, 90, 20);
        panel.add(category);

        view.setBackground(new Color(109, 84, 70));
        view.setBackground(new Color(255, 255, 255,0));
        view.setForeground(new Color(147, 101, 70));
        view.setModel(new DefaultComboBoxModel<>(new String[]{"sea", "forest", "city"}));
        view.setSelectedIndex(-1);
        view.setBorder(null);
        view.setRequestFocusEnabled(false);
        view.setBounds(580, 620, 65, 20);
        panel.add(view);

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
        deletebutton.setBounds(740, 600, 50, 50);
        panel.add(deletebutton);

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
        editbutton.setBounds(740, 550, 50, 50);
        panel.add(editbutton);

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
        addbutton.setBounds(740, 500, 50, 50);
        panel.add(addbutton);

        checkin.setFont(new Font("Segoe Print", 0, 14));
        checkin.setForeground(new Color(87, 47, 37));
        checkin.setText("Check-in");
        checkin.setBounds(310, 530, 70, 20);
        panel.add(checkin);

        checkout.setFont(new Font("Segoe Print", 0, 14));
        checkout.setForeground(new Color(87, 47, 37));
        checkout.setText("Check-out");
        checkout.setBounds(310, 560, 75, 20);
        panel.add(checkout);

        Type.setFont(new Font("Segoe Print", 0, 14));
        Type.setForeground(new Color(87, 47, 37));
        Type.setText("Type");
        Type.setBounds(380, 590, 72, 20);
        panel.add(Type);

        Category.setFont(new Font("Segoe Print", 0, 14));
        Category.setForeground(new Color(87, 47, 37));
        Category.setText("Category");
        Category.setBounds(480, 590, 72, 20);
        panel.add(Category);

        View.setFont(new Font("Segoe Print", 0, 14));
        View.setForeground(new Color(87, 47, 37));
        View.setText("View");
        View.setBounds(590, 590, 72, 20);
        panel.add(View);

        Daylabel.setFont(new Font("Segoe Print", 0, 14));
        Daylabel.setForeground(new Color(87, 47, 37));
        Daylabel.setText("Day");
        Daylabel.setBounds(410, 500, 40, 20);
        panel.add(Daylabel);

        Monthlabel.setFont(new Font("Segoe Print", 0, 14));
        Monthlabel.setForeground(new Color(87, 47, 37));
        Monthlabel.setText("Month");
        Monthlabel.setBounds(510, 500, 60, 20);
        panel.add(Monthlabel);

        Yearlabel.setFont(new Font("Segoe Print", 0, 14));
        Yearlabel.setForeground(new Color(87, 47, 37));
        Yearlabel.setText("Year");
        Yearlabel.setBounds(610, 500, 40, 20);
        panel.add(Yearlabel);

        table.setBackground(new java.awt.Color(184, 153, 132));
        table.setModel(new DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Check-in date", "Check-out date", "Type", "Category", "View","Status"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false,false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        //table.setColumnSelectionAllowed(true);
        table.setFocusable(false);
        table.setSelectionBackground(new Color(87, 47, 37));
        table.setSelectionForeground(new Color(255, 255, 255));
        table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        tablepane.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(85);
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(85);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
        }

        tablepane.setBounds(270, 210, 530, 236);
        tablepane.setBackground(new Color(255, 255, 255,0));
        panel.add(tablepane);

        jLabel15.setForeground(new Color(255, 255, 255));
        jLabel15.setIcon(new ImageIcon("src/mainPackage/images/2.png"));
        jLabel15.setBounds(0, 0, 900, 700);
        panel.add(jLabel15);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 900, 700);

        pack();
        setLocationRelativeTo(null);
    }

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {
        exit.setForeground(new Color(207, 174, 149));
    }

    private void exitMouseExited(java.awt.event.MouseEvent evt) {
        exit.setForeground(new Color(87, 47, 37));
    }

    private void exitMousePressed(java.awt.event.MouseEvent evt) {
        exit.setForeground(new Color(207, 174, 149));
    }

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (day_checkin.getSelectedIndex() == -1 || month_checkin.getSelectedIndex() == -1 || year_checkin.getSelectedIndex() == -1 || month_checkout.getSelectedIndex() == -1 || day_checkout.getSelectedIndex() == -1 || year_checkout.getSelectedIndex() == -1 || type.getSelectedIndex() == -1 || category.getSelectedIndex() == -1 || view.getSelectedIndex() == -1) {
            Warning1 d = new Warning1(this, true,"");
            d.setVisible(true);
        } else {
            String data[] = {(String) day_checkin.getSelectedItem() + "/" + (String) month_checkin.getSelectedItem() + "/" + (String) year_checkin.getSelectedItem(), (String) day_checkout.getSelectedItem() + "/" + (String) month_checkout.getSelectedItem() + "/" + (String) year_checkout.getSelectedItem(), (String) type.getSelectedItem(), (String) category.getSelectedItem(), (String) view.getSelectedItem(),"Pending"};
            DefaultTableModel tab = (DefaultTableModel) table.getModel();
            tab.addRow(data);
        }
    }

    private void addbuttonMouseReleased(MouseEvent evt) {
        addbutton.setIcon(new ImageIcon("src/mainPackage/images/add-37.png"));
    }

    private void addbuttonMousePressed(MouseEvent evt) {
        addbutton.setIcon(new ImageIcon("src/mainPackage/images/ajouter-37.png"));
    }

    private void editbuttonMousePressed(MouseEvent evt) {
        editbutton.setIcon(new ImageIcon("src/mainPackage/images/modify-40.png"));

    }

    private void editbuttonMouseReleased(MouseEvent evt) {
        editbutton.setIcon(new ImageIcon("src/mainPackage/images/edit-40.png"));

    }

    private void deletebuttonMousePressed(MouseEvent evt) {
        deletebutton.setIcon(new ImageIcon("src/mainPackage/images/supprimer-32.png"));

    }

    private void deletebuttonMouseReleased(MouseEvent evt) {
        deletebutton.setIcon(new ImageIcon("src/mainPackage/images/delete-32.png"));

    }

    private void deletebuttonActionPerformed(ActionEvent evt) {
        DefaultTableModel tab = (DefaultTableModel) table.getModel();
        if (table.getSelectedRowCount() == 1) {
            tab.removeRow(table.getSelectedRow());
        } else {
            if (table.getRowCount() == 0) {
                Warning1 d = new Warning1(this, true,"");
                d.setVisible(true);
            } else {
                Warning1 d = new Warning1(this, true,"");
                d.setVisible(true);
            }
        }

    }

    private void tableMouseClicked(MouseEvent evt) {
        DefaultTableModel tab = (DefaultTableModel) table.getModel();

        String[] in = tab.getValueAt(table.getSelectedRow(), 0).toString().split("/");
        String[] out = tab.getValueAt(table.getSelectedRow(), 1).toString().split("/");
        String t = tab.getValueAt(table.getSelectedRow(), 2).toString();
        String c = tab.getValueAt(table.getSelectedRow(), 3).toString();
        String v = tab.getValueAt(table.getSelectedRow(), 4).toString();

        day_checkin.setSelectedItem(in[1]);
        month_checkin.setSelectedItem(in[0]);
        year_checkin.setSelectedItem(in[2]);
        day_checkout.setSelectedItem(in[1]);
        month_checkout.setSelectedItem(in[0]);
        year_checkout.setSelectedItem(in[2]);
        type.setSelectedItem(t);
        category.setSelectedItem(c);
        view.setSelectedItem(v);

    }

    private void editbuttonActionPerformed(ActionEvent evt) {
        DefaultTableModel tab = (DefaultTableModel) table.getModel();
        if (table.getSelectedRowCount() == 1) {

            String date_in = (String) day_checkin.getSelectedItem() + "/" + (String) month_checkin.getSelectedItem() + "/" + (String) year_checkin.getSelectedItem();
            String date_out = (String) day_checkout.getSelectedItem() + "/" + (String) month_checkout.getSelectedItem() + "/" + (String) year_checkout.getSelectedItem();
            String t = (String) type.getSelectedItem();
            String c = (String) category.getSelectedItem();
            String v = (String) view.getSelectedItem();

            tab.setValueAt(date_in, table.getSelectedRow(), 0);
            tab.setValueAt(date_out, table.getSelectedRow(), 1);
            tab.setValueAt(t, table.getSelectedRow(), 2);
            tab.setValueAt(c, table.getSelectedRow(), 3);
            tab.setValueAt(v, table.getSelectedRow(), 4);

        } else {
            if (table.getRowCount() == 0) {
                Warning1 d = new Warning1(this, true,"");
                d.setVisible(true);
            } else {
                Warning1 d = new Warning1(this, true,"");
                d.setVisible(true);
            }
        }
    }

    private void formMousePressed(MouseEvent evt) {
        posX = evt.getX();
        posY = evt.getY();
        table.clearSelection();
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
                new Principal_client().setVisible(true);

    }
}



