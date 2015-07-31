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
    
    public void CrearMatriz(int x, int y)
    {
        Fila(x,y);
        Columna(x,y);
    }
    
    public void Fila(int x, int y)
    {
        MLNodo Aux = getComienzo();
        while(Aux != null){
            if(Aux.getI() < x)
            {
                MLNodo nuevo = new MLNodo();
                nuevo.setI(Aux.getI()+1);
                Aux.setNext(nuevo);
                nuevo.setBack(Aux);
                CrearFila(nuevo.getInicio(),Aux.getInicio(),nuevo.getI(),y);
            }
            Aux = Aux.getNext();
        }
    }

    
    
    private void CrearFila(MNodo n, MNodo a, int x, int y)
    {
        if(a != null)
        {
            MNodo nuevo = new MNodo();
            nuevo.setX(x);
            nuevo.setY(y);
        }
        
        
    }
    
    public void Columna(int x, int y)
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
    private void CrearColumna (MNodo n, int x, int y)
    {
        
    }
    
    public MLNodo getComienzo() {
        return Comienzo;
    }
    
}