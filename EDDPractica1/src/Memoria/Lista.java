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
    public void IngresarInicio(Lista l, int i)
    {
        LNodo nuevo = new LNodo();
        nuevo.SetInfo(i);
        if(ListaVacia(l))
        {
            SetInicio(nuevo);
            SetFin(nuevo);
        }else{
            nuevo.SetSiguiente(GetInicio());
            GetInicio().SetAtras(nuevo);
            SetInicio(nuevo);
        }
    }
    
    public void IngresarFin(Lista l,int i)
    {
        LNodo nuevo = new LNodo();
        nuevo.SetInfo(i);
        if(ListaVacia(l))
        {
            SetInicio(nuevo);
            SetFin(nuevo);
        }else{
            nuevo.SetAtras(GetFin());
            GetFin().SetSiguiente(nuevo);
            SetFin(nuevo);
        }
    }
    public LNodo ExtraerInicio(Lista l)
    {
        if(ListaVacia(l))
        {
            return null;
        }else{
            LNodo aux = l.GetInicio();
            if(l.GetInicio() == l.GetFin())
            {
                l.SetInicio(null);
                l.SetFin(null);
                return aux;
            }else{
                l.SetInicio(l.GetInicio().GetSiguiente());
                l.GetInicio().SetAtras(null);
                return aux;
            }
        }
    }
    public LNodo ExtraerFin(Lista l)
    {
        if(ListaVacia(l))
        {
            return null;
        }else{
            LNodo aux = l.GetFin();
            if(l.GetInicio() == l.GetFin())
            {
                l.SetInicio(null);
                l.SetFin(null);
                return aux;
            }else{
                l.SetFin(l.GetFin().GetAtras());
                l.GetFin().SetSiguiente(null);
                return aux;
            }
        }
    }
    public boolean ListaVacia(Lista l)
    {
        return l.GetInicio() == null;
    }
    
    private void SetInicio(LNodo i)
    {
        Inicio = i;
    }
    private LNodo GetInicio()
    {
        return Inicio;
    }
    private void SetFin(LNodo f)
    {
        Fin = f;
    }
    private LNodo GetFin()
    {
        return Fin;
    }
}
