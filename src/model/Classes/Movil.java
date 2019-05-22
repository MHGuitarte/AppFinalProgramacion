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
public class Movil extends Producto implements Descontable, Serializable {

    public enum SO implements Serializable {
        OSX, ANDROID;
    }

    public enum MARCAMOVIL implements Serializable {
        APPLE("OSX"), SAMSUNG("ANDROID"), HUAWEI("ANDROID"), XIAOMI("ANDROID"), BQ("ANDROID");

        private final String so;

        private MARCAMOVIL(String so) {
            this.so = so;
        }

        public String getSo() {
            return so;
        }

    }

    public enum MODELOMOVIL implements Serializable {
        iPHONE_XS(MARCAMOVIL.APPLE),
        iPHONE_8(MARCAMOVIL.APPLE),
        iPHONE_XR(MARCAMOVIL.APPLE),
        iPHONE_7(MARCAMOVIL.APPLE),
        iPHONE_5(MARCAMOVIL.APPLE),
        S10(MARCAMOVIL.SAMSUNG),
        S10E(MARCAMOVIL.SAMSUNG),
        S9(MARCAMOVIL.SAMSUNG),
        J9(MARCAMOVIL.SAMSUNG),
        A7(MARCAMOVIL.SAMSUNG),
        P30(MARCAMOVIL.HUAWEI),
        P30_PRO(MARCAMOVIL.HUAWEI),
        P_SMART(MARCAMOVIL.HUAWEI),
        MATE_20(MARCAMOVIL.HUAWEI),
        MATE_20_PRO(MARCAMOVIL.HUAWEI),
        MI_MAX_3(MARCAMOVIL.XIAOMI),
        MI_9_PRO(MARCAMOVIL.XIAOMI),
        MI_A2(MARCAMOVIL.XIAOMI),
        MI_A2_LITE(MARCAMOVIL.XIAOMI),
        REDMI_NOTE_7(MARCAMOVIL.XIAOMI);

        private final MARCAMOVIL marca;

        private MODELOMOVIL(MARCAMOVIL marca) {
            this.marca = marca;
        }

        public MARCAMOVIL getMarca() {
            return marca;
        }

    }

    private int camara, memoria;

    private String cpu;

    private SO so;
    private MARCAMOVIL marca;
    private MODELOMOVIL modelo;

    public Movil() {

    }

    public Movil(String id, String nombre, String descripcion, float precio, LocalDate fechaRecepcion, int unidades, int camara, int memoria, String cpu, SO so, MARCAMOVIL marca, MODELOMOVIL modelo) {
        super(id, nombre, descripcion, precio, fechaRecepcion, unidades);
        this.camara = camara;
        this.memoria = memoria;
        this.cpu = cpu;
        this.so = so;
        this.marca = marca;
        this.modelo = modelo;

    }

    public int getCamara() {
        return camara;
    }

    public void setCamara(int camara) {
        this.camara = camara;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public SO getSo() {
        return so;
    }

    public void setSo(SO so) {
        this.so = so;
    }

    public MARCAMOVIL getMarca() {
        return marca;
    }

    public void setMarca(MARCAMOVIL marca) {
        this.marca = marca;
    }

    public MODELOMOVIL getModelo() {
        return modelo;
    }

    public void setModelo(MODELOMOVIL modelo) {
        this.modelo = modelo;
    }

}
