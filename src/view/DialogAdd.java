package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import view.Panels.AddComponente;
import view.Panels.AddMovil;
import view.Panels.AddTablet;

/**
 *
 * @author manuel
 */
public class DialogAdd extends JDialog {

    private JPanel pMain, pSelector, pBotones, pAux;
    private JButton btnAdd, btnSalir;
    private ButtonGroup gpProductos;
    private JRadioButton rbComp, rbTablet, rbMovil;

    private AddComponente comp;
    private AddMovil mov;
    private AddTablet tab;

    private String actual;

    public DialogAdd(JFrame owner) {
        super(owner);

        comp = new AddComponente();
        mov = new AddMovil();
        tab = new AddTablet();

        this.setTitle("Añadir Producto");
        this.setSize(640, 480);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        pMain = new JPanel();
        pSelector = new JPanel();
        pBotones = new JPanel();

        pAux = new JPanel();

        btnAdd = new JButton("Añadir");
        btnSalir = new JButton("Salir");

        gpProductos = new ButtonGroup();

        rbComp = new JRadioButton("Componente");
        rbTablet = new JRadioButton("Tablet");
        rbMovil = new JRadioButton("Móvil");

        //LAYOUTS
        pMain.setLayout(new BorderLayout());
        pSelector.setLayout(new FlowLayout());
        pBotones.setLayout(new FlowLayout(FlowLayout.RIGHT));

        CardLayout cly = new CardLayout();

        pAux.setLayout(cly);

        pSelector.setBorder(BorderFactory.createTitledBorder("Producto"));

        //Se introducen elementos en contenedores
        gpProductos.add(rbComp);
        gpProductos.add(rbTablet);
        gpProductos.add(rbMovil);

        pSelector.add(rbComp);
        pSelector.add(rbTablet);
        pSelector.add(rbMovil);

        pBotones.add(btnAdd);
        pBotones.add(btnSalir);

        pAux.add(comp, "componente");
        pAux.add(mov, "movil");
        pAux.add(tab, "tablet");

        pMain.add(pSelector, BorderLayout.NORTH);
        pMain.add(pAux, BorderLayout.CENTER);
        pMain.add(pBotones, BorderLayout.SOUTH);

        rbComp.setSelected(true);

        comp.setName("comp");
        mov.setName("mov");
        tab.setName("tab");

        actual = pAux.getComponent(0).getName();
        
        rbComp.addActionListener((ActionEvent ev) -> {

            cly.show(pAux, "componente");
            actual = pAux.getComponent(0).getName();
            System.out.println(actual);
        });

        rbMovil.addActionListener((ActionEvent ev) -> {

            cly.show(pAux, "movil");
            actual = pAux.getComponent(1).getName();
            System.out.println(actual);
        });

        rbTablet.addActionListener((ActionEvent ev) -> {

            cly.show(pAux, "tablet");
            actual = pAux.getComponent(2).getName();
            System.out.println(actual);
        });
         
        this.add(pMain);
        this.setResizable(false);
        this.setVisible(true);

    }

    public JPanel getpMain() {
        return pMain;
    }

    public JPanel getpSelector() {
        return pSelector;
    }

    public JPanel getpBotones() {
        return pBotones;
    }

    public JPanel getpAux() {
        return pAux;
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public ButtonGroup getGpProductos() {
        return gpProductos;
    }

    public JRadioButton getRbComp() {
        return rbComp;
    }

    public JRadioButton getRbTablet() {
        return rbTablet;
    }

    public JRadioButton getRbMovil() {
        return rbMovil;
    }

    public AddComponente getComp() {
        return comp;
    }

    public AddMovil getMov() {
        return mov;
    }

    public AddTablet getTab() {
        return tab;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }
    
    
    
    

}
