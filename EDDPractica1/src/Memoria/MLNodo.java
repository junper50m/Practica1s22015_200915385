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
public class MLNodo {
    private int i;
    private int j;
    private MLNodo Next;
    private MLNodo Back;
    private MNodo Inicio;
    public MLNodo()
    {
        this.i = 0;
        this.j = 0;
        this.Next = null;
        this.Back = null;
        this.Inicio = null;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public MLNodo getNext() {
        return Next;
    }

    public void setNext(MLNodo Next) {
        this.Next = Next;
    }

    public MLNodo getBack() {
        return Back;
    }

    public void setBack(MLNodo Back) {
        this.Back = Back;
    }

    public MNodo getInicio() {
        return Inicio;
    }

    public void setInicio(MNodo Inicio) {
        this.Inicio = Inicio;
    }
    
}
