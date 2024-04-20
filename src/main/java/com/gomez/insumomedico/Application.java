package com.gomez.insumomedico;

import com.gomez.insumomedico.models.Productos;
import com.gomez.insumomedico.models.Usuarios;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    private static Usuarios usuario = new Usuarios();

    private static Productos producto = new Productos();

    private static ObservableList<Productos> productos = FXCollections.observableArrayList();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Administrador");
        stage.setScene(scene);
        stage.show();
    }

    public static Usuarios getUsuario() {
        return usuario;
    }

    public static Productos getProducto() {
        return producto;
    }

    public static ObservableList<Productos> getProductos() {
        return productos;
    }
    public static void main(String[] args) {
        launch();
    }
}