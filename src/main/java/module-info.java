module es.unaizugaza {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;

    opens es.unaizugaza to javafx.fxml;
    exports es.unaizugaza;
}