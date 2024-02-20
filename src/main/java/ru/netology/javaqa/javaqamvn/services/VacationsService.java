package ru.netology.javaqa.javaqamvn.services;

public class VacationsService {
    public int calculateVacations(int income, int expenses, int threshold) {
        int months = 0;
        int money = 0;
        int count = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                //отдыхает
                money -= expenses;
                money = money / 3;
                months++;
            } else {
                // работает
                money -= expenses;
                money += income;
            }
        }
        return months;
    }
}
