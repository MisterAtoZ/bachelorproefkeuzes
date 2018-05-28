/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachelorproefkeuzes;

import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Jonathan
 */
public class KeuzeProp {
    private SimpleStringProperty naam;
    private SimpleStringProperty proef;
    private ReadOnlyIntegerWrapper punten;

    public KeuzeProp(String naam, String proef, int punten) {
        this.naam = new SimpleStringProperty(naam);
        this.proef = new SimpleStringProperty(proef);
        this.punten = new ReadOnlyIntegerWrapper(punten);
    }

    public SimpleStringProperty naamProperty() {
        return naam;
    }

    public SimpleStringProperty proefProperty() {
        return proef;
    }

    public ReadOnlyIntegerWrapper puntenProperty() {
        return punten;
    }    
}
