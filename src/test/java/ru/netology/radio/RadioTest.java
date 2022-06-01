package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 1",
            "8, 8",
            "9, 9",
            "10, 0"
    })
    public void findStation(int setCurrentStation, int expected) {

        Radio radio = new Radio();
        radio.setCurrentStation(setCurrentStation);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "-1, 1",
            "0, 1",
            "1, 2",
            "2, 3",
            "8, 9",
            "9, 0",
            "10, 1"
    })
    public void nextStation(int setCurrentStation, int expected) {

        Radio radio = new Radio();
        radio.setCurrentStation(setCurrentStation);
        radio.next();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}

