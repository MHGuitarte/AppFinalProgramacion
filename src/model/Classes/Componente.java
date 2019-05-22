/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Classes;

import java.io.Serializable;
import java.time.LocalDate;
import model.Interfaces.Descontable;

/**
 *
 * @author manghur
 */
public class Componente extends Producto implements Descontable, Serializable {

    public enum COMPONENTE implements Serializable {

        CPU, RAM, HDD, SDD, GRAFICA, MOTHERBOARD, TORRE, VENTILADOR;

    }

    private String fabricante;
    private COMPONENTE tipoComponente;

    public Componente() {
    }

    public Componente(String id, String nombre, String descripcion, float precio, LocalDate fechaRecepcion, int unidades, String fabricante, COMPONENTE tipoComponente) {
        super(id, nombre, descripcion, precio, fechaRecepcion, unidades);
        this.fabricante = fabricante;
        this.tipoComponente = tipoComponente;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public COMPONENTE getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(COMPONENTE tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

}
