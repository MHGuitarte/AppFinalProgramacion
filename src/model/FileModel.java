/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Classes.Tienda;

/**
 *
 * @author manghur
 */
public class FileModel {

    public static File newFile(String fileName) throws IOException {

        File f = new File(fileName);

        if (!f.exists()) {
            f.createNewFile();
        }

        return f;
    }
    
    //Manipulación básica de ficheros binarios
    public static ObjectOutputStream abrirOOS(File f) throws FileNotFoundException, IOException {
        FileOutputStream out = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(out);

        return oos;
    }

    public static ObjOutStream abrirOST(File f) throws FileNotFoundException, IOException {
        FileOutputStream out = new FileOutputStream(f, true);
        ObjOutStream ost = new ObjOutStream(out);

        return ost;
    }

    public static ObjectInputStream abrirOIS(File f) throws FileNotFoundException, IOException {
        FileInputStream in = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(in);
        return ois;

    }

    public static void cerrarOOS(ObjectOutputStream oos) throws IOException {
        oos.close();
    }

    public static void cerrarOST(ObjOutStream ost) throws IOException {
        ost.close();

    }

    public static void cerrarOIS(ObjectInputStream ois) throws IOException {
        ois.close();
    }
//Fin de manipulación básica de ficheros binarios
    
    //Escritura de Tienda
    public static void guardarTienda(File f, ObjectOutputStream out, ObjOutStream ost, Tienda t) throws IOException {

        if (f.length() > 0) {

            ost.writeUnshared(t);

        } else {

            out.writeObject(t);
        }

    }
    
    public static Tienda leerTienda(File f, ObjectInputStream ois) throws IOException {

        Tienda t = new Tienda();

        while (true) {
            try {
                t = (Tienda) ois.readObject();
            } catch (Exception e) {
                System.out.println("Archivo leído");
                ois.close();
                break;
            }
        }

        return t;

    }
    
}
