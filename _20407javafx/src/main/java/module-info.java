module com.example._20407javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;
    requires javafx.base;


    opens com.example._20407javafx to javafx.fxml;
    exports com.example._20407javafx;

    opens com.example._20407javafx._11_04 to javafx.fxml;
    exports com.example._20407javafx._11_04;

    opens com.example._20407javafx._11_14 to javafx.fxml;
    exports com.example._20407javafx._11_14;
}