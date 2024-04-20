package com.gomez.insumomedico.controllers;

import com.gomez.insumomedico.Application;
import com.gomez.insumomedico.models.Productos;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MostrarProductosController implements Initializable {

    @FXML
    private TableColumn<Productos, String> cantidadColumn;

    @FXML
    private AnchorPane fondo;

    @FXML
    private TableColumn<Productos, String> marcaColumn;

    @FXML
    private TableColumn<Productos, String> nameColumn;

    @FXML
    private TableColumn<Productos, String> precioColumn;

    @FXML
    private Button salirBtn;

    @FXML
    private TableView<Productos> table;

    @FXML
    void OnMouseClickSalirBtn(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) fondo.getScene().getWindow();
        currentStage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("admin-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Administrador");
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cantidadColumn.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        this.marcaColumn.setCellValueFactory(new PropertyValueFactory<>("marca"));
        this.nameColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.precioColumn.setCellValueFactory(new PropertyValueFactory<>("precio"));

        this.table.setItems(Application.getProductos());
    }
}
