package bachelorproefkeuzes;

import javafx.beans.property.SimpleStringProperty;

/**
 * Klasse met de simpleStrings voor KeuzeStudent
 * 
 * @author Jonathan
 */
public class KeuzeStudentProp {
    private SimpleStringProperty naam;
    private SimpleStringProperty keuze1;
    private SimpleStringProperty keuze2;
    private SimpleStringProperty keuze3;
    
    /**
     * Constructor van KeuzeStudentProp
     * @param naam van de student
     * @param keuze1 van de student
     * @param keuze2 van de student
     * @param keuze3 van de student
     */
    public KeuzeStudentProp(String naam, String keuze1, String keuze2, String keuze3) {
        this.naam = new SimpleStringProperty(naam);
        this.keuze1 = new SimpleStringProperty(keuze1);
        this.keuze2 = new SimpleStringProperty(keuze2);
        this.keuze3 = new SimpleStringProperty(keuze3);
    }

    /**
     * getter van de naam van de student
     * 
     * @return naam van de student
     */
    public SimpleStringProperty studentProperty() {
        return naam;
    }

    /**
     * getter van de eerste keuze van de student
     * 
     * @return keuze1 van de student
     */
    public SimpleStringProperty keuze1Property() {
        return keuze1;
    }

    /**
     * getter van de tweede keuze van de student
     * @return keuze2 van de student
     */
    public SimpleStringProperty keuze2Property() {
        return keuze2;
    }

    /**
     * getter van de derde keuze van de student
     * 
     * @return keuze3 van de student
     */
    public SimpleStringProperty keuze3Property() {
        return keuze3;
    }
}
