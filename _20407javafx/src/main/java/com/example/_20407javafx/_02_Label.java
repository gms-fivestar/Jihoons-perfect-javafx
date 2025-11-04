package com.example._20407javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class _02_Label extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label lb = new Label("java");
        Button bt1 = new Button("라벨 바꾸기");

        bt1.setOnAction(event -> {
            String str = lb.getText();
            if(str.equals("java")){
                lb.setText("javafx");
            }else{
                lb.setText("java");
            }
        });

        VBox vb = new VBox(lb,bt1);
        Scene scene = new Scene(vb,500,500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
