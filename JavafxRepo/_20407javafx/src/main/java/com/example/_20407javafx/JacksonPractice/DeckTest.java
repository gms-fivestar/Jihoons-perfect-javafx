package com.example._20407javafx.JacksonPractice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;

public class DeckTest {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            // 1. Deck 만들기
            Deck deck = new Deck("영어 단어");

            // 2. 저장
            mapper.writeValue(new File("deck.json"), deck);
            System.out.println("✅ 덱 저장 완료!");

            // 3. 불러오기
            Deck loadedDeck = mapper.readValue(new File("deck.json"), Deck.class);
            System.out.println("✅ 덱 불러오기 완료!");
            System.out.println("덱 이름: " + loadedDeck.getName());
            System.out.println("카드 개수: " + loadedDeck.getCards().size());

            for (Card card : loadedDeck.getCards()) {
                System.out.println("- " + card.getQuestion() + " = " + card.getAnswer());
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
