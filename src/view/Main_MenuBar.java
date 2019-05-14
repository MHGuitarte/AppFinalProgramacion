package view;

import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import static java.awt.event.ActionEvent.ALT_MASK;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;

/**
 *
 * @author manuel
 */
public class Main_MenuBar extends JMenuBar {

    private JMenu menuArchivo, menuProductos, menuVentas, menuMostrar, menuAyuda;

    //Items del menú archivo
    private JMenuItem miNuevo, miAbrir, miGuardar, miGuardarComo, miSalir;

    //Items del menú productos
    private JMenuItem miAddProducto, miRmProducto;

    //Items del menú ventas
    private JMenuItem miVenta;

    //Items del menú mostrar
    private JMenuItem miShowProductos;

    //Items del menú ayuda
    private JMenuItem miAyuda, miAbout;

    public Main_MenuBar() {

        menuArchivo = new JMenu("Archivo");
        menuProductos = new JMenu("Productos");
        menuVentas = new JMenu("Ventas");
        menuMostrar = new JMenu("Mostrar");
        menuAyuda = new JMenu("Ayuda");

        miNuevo = new JMenuItem("Nuevo");
        miAbrir = new JMenuItem("Abrir...");
        miGuardar = new JMenuItem("Guardar");
        miGuardarComo = new JMenuItem("Guardar Como...");
        miSalir = new JMenuItem("Salir");

        miAddProducto = new JMenuItem("Añadir Producto");
        miRmProducto = new JMenuItem("Eliminar Producto");

        miVenta = new JMenuItem("Realizar Venta");

        miShowProductos = new JMenuItem("Mostrar Productos");

        miAyuda = new JMenuItem("Ver ayuda");
        miAbout = new JMenuItem("Acerca de...");

        //Atajos de teclado (Esto va aquí?)
        miNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        //Este atajo de teclado era CTRL + A, pero se ha modificado por CTRL + O ya que genera conflicto con otro atajo de teclado.
        miAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        miGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        miGuardarComo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK + ALT_MASK));
        miSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));

        miAddProducto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        miRmProducto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));

        miVenta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));

        miShowProductos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));

        miAyuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, ActionEvent.SHIFT_MASK));
        miAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));

        menuArchivo.add(miNuevo);
        menuArchivo.add(miAbrir);
        menuArchivo.add(miGuardar);
        menuArchivo.add(miGuardarComo);
        menuArchivo.add(new JSeparator());
        menuArchivo.add(miSalir);

        menuProductos.add(miAddProducto);
        menuProductos.add(miRmProducto);

        menuVentas.add(miVenta);

        menuMostrar.add(miShowProductos);

        menuAyuda.add(miAyuda);
        menuAyuda.add(miAbout);

        this.add(menuArchivo);
        this.add(menuProductos);
        this.add(menuVentas);
        this.add(menuMostrar);
        this.add(menuAyuda);
        
    }

    public JMenuItem getMiNuevo() {
        return miNuevo;
    }

    public JMenuItem getMiAbrir() {
        return miAbrir;
    }

    public JMenuItem getMiGuardar() {
        return miGuardar;
    }

    public JMenuItem getMiGuardarComo() {
        return miGuardarComo;
    }

    public JMenuItem getMiSalir() {
        return miSalir;
    }

    public JMenuItem getMiAddProducto() {
        return miAddProducto;
    }

    public JMenuItem getMiRmProducto() {
        return miRmProducto;
    }

    public JMenuItem getMiVenta() {
        return miVenta;
    }

    public JMenuItem getMiShowProductos() {
        return miShowProductos;
    }

    public JMenuItem getMiAyuda() {
        return miAyuda;
    }

    public JMenuItem getMiAbout() {
        return miAbout;
    }

}
