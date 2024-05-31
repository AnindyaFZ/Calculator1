module com.anindya.calculator1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anindya.calculator1 to javafx.fxml;
    exports com.anindya.calculator1;
}