package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();
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

        radio.setCurrentStation(setCurrentStation);
        radio.next();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "-1, 9",
            "0, 9",
            "1, 0",
            "2, 1",
            "8, 7",
            "9, 8",
            "10, 9",
            "11, 9"
    })
    public void prevStation(int setCurrentStation, int expected) {

        radio.setCurrentStation(setCurrentStation);
        radio.prev();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "-2, 1",
            "-1, 1",
            "0, 1",
            "1, 2",
            "8, 9",
            "9, 10",
            "10, 10",
            "11, 1"
    })
    public void plusVolume(int setCurrentVolume, int expected) {

        radio.setCurrentVolume(setCurrentVolume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 0",
            "8, 7",
            "9, 8",
            "10, 9",
            "11, 0",
            "12, 0"
    })
    public void minusVolume(int setCurrentVolume, int expected) {

        radio.setCurrentVolume(setCurrentVolume);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    Radio radio2 = new Radio(11);
    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 1",
            "8, 8",
            "9, 9",
            "10, 10",
            "11, 0"
    })
    public void findStation2(int setCurrentStation, int expected) {

        radio2.setCurrentStation(setCurrentStation);
        int actual = radio2.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "-1, 1",
            "0, 1",
            "1, 2",
            "2, 3",
            "8, 9",
            "9, 10",
            "11, 1"
    })
    public void nextStation2(int setCurrentStation, int expected) {

        radio2.setCurrentStation(setCurrentStation);
        radio2.next();
        int actual = radio2.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "-1, 10",
            "0, 10",
            "1, 0",
            "2, 1",
            "8, 7",
            "9, 8",
            "10, 9",
            "11, 10",
            "12, 10"
    })
    public void prevStation2(int setCurrentStation, int expected) {

        radio2.setCurrentStation(setCurrentStation);
        radio2.prev();
        int actual = radio2.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}

