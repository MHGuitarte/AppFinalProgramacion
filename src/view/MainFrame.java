package view;

import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author manuel
 */
public class MainFrame extends JFrame {

    private Main_MenuBar mb;
    private JLabel lBack;

    public MainFrame() {
        this.setTitle("Tienda");
        JFrame esto = this;
        this.setSize(640, 480);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mb = new Main_MenuBar();
        lBack = new JLabel();
        lBack.setIcon(new ImageIcon("src/view/resources/back.png"));

        this.setJMenuBar(mb);
        this.add(lBack);

        mb.getMiAddProducto().addActionListener((ActionEvent ev) -> {

            DialogAdd dAdd = new DialogAdd(esto);
        });

        mb.getMiRmProducto().addActionListener((ActionEvent ev) -> {

            DialogRemove dRm = new DialogRemove(esto);
        });

        mb.getMiSalir().addActionListener((ActionEvent ev) -> {

            System.exit(0);
        });

        mb.getMiVenta().addActionListener((ActionEvent ev) -> {
            DialogVenta dVen = new DialogVenta(esto);
        });

        mb.getMiShowProductos().addActionListener((ActionEvent ev) -> {
            DialogMostrar dMos = new DialogMostrar(esto);
        });

        this.setVisible(true);
    }

    public Main_MenuBar getMb() {
        return mb;
    }

}
