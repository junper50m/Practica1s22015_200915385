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
public class MLista {
    private final MLNodo Comienzo;
    public MLista()
    {
        this.Comienzo = new MLNodo();
    }
    public void Fila(int x)
    {
        MLNodo Aux = getComienzo();
        while(Aux != null){
            if(Aux.getI() < x)
            {
                MLNodo nuevo = new MLNodo();
                nuevo.setI(Aux.getI()+1);
                Aux.setNext(nuevo);
                nuevo.setBack(Aux);
            }
            Aux = Aux.getNext();
        }
    }

    public void Columna(int y)
    {
        MLNodo Aux = getComienzo();
        while(Aux != null){
            if(Aux.getJ() < y)
            {
                MLNodo nuevo = new MLNodo();
                nuevo.setJ(Aux.getJ()+1);
                Aux.setNext(nuevo);
                nuevo.setBack(Aux);
            }
            Aux = Aux.getNext();
        }
    }
    
    public MLNodo getComienzo() {
        return Comienzo;
    }
    
}