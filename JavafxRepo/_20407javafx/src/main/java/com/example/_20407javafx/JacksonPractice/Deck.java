package com.example._20407javafx.JacksonPractice;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private String name;
    private List<Card> cards;

    // ===== 생성자 =====

    // 기본 생성자 (Jackson 필수)
    public Deck() {
        this.cards = new ArrayList<>();  // 이것도 초기화!
    }

    // 이름을 받는 생성자
    public Deck(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    // ===== Getter/Setter =====

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    // ===== 유용한 메서드들 =====

    // 카드 추가
    public void addCard(Card card) {
        this.cards.add(card);
    }

    // 카드 삭제
    public void removeCard(Card card) {
        this.cards.remove(card);
    }

    // 카드 개수
    public int getCardCount() {
        return this.cards.size();
    }

    // 특정 인덱스의 카드 가져오기
    public Card getCard(int index) {
        if (index >= 0 && index < cards.size()) {
            return cards.get(index);
        }
        return null;
    }

    // 덱이 비어있는지 확인
    public boolean isEmpty() {
        return cards.isEmpty();
    }
}