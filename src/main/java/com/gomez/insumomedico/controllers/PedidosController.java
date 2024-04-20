package com.gomez.insumomedico.controllers;

import com.gomez.insumomedico.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PedidosController {

    @FXML
    private Button agregarButton;

    @FXML
    private TextField cantidadTxt;

    @FXML
    private TextField destinotxt;

    @FXML
    private AnchorPane fondo;

    @FXML
    private TextField marcaTxt;

    @FXML
    private TextField nombreTxt;

    @FXML
    private TextField precioTxt;

    @FXML
    private Button volveralmenuButton;

    @FXML
    void OnMouseClickedAgregarButton(MouseEvent event) {


    }

    @FXML
    void OnMouseClickedVolveralmenuButton(MouseEvent event) throws IOException {
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
