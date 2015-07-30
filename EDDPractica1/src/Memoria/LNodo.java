/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

/**
 *
 * @author JP
 */
public class LNodo {
    private int info;
    private LNodo Siguiente;
    private LNodo Atras;
    public LNodo()
    {
        info = 0;
        Siguiente = null;
        Atras = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
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
