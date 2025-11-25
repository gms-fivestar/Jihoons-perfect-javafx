package com.example._20407javafx;

public class Person {
    String name;
    String city;

    Person(String x, String y){
        name = x;
        city = y;
    }

    @Override
    public String toString(){
        return name + " , " + city;
    }

}
