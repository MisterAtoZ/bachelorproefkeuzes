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
 * Klasse die alles van de Bachelorproef uit de database haalt/zet/aanpast
 * 
 * @author Jonathan
 */
public class BachelorproevenDB {
    //hier komen de query's
    
    private Connection connectie;
    
    /**
     * maakt de verbinding met de localhost, de tabel van de database bpkeuzes
     * 
     */
    public BachelorproevenDB(){
        try {
            connectie = DriverManager.getConnection( "jdbc:mysql://localhost:3306/bpkeuzes",
                    "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Functie om een bachelorproef toe te voegen in de database
     * 
     * @param bp bachelorproef die moet worden toegevoegd in de database
     */
    public void voegToe(Bachelorproef bp){
        String sql = "insert into bp (titel,beschrijving)" + "values (?,?)"; //op vraagteken moet nog concrete data worden ingevoegd ergens anders
        // en om te vermijden da een tabel wordt verwijderd door iemand
        
        PreparedStatement stmt;
        try {
            stmt = connectie.prepareStatement(sql,
                            PreparedStatement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, bp.getTitel());
            stmt.setString(2,bp.getBeschrijving());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    /**
     * getter van de bachelorproeven die al in de database staan
     * De proeven staan alfabetisch gerangschikt op titel
     * 
     * @return bachelorproeven op alfabetische volgorde
     */
    public ArrayList<Bachelorproef> getProeven(){
        
        try {
            String sql = "select * from bp ORDER by titel";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<Bachelorproef> lijst = new ArrayList<>();
            while(results.next()){
                String titel = results.getString("titel");
                String beschr = results.getString("beschrijving");
                int id = results.getInt("id");
                Bachelorproef bp = new Bachelorproef(titel,beschr);
                bp.setId(id);
                lijst.add(bp);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    /**
     * Functie om de combobox met de namen van de bachelorproeven te vullen
     * 
     * @return String met de titels van de bachelorproeven 
     */
    public ArrayList<String> fillCombo(){
        
        try {
            String sql = "select * from bp ORDER by titel";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<String> lijst = new ArrayList<>();
            while(results.next()){
                String titel = results.getString("titel");
                lijst.add(titel);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
