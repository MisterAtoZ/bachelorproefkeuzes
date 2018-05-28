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
public class StudentDB {
    
    private Connection connectie;
    
    public StudentDB(){
        try {
            connectie = DriverManager.getConnection( "jdbc:mysql://localhost:3306/bpkeuzes",
                    "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(BachelorproevenDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Student> getProeven(){ 
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
}
