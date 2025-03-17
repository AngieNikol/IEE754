/**
 * Sample Skeleton for 'ConvertorIeee.fxml' Controller Class
 */

package Vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class IeeeController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cboCantidadDeBits"
    private ComboBox<?> cboCantidadDeBits; // Value injected by FXMLLoader

    @FXML // fx:id="cmdConvertirDecimal"
    private Button cmdConvertirDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="cmdConvertirIeee"
    private Button cmdConvertirIeee; // Value injected by FXMLLoader

    @FXML // fx:id="cmdMostrarExponente"
    private Button cmdMostrarExponente; // Value injected by FXMLLoader

    @FXML // fx:id="cmdMostrarMantisa"
    private Button cmdMostrarMantisa; // Value injected by FXMLLoader

    @FXML // fx:id="cmdMostrarSigno"
    private Button cmdMostrarSigno; // Value injected by FXMLLoader

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

    @FXML
    void convertirADecimal(ActionEvent event) {

    }

    @FXML
    void convertirDecimalAIeee(ActionEvent event) {

    }

    @FXML
    void elegirNumeroDeBits(ActionEvent event) {

    }

    @FXML
    void mostarSigno(ActionEvent event) {

    }

    @FXML
    void mostrarExponente(ActionEvent event) {

    }

    @FXML
    void mostrarMantisa(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cboCantidadDeBits != null : "fx:id=\"cboCantidadDeBits\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert cmdConvertirDecimal != null : "fx:id=\"cmdConvertirDecimal\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert cmdConvertirIeee != null : "fx:id=\"cmdConvertirIeee\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert cmdMostrarExponente != null : "fx:id=\"cmdMostrarExponente\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert cmdMostrarMantisa != null : "fx:id=\"cmdMostrarMantisa\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert cmdMostrarSigno != null : "fx:id=\"cmdMostrarSigno\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtExponente != null : "fx:id=\"txtExponente\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtMantisa != null : "fx:id=\"txtMantisa\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtNumeroDecimal != null : "fx:id=\"txtNumeroDecimal\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtNumeroIEEE != null : "fx:id=\"txtNumeroIEEE\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtResultadoDecimal != null : "fx:id=\"txtResultadoDecimal\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtResultadoIEEE != null : "fx:id=\"txtResultadoIEEE\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";
        assert txtSigno != null : "fx:id=\"txtSigno\" was not injected: check your FXML file 'ConvertorIeee.fxml'.";

    }

}
