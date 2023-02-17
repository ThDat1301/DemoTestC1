module com.thdat.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.thdat.bmiapp to javafx.fxml;
    exports com.thdat.bmiapp;
}
