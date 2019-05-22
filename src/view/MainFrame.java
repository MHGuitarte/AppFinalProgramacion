package view;

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
        this.setSize(640, 480);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mb = new Main_MenuBar();
        lBack = new JLabel();
        lBack.setIcon(new ImageIcon(getClass().getResource("/view/Resources/back.png"))); //Así es la única manera de abrir esto en Linux

        this.setJMenuBar(mb);
        this.add(lBack);

        this.setVisible(true);
    }

    public Main_MenuBar getMb() {
        return mb;
    }

}
