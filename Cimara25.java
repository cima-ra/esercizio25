/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cimara25;

/**
 *
 * @author Adrian
 */
public class Cimara25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rivenditore cimara = new Rivenditore("Cimara");
        Moto m1 = new Moto("Yamaha", "R1", 1000, 39);
        Auto a1 = new Auto("Fiat", "Panda", 1200, 45);
        Moto m2 = new Moto("Honda", "CBR", 1000, 39);
        Auto a2 = new Auto("Aston Martin", "DB5", 1200, 45);
        
        cimara.addMezzo(m1);
        cimara.addMezzo(a1);
        cimara.addMezzo(m2);
        cimara.addMezzo(a2);
        
        System.out.println(cimara.contaMoto());
        
        System.out.println(cimara.toString());
        
        cimara.remMezzo("A2");
        
        System.out.println(cimara.toString());
    }
    
}
