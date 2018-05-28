/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachelorproefkeuzes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonathan
 */
public class KeuzeDB {
    
    private Connection connectie;
    
    public KeuzeDB(){
        try {
            connectie = DriverManager.getConnection( "jdbc:mysql://localhost:3306/bpkeuzes",
                    "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Keuze> getProevenOpNaam(){ 
        try {
            String sql = "select * from Keuze ORDER by naam";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<Keuze> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("naam");
                String paswoord = results.getString("paswoord");
                int punten = results.getInt("punten");
                Keuze keuze = new Keuze(naam, paswoord, punten);
                lijst.add(keuze);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<Keuze> getProevenOpProef(){ 
        try {
            String sql = "select * from Keuze ORDER by proef";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<Keuze> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("naam");
                String paswoord = results.getString("paswoord");
                int punten = results.getInt("punten");
                Keuze keuze = new Keuze(naam, paswoord, punten);
                lijst.add(keuze);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<Keuze> getProevenOpPunten(){ 
        try {
            String sql = "select * from Keuze ORDER by punten";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<Keuze> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("naam");
                String paswoord = results.getString("paswoord");
                int punten = results.getInt("punten");
                Keuze keuze = new Keuze(naam, paswoord, punten);
                lijst.add(keuze);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
