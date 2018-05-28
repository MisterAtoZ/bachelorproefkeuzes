/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachelorproefkeuzes;

/**
 *
 * @author Jonathan
 */
public class Keuze {
    private String naam;
    private String proef;
    private int punten;

    public Keuze(String naam, String proef, int punten) {
        this.naam = naam;
        this.proef = proef;
        this.punten = punten;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getProef() {
        return proef;
    }

    public void setProef(String proef) {
        this.proef = proef;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }
    
    
}
