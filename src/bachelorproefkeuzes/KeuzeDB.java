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
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<String> getProef(String naam) {
        String sql = "select proef FROM keuze WHERE student = \""+naam+"\"";
        
        try {
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<String> lijst = new ArrayList<>();
            while(results.next()){
                String proef = results.getString("proef");
                lijst.add(proef);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
    
    public void updatePunten(int punten, String student) {
        String sql = "UPDATE keuze SET punten = \""+punten+"\" WHERE student = \""+student+"\"";
        
        PreparedStatement stmt;
        try {
            stmt = connectie.prepareStatement(sql,
                            PreparedStatement.RETURN_GENERATED_KEYS);
            //stmt.setString(1, naam);
            //stmt.setString(2,proef);
            //stmt.setInt(3, punten);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
       
    public void voegKeuzesToe(String naam, String proef, int punten) {
        String sql = "insert into keuze (student,proef,punten)" + "values (?,?,?)"; //op vraagteken moet nog concrete data worden ingevoegd ergens anders
        // en om te vermijden da een tabel wordt verwijderd door iemand
        
        PreparedStatement stmt;
        try {
            stmt = connectie.prepareStatement(sql,
                            PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, naam);
            stmt.setString(2,proef);
            stmt.setInt(3, punten);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
        
    public ArrayList<String> getStudenten() {
        try {
            String sql = "select student from keuze";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<String> lijst = new ArrayList<>();
            while(results.next()){
                String student = results.getString("student");
                lijst.add(student);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
    
    public ArrayList<Keuze> getProevenOpNaam(){ 
        try {
            String sql = "select * from keuze ORDER by student";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<Keuze> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("student");
                String proef = results.getString("proef");
                int punten = results.getInt("punten");
                Keuze keuze = new Keuze(naam, proef, punten);
                lijst.add(keuze);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<Keuze> getProevenOpProef(){ 
        try {
            String sql = "select * from keuze ORDER by proef";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<Keuze> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("student");
                String proef = results.getString("proef");
                int punten = results.getInt("punten");
                Keuze keuze = new Keuze(naam, proef, punten);
                lijst.add(keuze);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<Keuze> getProevenOpPunten(){ 
        try {
            String sql = "select * from keuze ORDER by punten";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<Keuze> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("student");
                String proef = results.getString("proef");
                int punten = results.getInt("punten");
                Keuze keuze = new Keuze(naam, proef, punten);
                lijst.add(keuze);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
