package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 12;

        // вызываем целевой метод:
        long actual = service.findMax(incomesInBillions);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}