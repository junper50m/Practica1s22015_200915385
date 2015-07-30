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
public class Lista {
    private LNodo Inicio;
    private LNodo Fin;
    public Lista()
    {
        Inicio = null;
        Fin = null;
    }
    public void IngresarInicio(int i)
    {
        LNodo nuevo = new LNodo();
        nuevo.setInfo(i);
        if(ListaVacia())
        {
            setInicio(nuevo);
            setFin(nuevo);
        }else{
            nuevo.setSiguiente(getInicio());
            getInicio().setAtras(nuevo);
            setInicio(nuevo);
        }
    }
    
    public void IngresarFin(int i)
    {
        LNodo nuevo = new LNodo();
        nuevo.setInfo(i);
        if(ListaVacia())
        {
            setInicio(nuevo);
            setFin(nuevo);
        }else{
            nuevo.setAtras(getFin());
            getFin().setSiguiente(nuevo);
            setFin(nuevo);
        }
    }
    public LNodo ExtraerInicio()
    {
        if(ListaVacia())
        {
            return null;
        }else{
            LNodo aux = getInicio();
            if(getInicio() == getFin())
            {
                setInicio(null);
                setFin(null);
                return aux;
            }else{
                setInicio(getInicio().getSiguiente());
                getInicio().setAtras(null);
                return aux;
            }
        }
    }
    public LNodo ExtraerFin()
    {
        if(ListaVacia())
        {
            return null;
        }else{
            LNodo aux = getFin();
            if(getInicio() == getFin())
            {
                setInicio(null);
                setFin(null);
                return aux;
            }else{
                setFin(getFin().getAtras());
                getFin().setSiguiente(null);
                return aux;
            }
        }
    }
    public boolean ListaVacia()
    {
        return getInicio() == null;
    }

    public LNodo getInicio() {
        return Inicio;
    }

    public void setInicio(LNodo Inicio) {
        this.Inicio = Inicio;
    }

    public LNodo getFin() {
        return Fin;
    }

    public void setFin(LNodo Fin) {
        this.Fin = Fin;
    }
    
  
    
}
