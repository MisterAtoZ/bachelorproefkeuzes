package bachelorproefkeuzes;

/**
 * De klasse die een bachelorproef definieert
 * 
 * @author Jonathan
 */
public class Bachelorproef {
    private int id; 
    private String titel;
    private String beschrijving;

    /**
     * constructor van de bachelorproef
     * 
     * @param titel van de bachelorproef
     * @param beschrijving van de bachelorproef
     */
    public Bachelorproef(String titel, String beschrijving) {
        this.titel = titel;
        this.beschrijving = beschrijving;
    }

    /**
     * getter van het id van de bachelorproef
     * 
     * @return id van de bachelorproef
     */
    public int getId() {
        return id;
    }

    /**
     * setter van het id van de bachelorproef
     * 
     * @param id van de bachelorproef
     */
    protected void setId(int id) {
        this.id = id;
    }

    /**
     * getter van de titel van de bachelorproef
     * 
     * @return titel van de bachelorproef
     */
    public String getTitel() {
        return titel;
    }

    /**
     * setter van de titel van de bachelorproef
     * 
     * @param titel van de bachelorproef
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * getter van de beschrijving van de bachelorproef
     * 
     * @return beschrijving van de bachelorproef
     */
    public String getBeschrijving() {
        return beschrijving;
    }

    /**
     * setter van de beschrijving van de bachelorproef
     * 
     * @param beschrijving van de bachelorproef
     */
    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }
}
