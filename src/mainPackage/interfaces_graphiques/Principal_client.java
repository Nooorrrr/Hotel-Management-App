package mainPackage.interfaces_graphiques;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import mainPackage.interfaces_graphiques.Welcome;
import mainPackage.model.User;


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
    private JButton logout = new JButton();
    private JLabel your_label = new JLabel();
    private JLabel reservation_label = new JLabel();
    private JLabel options_label = new JLabel();
    private JLabel jLabel14 = new JLabel();
    private JLabel jLabel12 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel13 = new JLabel();
    private JLabel jLabel10 = new JLabel();
    private JLabel jLabel1 = new JLabel();
    private LimitedTextField day_checkin = new LimitedTextField(2);
    private LimitedTextField month_checkin = new LimitedTextField(2);
    private LimitedTextField year_checkin = new LimitedTextField(4);
    private LimitedTextField day_checkout = new LimitedTextField(2);
    private LimitedTextField month_checkout = new LimitedTextField(2);
    private LimitedTextField year_checkout = new LimitedTextField(4);
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
    private JLabel Background = new JLabel();

    public Principal_client(User user) {

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

        person.setIcon(new ImageIcon("src/mainPackage/images/utilisateur-60.png"));
        person.setBounds(90, 60, 60, 60);
        panel.add(person);

        name.setFont(new Font("Segoe Print", 0, 14));
        name.setForeground(new Color(87, 47, 37));
        name.setBorder(null);
        //name.setCaretColor(new Color(184, 153, 132));
        name.setFocusable(false);
        name.setBackground(new Color(255, 255, 255,0));
        name.setText(user.getFullName());
        name.setBounds(160, 70, 170, 40);
        panel.add(name);

        logout.setIcon(new ImageIcon("src/mainPackage/images/door.png"));
        logout.setBounds(270, 70, 40, 40);
        logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logoutMouseReleased(evt);
            }
        });
        panel.add(logout);

        title.setFont(new Font("High Tower Text", 1, 20));
        title.setForeground(new Color(255, 255, 255));
        title.setText("YOUR RESERVATION LIST");
        title.setBounds(460, 180, 280, 24);
        panel.add(title);

        addicon.setIcon(new ImageIcon("src/mainPackage/images/add-60.png"));
        addicon.setBounds(62, 310, 60, 50);
        panel.add(addicon);

        editicon.setIcon(new ImageIcon("src/mainPackage/images/edit-55.png"));
        editicon.setBounds(65, 390, 55, 60);
        panel.add(editicon);

        deleteicon.setIcon(new ImageIcon("src/mainPackage/images/delete-48.png"));
        deleteicon.setBounds(70, 500, 50, 50);
        panel.add(deleteicon);

        your_label.setFont(new Font("High Tower Text", 1, 18));
        your_label.setForeground(new Color(255, 255, 255));
        your_label.setText("YOUR  ");
        your_label.setBounds(120, 190, 70, 22);
        panel.add(your_label);

        reservation_label.setFont(new Font("High Tower Text", 1, 18));
        reservation_label.setForeground(new Color(255, 255, 255));
        reservation_label.setText("RESERVATION");
        reservation_label.setBounds(80, 220, 144, 22);
        panel.add(reservation_label);

        options_label.setFont(new Font("High Tower Text", 1, 18));
        options_label.setForeground(new Color(255, 255, 255));
        options_label.setText("OPTIONS :");
        options_label.setBounds(100, 250, 105, 22);
        panel.add(options_label);

        jLabel14.setFont(new Font("Segoe Print", 1, 14));
        jLabel14.setForeground(new Color(255, 255, 255));
        jLabel14.setText("ADD NEW");
        jLabel14.setBounds(140, 310, 80, 26);
        panel.add(jLabel14);

        jLabel12.setFont(new Font("Segoe Print", 1, 14));
        jLabel12.setForeground(new Color(255, 255, 255));
        jLabel12.setText(" RESERVATION ");
        jLabel12.setBounds(120, 330, 120, 26);
        panel.add(jLabel12);

        jLabel7.setFont(new Font("Segoe Print", 1, 14));
        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText("EDIT");
        jLabel7.setBounds(160, 400, 45, 26);
        panel.add(jLabel7);

        jLabel13.setFont(new Font("Segoe Print", 1, 14));
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setText("RESERVATION ");
        jLabel13.setBounds(130, 420, 115, 26);
        panel.add(jLabel13);

        jLabel10.setFont(new Font("Segoe Print", 1, 14));
        jLabel10.setForeground(new Color(255, 255, 255));
        jLabel10.setText("DELETE");
        jLabel10.setBounds(150, 500, 60, 26);
        panel.add(jLabel10);

        jLabel1.setFont(new Font("Segoe Print", 1, 14));
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText(" RESERVATION ");
        jLabel1.setBounds(120, 520, 120, 26);
        panel.add(jLabel1);

        day_checkin.setBackground(new Color(255, 255, 255,0));
        day_checkin.setFont(new Font("Segoe UI Historic", 0, 14));
        day_checkin.setHorizontalAlignment(JTextField.CENTER);
        day_checkin.setBorder(null);
        day_checkin.setCaretColor(new Color(87, 47, 37));
        day_checkin.setBounds(502, 531, 30, 27);
        panel.add(day_checkin);

        month_checkin.setBackground(new Color(255, 255, 255,0));
        month_checkin.setFont(new Font("Segoe UI Historic", 0, 14));
        month_checkin.setHorizontalAlignment(JTextField.CENTER);
        month_checkin.setBorder(null);
        month_checkin.setCaretColor(new java.awt.Color(87, 47, 37));
        month_checkin.setBounds(590, 531, 30, 27);
        panel.add(month_checkin);


        year_checkin.setBackground(new Color(255, 255, 255,0));
        year_checkin.setFont(new Font("Segoe UI Historic", 0, 14));
        year_checkin.setHorizontalAlignment(JTextField.CENTER);
        year_checkin.setBorder(null);
        year_checkin.setCaretColor(new Color(87, 47, 37));
        year_checkin.setBounds(668, 531, 50, 27);
        panel.add(year_checkin);

        day_checkout.setBackground(new Color(255, 255, 255,0));
        day_checkout.setFont(new Font("Segoe UI Historic", 0, 14));
        day_checkout.setHorizontalAlignment(JTextField.CENTER);
        day_checkout.setBorder(null);
        day_checkout.setCaretColor(new Color(87, 47, 37));
        day_checkout.setBounds(502, 562, 30, 27);
        panel.add(day_checkout);

        month_checkout.setBackground(new Color(255, 255, 255,0));
        month_checkout.setFont(new Font("Segoe UI Historic", 0, 14));
        month_checkout.setHorizontalAlignment(JTextField.CENTER);
        month_checkout.setBorder(null);
        month_checkout.setCaretColor(new Color(87, 47, 37));
        month_checkout.setBounds(590, 562, 30, 27);
        panel.add(month_checkout);

        year_checkout.setBackground(new Color(255, 255, 255,0));
        year_checkout.setFont(new Font("Segoe UI Historic", 0, 14));
        year_checkout.setHorizontalAlignment(JTextField.CENTER);
        year_checkout.setBorder(null);
        year_checkout.setCaretColor(new Color(87, 47, 37));
        year_checkout.setBounds(668, 562, 50, 27);
        panel.add(year_checkout);

        type.setBackground(new Color(255, 255, 255,0));
        type.setForeground(new Color(147, 101, 70));
        type.setModel(new DefaultComboBoxModel<>(new String[]{"Single", "Double", "Triple", "Quadruple"}));
        type.setSelectedIndex(-1);
        type.setBorder(null);
        type.setRequestFocusEnabled(false);
        type.setBounds(450, 622, 91, 20);
        panel.add(type);

        category.setBackground(new Color(255, 255, 255,0));
        category.setForeground(new Color(147, 101, 70));
        category.setModel(new DefaultComboBoxModel<>(new String[]{"Standard", "Premium", "Executive", "Family"}));
        category.setSelectedIndex(-1);
        category.setBorder(null);
        category.setRequestFocusEnabled(false);
        category.setBounds(559, 622, 85, 20);
        panel.add(category);

        view.setBackground(new Color(109, 84, 70));
        view.setBackground(new Color(255, 255, 255,0));
        view.setForeground(new Color(147, 101, 70));
        view.setModel(new DefaultComboBoxModel<>(new String[]{"Beach", "Mountain", "City"}));
        view.setSelectedIndex(-1);
        view.setBorder(null);
        view.setRequestFocusEnabled(false);
        view.setBounds(664, 622, 83, 20);
        panel.add(view);

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
        editbutton.setBounds(820, 550, 50, 50);
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
        deletebutton.setBounds(820, 600, 50, 50);
        panel.add(deletebutton);

        checkin.setFont(new Font("Segoe Print", 0, 14));
        checkin.setForeground(new Color(87, 47, 37));
        checkin.setText("Check-in");
        checkin.setBounds(392, 532, 70, 26);
        panel.add(checkin);

        checkout.setFont(new Font("Segoe Print", 0, 14));
        checkout.setForeground(new Color(87, 47, 37));
        checkout.setText("Check-out");
        checkout.setBounds(390, 562, 80, 26);
        panel.add(checkout);

        Type.setFont(new Font("Segoe Print", 0, 14));
        Type.setForeground(new Color(87, 47, 37));
        Type.setText("Type");
        Type.setBounds(473, 590, 40, 26);
        panel.add(Type);

        Category.setFont(new Font("Segoe Print", 0, 14));
        Category.setForeground(new Color(87, 47, 37));
        Category.setText("Category");
        Category.setBounds(564, 590, 75, 26);
        panel.add(Category);

        View.setFont(new Font("Segoe Print", 0, 14));
        View.setForeground(new Color(87, 47, 37));
        View.setText("View");
        View.setBounds(680, 590, 40, 26);
        panel.add(View);

        Daylabel.setFont(new Font("Segoe Print", 0, 14));
        Daylabel.setForeground(new Color(87, 47, 37));
        Daylabel.setText("Day");
        Daylabel.setBounds(502, 500, 33, 26);
        panel.add(Daylabel);

        Monthlabel.setFont(new Font("Segoe Print", 0, 14));
        Monthlabel.setForeground(new Color(87, 47, 37));
        Monthlabel.setText("Month");
        Monthlabel.setBounds(580, 500, 46, 26);
        panel.add(Monthlabel);

        Yearlabel.setFont(new Font("Segoe Print", 0, 14));
        Yearlabel.setForeground(new Color(87, 47, 37));
        Yearlabel.setText("Year");
        Yearlabel.setBounds(672, 500, 40, 26);
        panel.add(Yearlabel);

        table.setBackground(new Color(184, 153, 132));
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
        tablepane.setBackground(new Color(255, 255, 255,0));
        table.setFocusable(false);
        table.setSelectionBackground(new Color(87, 47, 37));
        table.setSelectionForeground(new Color(255, 255, 255));
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        tablepane.setBounds(310, 210, 580, 230);
        panel.add(tablepane);

        Background.setIcon(new ImageIcon("src/mainPackage/images/3.png"));
        Background.setBounds(0, 0, 1000, 700);
        panel.add(Background);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 1000, 700);

        pack();
        setLocationRelativeTo(null);
    }

    private void logoutMouseReleased(ActionEvent evt) {
        System.exit(0);
        Welcome w = new Welcome();
        w.setVisible(true);
       
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
        table.clearSelection();
    }

    private void formMouseDragged(MouseEvent evt) {
        int newX = getLocation().x + evt.getX() - posX;
        int newY = getLocation().y + evt.getY() - posY;
        // Set the new position of the frame
        setLocation(newX, newY);
    }

    private void addbuttonActionPerformed(ActionEvent evt) {
        if(day_checkin.getText().isEmpty()||month_checkin.getText().isEmpty()||year_checkin.getText().isEmpty()||month_checkout.getText().isEmpty()||day_checkout.getText().isEmpty()||year_checkout.getText().isEmpty()||type.getSelectedIndex() == -1 || category.getSelectedIndex() == -1 || view.getSelectedIndex() == -1){
            Warning1 d = new Warning1(this , true,"");
            d.setVisible(true);
        }
        else{
            String data[] ={(String) day_checkin.getText()+"/"+(String) month_checkin.getText()+"/"+(String) year_checkin.getText(),(String) day_checkout.getText()+"/"+(String) month_checkout.getText()+"/"+(String) year_checkout.getText(),(String) type.getSelectedItem(),(String) category.getSelectedItem(),(String) view.getSelectedItem(),"Pending"};
            DefaultTableModel tab = (DefaultTableModel)table.getModel();
            tab.addRow(data);
        }
    }

    private void addbuttonMousePressed(MouseEvent evt) {
        addbutton.setIcon(new ImageIcon("src/mainPackage/images/ajouter-37.png"));
    }
    private void addbuttonMouseReleased(MouseEvent evt) {
        addbutton.setIcon(new ImageIcon("src/mainPackage/images/add-37.png"));
    }

    private void tableMouseClicked(MouseEvent evt) {
        DefaultTableModel tab = (DefaultTableModel)table.getModel();

        String[] in = tab.getValueAt(table.getSelectedRow(), 0).toString().split("/");
        String[] out = tab.getValueAt(table.getSelectedRow(), 1).toString().split("/");
        String t = tab.getValueAt(table.getSelectedRow(),2).toString();
        String c = tab.getValueAt(table.getSelectedRow(),3).toString();
        String v = tab.getValueAt(table.getSelectedRow(),4).toString();

        day_checkin.setText(in[0]);
        month_checkin.setText(in[1]);
        year_checkin.setText(in[2]);
        day_checkout.setText(out[0]);
        month_checkout.setText(out[1]);
        year_checkout.setText(out[2]);
        type.setSelectedItem(t);
        category.setSelectedItem(c);
        view.setSelectedItem(v);

    }

    private void editbuttonActionPerformed(ActionEvent evt) {
        DefaultTableModel tab = (DefaultTableModel)table.getModel();
        if(table.getSelectedRowCount()==1){

            String date_in = (String) day_checkin.getText()+"/"+(String) month_checkin.getText()+"/"+(String) year_checkin.getText();
            String date_out = (String) day_checkout.getText()+"/"+(String) month_checkout.getText()+"/"+(String) year_checkout.getText();
            String t = (String) type.getSelectedItem();
            String c = (String) category.getSelectedItem();
            String v = (String) view.getSelectedItem();

            tab.setValueAt(date_in,table.getSelectedRow(),0);
            tab.setValueAt(date_out,table.getSelectedRow(),1);
            tab.setValueAt(t,table.getSelectedRow(),2);
            tab.setValueAt(c,table.getSelectedRow(),3);
            tab.setValueAt(v,table.getSelectedRow(),4);

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

    private void editbuttonMousePressed(MouseEvent evt) {
        editbutton.setIcon(new ImageIcon("src/mainPackage/images/modify-40.png"));

    }

    private void editbuttonMouseReleased(MouseEvent evt) {
        editbutton.setIcon(new ImageIcon("src/mainPackage/images/edit-40.png"));

    }

    private void deletebuttonActionPerformed(ActionEvent evt) {
        DefaultTableModel tab = (DefaultTableModel) table.getModel();
        if (table.getSelectedRowCount() == 1) {
            tab.removeRow(table.getSelectedRow());
        } else {
            if (table.getRowCount() == 0) {
                Warning1 d = new Warning1(this, true,"Select a row to delete");
                d.setVisible(true);
            } else {
                Warning1 d = new Warning1(this, true,"");
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
               // new Principal_client(user).setVisible(true);

    }
}



