package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationsServiceTest {

    @Test
    public void shouldCalculateVacation() {
        VacationsService service = new VacationsService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expectedMonths = 3;

        int actualMonths = service.calculateVacations(income, expenses, threshold);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void shouldCalculateVacationMonths() {
        VacationsService service = new VacationsService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expectedMonths = 2;

        int actualMonths = service.calculateVacations(income, expenses, threshold);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}