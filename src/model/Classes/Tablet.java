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
public class Tablet extends Producto implements Descontable, Serializable {

    public enum MARCATABLET implements Serializable {
        HUAWEI, SAMSUNG, BQ;
    }

    public enum MODELOTABLET implements Serializable {
        T3("HUAWEI"),
        T5("HUAWEI"),
        S2("SAMSUNG"),
        A3("SAMSUNG"),
        EDISON("BQ"),
        CERVANTES("BQ");

        private final String marca;

        private MODELOTABLET(String marca) {
            this.marca = marca;
        }

        public String getMarca() {
            return marca;
        }

    }

    private String cpu;
    private int memoria;
    private float pantalla;

    private MARCATABLET marca;
    private MODELOTABLET modelo;

    public Tablet() {
    }

    public Tablet(String id, String nombre, String descripcion, float precio, LocalDate fechaRecepcion, int unidades, String cpu, int memoria, float pantalla, MARCATABLET marca, MODELOTABLET modelo) {
        super(id, nombre, descripcion, precio, fechaRecepcion, unidades);
        this.cpu = cpu;
        this.memoria = memoria;
        this.pantalla = pantalla;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public float getPantalla() {
        return pantalla;
    }

    public void setPantalla(float pantalla) {
        this.pantalla = pantalla;
    }

    public MARCATABLET getMarca() {
        return marca;
    }

    public void setMarca(MARCATABLET marca) {
        this.marca = marca;
    }

    public MODELOTABLET getModelo() {
        return modelo;
    }

    public void setModelo(MODELOTABLET modelo) {
        this.modelo = modelo;
    }

}
