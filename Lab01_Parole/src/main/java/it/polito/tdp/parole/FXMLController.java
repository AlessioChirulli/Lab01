package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnCancella;
    
    @FXML
    private TextArea txtTempo;
    
    @FXML
    void doInsert(ActionEvent event) {
    	double tempo=(double)System.nanoTime();
    	elenco.addParola(txtParola.getText());
    	txtParola.clear();
    	String lista="";
    	for(String s:elenco.getElenco() )
    		lista+=s+"\n";
    	txtResult.setText(lista);
    	double tempo2=(double)System.nanoTime();
    	txtTempo.setText(Double.toString((double)((tempo2-tempo)/1e6))+" millisecondi");
    }

    @FXML
    void doReset(ActionEvent event) {
    	double tempo=(double)System.nanoTime();
    	elenco.reset();
    	txtParola.clear();
    	txtResult.clear();
    	double tempo2=(double)System.nanoTime();
    	txtTempo.setText(Double.toString((double)((tempo2-tempo)/1e6))+" millisecondi");
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    double tempo=(double)System.nanoTime();
    String cancella=txtResult.getSelectedText();
    elenco.cancella(cancella);
    String lista="";
    for(String s:elenco.getElenco() )
		lista+=s+"\n";
    txtResult.setText(lista);
    double tempo2=(double)System.nanoTime();
	txtTempo.setText(Double.toString((double)((tempo2-tempo)/1e6))+" millisecondi");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempo != null : "fx:id=\"txtTempo\" was not injected: check your FXML file 'Scene.fxml'.";
        elenco = new Parole() ;
    }
}
