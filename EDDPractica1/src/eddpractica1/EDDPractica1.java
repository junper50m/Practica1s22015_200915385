/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;
import Memoria.*;
import Interfaz.*;
/**
 *
 * @author JP
 */
public class EDDPractica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //M.Crear(2, 2);
        //M.Mostrar();
        //System.out.println("-------------------------");
        //M.EliminarFila();
        //M.Mostrar();
        //Inicio Principal = new Inicio();
        //Principal.show(true);
        Lista L = new Lista();
        Carga c = new Carga();
        Creacion cre = new Creacion();
        cre.setLista(L);
        c.setLista(L);
        c.setCarga(c);
        c.setCreacion(cre);
        c.show(true);
        //Pared p = new Pared(c.getPared());
        //p.CrearPared();
        //Suelo s = new Suelo(c.getSuelo());
        //s.CrearSuelo();
    }
    
}
