package com.gomez.insumomedico.controllers;

import com.gomez.insumomedico.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminController {

    @FXML
    private Button ActualizarDatosDelProductoButton;

    @FXML
    private Button AgregarusuariosButton;

    @FXML
    private Button agregarProductosButton;

    @FXML
    private Button buscarProductosButton;

    @FXML
    private Button buscarusuarioButton;

    @FXML
    private Button eliminarProductosButton;

    @FXML
    private AnchorPane fondo;

    @FXML
    private Button mostrarProductosButton;

    @FXML
    private Button salirButton;

    @FXML
    void onClickActualizarDatosDelProductoProductosButton(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) fondo.getScene().getWindow();
        currentStage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("ActualizarDatos-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Actualizar Productos");
        stage.show();
    }
    @FXML
    void onClickAgregarProductosButton(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) fondo.getScene().getWindow();
        currentStage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("agregarProducto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Agregar Productos");
        stage.show();
    }

    @FXML
    void onClickAgregarUsuariosButton(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) fondo.getScene().getWindow();
        currentStage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("AgregarUsuario-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Agregar Usuario");
        stage.show();
    }

    @FXML
    void onClickBuscarProductosButton(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) fondo.getScene().getWindow();
        currentStage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("BuscarProductos-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Buscar Productos");
        stage.show();
    }

    @FXML
    void onClickBuscarUsuarioButton(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) fondo.getScene().getWindow();
        currentStage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("BuscarUsuario-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Buscar Usuario");
        stage.show();
    }

    @FXML
    void onClickEliminarProductosButton(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) fondo.getScene().getWindow();
        currentStage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("EliminarProducto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Eliminar Productos");
        stage.show();
    }


    @FXML
    void onClickMostrarProductosButton(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) fondo.getScene().getWindow();
        currentStage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("MostrarProductos-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Mostrar Productos");
        stage.show();
    }

    @FXML
    void onClickSalirButton(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) fondo.getScene().getWindow();
        currentStage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Administrador");
        stage.show();

    }

}
