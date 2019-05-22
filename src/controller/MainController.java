/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import model.Classes.Tienda;
import view.MainFrame;
import view.Main_MenuBar;

/**
 *
 * @author mangh
 */
public class MainController {

    private static final MainFrame mf = new MainFrame();
    private static final Main_MenuBar mb = mf.getMb();
    private static Tienda tMain;
    private static Tienda tAux;

    public MainController() {
//Asignamos las distintas acciones a los distintos botones y opciones
        mb.getMiNuevo().addActionListener((ActionEvent ev) -> {
            Orders.nuevo(mf);
        });
        mb.getMiAbrir().addActionListener((ActionEvent ev) -> Orders.abrir(mf));
        mb.getMiGuardar().addActionListener((ActionEvent ev) -> Orders.guardar(mf));
        mb.getMiGuardarComo().addActionListener((ActionEvent ev) -> Orders.guardarComo(mf));
        mb.getMiSalir().addActionListener((ActionEvent ev) -> System.exit(0));
        mb.getMiAddProducto().addActionListener((ActionEvent ev) -> Orders.addProducto(mf));
        mb.getMiRmProducto().addActionListener((ActionEvent ev) -> Orders.rmProducto(mf));
        mb.getMiVenta().addActionListener((ActionEvent ev) -> Orders.venta(mf));
        mb.getMiShowProductos().addActionListener((ActionEvent ev) -> Orders.mostrar(mf));
        mb.getMiAyuda().addActionListener((ActionEvent ev) -> Orders.ayuda(mf));
        mb.getMiAbout().addActionListener((ActionEvent ev) -> Orders.about(mf));

    }

    public static Tienda gettMain() {
        return tMain;
    }

    public static Tienda gettAux() {
        return tAux;
    }

    public static MainFrame getMf() {
        return mf;
    }

    public static Main_MenuBar getMb() {
        return mb;
    }

}
