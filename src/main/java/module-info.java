module com.example.liftproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.liftproject to javafx.fxml;
    exports com.example.liftproject;
}