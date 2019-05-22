package controller;

import model.Classes.Componente;
import model.Classes.Tienda;
import view.DialogAdd;

/**
 *
 * @author mangh
 */
public class DialogControllers {

    public static void addArticulo(DialogAdd add, Tienda t) {
        String s = add.getActual();
        String id, nombre, desc, fab, comp = "";
        float precio = 0f;
        int unidades, dd, mm, yy = 0;

        switch (s) {
            case ("comp"): {
                id = add.getComp().getTxtId().getText();
                nombre = add.getComp().getTxtNom().getText();
                desc = add.getComp().getTxtDesc().getText();
                fab = add.getComp().getTxtFab().getText();
                comp = add.getComp().getCbTipo().getSelectedItem().toString();
                precio = Float.parseFloat(add.getComp().getTxtPre().getText());
                unidades = Integer.parseInt(add.getComp().getTxtUds().getText());
                dd = Integer.parseInt(add.getComp().getTxtUds().getText());
                mm = Integer.parseInt(add.getComp().getTxtUds().getText());
                yy = Integer.parseInt(add.getComp().getTxtUds().getText());

                t.getComponentes().add(new Componente());
                break;
            }

            case ("mov"): {

                break;
            }

            case ("tab"): {

                break;
            }
        }
    }

    public static void rmArticulo() {

    }

    public static void aceptarVenta() {

    }

    public static void listarProductos() {

    }

}
