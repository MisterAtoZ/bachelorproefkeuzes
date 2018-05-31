package bachelorproefkeuzes;

/**
 * Deze klasse definieert een student
 * @author Jonathan
 */
public class Student {
    private int id;
    private String naam;
    private String paswoord;
    
    /**
     * Constructor van de klasse student
     * 
     * @param naam de naam van de student
     * @param paswoord het paswoord van de student
     */
    public Student(String naam, String paswoord) {
        this.naam = naam;
        this.paswoord = paswoord;
    }

    /**
     * getter van het ID van de student in de database
     * 
     * @return id van de student
     */
    public int getId() {
        return id;
    }

    /**
     * setter van het id in de database
     * 
     * @param id het id dat de student krijgt
     */
    public void setId(int id) {
        this.id = id;
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
     * setter van de naam van de student
     * 
     * @param naam die de student moet krijgen
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * getter van het paswoord van de student
     * 
     * @return paswoord van de student
     */
    public String getPaswoord() {
        return paswoord;
    }

    /**
     * setter van het paswoord van de student
     * 
     * @param paswoord dat de student moet krijgen
     */
    public void setPaswoord(String paswoord) {
        this.paswoord = paswoord;
    }
}
