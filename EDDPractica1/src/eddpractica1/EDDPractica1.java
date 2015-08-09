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
        M.Crear(5, 4);
        M.Mostrar();
        System.out.println("*************");
        M.Crear(3, 2);
        M.Mostrar();
        System.out.println("++++++++++++++");
        M.Crear(6, 5);
        M.Mostrar();
        System.out.println("++++++++++++++");
        M.Crear(10, 10);
        M.Mostrar();
        System.out.println("Hola Mundo");
    }
    
}
