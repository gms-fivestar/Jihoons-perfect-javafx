package com.example._20407javafx.JacksonPractice;

public class Card {
    private String question;
    private String answer;

    public Card(String question, String answer){
        this.question = question;
        this.answer = answer;
    }


    // 3. Getter 메서드들 (Jackson이 JSON 변환할 때 사용!)
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    // 4. Setter 메서드들 (Jackson이 JSON에서 객체 만들 때 사용!)
    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
