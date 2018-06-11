package bachelorproefkeuzes;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * Klasse die de controller is van het programma
 * 
 * @author Jonathan
 */
public class FXMLDocumentController {
    
     @FXML
    private AnchorPane hoofdmenu;

    @FXML
    private Button knopNaarLijstBp;

    @FXML
    private Button knopNaarLijstToewijzigingenkeuzes;

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
    private Button knopNaarInloggenDocent;

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
    private TextArea beschrijvingen;

    @FXML
    private Button voegBPtoe;

    @FXML
    private Label labelTitel;

    @FXML
    private Label labelBeschrijving;

    @FXML
    private Button knopTerugLijstBp;

    @FXML
    private Button terugknopBpToevoegen;

    @FXML
    private Label labelTitelBpToevoegen;

    @FXML
    private Label labelOpgeslagen;

    @FXML
    private Label labelFoutBpToev;

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
    private TableView<KeuzeProp> tabelKeuze;

    @FXML
    private TableColumn<KeuzeProp, String> kolomKeuzeNaam;

    @FXML
    private TableColumn<KeuzeProp, String> kolomKeuzeProef;

    @FXML
    private TableColumn<KeuzeProp, Number> kolomKeuzePunten;

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
    private Label labelPaswoordKeuzeToevoegen;

    @FXML
    private Button terugKeuzeT;

    @FXML
    private ComboBox<String> comboboxNaamKeuzeT;

    @FXML
    private ComboBox<String> comboboxKeuze1KeuzeT;

    @FXML
    private ComboBox<String> comboboxKeuze2KeuzeT;

    @FXML
    private ComboBox<String> comboboxKeuze3KeuzeT;

    @FXML
    private PasswordField textfieldPaswoordKeuzeT;

    @FXML
    private Button knopBevestigenKeuzeT;

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
    private PasswordField textfieldPaswoordInlD;

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
    private Button knopNaarKeuzeVerwijderen;

    @FXML
    private Button knopNaarPuntenToewijzen;

    @FXML
    private Button knopNaarStudentToevoegen;

    @FXML
    private Button knopNaarBpToevoegen;

    @FXML
    private Label labelTitelActiesDocent;

    @FXML
    private Button knopHoofdmenuActiesDocenten;

    @FXML
    private AnchorPane LijstKeuzeSt;

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
    private ComboBox<String> comboboxStudentKeuzeToew;

    @FXML
    private ComboBox<String> comboboxKeuzeKeuzeToew;

    @FXML
    private Label labelStudentKeuzeToew;

    @FXML
    private Label labelKeuzeKeuzeToew;

    @FXML
    private Label labelFoutKeuzeToew;

    @FXML
    private Button knopBevestigenKeuzeToew;

    @FXML
    private Button knopTerugKeuzeToewijzen;

    @FXML
    private Button knopHoofdmenuKeuzeToev;

    @FXML
    private Label labelFoutKeuzeToew1;

    @FXML
    private Label labelOkeKeuzeToewijzen;

    @FXML
    private Label labelFoutKeuzeToew2;

    @FXML
    private AnchorPane studentToevoegen;

    @FXML
    private Label titellabelStudToev;

    @FXML
    private Label labelNaamStudToev;

    @FXML
    private Label labelPaswStudToev;

    @FXML
    private TextField textfieldNaamStudToev;

    @FXML
    private Label labelBevestigStudToev;

    @FXML
    private Label labelFoutStudToev;

    @FXML
    private Label labelFoutStudToev1;

    @FXML
    private PasswordField textfieldPaswStudToev;

    @FXML
    private Button bevestigknopStudToev;

    @FXML
    private Button terugknopStudToev;

    @FXML
    private Button terugNaarHoofdmStudToev;

    @FXML
    private AnchorPane puntenToewijzen;

    @FXML
    private Label labelTitelPuntenToew;

    @FXML
    private Label labelStudentPuntenToew;

    @FXML
    private ComboBox<String> comboboxStudentPuntenToew;

    @FXML
    private TextField textfieldPuntenPuntenToew;

    @FXML
    private Button bevestigknopPuntenToew;

