package es.unaizugaza;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase principal que carga la interfaz de usuario desde un archivo FXML.
 * La estructura y los estilos están definidos en color.fxml y styles.css.
 */

public class App extends Application {

    /**
     * Logger utilizado para mostrar información en consola
     * sobre el ciclo de vida de la aplicación.
     */
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    /**
     * Método de inicio de la aplicación JavaFX.
     * <p>
     * Carga la interfaz desde {@code color.fxml}, aplica la hoja de estilos
     * {@code styles.css}, y muestra la ventana principal de la aplicación.
     * </p>
     *
     * @param stage la ventana principal (primary stage) proporcionada por JavaFX
     * @throws Exception si ocurre un error al cargar el archivo FXML o la hoja de estilos
     */
    @Override
    public void start(Stage stage) throws Exception {
        logger.info("App lanzada");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/color.fxml"));
        Scene scene = new Scene(loader.load());

        stage.setTitle("Using Slider Controls");
        scene.getStylesheets().add(getClass().getResource("css/styles.css").toExternalForm());

        stage.setMinWidth(450);
        stage.setMinHeight(350);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * Punto de entrada principal de la aplicación.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        launch();
    }
}