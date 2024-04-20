package com.gomez.insumomedico.controllers;

import com.gomez.insumomedico.Application;
import com.gomez.insumomedico.models.Productos;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class EliminarProductoController {

    @FXML
    private Button eliminarButton;

    @FXML
    private ImageView fondo;

    @FXML
    private TextField nombreTxt;

    @FXML
    private Button volveralmenuButton;

    @FXML
    void OnMouseClickedEliminarButton(MouseEvent event) {
        String nombre = nombreTxt.getText();

        //ArrayList<Productos> listaProductos = Application.getProducto().getListaProductos();
        ObservableList<Productos> listaProductos = Application.getProductos();

        Productos productoEliminar = null;
        for (Productos producto : listaProductos) {
            if (producto.getNombre().equals(nombre)) {
                productoEliminar = producto;
                break;
            }
        }

        if (productoEliminar != null) {
            listaProductos.remove(productoEliminar);
            mostrarAlerta("Éxito", "Se ha eliminado el producto correctamente.");
        } else {
            mostrarAlerta("Error", "No se encontró ningún producto con ese nombre");
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
