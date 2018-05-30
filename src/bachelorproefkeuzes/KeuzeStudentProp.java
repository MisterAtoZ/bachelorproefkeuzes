/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachelorproefkeuzes;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Jonathan
 */
public class KeuzeStudentProp {
    private SimpleStringProperty naam;
    private SimpleStringProperty keuze1;
    private SimpleStringProperty keuze2;
    private SimpleStringProperty keuze3;
    
    public KeuzeStudentProp(String naam, String keuze1, String keuze2, String keuze3) {
        this.naam = new SimpleStringProperty(naam);
        this.keuze1 = new SimpleStringProperty(keuze1);
        this.keuze2 = new SimpleStringProperty(keuze2);
        this.keuze3 = new SimpleStringProperty(keuze3);
    }

    public SimpleStringProperty studentProperty() {
        return naam;
    }

    public SimpleStringProperty keuze1Property() {
        return keuze1;
    }

    public SimpleStringProperty keuze2Property() {
        return keuze2;
    }

    public SimpleStringProperty keuze3Property() {
        return keuze3;
    }
}
