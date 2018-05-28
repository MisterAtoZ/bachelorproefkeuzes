/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bachelorproefkeuzes;

import java.net.URL;
import java.util.ArrayList;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FXMLDocumentController {
   
    @FXML
    private AnchorPane hoofdmenu;

    @FXML
    private Button knopNaarLijstBp;

    @FXML
    private Label labelHoofdmenu;

    @FXML
    private Button knopNaarBpToevoegen;
    
    @FXML
    private Button knopNaarLijstKeuzes;
    
    @FXML
    private AnchorPane lijstBp;

    @FXML
    private TableView<BP> bpTabel;

    @FXML
    private TableColumn<BP, String> titelKolom;

    @FXML
    private TableColumn<BP, String> beschrijvingKolom;
    
    @FXML
    private Label labelTitelLijst;

    @FXML
    private Button terugknopLijst;

    @FXML
    private AnchorPane bpToevoegen;

    @FXML
    private TextField titel;

    @FXML
    private Button voegBPtoe;

    @FXML
    private TextArea beschrijvingen;

    @FXML
    private Label labelTitel;

    @FXML
    private Label labelBeschrijving;

    @FXML
    private Button terugknopBpToevoegen;

    @FXML
    private Label labelTitelBpToevoegen;
    
    @FXML
    private AnchorPane lijstKeuze;

    @FXML
    private Button terugknopLijstKeuzes;

    @FXML
    private Button sorteerknopNaam;

    @FXML
    private Button sorteerknopProef;

    @FXML
    private Label titelLijstKeuze;

    @FXML
    private TableView<KeuzeProp> tabelKeuze;

    @FXML
    private TableColumn<KeuzeProp, String> kolomKeuzeNaam;

    @FXML
    private TableColumn<KeuzeProp, String> kolomKeuzeProef;

    @FXML
    private TableColumn<KeuzeProp, Number> kolomKeuzePunten;

    @FXML
    private Button sorteerknopPunten;
    
    
    private BachelorproevenDB modelBp;
    private KeuzeDB modelKeuze;

    @FXML
    void initialize() {
         modelBp = new BachelorproevenDB();
        hoofdmenu.setVisible(true);
        lijstBp.setVisible(false);
        bpToevoegen.setVisible(false);
        lijstKeuze.setVisible(false);
        //vulTabel();
        refresh();
    }
    
    public void refresh() {
        //knoppen hoofdmenu
        knopNaarLijstBp.setOnAction(event ->{hoofdmenu.setVisible(false); lijstBp.setVisible(true);vulTabelBp();});
        knopNaarBpToevoegen.setOnAction(ecent ->{hoofdmenu.setVisible(false);lijstBp.setVisible(false);bpToevoegen.setVisible(true);});
        knopNaarLijstKeuzes.setOnAction(event ->{hoofdmenu.setVisible(false);lijstKeuze.setVisible(true);vulTabelKeuzeOpNaam();});
        //knoppen lijstBp
        terugknopLijst.setOnAction(event->{hoofdmenu.setVisible(true); lijstBp.setVisible(false);bpToevoegen.setVisible(false);});
        //knoppen BPtoevoegen
        voegBPtoe.setOnAction(event -> voegBPToe());
        terugknopBpToevoegen.setOnAction(event->{hoofdmenu.setVisible(true); lijstBp.setVisible(false);bpToevoegen.setVisible(false);});
        //Knoppen lijstKeuzes
        sorteerknopNaam.setOnAction(event -> vulTabelKeuzeOpNaam());
        sorteerknopProef.setOnAction(event -> vulTabelKeuzeOpProef());
        sorteerknopPunten.setOnAction(event -> vulTabelKeuzeOpPunten());
        terugknopLijstKeuzes.setOnAction(event ->{hoofdmenu.setVisible(true);lijstKeuze.setVisible(false);});
    }
    
    public void voegBPToe(){
        Bachelorproef nieuw = new Bachelorproef(titel.getText(), 
                                                beschrijvingen.getText());
        modelBp.voegToe(nieuw);
        ArrayList<Bachelorproef> alles = modelBp.getProeven();
        voegBPtoe.setText(alles.size() + " proeven");
        vulTabelBp();
    }
    
    
    public void vulTabelBp() {
        ArrayList<Bachelorproef> alles = modelBp.getProeven();
        ObservableList<BP> bps = FXCollections.observableArrayList();
        for(Bachelorproef bp : alles) {
            bps.add(new BP(bp.getTitel(), bp.getBeschrijving()));
        }
        titelKolom.setCellValueFactory(rij -> rij.getValue().titelProperty());
        beschrijvingKolom.setCellValueFactory(rij -> rij.getValue().beschrijvingProperty());
        
        bpTabel.setItems(bps);
    }
    
        public void vulTabelKeuzeOpNaam() {
        ArrayList<Keuze> alles = modelKeuze.getProevenOpNaam();
        ObservableList<KeuzeProp> keuzes = FXCollections.observableArrayList();
        for(Keuze keuze : alles) {
            keuzes.add(new KeuzeProp(keuze.getNaam(), keuze.getProef(), keuze.getPunten()));
        }
        kolomKeuzeNaam.setCellValueFactory((rij -> rij.getValue().naamProperty()));
        kolomKeuzeProef.setCellValueFactory(rij -> rij.getValue().proefProperty());
        kolomKeuzePunten.setCellValueFactory(rij -> rij.getValue().puntenProperty());
        
        tabelKeuze.setItems(keuzes);
    }
        
    public void vulTabelKeuzeOpProef() {
        ArrayList<Keuze> alles = modelKeuze.getProevenOpProef();
        ObservableList<KeuzeProp> keuzes = FXCollections.observableArrayList();
        for(Keuze keuze : alles) {
            keuzes.add(new KeuzeProp(keuze.getNaam(), keuze.getProef(), keuze.getPunten()));
        }
        kolomKeuzeNaam.setCellValueFactory((rij -> rij.getValue().naamProperty()));
        kolomKeuzeProef.setCellValueFactory(rij -> rij.getValue().proefProperty());
        kolomKeuzePunten.setCellValueFactory(rij -> rij.getValue().puntenProperty());
        
        tabelKeuze.setItems(keuzes);
    }
    
    public void vulTabelKeuzeOpPunten() {
        ArrayList<Keuze> alles = modelKeuze.getProevenOpPunten();
        ObservableList<KeuzeProp> keuzes = FXCollections.observableArrayList();
        for(Keuze keuze : alles) {
            keuzes.add(new KeuzeProp(keuze.getNaam(), keuze.getProef(), keuze.getPunten()));
        }
        kolomKeuzeNaam.setCellValueFactory((rij -> rij.getValue().naamProperty()));
        kolomKeuzeProef.setCellValueFactory(rij -> rij.getValue().proefProperty());
        kolomKeuzePunten.setCellValueFactory(rij -> rij.getValue().puntenProperty());
        
        tabelKeuze.setItems(keuzes);
    }
}

