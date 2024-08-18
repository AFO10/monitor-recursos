module com.portafolio.monitorrecursos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.portafolio.monitorrecursos to javafx.fxml;
    exports com.portafolio.monitorrecursos;
    exports com.portafolio.monitorrecursos.Controllers;
    opens com.portafolio.monitorrecursos.Controllers to javafx.fxml;
}