/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cimara25;
import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class Rivenditore {
    
    private int auto;
    private int moto;
    private String nome;
    private ArrayList<Veicolo> mezzi;

    public Rivenditore(String nome) {
        this.nome = nome;
        mezzi = new ArrayList<>();
    }
    
    public void addMezzo(Veicolo a)
    {
        mezzi.add(a);
        
        if(mezzi.get(mezzi.lastIndexOf(a)) instanceof Moto)
        {
            auto++;
            mezzi.get(mezzi.lastIndexOf(a)).setMatricola(auto);
        }else if(mezzi.get(mezzi.lastIndexOf(a)) instanceof Auto)
        {
            moto++;
            mezzi.get(mezzi.lastIndexOf(a)).setMatricola(moto);
        }
    }
    
    public void remMezzo(String matricola)
    {
        for(int i = 0; i < mezzi.size(); i++)
        {
            if(mezzi.get(i).getMatricola().equals(matricola))
            {
                mezzi.remove(i);
            }
        }
    }
    
    public int contaMoto()
    {
        int a = 0;
        
        for(int i = 0; i < mezzi.size(); i++)
        {
            if(mezzi.get(i) instanceof Moto)
            {
                a++;
            }
        }
        
        return a;
    }
    
    public String toString()
    {
        String a = " ";
        
        if(mezzi.size() > -1)
        {
            for(int i = 0; i < mezzi.size(); i++)
            {
                if(mezzi.get(i) instanceof Moto)
                {
                    a += "_Moto_ Tipo di patente richiesta: " + mezzi.get(i).tipoPatenteMinima() + "\n";
                }else{
                    a += "_Auto_";
                }
                
                a += " Matricola: " + mezzi.get(i).getMatricola() + "; Marca: " + mezzi.get(i).getMarca() + "; Modello: " + mezzi.get(i).getModello() + "; Cilindrata: " + mezzi.get(i).getCilindrata() + "; Potenza: " + mezzi.get(i).getPotenza() + ".\n";
            }
        }else
        {
            a += "Non ci sono moto oppure macchine disponibli dal rivenditore.";
        }
        
        return a;
    }
    
}
