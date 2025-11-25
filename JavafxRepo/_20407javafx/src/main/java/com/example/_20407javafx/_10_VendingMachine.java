package com.example._20407javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _10_VendingMachine extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // 화면에 보여주는 상자 lv
        ListView<Soda> lv = new ListView<>();
        // 실제로 데이터를 담는 상자 ov
        ObservableList<Soda> ov = FXCollections.observableArrayList();
        lv.setItems(ov);


        ov.addAll(new Soda("코카콜라",1700), new Soda("스프라이트",1600), new Soda("환타", 1300));

        Button buyButton = new Button("구매하기");

        Label LABEL_totalSell = new Label("팔린 음료수 : 0");
        Label LABEL_totalPrice = new Label("팔린 금액 : 0");

        buyButton.setOnAction(e ->{
            Soda selected = lv.getSelectionModel().getSelectedItem();

            System.out.println(selected.name + " 음료를 구매해주셔서 감사합니다! 가격은 " + selected.price +"원 입니다!");
            Soda.totalPrice += selected.price;
            Soda.totalSell++;

            LABEL_totalPrice.setText("팔린 음료수 : " + Soda.totalSell);
            LABEL_totalSell.setText("팔린 금액 : " + Soda.totalPrice);
        });

        HBox hb = new HBox(50,buyButton,LABEL_totalSell,LABEL_totalPrice);
        VBox vb = new VBox(lv,hb);

        Scene sc = new Scene(vb, 500, 500);

        primaryStage.setTitle("안녕");
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
