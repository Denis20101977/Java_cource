package Lesson_youtube.Lesson_youtube.src.Stepik_lessons;

public class WhatToDo {
    public static void main(String[] args) {
        boolean isGoodWeather = false;
        boolean isNight = true;
        if (isNight) {
            System.out.println("Спать");
        }
        if (!isNight && isGoodWeather) {
            System.out.println("Идем гулять");
        }
        if (!isNight && !isGoodWeather) {
            System.out.println("Читать книгу");
        }

    }
}
