package com.example._20407javafx._11_04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Level2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Random random = new Random();
        // 1부터 100까지의 랜덤 정수 생성 (0부터 99까지 + 1)
        int randomNumber = random.nextInt(100) + 1;

        Label lb = new Label("정답을 적어보세용! (1~100)");
        TextField tf = new TextField();

        tf.setOnAction(e->{
            String str = tf.getText();
            int n = Integer.parseInt(str);

            if(n > randomNumber){
                lb.setText("낮은 숫자!");
            }else if(n < randomNumber){
                lb.setText("높은 숫자!");
            }else{
                lb.setText("정답!!!");
            }
        });

        HBox hb1 = new HBox(tf);
        HBox hb2 = new HBox(25,lb);
        VBox vb = new VBox(hb1,hb2);
        Scene scene = new Scene(vb,1000,1000);

        primaryStage.setScene(scene);
        primaryStage.setTitle("TextField");
        primaryStage.show();
    }
}
