package bachelorproefkeuzes;

import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Klasse met de simpleStrings voor een keuze
 * 
 * @author Jonathan
 */
public class KeuzeProp {
    private SimpleStringProperty naam;
    private SimpleStringProperty proef;
    private ReadOnlyIntegerWrapper punten;

    /**
     * Constructor voor de simpleStrings voor een keuze
     * 
     * @param naam van de student in deze keuze
     * @param proef van de keuze
     * @param punten van de keuze
     */
    public KeuzeProp(String naam, String proef, int punten) {
        this.naam = new SimpleStringProperty(naam);
        this.proef = new SimpleStringProperty(proef);
        this.punten = new ReadOnlyIntegerWrapper(punten);
    }

    /**
     * Getter van de naam van de student in de keuze
     * 
     * @return naam van de student in deze keuze
     */
    public SimpleStringProperty naamProperty() {
        return naam;
    }

    /**
     * Getter van de proef in de keuze
     * 
     * @return proef van de keuze
     */
    public SimpleStringProperty proefProperty() {
        return proef;
    }

    /**
     * Getter van de punten in de keuze
     * 
     * @return punten van de keuze
     */
    public ReadOnlyIntegerWrapper puntenProperty() {
        return punten;
    }    
}
