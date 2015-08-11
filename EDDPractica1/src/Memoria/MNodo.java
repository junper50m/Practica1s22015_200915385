/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

import javax.swing.JLabel;

/**
 *
 * @author JP
 */
public class MNodo {
    private String Nombre;
    private JLabel Imagen;
    private int x;
    private int y;
    private MNodo Siguiente;
    private MNodo Atras;
    private MNodo Arriba;
    private MNodo Abajo;
    public MNodo()
    {
        this.Nombre = "";
        this.Imagen = null;
        this.x = -1;
        this.y = -1;
        this.Siguiente = null;
        this.Atras = null;
        this.Arriba = null;
        this.Abajo = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public JLabel getImagen() {
        return Imagen;
    }

    public void setImagen(JLabel Imagen) {
        this.Imagen = Imagen;
    }

   

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MNodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(MNodo Siguiente) {
        this.Siguiente = Siguiente;
    }

    public MNodo getAtras() {
        return Atras;
    }

    public void setAtras(MNodo Atras) {
        this.Atras = Atras;
    }

    public MNodo getArriba() {
        return Arriba;
    }

    public void setArriba(MNodo Arriba) {
        this.Arriba = Arriba;
    }

    public MNodo getAbajo() {
        return Abajo;
    }

    public void setAbajo(MNodo Abajo) {
        this.Abajo = Abajo;
    }

    
    
    
}
