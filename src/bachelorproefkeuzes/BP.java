package bachelorproefkeuzes;

import javafx.beans.property.SimpleStringProperty;

/**
 * Klasse met de simpleStrings voor een bachelorproef
 * 
 * @author Jonathan
 */
public class BP {
    private SimpleStringProperty titel;
    private SimpleStringProperty beschrijving;

    /**
     * constructor van BP
     * 
     * @param titel de titel van de bachelorproef
     * @param beschrijving de beschrijving van de bachelorproef
     */
    public BP(String titel, String beschrijving) {
        this.titel = new SimpleStringProperty(titel);
        this.beschrijving = new SimpleStringProperty(beschrijving);
    }
    
    /**
     * geeft de titel van de bachelorproef
     * 
     * @return titel van de bachelorproef
     */
    public SimpleStringProperty titelProperty() {
        return titel;
    }
    
    /**
     * geeft de beschrijving van de bachelorproef
     * 
     * @return beschrijving van de bachelorproef
     */
    public SimpleStringProperty beschrijvingProperty() {
        return beschrijving;
    }
}
