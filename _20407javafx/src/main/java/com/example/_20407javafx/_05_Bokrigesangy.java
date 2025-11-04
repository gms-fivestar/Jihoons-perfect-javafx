package com.example._20407javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import org.w3c.dom.Text;

import java.awt.*;

public class _05_Bokrigesangy extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label lb = new Label("0");

        TextField tf = new TextField();
        tf.setPromptText("투자금을 입력하세요.");

        Button bt1 = new Button("5%");
        Button bt2 = new Button("10%");
        Button bt3 = new Button("15%");

        bt1.setOnAction(e->{
            String str = tf.getText();
            try{
                double n = Double.parseDouble(str);

                for(int i = 1; i <= 5; i++){
                    n *= 1.05;
                }
                str = Double.toString(n);
                lb.setText(str);
            }catch(NumberFormatException exception){
                lb.setText("변환 불가(숫자가 아님)");
            }
        });

        bt2.setOnAction(e->{
            String str = tf.getText();
            try{
                double n = Double.parseDouble(str);

                for(int i = 1; i <= 5; i++){
                    n *= 1.1;
                }
                str = Double.toString(n);
                lb.setText(str);
            }catch(NumberFormatException exception){
                lb.setText("변환 불가(숫자가 아님)");
            }
        });

        bt3.setOnAction(e->{
            String str = tf.getText();
            try{
                double n = Double.parseDouble(str);

                for(int i = 1; i <= 5; i++){
                    n *= 1.15;
                }
                str = Double.toString(n);
                lb.setText(str);
            }catch(NumberFormatException exception){
                lb.setText("변환 불가(숫자가 아님)");
            }
        });

        VBox vb = new VBox(tf,bt1,bt2,bt3,lb);
        Scene scene = new Scene(vb,1000,1000);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
