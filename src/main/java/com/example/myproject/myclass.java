package com.example.myproject;

public class MyClass {
    // Поле класса
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    // Метод
    public String greet() {
        return "Hello, " + name + "!";
    }

    // Геттер (при необходимости)
    public String getName() {
        return name;
    }

    // Сеттер (при необходимости)
    public void setName(String name) {
        this.name = name;
    }
}
