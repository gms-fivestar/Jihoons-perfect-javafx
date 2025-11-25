package com.example._20407javafx.JacksonPractice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class DeckMaker extends Application {
    private Deck deck;
    private TextField questionField;
    private TextField answerField;
    private Button addButton;
    private Button saveButton;
    private Label messageLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        initUI();
        setupEventHandlers();
//        setupLayout(primaryStage);

        Label lb = new Label();
        Label lbIntro = new Label("Anki 덱 만들기");

        Button btAddcard = new Button("카드 추가");
        Button btSavecard = new Button("카드 저장");

        TextField tfEnterQustion = new TextField();
        TextField tfEnterAnswer = new TextField();

        tfEnterQustion.setPromptText("문제");
        tfEnterAnswer.setPromptText("정답");

        btAddcard(e->{
            String q = tfEnterQustion.getText();
            String a = tfEnterAnswer.getText();
            addCard(q,a);
        });

        HBox hbTextField = new HBox(tfEnterQustion,tfEnterAnswer);
        HBox hbButton = new HBox(btAddcard, btSavecard);
        VBox vb = new VBox(hbTextField,hbButton,lb);

        Scene sc = new Scene(vb,400,200);
        primaryStage.setTitle("덱 생성기");
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    private void initUI() {

    }

    private void setupEventHandlers() {

    }

//    private void setupLayout(Stage primaryStage) {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//
//        Deck deck = new Deck("deck");
//
//        try {
//            mapper.writeValue(new File("deck.json"), deck);
//            System.out.println("✅ 덱 저장 완료!");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    private void addCard(String Q, String A) {
        deck.addCard(new Card(Q,A));
    }

    private void saveDeck() {
    }
}
