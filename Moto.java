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
public class Moto extends Veicolo{
    public Moto(String marca, String modello, double cilindrata, double potenza) {
        super(marca, modello, cilindrata, potenza);
    }

    @Override
    public void setMatricola(int n) {
        matricola = "M" + n;
    }
}
