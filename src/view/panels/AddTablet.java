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
public class AddTablet extends JPanel {

    private JComboBox cbMarca, cbModelo;
    private JLabel lId, lNom, lPre, lUds, lDesc, lMarca, lModelo, lPan, lMem, lCPU;
    private JTextField txtId, txtNom, txtPre, txtUds, txtDesc, txtPan, txtMem, txtCPU;

    public AddTablet() {

        cbMarca = new JComboBox();
        cbModelo = new JComboBox();

        lId = new JLabel("Identificador");
        lNom = new JLabel("Nombre");
        lPre = new JLabel("Precio");
        lUds = new JLabel("Unidades");
        lDesc = new JLabel("Descripción");
        lMarca = new JLabel("Marca");
        lModelo = new JLabel("Modelo");
        lPan = new JLabel("Pantalla");
        lMem = new JLabel("Memoria");
        lCPU = new JLabel("Procesador");

        txtId = new JTextField(15);
        txtNom = new JTextField(15);
        txtPre = new JTextField(15);
        txtUds = new JTextField(15);
        txtDesc = new JTextField(15);
        txtPan = new JTextField(15);
        txtMem = new JTextField(15);
        txtCPU = new JTextField(15);

        Border borderLabel = BorderFactory.createEmptyBorder(20, 5, 20, 5);
        Border borderTxt = BorderFactory.createEmptyBorder(5, 20, 5, 20);

        lId.setBorder(borderLabel);
        lNom.setBorder(borderLabel);
        lPre.setBorder(borderLabel);
        lUds.setBorder(borderLabel);
        lDesc.setBorder(borderLabel);
        lMarca.setBorder(borderLabel);
        lModelo.setBorder(borderLabel);
        lPan.setBorder(borderLabel);
        lMem.setBorder(borderLabel);
        lCPU.setBorder(borderLabel);

        txtId.setBorder(borderTxt);
        txtNom.setBorder(borderTxt);
        txtPre.setBorder(borderTxt);
        txtUds.setBorder(borderTxt);
        txtDesc.setBorder(borderTxt);
        txtPan.setBorder(borderTxt);
        txtMem.setBorder(borderTxt);
        txtCPU.setBorder(borderTxt);

        cbMarca.setBorder(borderTxt);
        cbModelo.setBorder(borderTxt);

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

//Marca(Enum)
        gbc.gridx = 2;
        gbc.gridy = 0;
        this.add(lMarca, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        this.add(cbMarca, gbc);

//Modelo (Enum)
        gbc.gridx = 2;
        gbc.gridy = 2;
        this.add(lModelo, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        this.add(cbModelo, gbc);

//Pantalla
        gbc.gridx = 2;
        gbc.gridy = 4;
        this.add(lPan, gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        this.add(txtPan, gbc);

//Memoria
        gbc.gridx = 2;
        gbc.gridy = 6;
        this.add(lMem, gbc);

        gbc.gridx = 3;
        gbc.gridy = 6;
        this.add(txtMem, gbc);

//Procesador
        gbc.gridx = 2;
        gbc.gridy = 8;
        this.add(lCPU, gbc);

        gbc.gridx = 3;
        gbc.gridy = 8;
        this.add(txtCPU, gbc);

    }

    public JComboBox getCbMarca() {
        return cbMarca;
    }

    public JComboBox getCbModelo() {
        return cbModelo;
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

    public JLabel getlMarca() {
        return lMarca;
    }

    public JLabel getlModelo() {
        return lModelo;
    }

    public JLabel getlPan() {
        return lPan;
    }

    public JLabel getlMem() {
        return lMem;
    }

    public JLabel getlCPU() {
        return lCPU;
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

    public JTextField getTxtPan() {
        return txtPan;
    }

    public JTextField getTxtMem() {
        return txtMem;
    }

    public JTextField getTxtCPU() {
        return txtCPU;
    }
    
}
