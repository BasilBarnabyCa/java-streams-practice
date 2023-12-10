module com.example.streamspractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.streamspractice to javafx.fxml;
    exports com.example.streamspractice;
}