package com.example._20407javafx._11_14;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class borderpane_Test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        Label topLabel = new Label("상단(Top)");
        Label bottomLabel = new Label("바닥(Bottom)");
        Label leftLabel = new Label("왼쪽(Left)");
        Label rightLabel = new Label("오른쪽(Right)");
        Label centerLabel = new Label("중간(Center)");

        root.setTop(topLabel);
        root.setBottom(bottomLabel);
        root.setLeft(leftLabel);
        root.setRight(rightLabel);
        root.setCenter(centerLabel);

        BorderPane.setAlignment(topLabel, Pos.TOP_CENTER);
        BorderPane.setAlignment(bottomLabel, Pos.BOTTOM_CENTER);
        BorderPane.setAlignment(leftLabel, Pos.CENTER);
        BorderPane.setAlignment(rightLabel, Pos.CENTER);
        BorderPane.setAlignment(centerLabel, Pos.CENTER);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("BorderPane 5개 구역 테스트");
        primaryStage.show();
    }
}
