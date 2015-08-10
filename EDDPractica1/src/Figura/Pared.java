/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author JP
 */
public class Pared {
    JPanel Fondo;
    public Pared(JPanel p){
        Fondo = p;
    }
    
    public void CrearPared(){
        Thread hilo;

        Runnable hiloFor = new Runnable() {

            @Override
            public void run() {
                Thread actual = Thread.currentThread();
                synchronized (actual) {
                    for (int i = 0; i < 50; i++) {
                        LinX(i, 50, 2, 2);
                        /*try {
                            actual.wait(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                        }*/
                    }
                    for (int i = 0; i < 50; i++) {
                        LinYY(i, 50, 52, 2);
                      /*  try {
                            actual.wait(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                        }*/
                    }
                    for (int i = 0; i < 50; i++) {
                        LinXX(i, 50, 52, 52);
                        /*try {
                            actual.wait(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                        }*/
                    }
                    for (int i = 0; i < 50; i++) {
                        LinY(i, 50, 2, 52);
                       /* try {
                            actual.wait(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                        }*/
                    }

                }
            }
        };

        hilo = new Thread(hiloFor);
        hilo.start();
    }
    
    
    public void LinX(int i, int f, int x, int y) {

        
            JPanel p0 = new JPanel();
            p0.setBackground(new Color(0, 0, 150));
            p0.setBounds(x + i, y, 1, 1);
            Fondo.add(p0);

            if(i < f-2)
            {
                JPanel p1 = new JPanel();
                p1.setBackground(new Color(0, 100, 255));
                p1.setBounds(x + i +1, y + 1, 1, 1);
                Fondo.add(p1);    
            }else{
                JPanel p1 = new JPanel();
                p1.setBackground(new Color(0, 100, 255));
                p1.setBounds(x + i -1, y + 1, 1, 1);
                Fondo.add(p1);
            }
                

            if(i < f-4)
            {
                JPanel p2 = new JPanel();
                p2.setBackground(new Color(0, 200, 255));
                p2.setBounds(x + i+2, y + 2, 1, 1);
                Fondo.add(p2);
            }else{
                JPanel p2 = new JPanel();
                p2.setBackground(new Color(0, 200, 255));
                p2.setBounds(x + i -2, y + 2, 1, 1);
                Fondo.add(p2);
            }

            
            if(i < f-6)
            {
                JPanel p3 = new JPanel();
                p3.setBackground(new Color(0, 255, 255));
                p3.setBounds(x + i +3, y + 3, 1, 1);
                Fondo.add(p3);
            }else{
                JPanel p3 = new JPanel();
                p3.setBackground(new Color(0, 255, 255));
                p3.setBounds(x + i-3, y + 3, 1, 1);
                Fondo.add(p3);
            }
               
            if(i < f-8)
            {
                JPanel p4 = new JPanel();
                p4.setBackground(new Color(0, 200, 255));
                p4.setBounds(x + i +4, y + 4, 1, 1);
                Fondo.add(p4);
            }else{
                JPanel p4 = new JPanel();
                p4.setBackground(new Color(0, 200, 255));
                p4.setBounds(x + i-4, y + 4, 1, 1);
                Fondo.add(p4);
            }

            if(i < f-10)
            {
                JPanel p5 = new JPanel();
                p5.setBackground(new Color(0, 100, 255));
                p5.setBounds(x + i+5, y + 5, 1, 1);
                Fondo.add(p5);
            }else{
                JPanel p5 = new JPanel();
                p5.setBackground(new Color(0, 100, 255));
                p5.setBounds(x + i-5, y + 5, 1, 1);
                Fondo.add(p5);
            }
                
            if(i < f-12)
            {
                JPanel p6 = new JPanel();
                p6.setBackground(new Color(0, 0, 150));
                p6.setBounds(x + i +6, y + 6, 1, 1);
                Fondo.add(p6);
            }else{
                JPanel p6 = new JPanel();
                p6.setBackground(new Color(0, 0, 150));
                p6.setBounds(x + i -6, y + 6, 1, 1);
                Fondo.add(p6);
            }
                
            Fondo.repaint();
        
        //Fondo.updateUI();    

    }

