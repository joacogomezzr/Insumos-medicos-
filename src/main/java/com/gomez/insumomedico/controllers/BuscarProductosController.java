package com.gomez.insumomedico.controllers;

import com.gomez.insumomedico.Application;
import com.gomez.insumomedico.models.Productos;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
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
import java.util.ArrayList;

public class BuscarProductosController {

    @FXML
    private Label cantidadlabel;

    @FXML
    private TextField cantidadtxt;

    @FXML
    private Button buscarproductoButton;

    @FXML
    private AnchorPane fondo;

    @FXML
    private Label marcaLabel;

    @FXML
    private TextField marcaTxt;

    @FXML
    private Label nombreLabel;

    @FXML
    private TextField nombreTxt;

    @FXML
    private TextField nombrepTxt;

    @FXML
    private Label precioLabel;

    @FXML
    private TextField precioTxt;

    @FXML
    private Button volveralmenuButton;

    @FXML
    void OnMouseClickedBuscarProductoButton(MouseEvent event) {
        String nombreBuscado = nombrepTxt.getText();
        //ArrayList<Productos> listaProductos = Application.getProducto().getListaProductos();
        ObservableList<Productos> lista = Application.getProductos();

        Productos productoEncontrado = null;
        for (Productos productos : lista) {
            if (productos.getNombre().equals(nombreBuscado)) {
                productoEncontrado = productos;
                break;
            }
        }

        if (productoEncontrado != null) {
            mostrarAlerta("Búsqueda Exitosa", "Se encontró el producto buscado");

            nombreTxt.setVisible(true);
            nombreLabel.setVisible(true);
            precioTxt.setVisible(true);
            precioLabel.setVisible(true);
            marcaTxt.setVisible(true);
            marcaLabel.setVisible(true);
            cantidadlabel.setVisible(true);
            cantidadtxt.setVisible(true);

            nombreTxt.setText(productoEncontrado.getNombre());
            precioTxt.setText(productoEncontrado.getPrecio());
            marcaTxt.setText(productoEncontrado.getMarca());
            cantidadtxt.setText(productoEncontrado.getCantidad());

            System.out.println("Producto encontrado:");
            System.out.println("Nombre del producto: " + productoEncontrado.getNombre());
            System.out.println("Precio: " + productoEncontrado.getPrecio());
            System.out.println("Marca: " + productoEncontrado.getMarca());
        } else {
            mostrarAlerta("Error", "No se encontró nigún producto con ese nombre.");
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
        stage.setTitle("Menú");
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
