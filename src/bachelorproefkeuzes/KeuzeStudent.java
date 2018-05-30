/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachelorproefkeuzes;

/**
 *
 * @author Jonathan
 */
public class KeuzeStudent {
    private String student;
    private String keuze1;
    private String keuze2;
    private String keuze3;

    public KeuzeStudent(String student, String keuze1, String keuze2, String keuze3) {
        this.student = student;
        this.keuze1 = keuze1;
        this.keuze2 = keuze2;
        this.keuze3 = keuze3;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getKeuze1() {
        return keuze1;
    }

    public void setKeuze1(String keuze1) {
        this.keuze1 = keuze1;
    }

    public String getKeuze2() {
        return keuze2;
    }

    public void setKeuze2(String keuze2) {
        this.keuze2 = keuze2;
    }

    public String getKeuze3() {
        return keuze3;
    }

    public void setKeuze3(String keuze3) {
        this.keuze3 = keuze3;
    }
}
