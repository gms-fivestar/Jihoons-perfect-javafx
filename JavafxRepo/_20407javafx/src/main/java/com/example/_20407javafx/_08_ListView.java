package com.example._20407javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import org.w3c.dom.Text;

public class _08_ListView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // 화면에 보여주는 상자 lv
        ListView <String> lv = new ListView<>();
        // 실제로 데이터를 담는 상자 ov
        ObservableList <String> ov = FXCollections.observableArrayList();
        // lv와 ov를 연결해주는 코드
        lv.setItems(ov);

        ov.addAll("특급1","특급2","특급3");

        TextField tf = new TextField();

        Button btAdd = new Button("추가하기");
        Button btRemove = new Button("삭제하기");
        Button btSet = new Button("변경하기");
        Button btContains = new Button("검사하기");

        btAdd.setOnAction(e->{
            String str = tf.getText();
            ov.add(str);
        });

        btRemove.setOnAction(e->{
            String str = tf.getText();
            ov.remove(str);
        });

        btSet.setOnAction(e->{
            ov.set(0, tf.getText());
        });

        btContains.setOnAction(e->{
            String text = tf.getText();

            if(ov.contains(text)){
                System.out.println("존재함!");
            }else{
                System.out.println("존재하지 않음!");
            }
        });

        VBox vb = new VBox(10,lv,tf,btAdd,btRemove, btSet,btContains);

        Scene scene = new Scene(vb);

        primaryStage.setTitle("성찰교실 리스트");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
