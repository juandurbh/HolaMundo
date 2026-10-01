module com.example.holamundo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.holamundo1 to javafx.fxml;
    exports com.example.holamundo1;
}