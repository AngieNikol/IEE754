/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Nikol Ortiz y Daniela Garcia 
 * 1152348 - 1152365
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Cargar el archivo FXML usando getClass().getResource() para buscarlo en el directorio adecuado
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ConvertorIeee.fxml"));

        // Cargar el archivo FXML y obtener el root (raíz) de la escena
        Parent root = loader.load();

        // Crear la escena con el root cargado desde el FXML
        Scene scene = new Scene(root);

        // Configurar la escena en el escenario (stage)
        stage.setScene(scene);
        stage.setTitle("Convertor");
        stage.setResizable(false);

        // Mostrar el escenario
        stage.show();
    }
}
