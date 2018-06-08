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
 * Klasse die alles van de KeuzeStudent uit de database haalt/zet/aanpast
 * 
 * @author Jonathan
 */
public class KeuzeStudentDB {
    
    private Connection connectie;
    
    /**
     * maakt de verbinding met de localhost, de tabel van de database bpkeuzes
     */
    public KeuzeStudentDB(){
        try {
            connectie = DriverManager.getConnection( "jdbc:mysql://localhost:3306/bpkeuzes",
                    "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Getter van de keuzes van de ingegeven naam uit de database
     * 
     * @param naam van de student
     * @return keuzes die de student heeft gemaakt
     */
    public ArrayList<String> getKeuzesVanStudent(String naam) {
        try {
            String sql = "select * FROM keuzestudent WHERE student = \""+naam+"\"";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<String> lijst = new ArrayList<>();
            while(results.next()){
                String keuze1 = results.getString("keuze1");
                String keuze2 = results.getString("keuze2");
                String keuze3= results.getString("keuze3");
                lijst.add(keuze1);
                lijst.add(keuze2);
                lijst.add(keuze3);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
    
    /**
     * getter van de namen van de studenten die hun keuze is opgeslagen in de database
     * 
     * @return namen van de studenten
     */
    public ArrayList<String> getNamenStudenten() {
        try {
            String sql = "select student from keuzestudent";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<String> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("student");
                lijst.add(naam);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
    
    /**
     * Functie om een keuze toe te voegen in de database
     * 
     * @param naam van de student
     * @param keuze1 die de student heeft gekozen
     * @param keuze2 die de student heeft gekozen
     * @param keuze3 die de student heeft gekozen
     */
    public void voegKeuzesStToe(String naam, String keuze1, String keuze2, String keuze3) {
        String sql = "insert into keuzestudent (student,keuze1,keuze2,keuze3)" + "values (?,?,?,?)"; //op vraagteken moet nog concrete data worden ingevoegd ergens anders
        // en om te vermijden da een tabel wordt verwijderd door iemand
        
        PreparedStatement stmt;
        try {
            stmt = connectie.prepareStatement(sql,
                            PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, naam);
            stmt.setString(2,keuze1);
            stmt.setString(3, keuze2);
            stmt.setString(4, keuze3);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    /**
     * Getter van de proeven alfabetisch geordent op de studenten
     * 
     * @return de keuzes van de studenten
     */
    public ArrayList<KeuzeStudent> getProevenOpStudent(){ 
        try {
            String sql = "select * from keuzestudent ORDER by student";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<KeuzeStudent> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("student");
                String keuze1 = results.getString("keuze1");
                String keuze2 = results.getString("keuze2");
                String keuze3 = results.getString("keuze3");
                KeuzeStudent keuzeSt = new KeuzeStudent(naam, keuze1, keuze2, keuze3);
                lijst.add(keuzeSt);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    /**
     * Getter van de proeven alfabetisch geordent op de keuze1
     * 
     * @return de keuzes van de studenten
     */
    public ArrayList<KeuzeStudent> getProevenOpKeuze1(){ 
        try {
            String sql = "select * from keuzestudent ORDER by keuze1";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<KeuzeStudent> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("student");
                String keuze1 = results.getString("keuze1");
                String keuze2 = results.getString("keuze2");
                String keuze3 = results.getString("keuze3");
                KeuzeStudent keuzeSt = new KeuzeStudent(naam, keuze1, keuze2, keuze3);
                lijst.add(keuzeSt);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    /**
     * Getter van de proeven alfabetisch geordent op de keuze2
     * 
     * @return de keuzes van de studenten
     */
    public ArrayList<KeuzeStudent> getProevenOpKeuze2(){ 
        try {
            String sql = "select * from keuzestudent ORDER by keuze2";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<KeuzeStudent> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("student");
                String keuze1 = results.getString("keuze1");
                String keuze2 = results.getString("keuze2");
                String keuze3 = results.getString("keuze3");
                KeuzeStudent keuzeSt = new KeuzeStudent(naam, keuze1, keuze2, keuze3);
                lijst.add(keuzeSt);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    /**
     * Getter van de proeven alfabetisch geordent op de keuze3
     * 
     * @return de keuzes van de studenten
     */
    public ArrayList<KeuzeStudent> getProevenOpKeuze3(){ 
        try {
            String sql = "select * from keuzestudent ORDER by keuze3";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<KeuzeStudent> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("student");
                String keuze1 = results.getString("keuze1");
                String keuze2 = results.getString("keuze2");
                String keuze3 = results.getString("keuze3");
                KeuzeStudent keuzeSt = new KeuzeStudent(naam, keuze1, keuze2, keuze3);
                lijst.add(keuzeSt);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(KeuzeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
