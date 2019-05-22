package main;

import controller.MainController;
import java.io.IOException;

/**
 *
 * @author manuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        MainController controller = new MainController();
        
        /*ESTO FUNCIONA BIEN, HAY QUE IMPLEMENTARLO EN EL CONTROLADOR
        
        ArrayList<Movil> ms = new ArrayList<>();
        ArrayList<Tablet> tb = new ArrayList<>();
        ArrayList<Componente> cm = new ArrayList<>();

        ms.add(new Movil("we", "wegwe", "eqfwe3", 31.0f, LocalDate.of(2010, 10, 10), 4, 12, 8, "wewfwr", SO.ANDROID, MARCAMOVIL.SAMSUNG, MODELOMOVIL.S10));
        ms.add(new Movil("we", "wegwe", "eqfwe3", 31.0f, LocalDate.of(2010, 10, 10), 4, 12, 8, "wewfwr", SO.ANDROID, MARCAMOVIL.SAMSUNG, MODELOMOVIL.S10));

        tb.add(new Tablet("we", "3354", "eqfwe3", 31.0f, LocalDate.of(2010, 10, 10), 4, "wrgwr4", 3, 73.0f, MARCATABLET.HUAWEI, MODELOTABLET.T5));
        tb.add(new Tablet("we", "3354", "eqfwe3", 31.0f, LocalDate.of(2010, 10, 10), 4, "wrgwr4", 3, 73.0f, MARCATABLET.HUAWEI, MODELOTABLET.T5));

        cm.add(new Componente("23twe", "3354", "eqfwe3", 31.0f, LocalDate.of(2010, 10, 10), 4, "wrgwr4", COMPONENTE.HDD));
        cm.add(new Componente("23twe", "3354", "eqfwe3", 31.0f, LocalDate.of(2010, 10, 10), 4, "wrgwr4", COMPONENTE.MOTHERBOARD));

        Tienda t = new Tienda(tb, ms, cm);

        ObjectOutputStream oos;
        ObjOutStream ost;

        File f = new File("ejemplo.dat");

        oos = abrirOOS(f);
        ost = abrirOST(f);

        guardarTienda(f, oos, ost, t);

        cerrarOOS(oos);
        cerrarOST(ost);

        File f1 = new File("ejemplo.dat");
        ObjectInputStream ois;

        ois = abrirOIS(f1);

        Tienda tVuelta = leerTienda(f1, ois);
        System.out.println(tVuelta.getMoviles().get(0).getNombre());
         */
    }

}
