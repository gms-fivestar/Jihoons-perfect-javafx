package com.example._20407javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _01_windows extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button bt1 = new Button("1번 버튼");
        Button bt2 = new Button("2번 버튼");

        bt1.setOnAction(actionEvent -> {
            System.out.println("ㅎㅇ 1번 버튼 어서오고");
        });

        bt2.setOnAction(actionEvent -> {
            System.out.println("ㅎㅇ 2번 버튼 어서오지 말고");
        });

        VBox vb = new VBox(bt1,bt2);
        Scene scene = new Scene(vb,500,500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
