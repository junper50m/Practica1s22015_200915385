/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;
import Memoria.*;
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
        Matriz M = new Matriz();
        M.Crear(2, 2);
        M.Mostrar();
        System.out.println("-------------------------");
        M.EliminarFila();
        M.Mostrar();
        System.out.println("-------------------------");
        M.EliminarColumna();
        M.Mostrar();
        System.out.println("/////////////////////////");
        M.EliminarColumna();
        M.Mostrar();
        System.out.println("/////////////////////////");
        M.EliminarColumna();
        M.Mostrar();
    }
    
}
