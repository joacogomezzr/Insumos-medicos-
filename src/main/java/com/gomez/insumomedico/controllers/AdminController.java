package com.gomez.insumomedico.controllers;

import com.gomez.insumomedico.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminController {

    @FXML
    private Button buscarproductoButton;

    @FXML
    private Button buscarusuarioButton;

    @FXML
    private Button mostrarproductosButton;

    @FXML
    private AnchorPane fondo;

    @FXML
    private Button mostrarusuariosButton;

    @FXML
    private Button salirButton;

    @FXML
    void onClickBuscarProductoButton(MouseEvent event) {

    }

    @FXML
    void onClickBuscarUsuarioButton(MouseEvent event) {

    }

    @FXML
    void onClickMostrarProductosButton(MouseEvent event) {

    }

    @FXML
    void onClickMostrarUsuariosButton(MouseEvent event) {

    }

    @FXML
    void onClickSalirButton(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) fondo.getScene().getWindow();
        currentStage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("admin-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Administrador");
        stage.show();

    }

}
