module org.example.proyectobodega {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.proyectobodega to javafx.fxml;
    exports org.example.proyectobodega;
}