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
    private Button knopNaarLijstKeuzesSt;

    @FXML
    private Button knopNaarKeuzeIndienen;

    @FXML
    private Label labelVoorStudenten;

    @FXML
    private Label labelVoorDocenten;

    @FXML
    private Button knopNaarLijstToewijzigingenkeuzes;

    @FXML
    private Button knopNaarInloggenDocent;

    @FXML
    private AnchorPane lijstBp;

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
    private Label labelOpgeslagen;

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
    private Button sorteerknopPunten;

    @FXML
    private AnchorPane keuzeToevoegen;

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

    @FXML
    private Label labelFoutKeuzeT;

    @FXML
    private Label labelNaamAlIngediend;

    @FXML
    private AnchorPane inloggenDocent;

    @FXML
    private Label labelTitelInloggenDocent;

    @FXML
    private Label labelNaamInlD;

    @FXML
    private Label labelPaswoordInlD;

    @FXML
    private TextField textfieldNaamInlD;

    @FXML
    private TextField textfieldPaswoordInlD;

    @FXML
    private Button knopInloggenD;

    @FXML
    private Button knopHoofdmenuInlD;

    @FXML
    private Label labelFoutDocent;

    @FXML
    private AnchorPane actiesDocent;

    @FXML
    private Button knopNaarKeuzeToewijzen;

    @FXML
    private Button knopNaarPuntenToewijzen;

    @FXML
    private Button knopNaarStudentToevoegen;

    @FXML
    private Button knopNaarBpToevoegen;

    @FXML
    private Label labelTitelActiesDocent;

    @FXML
    private AnchorPane LijstKeuzeSt;

    @FXML
    private Label labelTitelKeuzeSt;

    @FXML
    private Button knopKeuzeStSortStu;

    @FXML
    private Button knopkeuzeStSortKeuze1;

    @FXML
    private Button knopkeuzeStSortKeuze2;

    @FXML
    private Button knopkeuzeStSortKeuze3;

    @FXML
    private Button knopHoofdmenuKeuzeSt;

    @FXML
    private AnchorPane keuzeToewijzen;

    @FXML
    private Label labelTitelKeuzeToewijzen;

    @FXML
    private Label labelStudentKeuzeToew;

    @FXML
    private Label labelKeuzeKeuzeToew;

    @FXML
    private Label labelFoutKeuzeToew;

    @FXML
    private Button knopBevestigenKeuzeToew;

    @FXML
    private Button knopHoofdmenuKeuzeToev;

    @FXML
    private Label labelFoutKeuzeToew1;
    
    @FXML
    private Button knopTerugKeuzeToewijzen;
    
    @FXML
    private TableView<BP> bpTabel;

    @FXML
    private TableColumn<BP, String> titelKolom;

    @FXML
    private TableColumn<BP, String> beschrijvingKolom;

    @FXML
    private TableView<KeuzeProp> tabelKeuze;

    @FXML
    private TableColumn<KeuzeProp, String> kolomKeuzeNaam;

    @FXML
    private TableColumn<KeuzeProp, String> kolomKeuzeProef;

    @FXML
    private TableColumn<KeuzeProp, Number> kolomKeuzePunten;

    @FXML
    private ComboBox<String> comboboxNaamKeuzeT;

    @FXML
    private ComboBox<String> comboboxKeuze1KeuzeT;

    @FXML
    private ComboBox<String> comboboxKeuze2KeuzeT;

    @FXML
    private ComboBox<String> comboboxKeuze3KeuzeT;
    
    @FXML
    private TableView<KeuzeStudentProp> tabelKeuzeSt;

    @FXML
    private TableColumn<KeuzeStudentProp, String> kolomKeuzeStStudent;

    @FXML
    private TableColumn<KeuzeStudentProp, String> kolomKeuzeStKeuze1;

    @FXML
    private TableColumn<KeuzeStudentProp, String> kolomKeuzeStKeuze2;

    @FXML
    private TableColumn<KeuzeStudentProp, String> kolomKeuzeStKeuze3;
    
    @FXML
    private ComboBox<String> comboboxStudentKeuzeToew;

    @FXML
    private ComboBox<String> comboboxKeuzeKeuzeToew;
    
    @FXML
    private Label labelOkeKeuzeToewijzen;
    
    @FXML
    private Label labelFoutKeuzeToew2;
    
    private BachelorproevenDB modelBp;
    private KeuzeDB modelKeuze;
    private StudentDB modelStudent;
    private DocentDB modelDocent;
    private KeuzeStudentDB modelKeuzeSt;

    @FXML
    void initialize() {
        modelBp = new BachelorproevenDB();
        modelKeuze = new KeuzeDB();
        modelStudent = new StudentDB();
        modelDocent = new DocentDB();
        modelKeuzeSt = new KeuzeStudentDB();
        
        hoofdmenu.setVisible(true);
        lijstBp.setVisible(false);
        bpToevoegen.setVisible(false);
        lijstKeuze.setVisible(false);
        keuzeToevoegen.setVisible(false);
        inloggenDocent.setVisible(false);
        LijstKeuzeSt.setVisible(false);
        keuzeToewijzen.setVisible(false);
        actiesDocent.setVisible(false);
        
        labelFoutKeuzeT.setVisible(false);
        labelFoutDocent.setVisible(false);
        labelOpgeslagen.setVisible(false);
        labelNaamAlIngediend.setVisible(false);
        labelFoutKeuzeToew.setVisible(false);
        labelFoutKeuzeToew1.setVisible(false);
        labelFoutKeuzeToew2.setVisible(false);
        labelOkeKeuzeToewijzen.setVisible(false);
        refresh();
    }
    
    public void refresh() {
        //knoppen hoofdmenu
        knopNaarLijstBp.setOnAction(event ->{hoofdmenu.setVisible(false); lijstBp.setVisible(true);vulTabelBp();});
        knopNaarInloggenDocent.setOnAction(event ->{hoofdmenu.setVisible(false);inloggenDocent.setVisible(true);});//gaat naar inlogscherm docent
        knopNaarLijstKeuzesSt.setOnAction(event ->{hoofdmenu.setVisible(false);LijstKeuzeSt.setVisible(true);vulTabelKeuzeStOpStudent();});
        knopNaarKeuzeIndienen.setOnAction(event ->{hoofdmenu.setVisible(false);keuzeToevoegen.setVisible(true);keuzeToevoegen();});//keuze aanpassen, dat iedere student maar 1 keer kan toevoegen
        knopNaarLijstToewijzigingenkeuzes.setOnAction(event ->{hoofdmenu.setVisible(false); lijstKeuze.setVisible(true);vulTabelKeuzeOpNaam();});
        //knopNaarStudentToevoegen nog maken!
        //knoppen lijstBp
        terugknopLijst.setOnAction(event->{hoofdmenu.setVisible(true); lijstBp.setVisible(false);bpToevoegen.setVisible(false);});
        //knoppen BPtoevoegen
        voegBPtoe.setOnAction(event -> voegBPToe());
        terugknopBpToevoegen.setOnAction(event->{hoofdmenu.setVisible(true); bpToevoegen.setVisible(false); labelOpgeslagen.setVisible(false);});
        //Knoppen lijstKeuzes
        sorteerknopNaam.setOnAction(event -> vulTabelKeuzeOpNaam());
        sorteerknopProef.setOnAction(event -> vulTabelKeuzeOpProef());
        sorteerknopPunten.setOnAction(event -> vulTabelKeuzeOpPunten());
        terugknopLijstKeuzes.setOnAction(event ->{hoofdmenu.setVisible(true);lijstKeuze.setVisible(false);});
        //knoppen keuzeToevoegen
        knopBevestigenKeuzeT.setOnAction(event ->{voegKeuzeToe();});
        terugKeuzeT.setOnAction(event->initialize());
        //knoppen inloggenDocent
        knopInloggenD.setOnAction(event ->{if(controlerenDocent()==true){inloggenDocent.setVisible(false);labelFoutDocent.setVisible(false); actiesDocent.setVisible(true);}});
        knopHoofdmenuInlD.setOnAction(event ->{hoofdmenu.setVisible(true);inloggenDocent.setVisible(false);labelFoutDocent.setVisible(false);});
        //knoppen acties docenten
        knopNaarBpToevoegen.setOnAction(event ->{actiesDocent.setVisible(false);bpToevoegen.setVisible(true);});
        knopNaarKeuzeToewijzen.setOnAction(event -> {actiesDocent.setVisible(false); keuzeToewijzen.setVisible(true); keuzeToewijzen();});
        //knoppen naar lijstKeuzeSt
        knopKeuzeStSortStu.setOnAction(event ->{vulTabelKeuzeStOpStudent();});
        knopkeuzeStSortKeuze1.setOnAction(event ->{vulTabelKeuzeStOpKeuze1();});
        knopkeuzeStSortKeuze2.setOnAction(event -> {vulTabelKeuzeStOpKeuze2();});
        knopkeuzeStSortKeuze3.setOnAction(event ->{vulTabelKeuzeStOpKeuze3();});
        knopHoofdmenuKeuzeSt.setOnAction(event ->{hoofdmenu.setVisible(true); LijstKeuzeSt.setVisible(false);});
        //knoppen lijst toegewezen keuzes
        terugknopLijstKeuzes.setOnAction(event-> initialize());
        sorteerknopNaam.setOnAction(event -> vulTabelKeuzeOpNaam());
        sorteerknopProef.setOnAction(event -> vulTabelKeuzeOpProef());
        sorteerknopPunten.setOnAction(event -> vulTabelKeuzeOpPunten());
        //knoppen keuze toewijzen
        knopBevestigenKeuzeToew.setOnAction(event->voegDefKeuzeToe());
        knopHoofdmenuKeuzeToev.setOnAction(event -> initialize());
        knopTerugKeuzeToewijzen.setOnAction(event ->{actiesDocent.setVisible(true); keuzeToewijzen.setVisible(false);});
    }
    
    public void keuzeToewijzen() {
        ObservableList<String> namenKeuzeLijst = FXCollections.observableArrayList(modelKeuzeSt.getNamenStudenten());
        if(namenKeuzeLijst.isEmpty()==true) {
            labelFoutKeuzeToew.setVisible(false);
            labelFoutKeuzeToew1.setVisible(false);
            labelFoutKeuzeToew2.setVisible(true);
        }
        else {
        comboboxStudentKeuzeToew.setItems(namenKeuzeLijst);
        comboboxStudentKeuzeToew.setValue(namenKeuzeLijst.get(0));
        String naam = comboboxStudentKeuzeToew.getValue();
        ObservableList<String> keuzesVanStudent = FXCollections.observableArrayList(modelKeuzeSt.getKeuzesVanStudent(naam));

        comboboxKeuzeKeuzeToew.setItems(keuzesVanStudent);//query nog voor schrijven!
        }
    }
    
    public void voegDefKeuzeToe() {
        //keuze toevoegen aan de lijst
        String student = comboboxStudentKeuzeToew.getValue();
        String keuze = comboboxKeuzeKeuzeToew.getValue();
        
        if(student.isEmpty()||keuze.isEmpty()) {labelFoutKeuzeToew.setVisible(true);labelFoutKeuzeToew1.setVisible(false); labelFoutKeuzeToew2.setVisible(false);}
        else {
            //controleren of de student al in de lijst zit
            //keuze toevoegen
            ObservableList<String> namenInLijst = FXCollections.observableArrayList(modelKeuze.getStudenten());
        
            if(namenInLijst.contains(student)){
                //de naam zit al in de lijst en kan niet nog eens worden toegevoegd
                labelFoutKeuzeToew1.setVisible(true);
                labelOkeKeuzeToewijzen.setVisible(false);
                labelFoutKeuzeToew.setVisible(false);
            }
            else {
                labelFoutKeuzeToew.setVisible(false);
                labelFoutKeuzeToew1.setVisible(false);
                labelFoutKeuzeToew2.setVisible(false);
                int punten = 0;
                modelKeuze.voegKeuzesToe(student, keuze, punten);
                labelOkeKeuzeToewijzen.setVisible(true);
            }
        }
    }
        
    
    public void vulTabelKeuzeStOpStudent() {
        ArrayList<KeuzeStudent> alles = modelKeuzeSt.getProevenOpStudent();
        ObservableList<KeuzeStudentProp> keuzes = FXCollections.observableArrayList();
        for(KeuzeStudent keuze : alles) {
            keuzes.add(new KeuzeStudentProp(keuze.getStudent(), keuze.getKeuze1(), keuze.getKeuze2(), keuze.getKeuze3()));
        }
        kolomKeuzeStStudent.setCellValueFactory((rij -> rij.getValue().studentProperty()));
        kolomKeuzeStKeuze1.setCellValueFactory(rij -> rij.getValue().keuze1Property());
        kolomKeuzeStKeuze2.setCellValueFactory(rij -> rij.getValue().keuze2Property());
        kolomKeuzeStKeuze3.setCellValueFactory(rij -> rij.getValue().keuze3Property());
        
        tabelKeuzeSt.setItems(keuzes);
    }
    
    public void vulTabelKeuzeStOpKeuze1() {
        ArrayList<KeuzeStudent> alles = modelKeuzeSt.getProevenOpKeuze1();
        ObservableList<KeuzeStudentProp> keuzes = FXCollections.observableArrayList();
        for(KeuzeStudent keuze : alles) {
            keuzes.add(new KeuzeStudentProp(keuze.getStudent(), keuze.getKeuze1(), keuze.getKeuze2(), keuze.getKeuze3()));
        }
        kolomKeuzeStStudent.setCellValueFactory((rij -> rij.getValue().studentProperty()));
        kolomKeuzeStKeuze1.setCellValueFactory(rij -> rij.getValue().keuze1Property());
        kolomKeuzeStKeuze2.setCellValueFactory(rij -> rij.getValue().keuze2Property());
        kolomKeuzeStKeuze3.setCellValueFactory(rij -> rij.getValue().keuze3Property());
        
        tabelKeuzeSt.setItems(keuzes);
    }
    
    public void vulTabelKeuzeStOpKeuze2() {
        ArrayList<KeuzeStudent> alles = modelKeuzeSt.getProevenOpKeuze2();
        ObservableList<KeuzeStudentProp> keuzes = FXCollections.observableArrayList();
        for(KeuzeStudent keuze : alles) {
            keuzes.add(new KeuzeStudentProp(keuze.getStudent(), keuze.getKeuze1(), keuze.getKeuze2(), keuze.getKeuze3()));
        }
        kolomKeuzeStStudent.setCellValueFactory((rij -> rij.getValue().studentProperty()));
        kolomKeuzeStKeuze1.setCellValueFactory(rij -> rij.getValue().keuze1Property());
        kolomKeuzeStKeuze2.setCellValueFactory(rij -> rij.getValue().keuze2Property());
        kolomKeuzeStKeuze3.setCellValueFactory(rij -> rij.getValue().keuze3Property());
        
        tabelKeuzeSt.setItems(keuzes);
    }
    
    public void vulTabelKeuzeStOpKeuze3() {
        ArrayList<KeuzeStudent> alles = modelKeuzeSt.getProevenOpKeuze3();
        ObservableList<KeuzeStudentProp> keuzes = FXCollections.observableArrayList();
        for(KeuzeStudent keuze : alles) {
            keuzes.add(new KeuzeStudentProp(keuze.getStudent(), keuze.getKeuze1(), keuze.getKeuze2(), keuze.getKeuze3()));
        }
        kolomKeuzeStStudent.setCellValueFactory((rij -> rij.getValue().studentProperty()));
        kolomKeuzeStKeuze1.setCellValueFactory(rij -> rij.getValue().keuze1Property());
        kolomKeuzeStKeuze2.setCellValueFactory(rij -> rij.getValue().keuze2Property());
        kolomKeuzeStKeuze3.setCellValueFactory(rij -> rij.getValue().keuze3Property());
        
        tabelKeuzeSt.setItems(keuzes);
    }
       
    public boolean controlerenDocent() {
        String naam = textfieldNaamInlD.getText();
        String paswoord = textfieldPaswoordInlD.getText();

        ObservableList<Docent> docenten = FXCollections.observableArrayList(modelDocent.getDocenten());
        for (int i=0; i<docenten.size();i++) {
            if(docenten.get(i).getNaam().equals(naam) && docenten.get(i).getPaswoord().equals(paswoord)) {
                return true;
            }
            else {
                labelFoutDocent.setVisible(true);
                return false;
            }
        } 
        return false;
    }
    
    public void keuzeToevoegen() {
        ObservableList<String> namen = FXCollections.observableArrayList(modelStudent.fillCombo());
        comboboxNaamKeuzeT.setItems(namen);
        
        ObservableList<String> bps = FXCollections.observableArrayList(modelBp.fillCombo());
        comboboxKeuze1KeuzeT.setItems(bps);
        comboboxKeuze2KeuzeT.setItems(bps);
        comboboxKeuze3KeuzeT.setItems(bps);
    }
       
    public void voegKeuzeToe() {
        String naam = comboboxNaamKeuzeT.getValue();
        String keuze1 = comboboxKeuze1KeuzeT.getValue();
        String keuze2 = comboboxKeuze2KeuzeT.getValue();
        String keuze3 = comboboxKeuze3KeuzeT.getValue();
        String paswoord = textfieldPaswoordKeuzeT.getText();
 
        ObservableList<String> namenInLijst = FXCollections.observableArrayList(modelKeuzeSt.getNamenStudenten());
        
       if(namenInLijst.contains(naam)==false || namenInLijst.isEmpty()){
            labelNaamAlIngediend.setVisible(false);
            if(modelKeuzeSt.isHetWWJuist(naam, paswoord)==true) {
                if(keuze1!=keuze2 || keuze1!=keuze3 || keuze2!=keuze3) {
                    modelKeuzeSt.voegKeuzesStToe(naam, keuze1, keuze2, keuze3);
                    initialize();
                }
                else {labelFoutKeuzeT.setVisible(true);}
            }
            else{labelFoutKeuzeT.setVisible(true);}//verkeerde ww}}
        }
        else {
            //de naam zit al in de lijst en kan niet nog eens worden toegevoegd
            labelNaamAlIngediend.setVisible(true);
            labelFoutKeuzeT.setVisible(false);
        }
    }
    
    public void voegBPToe(){
        Bachelorproef nieuw = new Bachelorproef(titel.getText(), 
                                                beschrijvingen.getText());
        modelBp.voegToe(nieuw);
        ArrayList<Bachelorproef> alles = modelBp.getProeven();
        labelOpgeslagen.setVisible(true);
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

