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
public abstract class Veicolo {
    private String marca;
    private String modello;
    private double cilindrata;
    protected String matricola;
    private double potenza;

    //Metodo costruttore
    public Veicolo(String marca, String modello, double cilindrata, double potenza) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.potenza = potenza;
    }

    //Getter e setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }

    public double getPotenza() {
        return potenza;
    }

    public void setPotenza(double potenza) {
        this.potenza = potenza;
    }

    public String getMatricola() {
        return matricola;
    }
    
    public String tipoPatenteMinima()
    {
        if(getPotenza() > 35)
        {
            return "A";
        }else if(getPotenza() > 11 || getCilindrata() > 125)
        {
            return "A2";
        }else if(getPotenza() > 4 || getCilindrata() > 50)
        {
            return "A1";
        }
        
        return "AM"; 
    }
    
    public abstract void setMatricola(int n);
}
