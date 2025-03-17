/**
 * Sample Skeleton for 'ConvertorIeee.fxml' Controller Class
 */
package Vista;

import Modelo.Fachada;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class IeeeController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cboCantidadDeBits"
    private ComboBox<String> cboCantidadDeBits; // Value injected by FXMLLoader

    @FXML // fx:id="cmdConvertirDecimal"
    private Button cmdConvertirDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="cmdConvertirIeee"
    private Button cmdConvertirIeee; // Value injected by FXMLLoader

    @FXML // fx:id="txtExponente"
    private TextField txtExponente; // Value injected by FXMLLoader

    @FXML // fx:id="txtMantisa"
    private TextField txtMantisa; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroDecimal"
    private TextField txtNumeroDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroIEEE"
    private TextField txtNumeroIEEE; // Value injected by FXMLLoader

    @FXML // fx:id="txtResultadoDecimal"
    private TextField txtResultadoDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtResultadoIEEE"
    private TextField txtResultadoIEEE; // Value injected by FXMLLoader

    @FXML // fx:id="txtSigno"
    private TextField txtSigno; // Value injected by FXMLLoader

    private Fachada fachada;

    @FXML
    void convertirADecimal(ActionEvent event) {
        String numero = txtNumeroIEEE.getText();
        
        double resultado = fachada.convertirIEEEaDecimal(numero);
        if(Double.isNaN(resultado)){
            alertError("El numero debe tener 32 O 64 BITS.");
        }
        txtResultadoDecimal.setText(String.valueOf(resultado));

    }

    @FXML
    void convertirDecimalAIeee(ActionEvent event) {

        String bits = cboCantidadDeBits.getValue();
        String numeroDecimal = txtNumeroDecimal.getText();
        String resultado = "";
        if (bits.equals("32")) {
            resultado = fachada.convertirDecimalAIeee32(Double.parseDouble(numeroDecimal));
        }
        if (bits.equals("64")) {
            resultado = fachada.convertirDecimalAIeee64(Double.parseDouble(numeroDecimal));
        }
        txtResultadoIEEE.setText(resultado);
        String signo = fachada.obtenerSigno();
        txtSigno.setText(signo);
        String exponente = fachada.obtenerExponente();
        txtExponente.setText(exponente);
        String mantisa = fachada.obtenerMantisa();
        txtMantisa.setText(mantisa);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cboCantidadDeBits != null : "fx:id=\"cboCantidadDeBits\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert cmdConvertirDecimal != null : "fx:id=\"cmdConvertirDecimal\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert cmdConvertirIeee != null : "fx:id=\"cmdConvertirIeee\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtExponente != null : "fx:id=\"txtExponente\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtMantisa != null : "fx:id=\"txtMantisa\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtNumeroDecimal != null : "fx:id=\"txtNumeroDecimal\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtNumeroIEEE != null : "fx:id=\"txtNumeroIEEE\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtResultadoDecimal != null : "fx:id=\"txtResultadoDecimal\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtResultadoIEEE != null : "fx:id=\"txtResultadoIEEE\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtSigno != null : "fx:id=\"txtSigno\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";

        fachada = new Fachada();
        listaBits();
    }

    private void listaBits() {
        ObservableList<String> numeroBits = FXCollections.observableArrayList("32", "64");
        cboCantidadDeBits.setItems(numeroBits);
    }

    
    private void alertError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message, ButtonType.OK);
        alert.setTitle("ERROR");
        alert.setHeaderText("Algo va mal... ");
        alert.showAndWait();
    }

}
