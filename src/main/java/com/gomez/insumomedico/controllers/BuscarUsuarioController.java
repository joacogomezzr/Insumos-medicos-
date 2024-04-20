package com.gomez.insumomedico.controllers;

import com.gomez.insumomedico.Application;
import com.gomez.insumomedico.models.Usuarios;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class BuscarUsuarioController {

    @FXML
    private TextField Nombre;

    @FXML
    private Button agregarButton;

    @FXML
    private Label apellidosLabel;

    @FXML
    private TextField apellidosTxt;

    @FXML
    private Label edadLabel;

    @FXML
    private TextField edadTxt;

    @FXML
    private ImageView fondo;

    @FXML
    private Label nomLabel;

    @FXML
    private TextField nomTxt;

    @FXML
    private Button volveralmenuButton;

    @FXML
    void OnMouseClickedAgregarButton(MouseEvent event) {
        String nombreBuscado = Nombre.getText();
        ArrayList<Usuarios> listaUsuarios = Application.getUsuario().getListaUsuarios();

        Usuarios usuarioEncontrado = null;
        for (Usuarios usuarios : listaUsuarios) {
            if (usuarios.getNombre().equals(nombreBuscado)) {
                usuarioEncontrado = usuarios;
                break;
            }
        }

        if (usuarioEncontrado != null) {
            mostrarAlerta("Búsqueda Exitosa", "Se encontró el cliente buscado");

            nomLabel.setVisible(true);
            nomTxt.setVisible(true);
            apellidosLabel.setVisible(true);
            apellidosTxt.setVisible(true);
            edadLabel.setVisible(true);
            edadTxt.setVisible(true);

            nomTxt.setText(String.valueOf(usuarioEncontrado.getNombre()));
            apellidosTxt.setText(String.valueOf(usuarioEncontrado.getApellidos()));
            edadTxt.setText(String.valueOf(usuarioEncontrado.getEdad()));

            System.out.println("Usuario Encontrado:");
            System.out.println("Nombre: "+usuarioEncontrado.getNombre());
            System.out.println("Apellidos: "+usuarioEncontrado.getApellidos());
            System.out.println("Edad: "+usuarioEncontrado.getEdad());
        } else {
            mostrarAlerta("Error", "No se encontró ningún usuario con ese nombre.");
        }
        limpiar();
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

    private void limpiar() {
        Nombre.clear();
    }
}

