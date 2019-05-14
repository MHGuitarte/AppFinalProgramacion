/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.DialogAdd;
import view.DialogMostrar;
import view.DialogRemove;
import view.DialogVenta;
import view.MainFrame;

/**
 *
 * @author mangh
 */
public class Orders {

    public static void nuevo(MainFrame mf) {

    }

    public static void abrir(MainFrame mf) {

    }

    public static void guardar(MainFrame mf) {

    }

    public static void guardarComo(MainFrame mf) {

    }

    public static void addProducto(MainFrame mf) {
        DialogAdd dAdd = new DialogAdd(mf);
    }

    public static void rmProducto(MainFrame mf) {
        DialogRemove dRm = new DialogRemove(mf);
    }

    public static void venta(MainFrame mf) {
        DialogVenta dVen = new DialogVenta(mf);
    }

    public static void mostrar(MainFrame mf) {
        DialogMostrar dMos = new DialogMostrar(mf);
    }

    public static void ayuda(MainFrame mf) {

    }

    public static void about(MainFrame mf) {

    }

}
