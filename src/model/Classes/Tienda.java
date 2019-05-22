/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Classes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author manghur
 */
public class Tienda implements Serializable {

    private ArrayList<Tablet> tablets;
    private ArrayList<Movil> moviles;
    private ArrayList<Componente> componentes;

    public Tienda() {
    }

    public Tienda(ArrayList<Tablet> tablets, ArrayList<Movil> moviles, ArrayList<Componente> componentes) {
        this.tablets = tablets;
        this.moviles = moviles;
        this.componentes = componentes;
    }

    public ArrayList<Tablet> getTablets() {
        return tablets;
    }

    public void setTablets(ArrayList<Tablet> tablets) {
        this.tablets = tablets;
    }

    public ArrayList<Movil> getMoviles() {
        return moviles;
    }

    public void setMoviles(ArrayList<Movil> moviles) {
        this.moviles = moviles;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

}