    public void LinY(int i, int f, int x, int y) {

            JPanel p0 = new JPanel();
            p0.setBackground(new Color(0, 0, 150));
            p0.setBounds(x, y-i, 1, 1);
            Fondo.add(p0);

            
            if(i < f-2)
            {
                JPanel p1 = new JPanel();
                p1.setBackground(new Color(0, 100, 255));
                p1.setBounds(x +1, y - i -1, 1, 1);
                Fondo.add(p1);    
            }else{
                JPanel p1 = new JPanel();
                p1.setBackground(new Color(0, 100, 255));
                p1.setBounds(x + 1, y - i +1, 1, 1);
                Fondo.add(p1);
            }
                
       
            if(i < f-4)
            {
                JPanel p2 = new JPanel();
                p2.setBackground(new Color(0, 200, 255));
                p2.setBounds(x +2, y - i-2, 1, 1);
                Fondo.add(p2);
            }else{
                JPanel p2 = new JPanel();
                p2.setBackground(new Color(0, 200, 255));
                p2.setBounds(x+2, y  - i +2, 1, 1);
                Fondo.add(p2);
            }

            
            if(i < f-6)
            {
                JPanel p3 = new JPanel();
                p3.setBackground(new Color(0, 255, 255));
                p3.setBounds(x+3 , y - i -3, 1, 1);
                Fondo.add(p3);
            }else{
                JPanel p3 = new JPanel();
                p3.setBackground(new Color(0, 255, 255));
                p3.setBounds(x +3, y - i+3, 1, 1);
                Fondo.add(p3);
            }
          
        
            if(i < f-8)
            {
                JPanel p4 = new JPanel();
                p4.setBackground(new Color(0, 200, 255));
                p4.setBounds(x +4, y - i -4, 1, 1);
                Fondo.add(p4);
            }else{
                JPanel p4 = new JPanel();
                p4.setBackground(new Color(0, 200, 255));
                p4.setBounds(x +4, y - i+4, 1, 1);
                Fondo.add(p4);
            }

       
        
            if(i < f-10)
            {
                JPanel p5 = new JPanel();
                p5.setBackground(new Color(0, 100, 255));
                p5.setBounds(x +5 , y - i-5, 1, 1);
                Fondo.add(p5);
            }else{
                JPanel p5 = new JPanel();
                p5.setBackground(new Color(0, 100, 255));
                p5.setBounds(x +5, y - i+5, 1, 1);
                Fondo.add(p5);
            }
            
                
            if(i < f-12)
            {
                JPanel p6 = new JPanel();
                p6.setBackground(new Color(0, 0, 150));
                p6.setBounds(x+6 , y - i -6, 1, 1);
                Fondo.add(p6);
            }else{
                JPanel p6 = new JPanel();
                p6.setBackground(new Color(0, 0, 150));
                p6.setBounds(x +6, y - i +6, 1, 1);
                Fondo.add(p6);
            }
                
            Fondo.repaint();
            
        
        
        //Fondo.updateUI();    

    }
    
    public void LinXX(int i, int f, int x, int y) {

        
            JPanel p0 = new JPanel();
            p0.setBackground(new Color(0, 0, 150));
            p0.setBounds(x - i, y, 1, 1);
            Fondo.add(p0);

            if(i < f-2)
            {
                JPanel p1 = new JPanel();
                p1.setBackground(new Color(0, 100, 255));
                p1.setBounds(x - i -1, y - 1, 1, 1);
                Fondo.add(p1);    
            }else{
                JPanel p1 = new JPanel();
                p1.setBackground(new Color(0, 100, 255));
                p1.setBounds(x - i +1, y - 1, 1, 1);
                Fondo.add(p1);
            }
                

            if(i < f-4)
            {
                JPanel p2 = new JPanel();
                p2.setBackground(new Color(0, 200, 255));
                p2.setBounds(x - i-2, y - 2, 1, 1);
                Fondo.add(p2);
            }else{
                JPanel p2 = new JPanel();
                p2.setBackground(new Color(0, 200, 255));
                p2.setBounds(x - i +2, y - 2, 1, 1);
                Fondo.add(p2);
            }

            
            if(i < f-6)
            {
                JPanel p3 = new JPanel();
                p3.setBackground(new Color(0, 255, 255));
                p3.setBounds(x - i -3, y - 3, 1, 1);
                Fondo.add(p3);
            }else{
                JPanel p3 = new JPanel();
                p3.setBackground(new Color(0, 255, 255));
                p3.setBounds(x - i+3, y - 3, 1, 1);
                Fondo.add(p3);
            }
               
            if(i < f-8)
            {
                JPanel p4 = new JPanel();
                p4.setBackground(new Color(0, 200, 255));
                p4.setBounds(x - i -4, y - 4, 1, 1);
                Fondo.add(p4);
            }else{
                JPanel p4 = new JPanel();
                p4.setBackground(new Color(0, 200, 255));
                p4.setBounds(x - i+4, y - 4, 1, 1);
                Fondo.add(p4);
            }

            if(i < f-10)
            {
                JPanel p5 = new JPanel();
                p5.setBackground(new Color(0, 100, 255));
                p5.setBounds(x - i-5, y - 5, 1, 1);
                Fondo.add(p5);
            }else{
                JPanel p5 = new JPanel();
                p5.setBackground(new Color(0, 100, 255));
                p5.setBounds(x - i+5, y - 5, 1, 1);
                Fondo.add(p5);
            }
                
            if(i < f-12)
            {
                JPanel p6 = new JPanel();
                p6.setBackground(new Color(0, 0, 150));
                p6.setBounds(x - i -6, y - 6, 1, 1);
                Fondo.add(p6);
            }else{
                JPanel p6 = new JPanel();
                p6.setBackground(new Color(0, 0, 150));
                p6.setBounds(x - i +6, y - 6, 1, 1);
                Fondo.add(p6);
            }
                
            Fondo.repaint();
        
        //Fondo.updateUI();    

    }

