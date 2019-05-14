package view.panels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author manuel
 */
public class AddComponente extends JPanel {

    private JComboBox cbTipo;
    private JLabel lId, lNom, lPre, lUds, lDesc, lTipo, lFab;
    private JTextField txtId, txtNom, txtPre, txtUds, txtDesc, txtTipo, txtFab;

    public AddComponente() {

        cbTipo = new JComboBox();

        lId = new JLabel("Identificador");
        lNom = new JLabel("Nombre");
        lPre = new JLabel("Precio");
        lUds = new JLabel("Unidades");
        lDesc = new JLabel("Descripción");
        lTipo = new JLabel("Componente");
        lFab = new JLabel("Fabricante");

        txtId = new JTextField(15);
        txtNom = new JTextField(15);
        txtPre = new JTextField(15);
        txtUds = new JTextField(15);
        txtDesc = new JTextField(15);
        txtFab = new JTextField(15);

        Border borderLabel = BorderFactory.createEmptyBorder(20, 5, 20, 5);
        Border borderTxt = BorderFactory.createEmptyBorder(5, 20, 5, 20);

        lId.setBorder(borderLabel);
        lNom.setBorder(borderLabel);
        lPre.setBorder(borderLabel);
        lUds.setBorder(borderLabel);
        lDesc.setBorder(borderLabel);
        lTipo.setBorder(borderLabel);
        lFab.setBorder(borderLabel);

        txtId.setBorder(borderTxt);
        txtNom.setBorder(borderTxt);
        txtPre.setBorder(borderTxt);
        txtUds.setBorder(borderTxt);
        txtDesc.setBorder(borderTxt);
        txtFab.setBorder(borderTxt);
        cbTipo.setBorder(borderTxt);

        //LAYOUTS
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridheight = 1;
        gbc.gridwidth = 1;

//Identificador
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(lId, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(txtId, gbc);

//Nombre
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(lNom, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        this.add(txtNom, gbc);

//Precio
        gbc.gridx = 0;
        gbc.gridy = 4;
        this.add(lPre, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        this.add(txtPre, gbc);

//Unidades
        gbc.gridx = 0;
        gbc.gridy = 6;
        this.add(lUds, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        this.add(txtUds, gbc);

//Descripción
        gbc.gridx = 0;
        gbc.gridy = 8;
        this.add(lDesc, gbc);

        gbc.gridx = 1;
        gbc.gridy = 8;
        this.add(txtDesc, gbc);

//Tipo(Enum)
        gbc.gridx = 2;
        gbc.gridy = 0;
        this.add(lTipo, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        this.add(cbTipo, gbc);

//Fabricante
        gbc.gridx = 2;
        gbc.gridy = 2;
        this.add(lFab, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        this.add(txtFab, gbc);

    }

    public JComboBox getCbTipo() {
        return cbTipo;
    }

    public JLabel getlId() {
        return lId;
    }

    public JLabel getlNom() {
        return lNom;
    }

    public JLabel getlPre() {
        return lPre;
    }

    public JLabel getlUds() {
        return lUds;
    }

    public JLabel getlDesc() {
        return lDesc;
    }

    public JLabel getlTipo() {
        return lTipo;
    }

    public JLabel getlFab() {
        return lFab;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public JTextField getTxtNom() {
        return txtNom;
    }

    public JTextField getTxtPre() {
        return txtPre;
    }

    public JTextField getTxtUds() {
        return txtUds;
    }

    public JTextField getTxtDesc() {
        return txtDesc;
    }

    public JTextField getTxtTipo() {
        return txtTipo;
    }

    public JTextField getTxtFab() {
        return txtFab;
    }

}
