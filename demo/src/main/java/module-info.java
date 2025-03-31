module mx.uv.coatza.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens mx.uv.coatza.demo to javafx.fxml;
    exports mx.uv.coatza.demo;
}