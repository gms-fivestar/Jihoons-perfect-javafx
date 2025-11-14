package com.example._20407javafx._11_04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Level3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    int min;
    int max;
    int currentNum;

    @Override
    public void start(Stage primaryStage) {
        Label lb = new Label("1~100까지 제가 맞추어 보겠습니다!!!");
        Button startButton = new Button("시작하기");
        Button correctButton = new Button("정답입니다!!");
        Button upButton = new Button("Up");
        Button downButton = new Button("Down");

        correctButton.setDisable(true);
        upButton.setDisable(true);
        downButton.setDisable(true);

        startButton.setOnAction(e ->{
            startButton.setDisable(true);
            correctButton.setDisable(false);
            upButton.setDisable(false);
            downButton.setDisable(false);

            resetGame(false, startButton, upButton, downButton, correctButton);

            this.min = 1;
            this.max = 100;

            this.currentNum = (this.min + this.max) / 2;
            lb.setText("당쉬무니 생광한 숮짜는" + currentNum + "이무니꽈?");
        });

        correctButton.setOnAction(e->{
            lb.setText("아 너무 쉽네요 ^^");
            resetGame(true, startButton, upButton, downButton, correctButton);
        });

        upButton.setOnAction(e->{
            this.min = (this.currentNum + 1);

            if(this.min > this.max) {
                lb.setText("사기치네 으휴.,... 그러니깐 자바 실력이 안늘지...");
                resetGame(true, startButton, upButton, downButton, correctButton);
            }

            else {
                this.currentNum = (this.min + this.max) / 2;
                lb.setText("당신의 넘버는 " + currentNum + " 이무니까???");
            }
        });


        downButton.setOnAction(e->{
            this.max = (this.currentNum - 1);

            if(this.min > this.max) {
                lb.setText("사기치네... 하 진짜... 무대 나가서 쌤 자바 싫어요!!!! 외쳐야 정신을 차리나;.......");
                resetGame(true, startButton, upButton, downButton, correctButton);
            }

            else {
                this.currentNum = (this.min + this.max) / 2;
                lb.setText("너가 생각한 숫자는" + currentNum + " 이무니꽈??");
            }
        });

        HBox hb1 = new HBox(lb);
        HBox hb2 = new HBox(startButton);
        HBox hb3 = new HBox(correctButton,upButton,downButton);
        VBox vb = new VBox(hb1,hb2,hb3);
        Scene scene = new Scene(vb,1000,1000);

        primaryStage.setTitle("Level 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void resetGame(boolean init, Button startButton, Button upButton, Button downButton, Button correctButton) {
        startButton.setDisable(!init);
        upButton.setDisable(init);
        downButton.setDisable(init);
        correctButton.setDisable(init);
    }
}
