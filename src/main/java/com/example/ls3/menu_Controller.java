package com.example.ls3;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class menu_Controller implements Initializable {
    @FXML
    private Button btn_ADD;

    @FXML
    private Button btn_add_2;

    @FXML
    private Button btn_back_up;

    @FXML
    private Button btn_back_up_2;

    @FXML
    private Button btn_dashboard;

    @FXML
    private Button btn_dashboard_2;

    @FXML
    private Button btn_report;

    @FXML
    private Button btn_report_2;

    @FXML
    private Label Back_menu;
    @FXML
    private AnchorPane myPane;
    @FXML
        private BorderPane screen;
    Stage stage = null;
    @FXML
    private Label Menu;

    @FXML
    private ImageView exit, minimize, maximize;

    @FXML
    private AnchorPane slider;
    @FXML
    private StackPane stack_pane;
    @Override
    
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(exit!=null){
         try {
             exit.setOnMouseClicked(event -> {
                 System.exit(0);
             });
         }catch (Exception e){
             e.printStackTrace();
         }
        }
        if(minimize!=null){
            minimize.setOnMouseClicked(event->{
                ((Stage)((ImageView)event.getSource()).getScene().getWindow()).setIconified(true);
            });
        }
       if(maximize!=null){
           maximize.setOnMouseClicked(event->{
               stage = (Stage)myPane.getScene().getWindow();
               if(stage.isMaximized()){

                   stage.setMaximized(false);
               }else{

                   stage.setMaximized(true);
               }
           });
       }
        if(Menu!= null){
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
        }
        if(slider!=null){slider.setTranslateX(-176);}

        if(Back_menu!=null){
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



    public void dashboard_clicked(ActionEvent event) {
        TranslateTransition slide = new TranslateTransition();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard.fxml"));
        try {
            Pane registerPane = fxmlLoader.load();
            screen.getChildren().clear();
            screen.getChildren().add(registerPane);

            slide.setToX(0);
            slide.play();
            slider.setTranslateX(-176);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void add_clicked(ActionEvent event) {
        TranslateTransition slide = new TranslateTransition();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add.fxml"));
        try {
            Pane registerPane = fxmlLoader.load();
            screen.getChildren().clear();
            screen.getChildren().add(registerPane);

            slide.setToX(0);
            slide.play();
            slider.setTranslateX(-176);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void report_clicked(ActionEvent event) {
        TranslateTransition slide = new TranslateTransition();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("report.fxml"));
        try {
            Pane registerPane = fxmlLoader.load();
            screen.getChildren().clear();
            screen.getChildren().add(registerPane);

            slide.setToX(0);
            slide.play();
            slider.setTranslateX(-176);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void backup_clicked(ActionEvent event) {
        TranslateTransition slide = new TranslateTransition();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("backup.fxml"));
        try {
            Pane registerPane = fxmlLoader.load();
            screen.getChildren().clear();
            screen.getChildren().add(registerPane);

            slide.setToX(0);
            slide.play();
            slider.setTranslateX(-176);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listView_Clicked(ActionEvent event) {
        TranslateTransition slide = new TranslateTransition();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("list.fxml"));
        try {
            Pane registerPane = fxmlLoader.load();
            screen.getChildren().clear();
            screen.getChildren().add(registerPane);

            slide.setToX(0);
            slide.play();
            slider.setTranslateX(-176);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }


