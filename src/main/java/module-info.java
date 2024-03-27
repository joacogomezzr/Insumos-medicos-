module com.gomez.insumomedico {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gomez.insumomedico to javafx.fxml;
    exports com.gomez.insumomedico;
    exports com.gomez.insumomedico.controllers;
    opens com.gomez.insumomedico.controllers to javafx.fxml;
}