package bachelorproefkeuzes;

/**
 * Klasse die de keuzes van de student definieert
 * 
 * @author Jonathan
 */
public class KeuzeStudent {
    private String student;
    private String keuze1;
    private String keuze2;
    private String keuze3;

    /**
     * constructor van de klasse Keuzestudent
     * 
     * @param student van wie de keuze is
     * @param keuze1 van de student
     * @param keuze2 van de student
     * @param keuze3 van de student
     */
    public KeuzeStudent(String student, String keuze1, String keuze2, String keuze3) {
        this.student = student;
        this.keuze1 = keuze1;
        this.keuze2 = keuze2;
        this.keuze3 = keuze3;
    }

    /**
     * getter van de naam van de student
     * 
     * @return de naam van de student
     */
    public String getStudent() {
        return student;
    }

    /**
     * setter van de naam van de student
     * 
     * @param student naam van de student
     */
    public void setStudent(String student) {
        this.student = student;
    }

    /**
     * getter van eerste keuze van de student
     * 
     * @return keuze1 van de student
     */
    public String getKeuze1() {
        return keuze1;
    }

    /**
     * setter van keuze1 van de student
     * 
     * @param keuze1 van de student
     */
    public void setKeuze1(String keuze1) {
        this.keuze1 = keuze1;
    }

    /**
     * getter van keuze2 van de student
     * 
     * @return keuze2 van de student
     */
    public String getKeuze2() {
        return keuze2;
    }

    /**
     * setter van keuze2 van de student
     * 
     * @param keuze2 van de student
     */
    public void setKeuze2(String keuze2) {
        this.keuze2 = keuze2;
    }

    /**
     * getter van keuze3 van de student
     * 
     * @return keuze3 van de student
     */
    public String getKeuze3() {
        return keuze3;
    }

    /**
     * setter van keuze3 van de student
     * @param keuze3 van de student
     */
    public void setKeuze3(String keuze3) {
        this.keuze3 = keuze3;
    }
}
