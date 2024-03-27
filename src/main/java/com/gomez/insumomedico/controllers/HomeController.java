package com.gomez.insumomedico.controllers;

import com.gomez.insumomedico.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    @FXML
    private Button aceptarButton;

    @FXML
    private TextField contraseñaTxt;

    @FXML
    private Button salirButton;

    @FXML
    private AnchorPane fondo;

    @FXML
    private TextField usuarioTxt;

    @FXML
    private Label welcomeText;

    @FXML
    private Label welcomeText1;

    @FXML
    void onClickAceptarButton(MouseEvent event) throws IOException {
        String usuarioText = usuarioTxt.getText();
        String contraseñaText = contraseñaTxt.getText();

        if (usuarioText.equals("Joaco")) {
            if (contraseñaText.equals("123")) {
                Stage currentStage = (Stage) fondo.getScene().getWindow();
                currentStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("admin-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Administrador");
                stage.show();
            } else {
                mostrarAlerta("Error de contraseña", "La contraseña es incorrecta, intentalo nuevamente.");
            }
        } else {
            mostrarAlerta("Error de usuario", "El usuario es incorrecto, intentalo nuevamente.");
        }
    }

    @FXML
    void onClickSalirButton(MouseEvent event) {
        System.exit(1);
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

}
