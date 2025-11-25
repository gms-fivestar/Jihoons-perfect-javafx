package com.example._20407javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

public class _06_TextArea extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextArea ta1 = new TextArea();
        TextArea ta2 = new TextArea();

        Button bt = new Button("옮기기");

        bt.setOnAction(e ->{
            String str = ta1.getText();
            ta2.setText(str);
        });

        HBox hb = new HBox(50, ta1,ta2);
        VBox root = new VBox(hb,bt);

        Scene scene = new Scene(root, 700 , 700);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
