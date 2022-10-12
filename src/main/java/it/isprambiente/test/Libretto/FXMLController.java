/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.isprambiente.test.Libretto;

import java.net.URL;
import java.util.ResourceBundle;

import it.isprambiente.test.Libretto.model.Libretto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Libretto model;
	
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="dpEsame"
    private DatePicker dpEsame; // Value injected by FXMLLoader

    @FXML // fx:id="rLode"
    private RadioButton rLode; // Value injected by FXMLLoader

    @FXML // fx:id="txtEsame"
    private TextField txtEsame; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="txtVoto"
    private TextField txtVoto; // Value injected by FXMLLoader

    @FXML
    void btnInserisci(ActionEvent event) {

    }

    public void setModel(Libretto model) {
    	this.model = model;
    }
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert dpEsame != null : "fx:id=\"dpEsame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert rLode != null : "fx:id=\"rLode\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtEsame != null : "fx:id=\"txtEsame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
