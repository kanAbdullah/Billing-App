module com.example.billingapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.example.billingapp to javafx.fxml;
    exports com.example.billingapp;
    exports com.example.billingapp.menuler;
    opens com.example.billingapp.menuler to javafx.fxml;
}