    public void LinYY(int i, int f, int x, int y) {

            JPanel p0 = new JPanel();
            p0.setBackground(new Color(0, 0, 150));
            p0.setBounds(x, y+i, 1, 1);
            Fondo.add(p0);

            
            if(i < f-2)
            {
                JPanel p1 = new JPanel();
                p1.setBackground(new Color(0, 100, 255));
                p1.setBounds(x -1, y + i +1, 1, 1);
                Fondo.add(p1);    
            }else{
                JPanel p1 = new JPanel();
                p1.setBackground(new Color(0, 100, 255));
                p1.setBounds(x - 1, y + i -1, 1, 1);
                Fondo.add(p1);
            }
                
       
            if(i < f-4)
            {
                JPanel p2 = new JPanel();
                p2.setBackground(new Color(0, 200, 255));
                p2.setBounds(x -2, y + i+2, 1, 1);
                Fondo.add(p2);
            }else{
                JPanel p2 = new JPanel();
                p2.setBackground(new Color(0, 200, 255));
                p2.setBounds(x-2, y  + i -2, 1, 1);
                Fondo.add(p2);
            }

            
            if(i < f-6)
            {
                JPanel p3 = new JPanel();
                p3.setBackground(new Color(0, 255, 255));
                p3.setBounds(x-3 , y + i +3, 1, 1);
                Fondo.add(p3);
            }else{
                JPanel p3 = new JPanel();
                p3.setBackground(new Color(0, 255, 255));
                p3.setBounds(x -3, y + i-3, 1, 1);
                Fondo.add(p3);
            }
          
        
            if(i < f-8)
            {
                JPanel p4 = new JPanel();
                p4.setBackground(new Color(0, 200, 255));
                p4.setBounds(x -4, y + i +4, 1, 1);
                Fondo.add(p4);
            }else{
                JPanel p4 = new JPanel();
                p4.setBackground(new Color(0, 200, 255));
                p4.setBounds(x -4, y + i-4, 1, 1);
                Fondo.add(p4);
            }

       
        
            if(i < f-10)
            {
                JPanel p5 = new JPanel();
                p5.setBackground(new Color(0, 100, 255));
                p5.setBounds(x -5 , y + i+5, 1, 1);
                Fondo.add(p5);
            }else{
                JPanel p5 = new JPanel();
                p5.setBackground(new Color(0, 100, 255));
                p5.setBounds(x -5, y + i-5, 1, 1);
                Fondo.add(p5);
            }
            
            
                
            if(i < f-12)
            {
                JPanel p6 = new JPanel();
                p6.setBackground(new Color(0, 0, 150));
                p6.setBounds(x-6 , y + i +6, 1, 1);
                Fondo.add(p6);
            }else{
                JPanel p6 = new JPanel();
                p6.setBackground(new Color(0, 0, 150));
                p6.setBounds(x -6, y + i -6, 1, 1);
                Fondo.add(p6);
            }
                
            Fondo.repaint();
            
        
        
        //Fondo.updateUI();    

    }

    
}
