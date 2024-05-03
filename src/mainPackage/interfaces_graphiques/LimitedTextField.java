package mainPackage.interfaces_graphiques;

import javax.swing.*;

public class LimitedTextField extends JTextField {
    public LimitedTextField(int n) {
        super();
        setDocument(new JTextFieldLimit(n)); // Limite à n caractères
    }
}
