package bachelorproefkeuzes;

/**
 * Deze klasse definieert de lijst keuze uit de database
 * 
 * @author Jonathan
 */
public class Keuze {
    private String naam;
    private String proef;
    private int punten;

    /**
     * constructor van de klasse Keuze
     * 
     * @param naam van de student
     * @param proef toegewezen aan de student
     * @param punten gekregen op de proef
     */
    public Keuze(String naam, String proef, int punten) {
        this.naam = naam;
        this.proef = proef;
        this.punten = punten;
    }

    /**
     * getter van de naam van de student
     * 
     * @return naam van de student
     */
    public String getNaam() {
        return naam;
    }

    /**
     * setter van de naam van de de student
     * 
     * @param naam die de student moet krijgen
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * getter van de proef die de student doet
     * 
     * @return proef die de student doet
     */
    public String getProef() {
        return proef;
    }

    /**
     * setter van de proef die de student doet
     * 
     * @param proef die de student doet
     */
    public void setProef(String proef) {
        this.proef = proef;
    }

    /**
     * getter van de punten die de student kreeg
     * 
     * @return punten die de student krijgt
     */
    public int getPunten() {
        return punten;
    }

    /**
     * setter van de punten die de student krijgt
     * 
     * @param punten die de student krijgt
     */
    public void setPunten(int punten) {
        this.punten = punten;
    }
    
    
}
