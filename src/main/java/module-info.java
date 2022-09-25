module com.example.ls3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ls3 to javafx.fxml;
    exports com.example.ls3;
}