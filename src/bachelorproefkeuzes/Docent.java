package bachelorproefkeuzes;

/**
 * Deze klasse definieert een docent uit de database tabel docent
 * 
 * @author Jonathan
 */
public class Docent {
    private int id;
    private String naam;
    private String paswoord;

    /**
     * constructor van de klasse docent
     * 
     * @param naam van de docent
     * @param paswoord van de docent
     */
    public Docent(String naam, String paswoord) {
        this.naam = naam;
        this.paswoord = paswoord;
    }

    /**
     * getter van het id van de docent
     * 
     * @return id van de docent
     */
    public int getId() {
        return id;
    }

    /**
     * setter van het id van de docent
     * 
     * @param id dat de docent krijgt
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter van de naam van de docent
     * 
     * @return naam van de docent
     */
    public String getNaam() {
        return naam;
    }

    /**
     * setter van de naam van de docent
     * 
     * @param naam die de docent krijgt
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * getter van het paswoord van de docent
     * 
     * @return paswoord van de docent
     */
    public String getPaswoord() {
        return paswoord;
    }

    /**
     * setter van het paswoord van de docent
     * 
     * @param paswoord dat de docent krijgt
     */
    public void setPaswoord(String paswoord) {
        this.paswoord = paswoord;
    }
}
