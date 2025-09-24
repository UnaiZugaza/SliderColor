package es.unaizugaza;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorController {

    /**
     * Rectángulo en el que se muestra el color generado
     * a partir de los valores de los sliders RGB.
     */
    @FXML
    private Rectangle colorRect;

    /**
     * Slider que controla la componente roja del color.
     */
    @FXML
    private Slider sliderRed;

    /**
     * Slider que controla la componente verde del color.
     */
    @FXML
    private Slider sliderGreen;

    /**
     * Slider que controla la componente azul del color.
     */
    @FXML
    private Slider sliderBlue;

    /**
     * Método de inicialización llamado automáticamente
     * después de cargar el archivo FXML.
     * <p>
     * Establece el color inicial del rectángulo y añade
     * listeners a los sliders para que, al cambiar su valor,
     * se actualice el color mostrado.
     * </p>
     */
    @FXML
    private void initialize() {
        updateColor();

        sliderRed.valueProperty().addListener((obs, oldVal, newVal) -> updateColor());
        sliderGreen.valueProperty().addListener((obs, oldVal, newVal) -> updateColor());
        sliderBlue.valueProperty().addListener((obs, oldVal, newVal) -> updateColor());
    }

    /**
     * Actualiza el color del rectángulo combinando
     * los valores actuales de los sliders de rojo,
     * verde y azul.
     * <p>
     * Los valores de los sliders se convierten a enteros
     * en el rango válido para componentes RGB (0-255).
     * </p>
     */
    private void updateColor() {
        int r = (int) sliderRed.getValue();
        int g = (int) sliderGreen.getValue();
        int b = (int) sliderBlue.getValue();
        colorRect.setFill(Color.rgb(r, g, b));
    }
}