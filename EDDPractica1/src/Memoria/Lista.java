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
public class Lista {
    private LNodo Inicio;
    private LNodo Fin;
    public Lista()
    {
        Inicio = null;
        Fin = null;
    }
    public void IngresarInicio(String nom, JLabel ima)
    {
        LNodo nuevo = new LNodo();
        nuevo.setNombre(nom);
        nuevo.setImagen(ima);
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
    
    public void IngresarFin(String nom, JLabel ima)
    {
        LNodo nuevo = new LNodo();
        nuevo.setNombre(nom);
        nuevo.setImagen(ima);
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
    public void Eliminar(String Nombre,int j)
    {
        //System.out.println("********************************************");
        //System.out.println("Eliminar: ["+Nombre+","+j+"]");
        LNodo aux = Inicio;
        while(aux != null)
        {
            //System.out.println("Eliminar11: ["+aux.getNombre()+","+aux.getId()+"]");
            if(aux.getNombre().equals(Nombre) && aux.getId() == j)
            {
                if(aux.getAtras() == null)
                {
                    if(aux.getSiguiente() == null)
                    {
                        Inicio = Fin = aux = null;
                    }else{
                        Inicio = aux.getSiguiente();
                        Inicio.setAtras(null);
                        aux = null;
                    }
                }else{
                    if(aux.getSiguiente() == null)
                    {
                        
                        aux.getAtras().setSiguiente(null);
                        aux = null;
                    }else{
                        aux.getAtras().setSiguiente(aux.getSiguiente());
                        aux.getSiguiente().setAtras(aux.getAtras());
                        aux = null;
                    }
                }
            }else{
                aux = aux.getSiguiente();
            }
            
        }
    }
    
    public LNodo Buscar(String Nombre,int j)
    {
        LNodo aux = Inicio;
        LNodo tmp = null;
        while(aux != null)
        {
            if(aux.getNombre().equals(Nombre) && aux.getId() == j)
            {
                tmp = aux;
            }else{
                aux = aux.getSiguiente();
            }
            
        }
        return tmp;
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
