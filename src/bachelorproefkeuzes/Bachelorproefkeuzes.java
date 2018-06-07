package bachelorproefkeuzes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hoofdklasse van dit programma
 * 
 * @author Jonathan
 */
public class Bachelorproefkeuzes extends Application {
    //toevoegen voor git
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Voor MySQL
            System.out.println("Laden van de driver is gelukt.");
            }
        catch (ClassNotFoundException e) {
        System.err.println("Kan de driver niet laden.");
        return;
        }
        
        launch(args);
    }
        
        
    
    
}
