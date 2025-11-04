package com.example._20407javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _03_count extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label lb = new Label("0");
        Button bt1 = new Button("+ 1");
        Button bt2 = new Button("+ 10");
        Button bt3 = new Button("+ 100");

        bt1.setOnAction(event -> {
            String number = lb.getText();
            int n = Integer.parseInt(number);
            n += 1;
            number = Integer.toString(n);
            lb.setText(number);
        });

        bt2.setOnAction(event -> {
            String number = lb.getText();
            int n = Integer.parseInt(number);
            n += 10;
            number = Integer.toString(n);
            lb.setText(number);
        });

        bt3.setOnAction(event -> {
            String number = lb.getText();
            int n = Integer.parseInt(number);
            n += 100;
            number = Integer.toString(n);
            lb.setText(number);
        });

        VBox vb = new VBox(lb,bt1,bt2,bt3);
        Scene scene = new Scene(vb,500,500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
