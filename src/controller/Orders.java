/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Classes.Tienda;
import static model.FileModel.abrirOIS;
import static model.FileModel.abrirOOS;
import static model.FileModel.abrirOST;
import static model.FileModel.cerrarOIS;
import static model.FileModel.cerrarOOS;
import static model.FileModel.cerrarOST;
import static model.FileModel.guardarTienda;
import static model.FileModel.leerTienda;
import model.ObjOutStream;
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
        dAdd.getBtnAdd().addActionListener((ActionEvent ev) -> {});
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
