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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
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
    private Button knopNaarKeuzeToevoegen;
    
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
    
    @FXML
    private AnchorPane keuzeToevoegen;

    @FXML
    private ComboBox<String> comboboxNaamKeuzeT;

    @FXML
    private ComboBox<String> comboboxKeuze1KeuzeT;

    @FXML
    private ComboBox<String> comboboxKeuze2KeuzeT;

    @FXML
    private ComboBox<String> comboboxKeuze3KeuzeT;

    @FXML
    private Label labelTitelKeuzeToevoegen;

    @FXML
    private Label labelNaamKeuzeToevoegen;

    @FXML
    private Label LabelKeuze1KeuzeToevoegen;

    @FXML
    private Label labelKeuze2KeuzeToevoegen;

    @FXML
    private Label labelKeuze3KeuzeToevoegen;

    @FXML
    private TextField textfieldPaswoordKeuzeT;

    @FXML
    private Label labelPaswoordKeuzeToevoegen;

    @FXML
    private Button knopBevestigenKeuzeT;

    @FXML
    private Button terugKeuzeT;
    
    
    private BachelorproevenDB modelBp;
    private KeuzeDB modelKeuze;
    private StudentDB modelStudent;

    @FXML
    void initialize() {
        modelBp = new BachelorproevenDB();
        modelKeuze = new KeuzeDB();
        modelStudent = new StudentDB();
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
        knopNaarKeuzeToevoegen.setOnAction(event ->{hoofdmenu.setVisible(false);keuzeToevoegen.setVisible(true);keuzeToevoegen();});
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
        //knoppen keuzeToevoegen
        knopBevestigenKeuzeT.setOnAction(event ->{hoofdmenu.setVisible(true);keuzeToevoegen.setVisible(false);});
        terugKeuzeT.setOnAction(event ->{hoofdmenu.setVisible(true);keuzeToevoegen.setVisible(false);});
    }
    
    public void keuzeToevoegen() {
        //naam invullen in combobox+alle keuzes
        //paswoord gedaan krijgen
        ObservableList<String> namen = FXCollections.observableArrayList(modelStudent.fillCombo());
        comboboxNaamKeuzeT.setItems(namen);
        
        ObservableList<String> bps = FXCollections.observableArrayList(modelBp.fillCombo());
        comboboxKeuze1KeuzeT.setItems(bps);
        comboboxKeuze2KeuzeT.setItems(bps);
        comboboxKeuze3KeuzeT.setItems(bps);
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

