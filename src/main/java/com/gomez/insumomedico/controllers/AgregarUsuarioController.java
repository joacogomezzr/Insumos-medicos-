package com.gomez.insumomedico.controllers;

import com.gomez.insumomedico.Application;
import com.gomez.insumomedico.models.Usuarios;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class AgregarUsuarioController {

    @FXML
    private TextField Apellidos;

    @FXML
    private TextField Edad;

    @FXML
    private TextField Nombre;

    @FXML
    private Button agregarButton;

    @FXML
    private AnchorPane fondo;

    @FXML
    private Button volveralmenuButton;

    @FXML
    void OnMouseClickedAgregarButton(MouseEvent event) {
        ArrayList<Usuarios> usuarios = Application.getUsuario().getListaUsuarios();

        String nombre = Nombre.getText();
        String apellidos = Apellidos.getText();
        String edad = Edad.getText();

        Usuarios usuario = new Usuarios(nombre, apellidos, edad);

        if (usuarios.add(usuario)) {
            mostrarAlerta("Éxito", "El usuario se guardó correctamente");

            System.out.println("Se agregó a: ");
            System.out.println("Nombre: "+usuario.getNombre());
            System.out.println("Apellidos: "+usuario.getApellidos());
            System.out.println("Edad: "+usuario.getEdad());
        }
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

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

}