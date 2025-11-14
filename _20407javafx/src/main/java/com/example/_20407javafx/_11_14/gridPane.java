package com.example._20407javafx._11_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

import javax.swing.text.LayoutQueue;

public class gridPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();

        root.setHgap(10);
        root.setVgap(10);

        Label lb00 = new Label("{0,0}");
        Label lb01 = new Label("{0,1}");
        Label lb11 = new Label("{1,1}");
        Label lb10 = new Label("{1,0}");

        lb00.setStyle("-fx-background-color: #FFCCCC;");
        lb10.setStyle("-fx-background-color: #CCFFCC;");
        lb01.setStyle("-fx-background-color: #CCCCFF;");
        lb11.setStyle("-fx-background-color: #FFFFCC;");


        root.add(lb00,0,0);
        root.add(lb01,0,1);
        root.add(lb10,1,0);
        root.add(lb11,1,1);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("GridPane 좌표 테스트");
        primaryStage.show();
    }
}
