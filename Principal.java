/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6_s2;

/**
 *
 * @author alx-pc
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MagodeFuego objetoMago;
        objetoMago = new MagodeFuego("rojo", 99, 99);
        
        System.out.println("Color del mago: "+ objetoMago.getColor()+"\n"
                + "Poder del mago: "+objetoMago.getPoder()+"\n"
                        + "Vida del mago: "+objetoMago.getVida());
        
    }
    
}
