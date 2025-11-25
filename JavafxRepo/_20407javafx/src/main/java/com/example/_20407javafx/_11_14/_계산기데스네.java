package com.example._20407javafx._11_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import javax.swing.border.Border;
import java.awt.*;

public class _계산기데스네 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        String firstNum = null;
        String secondNum = null;
        String operator = null;

        int step = 1;

        TextField tf = new TextField();
        tf.setEditable(false);

        GridPane buttonsPane = new GridPane();

        Button bt0 = new Button("0");
        Button bt1 = new Button("1");
        Button bt2 = new Button("2");
        Button bt3 = new Button("3");
        Button bt4 = new Button("4");
        Button bt5 = new Button("5");
        Button bt6 = new Button("6");
        Button bt7 = new Button("7");
        Button bt8 = new Button("8");
        Button bt9 = new Button("9");
        Button btPlus = new Button("+");
        Button btMinus = new Button("-");
        Button btDivision = new Button("/");
        Button btMulti = new Button("*");
        Button btResult = new Button("=");

        buttonsPane.add(bt0,0,3);
        buttonsPane.add(bt1,0,2);
        buttonsPane.add(bt2,1,2);
        buttonsPane.add(bt3,2,2);
        buttonsPane.add(bt4,0,1);
        buttonsPane.add(bt5,1,1);
        buttonsPane.add(bt6,2,1);
        buttonsPane.add(bt7,0,0);
        buttonsPane.add(bt8,1,0);
        buttonsPane.add(bt9,2,0);
        buttonsPane.add(btPlus,3,3);
        buttonsPane.add(btMinus,3,2);
        buttonsPane.add(btDivision,3,0);
        buttonsPane.add(btMulti,3,1);
        buttonsPane.add(btResult,2,3);

         







        Scene scene = new Scene(buttonsPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("계산기");
        primaryStage.show();
    }
}
