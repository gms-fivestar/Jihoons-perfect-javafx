package com.example._20407javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class _07_TextAreaUse extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextArea ta1 = new TextArea();
        TextArea ta2 = new TextArea();

        Button bt = new Button("교정하기");

        Label lb = new Label("교정하기를 누르면 맞춤법이 교정이 됩니다.");

        HBox hb = new HBox(20,ta1,ta2);
        VBox vb = new VBox(10,hb,bt,lb);

        bt.setOnAction(e->{
            String str = ta1.getText();
            int count = 0;
            if(str.contains("마춤뻡")){
                str = str.replace("마춤뻡","맞춤법");
                count++;
            }

            if(str.contains("사생활치매")){
                str = str.replace("사생활치매","사생활침해");
                count++;
            }

            if(str.contains("골이따분한 성격")){
                str = str.replace("골이따분한 성격","고리타분한 성격");
                count++;
            }

            ta2.setText(str);

            lb.setText("현재 " + count + "개의 오타가 교정되었습니다.");
        });

        Scene scene = new Scene(vb,700,700);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
