/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Interfaces;

/**
 *
 * @author manghur
 */
public abstract interface Descontable{

    public static float calcularPrecio(float precio) {
        return precio / 2;
    }

}
