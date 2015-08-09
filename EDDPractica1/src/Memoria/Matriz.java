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
public class Matriz {
 
    private MNodo Inicio;
    public Matriz(){
        Inicio = null;
    }
    
    public void Crear(int x, int y){
        Ingresar(x-1,y-1);
    }

    public void Ingresar(int x, int y){
        if(MatrizVacia())
        {
            MNodo nuevo = new MNodo();
            nuevo.setX(0);
            nuevo.setY(0);
            Inicio = nuevo;
            MNodo aux;
            MNodo aux1;
            MNodo aux2;
            MNodo tmp = Inicio;
            while(tmp != null)
            {
                aux = tmp;
                if(tmp.getSiguiente() != null)
                {
                    aux2 = tmp.getSiguiente();
                    if(tmp.getAtras() != null)
                    {
                        aux1 = tmp.getAtras();
                        while(aux != null)
                        {
                            if(aux.getY() < y && aux.getArriba() == null)
                            {
                                MNodo n = new MNodo();
                                n.setY(aux.getY()+1);
                                n.setX(aux.getX());
                                aux.setArriba(n);
                                n.setAbajo(aux);
                                n.setAtras(aux1.getArriba());
                                aux1.getArriba().setSiguiente(n);
                                n.setSiguiente(aux2.getArriba());
                                aux2.getArriba().setAtras(n);
                            }
                            aux = aux.getArriba();
                            aux1 = aux1.getArriba();
                            aux2 = aux2.getArriba();
                        }
                    }else{
                        while(aux != null)
                        {
                            if(aux.getY() < y && aux.getArriba() == null)
                            {
                                MNodo n = new MNodo();
                                n.setY(aux.getY()+1);
                                n.setX(aux.getX());
                                aux.setArriba(n);
                                n.setAbajo(aux);
                                n.setSiguiente(aux2.getArriba());
                                aux2.getArriba().setAtras(n);
                            }
                            aux = aux.getArriba();
                            aux2 = aux2.getArriba();
                        }
                    }
                }else{
                    if(tmp.getAtras() != null)
                    {
                        aux1 = tmp.getAtras();
                        while(aux != null)
                        {
                            if(aux.getY() < y && aux.getArriba() == null)
                            {
                                MNodo n = new MNodo();
                                n.setY(aux.getY()+1);
                                n.setX(aux.getX());
                                aux.setArriba(n);
                                n.setAbajo(aux);
                                n.setAtras(aux1.getArriba());
                                aux1.getArriba().setSiguiente(n);
                            }
                            aux = aux.getArriba();
                            aux1 = aux1.getArriba();
                        }
                    }else{
                        while(aux != null)
                        {
                            if(aux.getY() < y && aux.getArriba() == null)
                            {
                                MNodo n = new MNodo();
                                n.setY(aux.getY()+1);
                                n.setX(aux.getX());
                                aux.setArriba(n);
                                n.setAbajo(aux);
                            }
                            aux = aux.getArriba();
                        }
                    }
                }
                
                
                
                if(tmp.getX() < x && tmp.getSiguiente() == null)
                {
                    MNodo n = new MNodo();
                    n.setY(tmp.getY());
                    n.setX(tmp.getX()+1);
                    n.setAtras(tmp);
                    tmp.setSiguiente(n);
                }
                
                tmp = tmp.getSiguiente();
            }
        }else{
            MNodo aux;
            MNodo aux1;
            MNodo aux2;
            MNodo tmp = Inicio;
            while(tmp != null)
            {
                aux = tmp;
                if(tmp.getSiguiente() != null)
                {
                    aux2 = tmp.getSiguiente();
                    if(tmp.getAtras() != null)
                    {
                        aux1 = tmp.getAtras();
                        while(aux != null)
                        {
                            if(aux.getY() < y && aux.getArriba() == null)
                            {
                                MNodo n = new MNodo();
                                n.setY(aux.getY()+1);
                                n.setX(aux.getX());
                                aux.setArriba(n);
                                n.setAbajo(aux);
                                n.setAtras(aux1.getArriba());
                                aux1.getArriba().setSiguiente(n);
                            }
                            aux = aux.getArriba();
                            aux1 = aux1.getArriba();
                        }
                    }else{
                        while(aux != null)
                        {
                            if(aux.getY() < y && aux.getArriba() == null)
                            {
                                MNodo n = new MNodo();
                                n.setY(aux.getY()+1);
                                n.setX(aux.getX());
                                aux.setArriba(n);
                                n.setAbajo(aux);
                            }
                            aux = aux.getArriba();
                        }
                    }
                }else{
                    if(tmp.getAtras() != null)
                    {
                        aux1 = tmp.getAtras();
                        while(aux != null)
                        {
                            if(aux.getY() < y && aux.getArriba() == null)
                            {
                                MNodo n = new MNodo();
                                n.setY(aux.getY()+1);
                                n.setX(aux.getX());
                                aux.setArriba(n);
                                n.setAbajo(aux);
                                n.setAtras(aux1.getArriba());
                                aux1.getArriba().setSiguiente(n);
                            }
                            aux = aux.getArriba();
                            aux1 = aux1.getArriba();
                        }
                    }else{
                        while(aux != null)
                        {
                            if(aux.getY() < y && aux.getArriba() == null)
                            {
                                MNodo n = new MNodo();
                                n.setY(aux.getY()+1);
                                n.setX(aux.getX());
                                aux.setArriba(n);
                                n.setAbajo(aux);
                            }
                            aux = aux.getArriba();
                        }
                    }
                }
                
                
                if(tmp.getX() < x && tmp.getSiguiente() == null)
                {
                    MNodo n = new MNodo();
                    n.setY(tmp.getY());
                    n.setX(tmp.getX()+1);
                    n.setAtras(tmp);
                    tmp.setSiguiente(n);
                }
                
                tmp = tmp.getSiguiente();
            }
        }
        
    }
    
    public void Mostrar(){
        MNodo aux = Inicio;
        MNodo tmp;
        while(aux != null)
        {
            tmp = aux;
            while(tmp != null)
            {
                System.out.print("("+tmp.getX()+","+tmp.getY()+")");
                tmp = tmp.getSiguiente();
            }
            System.out.println(" ");
                
            aux = aux.getArriba();
        }
    }
    public boolean MatrizVacia(){
        return Inicio == null;
    }
    
    public MNodo getInicio() {
        return Inicio;
    }

    public void setInicio(MNodo Inicio) {
        this.Inicio = Inicio;
    }
    
    
}
