module com.example.nattodol {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens com.example.nattodol to javafx.fxml;
    exports com.example.nattodol;
}