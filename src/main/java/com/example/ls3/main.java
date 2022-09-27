package com.example.ls3;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {

    @FXML
    Button btn_login,btn_register;
    @FXML
    TextField tfx_email,tfx_password;
    @Override

    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu_page.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}