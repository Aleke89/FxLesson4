package com.example.ls3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Login_Controller {
    @FXML
    Button btn_login,btn_register;
    @FXML
    TextField tfx_email,tfx_password;

    public void btn_login_clicked(ActionEvent event){
        if(tfx_email.getText().equals("aleke") && tfx_password.getText().equals("aleke")){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("Welcome_page.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 600, 600);
                Stage stage = new Stage();
                stage.setTitle("WELCOME PAGE");
                stage.setScene(scene);
                stage.show();
                ((Node)(event.getSource())).getScene().getWindow().hide();
            }
            catch (IOException e) {
                System.out.println(e.toString());
            }
        }else{
            try{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Error");
                alert.show();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void btn_register_clicked(ActionEvent event) {
        try{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Register_page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage stage = new Stage();
        stage.setTitle("WELCOME PAGE");
        stage.setScene(scene);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }catch (Exception e){
            e.printStackTrace();
        }
    }
}
