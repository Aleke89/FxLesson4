package com.example.ls3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.application.Application.launch;

public class ListView_Controller implements Initializable {
    @FXML
    private AnchorPane ap;
    @FXML
    private VBox vBox;


    private final Image IMAGE_190 = new Image("D:\\UROKI LESSONS\\Java\\Java List View\\FxLesson4\\src\\main\\resources\\com\\example\\ls3\\3-types-of-backup.png");
    private final Image IMAGE_140 = new Image("D:\\UROKI LESSONS\\Java\\Java List View\\FxLesson4\\src\\main\\resources\\com\\example\\ls3\\3-types-of-backup.png");
    //private final Image IMAGE_140 = new Image("https://motor.ru/imgs/2018/01/09/15/1436017/a21ddf8bd23d2f78fdcf8b1e359a6383a5fd2dc5.jpg");

    private Image[] listOfImages = {IMAGE_140,IMAGE_190};
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ListView<String> listView = new ListView<String>();
        ObservableList<String> items = FXCollections.observableArrayList("Mercedes-Benz 190:2.3","Mercedes-Benz 140:6.3");
        listView.setItems(items);

        listView.setCellFactory(param->new ListCell<String>(){
            private ImageView imageView = new ImageView();

            @Override
            public void updateItem(String name, boolean empty) {
                super.updateItem(name, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else {
                    if(name.equals("Mercedes-Benz 190:2.3")){
                        imageView.setFitWidth(320);
                        imageView.setFitHeight(200);
                        imageView.setImage(listOfImages[1]);}
                    else if(name.equals("Mercedes-Benz 140:6.3")){
                        imageView.setFitWidth(280);
                        imageView.setFitHeight(200);
                        imageView.setImage(listOfImages[0]);}
                    setText(name);
                    setGraphic(imageView);
                }
            }
        });
//        VBox box = new VBox(listView);
        vBox.getChildren().addAll(listView);
//        box.setAlignment(Pos.CENTER);
//        Scene scene = new Scene(box, 200, 200);
//        stage.setScene(scene);
//        stage.show();
    }
}
