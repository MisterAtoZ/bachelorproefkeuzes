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
 * De klasse die de verbinding met de database maakt/onderhoudt
 * 
 * @author Jonathan
 */
public class StudentDB {
    
    private Connection connectie;
    
    /**
     * maakt de verbinding met de localhost, de tabel van de database bpkeuzes
     * 
     */
    public StudentDB(){
        try {
            connectie = DriverManager.getConnection( "jdbc:mysql://localhost:3306/bpkeuzes",
                    "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Functie om een student toe te voegen in de database
     * 
     * @param student die moet worden toegevoegd in de database
     */
    public void voegStudToe(Student student){
        String sql = "insert into student (naam,paswoord)" + "values (?,?)"; //op vraagteken moet nog concrete data worden ingevoegd ergens anders
        // en om te vermijden da een tabel wordt verwijderd door iemand
        
        PreparedStatement stmt;
        try {
            stmt = connectie.prepareStatement(sql,
                            PreparedStatement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, student.getNaam());
            stmt.setString(2,student.getPaswoord());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    /**
     * getter van de namen van de studenten 
     * 
     * @return ArrayList met de namen van de studenten
     */
    public ArrayList<String> getNamenStudenten() {
        try {
            String sql = "select naam from student";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<String> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("naam");
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
     * Geeft een ArrayList met alle studenten in de database
     * 
     * @return ArrayList met de studenten
     */
    public ArrayList<Student> getStudenten(){ 
        try {
            String sql = "select * from student ORDER by naam";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<Student> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("naam");
                String paswoord = results.getString("paswoord");
                int id = results.getInt("id");
                Student student = new Student(naam, paswoord);
                student.setId(id);
                lijst.add(student);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    /**
     * Functie om de naam van de student uit de database te halen
     * gebruikt voor de comboboxen te vullen
     * 
     * @return ArrayList met de namen 
     */
    public ArrayList<String> fillCombo(){ 
        try {
            String sql = "select * from student ORDER by naam";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<String> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("naam");
                lijst.add(naam);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
