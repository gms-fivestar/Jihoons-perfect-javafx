package com.example._20407javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;

public class _04_TextField extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button bt1 = new Button("Get Text");
        Button bt2 = new Button("Set Text");

        TextField tf = new TextField();
        tf.setPromptText("입력해보세요");

        bt1.setOnAction(e -> {
            String text = tf.getText();
            System.out.println(text);
        });

        bt2.setOnAction(e -> {
            tf.setText("텍스트가 바뀜");
        });

        tf.setOnAction(e->{ //엔터 치면 나오는거
            bt1.fire();
        });

        VBox vb = new VBox(tf,bt1,bt2);
        Scene scene = new Scene(vb,1000,1000);

        primaryStage.setScene(scene);
        primaryStage.setTitle("TextField");
        primaryStage.show();
    }
}
