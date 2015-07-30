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
    public void SetInfo(int i)
    {
        info = i;
    }
    public int GetInfo()
    {
        return info;
    } 
    
    public void SetSiguiente(LNodo s)
    {
        Siguiente = s;
    }
    public LNodo GetSiguiente()
    {
        return Siguiente;
    }
    public void SetAtras(LNodo a)
    {
        Atras = a;
    }
    public LNodo GetAtras()
    {
        return Atras;
    }
}
