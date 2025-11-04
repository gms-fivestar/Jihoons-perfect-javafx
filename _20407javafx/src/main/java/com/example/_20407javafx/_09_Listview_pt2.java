package com.example._20407javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _09_Listview_pt2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // 화면에 보여주는 상자 lv
        ListView <Person> lv = new ListView<>();
        // 실제로 데이터를 담는 상자 ov
        ObservableList <Person> ov = FXCollections.observableArrayList();

        TextField nameField = new TextField();
        nameField.setPromptText("이름을 입력하세요");
        TextField cityField = new TextField();
        cityField.setPromptText("도시를 입력하세요");

        Button addButton = new Button("추가하기");
        Button removeButton = new Button("삭제하기");
        Button changeButton = new Button("변경하기");
        Button printButton = new Button("정보출력");

        lv.setItems(ov);

        addButton.setOnAction(e->{
            String name = nameField.getText();
            String city = cityField.getText();

            Person person = new Person(name, city);

            ov.add(person);
        });

//        lv.setOnMouseClicked(e->{
//            System.out.println("클릭되었습니다");
//
//            String selected = lv.getSelectionModel().getSelectedItem();
//            int value = lv.getSelectionModel().getSelectedIndex();
//
//            System.out.println("인덱스는 : " + value + "\n선택된 모델 : " + selected);
//        });

        lv.getSelectionModel().selectedItemProperty().addListener((a, oldValue, newValue) ->{
            System.out.println(oldValue);
            System.out.println(newValue);
        });

        HBox hb1 = new HBox(50, nameField,cityField);
        HBox hb2 = new HBox(addButton,removeButton,changeButton,printButton);
        VBox vb = new VBox(lv,hb1,hb2);

        Scene sc = new Scene(vb, 500, 500);

        primaryStage.setTitle("안녕");
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