    @FXML
    private Button terugknopPuntenToew;

    @FXML
    private Button HoofdmenuPuntenToew;

    @FXML
    private Label labelProefVnStPuntenToew;

    @FXML
    private Label labelFoutPuntenToew;

    @FXML
    private Label labelToegewPuntenToew;

    @FXML
    private AnchorPane keuzeVerwijderen;

    @FXML
    private Label labelTitelKeuzeVerw;

    @FXML
    private Label labelStudentKeuzeVerw;

    @FXML
    private ComboBox<String> comboboxStudentKeuzeVerw;

    @FXML
    private Button bevestigknopKeuzeVerw;

    @FXML
    private Button terugknopKeuzeVerw;

    @FXML
    private Button HoofdmenuKeuzeVerw;

    @FXML
    private Label labelKeuzeVerw;

    @FXML
    private AnchorPane bevestigPane;

    @FXML
    private Label labelBevestigPane;

    @FXML
    private Button knopBevestigBevestigPane;

    @FXML
    private Button knopAnnulerenBevestigPane;
    
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
        studentToevoegen.setVisible(false);
        puntenToewijzen.setVisible(false);
        keuzeVerwijderen.setVisible(false);
        bevestigPane.setVisible(false);
        
        labelFoutKeuzeT.setVisible(false);
        labelFoutDocent.setVisible(false);
        labelOpgeslagen.setVisible(false);
        labelFoutBpToev.setVisible(false);
        labelNaamAlIngediend.setVisible(false);
        labelFoutKeuzeToew.setVisible(false);
        labelFoutKeuzeToew1.setVisible(false);
        labelFoutKeuzeToew2.setVisible(false);
        labelOkeKeuzeToewijzen.setVisible(false);
        labelFoutStudToev.setVisible(false);
        labelFoutStudToev1.setVisible(false);
        labelBevestigStudToev.setVisible(false);
        labelFoutPuntenToew.setVisible(false);
        labelToegewPuntenToew.setVisible(false); 
        labelKeuzeVerw.setVisible(false);
        refresh();
    }
    
    /**
     * Functie die constant wordt gerunt om te controleren of er iets is verandert
     * 
     */
    public void refresh() {
        //knoppen hoofdmenu
        knopNaarLijstBp.setOnAction(event ->{hoofdmenu.setVisible(false); lijstBp.setVisible(true);vulTabelBp();});
        knopNaarInloggenDocent.setOnAction(event ->{hoofdmenu.setVisible(false);inloggenDocent.setVisible(true);});
        knopNaarLijstKeuzesSt.setOnAction(event ->{hoofdmenu.setVisible(false);LijstKeuzeSt.setVisible(true);vulTabelKeuzeStOpStudent();});
        knopNaarKeuzeIndienen.setOnAction(event ->{hoofdmenu.setVisible(false);keuzeToevoegen.setVisible(true);keuzeToevoegen();});
        knopNaarLijstToewijzigingenkeuzes.setOnAction(event ->{hoofdmenu.setVisible(false); lijstKeuze.setVisible(true);vulTabelKeuzeOpNaam();});
        //knoppen lijstBp
        terugknopLijst.setOnAction(event->{hoofdmenu.setVisible(true); lijstBp.setVisible(false);bpToevoegen.setVisible(false);});
        //knoppen BPtoevoegen
        voegBPtoe.setOnAction(event -> voegBPToe());
        terugknopBpToevoegen.setOnAction(event-> {hoofdmenu.setVisible(true); bpToevoegen.setVisible(false); labelOpgeslagen.setVisible(false); labelFoutBpToev.setVisible(false);});
        knopTerugLijstBp.setOnAction(event->{bpToevoegen.setVisible(false); labelOpgeslagen.setVisible(false); actiesDocent.setVisible(true); labelFoutBpToev.setVisible(false);});
        //Knoppen lijstKeuzes
        sorteerknopNaam.setOnAction(event -> vulTabelKeuzeOpNaam());
        sorteerknopProef.setOnAction(event -> vulTabelKeuzeOpProef());
        sorteerknopPunten.setOnAction(event -> vulTabelKeuzeOpPunten());
        terugknopLijstKeuzes.setOnAction(event ->{hoofdmenu.setVisible(true);lijstKeuze.setVisible(false);});
        //knoppen keuzeToevoegen
        knopBevestigenKeuzeT.setOnAction(event ->{voegKeuzeToe();});
        terugKeuzeT.setOnAction(event ->{hoofdmenu.setVisible(true);keuzeToevoegen.setVisible(false);});
        //knoppen inloggenDocent
        knopInloggenD.setOnAction(event ->{if(controlerenDocent()){inloggenDocent.setVisible(false);labelFoutDocent.setVisible(false); actiesDocent.setVisible(true);}});
        knopHoofdmenuInlD.setOnAction(event ->{hoofdmenu.setVisible(true);inloggenDocent.setVisible(false);labelFoutDocent.setVisible(false);});
        //knoppen acties docenten
        knopNaarBpToevoegen.setOnAction(event ->{actiesDocent.setVisible(false);bpToevoegen.setVisible(true);});
        knopNaarKeuzeToewijzen.setOnAction(event -> {actiesDocent.setVisible(false); keuzeToewijzen.setVisible(true); keuzeToewijzen();});
        knopHoofdmenuActiesDocenten.setOnAction(event -> {hoofdmenu.setVisible(true); actiesDocent.setVisible(false);});
        knopNaarStudentToevoegen.setOnAction(event ->{actiesDocent.setVisible(false); studentToevoegen.setVisible(true);});
        knopNaarPuntenToewijzen.setOnAction(event->{actiesDocent.setVisible(false); puntenToewijzen.setVisible(true);comboboxStudentPuntenToew.setItems(FXCollections.observableArrayList(modelKeuze.getStudenten()));});
        knopNaarKeuzeVerwijderen.setOnAction(event ->{actiesDocent.setVisible(false); keuzeVerwijderen.setVisible(true);
            comboboxStudentKeuzeVerw.setItems(FXCollections.observableArrayList(modelKeuze.getStudenten()));});
        //knoppen naar lijstKeuzeSt
        knopKeuzeStSortStu.setOnAction(event ->{vulTabelKeuzeStOpStudent();});
        knopkeuzeStSortKeuze1.setOnAction(event ->{vulTabelKeuzeStOpKeuze1();});
        knopkeuzeStSortKeuze2.setOnAction(event -> {vulTabelKeuzeStOpKeuze2();});
        knopkeuzeStSortKeuze3.setOnAction(event ->{vulTabelKeuzeStOpKeuze3();});
        knopHoofdmenuKeuzeSt.setOnAction(event ->{hoofdmenu.setVisible(true); LijstKeuzeSt.setVisible(false);});
        //knoppen lijst toegewezen keuzes
        terugknopLijstKeuzes.setOnAction(event-> {hoofdmenu.setVisible(true); lijstKeuze.setVisible(false);});
        sorteerknopNaam.setOnAction(event -> vulTabelKeuzeOpNaam());
        sorteerknopProef.setOnAction(event -> vulTabelKeuzeOpProef());
        sorteerknopPunten.setOnAction(event -> vulTabelKeuzeOpPunten());
        //knoppen keuze toewijzen
        knopBevestigenKeuzeToew.setOnAction(event->voegDefKeuzeToe());
        knopHoofdmenuKeuzeToev.setOnAction(event -> {hoofdmenu.setVisible(true);keuzeToewijzen.setVisible(false);});
        knopTerugKeuzeToewijzen.setOnAction(event ->{actiesDocent.setVisible(true); keuzeToewijzen.setVisible(false);});
        comboboxStudentKeuzeToew.getSelectionModel().selectedItemProperty().addListener( (options, oldValue, newValue) -> {
            String naam = comboboxStudentKeuzeToew.getValue();
            ObservableList<String> keuzesVanStudent = FXCollections.observableArrayList(modelKeuzeSt.getKeuzesVanStudent(naam));
            comboboxKeuzeKeuzeToew.setItems(keuzesVanStudent);}); 
        //knoppen student toevoegen
        terugNaarHoofdmStudToev.setOnAction(event -> {hoofdmenu.setVisible(true); studentToevoegen.setVisible(false);});
        terugknopStudToev.setOnAction(event->{actiesDocent.setVisible(true); studentToevoegen.setVisible(false);});
        bevestigknopStudToev.setOnAction(event->studentToevoegen());
        //knoppen punten toewijzen
        HoofdmenuPuntenToew.setOnAction(event->{puntenToewijzen.setVisible(false); hoofdmenu.setVisible(true); labelFoutPuntenToew.setVisible(false);
            labelToegewPuntenToew.setVisible(false);});
        terugknopPuntenToew.setOnAction(event ->{actiesDocent.setVisible(true); puntenToewijzen.setVisible(false);});
        bevestigknopPuntenToew.setOnAction(event->bevestigPuntenToewijzen());
        //knoppen keuze verwijderen
        terugknopKeuzeVerw.setOnAction(event ->{actiesDocent.setVisible(true); keuzeVerwijderen.setVisible(false); labelKeuzeVerw.setVisible(false);});
        HoofdmenuKeuzeVerw.setOnAction(event -> {hoofdmenu.setVisible(true);keuzeVerwijderen.setVisible(false);});
        bevestigknopKeuzeVerw.setOnAction(event ->{keuzeVerwijderen.setVisible(false); bevestigPane.setVisible(true);});
        //knoppen bevestigpane
        knopBevestigBevestigPane.setOnAction(event ->keuzeVerwijderen());
        knopAnnulerenBevestigPane.setOnAction(event ->{keuzeVerwijderen.setVisible(true); bevestigPane.setVisible(false);});
    }
    
    /**
     * Functie om alles aan te passen nadat er een keuze is verwijderd
     */
    public void keuzeVerwijderen() {
        modelKeuze.deleteKeuze(comboboxStudentKeuzeVerw.getValue());
        keuzeVerwijderen.setVisible(true);
        bevestigPane.setVisible(false);
        comboboxStudentKeuzeVerw.setItems(FXCollections.observableArrayList(modelKeuze.getStudenten()));
        comboboxStudentKeuzeVerw.setItems(FXCollections.observableArrayList(modelKeuze.getStudenten()));
        labelKeuzeVerw.setVisible(true);
    }
        
    /**
     * functie om de ingevulde punten toe te wijzen aan de ingevulde student
     */
    public void bevestigPuntenToewijzen() {
        String puntenSt = textfieldPuntenPuntenToew.getText();
        
        try{
        int num = Integer.parseInt(puntenSt);
        // is an integer!
        int punten = Integer.parseInt(puntenSt);
        if(punten > 20 || punten < 0) {
            //Punt niet goed, gaat niet
            labelFoutPuntenToew.setVisible(true);
            labelToegewPuntenToew.setVisible(false);
        }
        else {
            //functie maken voor de sqls
            String student = comboboxStudentPuntenToew.getValue();
            modelKeuze.updatePunten(punten, student);
            labelFoutPuntenToew.setVisible(false);
            labelToegewPuntenToew.setVisible(true);
        }
        } catch (NumberFormatException e) {
            // not an integer!
            labelFoutPuntenToew.setVisible(true);
            labelToegewPuntenToew.setVisible(false);
        }
    }
    
    /**
     * Functie om de ingevulde student toe te voegen
     */
    public void studentToevoegen() {
        String naam = textfieldNaamStudToev.getText();
        String paswoord = textfieldPaswStudToev.getText();
        Student studToev = new Student(naam, paswoord);
        ArrayList<String> studentInDeDB = new ArrayList(modelStudent.getNamenStudenten());
        
        if(naam.isEmpty() || paswoord.isEmpty()) {
            labelFoutStudToev1.setVisible(true);
            labelFoutStudToev.setVisible(false);
            labelBevestigStudToev.setVisible(false);
        }
        else if(studentInDeDB.contains(naam)) {
            //naam zit al in de lijst
            labelFoutStudToev1.setVisible(false);
            labelFoutStudToev.setVisible(true);
            labelBevestigStudToev.setVisible(false);
        }
        else {
            modelStudent.voegStudToe(studToev);
            labelFoutStudToev1.setVisible(false);
            labelFoutStudToev.setVisible(false);
            labelBevestigStudToev.setVisible(true);
        }      
    }
    
    /**
     * Functie om het anchorpane van keuze toewijzen te laden
     */
    public void keuzeToewijzen() {
        ObservableList<String> namenKeuzeStLijst = FXCollections.observableArrayList(modelKeuzeSt.getNamenStudenten());
        ObservableList<String> namenKeuzeLijst = FXCollections.observableArrayList(modelKeuze.getStudenten());
        ArrayList<String> namen = new ArrayList();
        for(int i=0; i<namenKeuzeStLijst.size();i++) {
            if(!namenKeuzeLijst.contains(namenKeuzeStLijst.get(i))) {
                namen.add(namenKeuzeStLijst.get(i));
            }
        }
        ObservableList<String> defNamen = FXCollections.observableArrayList(namen);
        if(defNamen.isEmpty()) {
            labelFoutKeuzeToew.setVisible(false);
            labelFoutKeuzeToew1.setVisible(false);
            labelFoutKeuzeToew2.setVisible(true);
            comboboxStudentKeuzeToew.setItems(defNamen);
        }
        else {
            comboboxStudentKeuzeToew.setItems(defNamen);
            comboboxStudentKeuzeToew.setValue(defNamen.get(0));
            labelFoutKeuzeToew2.setVisible(false);
        }
    }
    
    /**
     * functie om de keuze toe te voegen
     */
    public void voegDefKeuzeToe() {
        //keuze toevoegen aan de lijst
        String student = comboboxStudentKeuzeToew.getValue();
        String keuze = comboboxKeuzeKeuzeToew.getValue();
        
        if(comboboxKeuzeKeuzeToew.getValue()==null) {
            labelFoutKeuzeToew.setVisible(true);
            labelFoutKeuzeToew1.setVisible(false);
            labelFoutKeuzeToew2.setVisible(false);
            labelOkeKeuzeToewijzen.setVisible(false);
            keuzeToewijzen();
        }
        else {
            ObservableList<String> namenInLijst = FXCollections.observableArrayList(modelKeuze.getStudenten());
        
            if(namenInLijst.contains(student)){
                //de naam zit al in de lijst en kan niet nog eens worden toegevoegd
                labelFoutKeuzeToew1.setVisible(true);
                labelOkeKeuzeToewijzen.setVisible(false);
                labelFoutKeuzeToew.setVisible(false);
                labelOkeKeuzeToewijzen.setVisible(false);
            }
            else {
                labelFoutKeuzeToew.setVisible(false);
                labelFoutKeuzeToew1.setVisible(false);
                labelFoutKeuzeToew2.setVisible(false);
                int punten = 0;
                modelKeuze.voegKeuzesToe(student, keuze, punten);
                labelOkeKeuzeToewijzen.setVisible(true);
                keuzeToewijzen();
            }
        }
    }
        
    /**
     * Functie om de tabel keuzeStudenten te vullen gesorteerd op de student
     */
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
    
    /**
     * Functie om de tabel keuzeStudenten te vullen gesorteerd op keuze1
     */
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
    
    /**
     * Functie om de tabel keuzeStudenten te vullen gesorteerd op keuze2
     */
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
    
    /**
     * Functie om de tabel keuzeStudenten te vullen gesorteerd op keuze3
     */
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
       
    /**
     * Functie om te controleren of de docent zijn wachtwoord klopt
     * 
     * @return true als het paswoord klopt
     */
    public boolean controlerenDocent() {
        String naam = textfieldNaamInlD.getText();
        String paswoord = textfieldPaswoordInlD.getText();

        ObservableList<Docent> docenten = FXCollections.observableArrayList(modelDocent.getDocenten());
        if(!docenten.isEmpty()) {
            for (int i=0; i<docenten.size();i++) {
                if(docenten.get(i).getNaam().equals(naam)) {
                    if(docenten.get(i).getPaswoord().equals(paswoord)) {
                        labelFoutDocent.setVisible(false);
                        return true;
                    }
                }
            } 
        }
        else {
            labelFoutDocent.setVisible(true);
            return false;
        }
        return false;
    }
    
    /**
     * Functie om het anchorpane van keuze toevoegen te laden
     */
    public void keuzeToevoegen() {
        ObservableList<String> namen = FXCollections.observableArrayList(modelStudent.fillCombo());
        comboboxNaamKeuzeT.setItems(namen);
        
        ObservableList<String> bps = FXCollections.observableArrayList(modelBp.fillCombo());
        comboboxKeuze1KeuzeT.setItems(bps);
        comboboxKeuze2KeuzeT.setItems(bps);
        comboboxKeuze3KeuzeT.setItems(bps);
        labelNaamAlIngediend.setVisible(false);
        labelFoutKeuzeT.setVisible(false);
    }
       
    /**
     * Functie om de keuze van de student toe te voegen
     */
    public void voegKeuzeToe() {
        String naam = comboboxNaamKeuzeT.getValue();
        String keuze1 = comboboxKeuze1KeuzeT.getValue();
        String keuze2 = comboboxKeuze2KeuzeT.getValue();
        String keuze3 = comboboxKeuze3KeuzeT.getValue();
        String paswoord = textfieldPaswoordKeuzeT.getText();
 
        ObservableList<String> namenInLijst = FXCollections.observableArrayList(modelKeuzeSt.getNamenStudenten());
                        
        if(namenInLijst.contains(naam)==false || namenInLijst.isEmpty()){
            labelNaamAlIngediend.setVisible(false);
            if(controlerenWachtwoordStudent(naam, paswoord)) {
                if(keuze1!=keuze2 || keuze1!=keuze3 || keuze2!=keuze3) {
                    modelKeuzeSt.voegKeuzesStToe(naam, keuze1, keuze2, keuze3);
                    hoofdmenu.setVisible(true);
                    keuzeToevoegen.setVisible(false);
                    labelFoutKeuzeT.setVisible(true);
                }
                else {labelFoutKeuzeT.setVisible(true);}
            }
            else{labelFoutKeuzeT.setVisible(true);}
        }
        else {
            //de naam zit al in de lijst en kan niet nog eens worden toegevoegd
            labelNaamAlIngediend.setVisible(true);
            labelFoutKeuzeT.setVisible(false);
        }
    }
    
    /**
     * Functie om te controleren of het ingegeven paswoord van de student klopt
     * 
     * @param naam van de student
     * @param paswoord van de student
     * @return true als het paswoord correct is
     */
    public boolean controlerenWachtwoordStudent(String naam, String paswoord) {
        ObservableList<Student> studenten = FXCollections.observableArrayList(modelStudent.getStudenten());
        for (int i=0; i<studenten.size();i++) {
            if(studenten.get(i).getNaam().equals(naam)) {
                if(studenten.get(i).getPaswoord().equals(paswoord)) {
                    return true;
                }
                else {return false;}
            }
        } 
        return false;
    }
    
    /**
     * Functie om een BP toe te voegen 
     */
    public void voegBPToe(){
        if(!titel.getText().isEmpty() && !beschrijvingen.getText().isEmpty()) {
            Bachelorproef nieuw = new Bachelorproef(titel.getText(), 
                                                    beschrijvingen.getText());
            modelBp.voegToe(nieuw);
            ArrayList<Bachelorproef> alles = modelBp.getProeven();
            labelOpgeslagen.setVisible(true);
            labelFoutBpToev.setVisible(false);
        }
        else {
            labelOpgeslagen.setVisible(false);
            labelFoutBpToev.setVisible(true);
        }
    }
    
    /**
     * Functie om de tabel van de verschillende bachelorproeven te vullen
     */
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
    
    /**
     * Functie om de tabel keuze op naam te sorteren
     */
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
        
    /**
     * Functie om de tabel keuze op proef te sorteren
     */
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
    
    /**
     * Functie om de tabel keuze op punten te sorteren
     */
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

