package com.example._20407javafx;

public class Soda {
    String name;
    int price;

    static int totalPrice;
    static int totalSell;

    Soda(String sodaName, int sodaPrice){
        name = sodaName;
        price = sodaPrice;
    }

    public String toString(){
        return name + " / " + price + "원";
    }
}
