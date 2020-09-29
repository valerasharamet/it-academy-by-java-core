package com.rakovets.course.javabasics.practice.operators;

public class Task5notebook {
    public static void main(String[] args) {
        long timeInSeconds = 4566879624879654244l;
        long s = timeInSeconds % 60;
        long minutes = (timeInSeconds - s) / 60;
        long m = minutes % 60;
        long hours = (minutes - m) / 60;
        long H = hours % 24;
        long Days = (hours - H) / 24;
        long D = Days % 24;
        long W = (D - Days) % 7; // Неделя
        System.out.println("Week"+W+" Days: "+D+" Hours: "+H+" Minute: " + m + " Second:" + s );
    }
}
