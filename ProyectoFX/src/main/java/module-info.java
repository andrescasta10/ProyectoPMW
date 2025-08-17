module org.example.proyectofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.proyectofx to javafx.fxml;
    exports org.example.proyectofx;
}