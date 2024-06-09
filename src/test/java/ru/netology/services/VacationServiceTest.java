package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class VacationServiceTest {
    @Test
    void shouldCalculateNumberOfVacation1() {
        VacationService service = new VacationService();
        int actual = service.calc(10_000, 3_000, 20_000);
        Assertions.assertEquals(3, actual);
    }

    @Test
    void shouldCalculateNumberOfVacation2() {
        VacationService service = new VacationService();
        int actual = service.calc(100_000, 60_000, 150_000);
        Assertions.assertEquals(2, actual);
    }
}
