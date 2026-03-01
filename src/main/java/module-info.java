module com.example.exploringjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exploringjavafx to javafx.fxml;
    exports com.example.exploringjavafx;
}