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
 * Klasse die de verbinding met de database van de docent maakt
 * 
 * @author Jonathan
 */
public class DocentDB {
    private Connection connectie;
    
    /**
     * Maakt de verbinding met de localhost, de tabel bpkeuzes uit de database
     */
    public DocentDB(){
        try {
            connectie = DriverManager.getConnection( "jdbc:mysql://localhost:3306/bpkeuzes",
                    "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * getter van de docenten uit de database
     * 
     * @return String met de docenten 
     */
    public ArrayList<Docent> getDocenten(){ 
        try {
            String sql = "select * from docent";
            PreparedStatement stmt =
                    connectie.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();
            ArrayList<Docent> lijst = new ArrayList<>();
            while(results.next()){
                String naam = results.getString("naam");
                String paswoord = results.getString("paswoord");
                int id = results.getInt("id");
                Docent docent = new Docent(naam, paswoord);
                docent.setId(id);
                lijst.add(docent);
            }
            stmt.close();
            return lijst;
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
