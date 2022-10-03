package com.example.ls3;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class menu_Controller implements Initializable {
    @FXML
    private Label Back_menu;
    @FXML
    private AnchorPane myPane;

    Stage stage = null;
    @FXML
    private Label Menu;

    @FXML
    private ImageView exit, minimize, maximize;

    @FXML
    private AnchorPane slider;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        exit.setOnMouseClicked(event -> {
            System.exit(0);
        });

        minimize.setOnMouseClicked(event->{
                ((Stage)((ImageView)event.getSource()).getScene().getWindow()).setIconified(true);
        });
        maximize.setOnMouseClicked(event->{
           stage = (Stage)myPane.getScene().getWindow();
            if(stage.isMaximized()){

                stage.setMaximized(false);
            }else{

                stage.setMaximized(true);
            }
        });
        slider.setTranslateX(-176);
        Menu.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(0);
            slide.play();

            slider.setTranslateX(-176);
            slide.setOnFinished((ActionEvent e) -> {
                Menu.setVisible(false);
                Back_menu.setVisible(true);
            });
        });

        Back_menu.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(-176);
            slide.play();

            slider.setTranslateX(0);
            slide.setOnFinished((ActionEvent e) -> {
                Menu.setVisible(true);
                Back_menu.setVisible(false);
            });
        });
    }



}
