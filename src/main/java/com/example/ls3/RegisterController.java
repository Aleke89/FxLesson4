package com.example.ls3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {
@FXML
    TextField tfx_name,tfx_surname,tfx_password,tfx_email,tfx_phone_number;
@FXML
    private ComboBox<String> cmb_classroom,cmb_group;
public void initialize(URL url, ResourceBundle resourceBundle){
    String classroom[]={"201","202","102","103"};
    String group[]={"3E","3D","3G","3B"};
    ObservableList<String> data = FXCollections.observableArrayList(classroom);
    ObservableList<String> datag = FXCollections.observableArrayList(group);
    cmb_classroom.setItems(data);
    cmb_group.setItems(datag);
}
    public void btn_register_clicked(ActionEvent event) {
      {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 600);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            System.out.println(e.toString());
            }
        }
    }

    public void btn_log_in_clicked(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 600);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
