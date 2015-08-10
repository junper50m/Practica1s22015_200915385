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
public class LNodo {
    private String Nombre;
    private int Id;
    private int Tipo;
    private JLabel Imagen;
    private LNodo Siguiente;
    private LNodo Atras;
    public LNodo()
    {
        Nombre = "";
        Id = 0;
        Tipo = 0;
        Imagen = null;
        Siguiente = null;
        Atras = null;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public JLabel getImagen() {
        return Imagen;
    }

    public void setImagen(JLabel imagen) {
        this.Imagen = imagen;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int tipo) {
        this.Tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public LNodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(LNodo Siguiente) {
        this.Siguiente = Siguiente;
    }

    public LNodo getAtras() {
        return Atras;
    }

    public void setAtras(LNodo Atras) {
        this.Atras = Atras;
    }
    
}
