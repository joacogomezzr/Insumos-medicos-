package com.gomez.insumomedico.controllers;

import com.gomez.insumomedico.Application;
import com.gomez.insumomedico.models.Productos;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class AgregarProductoController {

    @FXML
    private Button agregarButton;

    @FXML
    private TextField cantidadTxt;

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
        //ArrayList<Productos> productos = Application.getProducto().getListaProductos();

        String nombre = this.nombreTxt.getText();
        String precio = this.precioTxt.getText();
        String marca = this.marcaTxt.getText();
        String cantidad = this.cantidadTxt.getText();

        Productos producto = new Productos(nombre, precio, marca, cantidad);

        if (!Application.getProductos().contains(producto)) {
            Application.getProductos().add(producto);

            mostrarAlerta("Éxito", "El producto se guardó correctamente");

            System.out.println("Se agregó a: ");
            System.out.println("Nombre: "+producto.getNombre());
            System.out.println("Precio: "+producto.getPrecio());
            System.out.println("Marca: "+producto.getMarca());
            System.out.println("Cantidad: "+producto.getCantidad());
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
