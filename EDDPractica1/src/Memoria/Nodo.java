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
public class Nodo {
    private int info;
    private Nodo Siguiente;
    private Nodo Atras;
    public Nodo()
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
    
    public void SetSiguiente(Nodo s)
    {
        Siguiente = s;
    }
    public Nodo GetSiguiente()
    {
        return Siguiente;
    }
    public void SetAtras(Nodo a)
    {
        Atras = a;
    }
    public Nodo GetAtras()
    {
        return Atras;
    }
}
