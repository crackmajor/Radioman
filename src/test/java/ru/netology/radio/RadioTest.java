package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void setValidRadioStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadio(5);

        int actual = radio.getCurrentNumberRadio();
        int expected = 5;

        assertEquals(expected, actual);


    }

    @Test
    void radioStationNumberOver9() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadio(11);

        int actual = radio.getCurrentNumberRadio();
        int expected = 0;

        assertEquals(expected, actual);


    }

    @Test
    void radioStationNumberSubZero() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadio(-99);

        int actual = radio.getCurrentNumberRadio();
        int expected = 0;

        assertEquals(expected, actual);


    }

    @Test
    void nextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadio(5);
        radio.nextRadio();

        int actual = radio.getCurrentNumberRadio();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStationFrom9() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadio(9);
        radio.nextRadio();

        int actual = radio.getCurrentNumberRadio();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void previousRadioStationFrom0() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadio(0);
        radio.previousRadio();

        int actual = radio.getCurrentNumberRadio();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void previousRadioStationFrom4() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadio(4);
        radio.previousRadio();

        int actual = radio.getCurrentNumberRadio();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void wrongVolumeLevelUpperRange() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void wrongVolumeLevelLowerRange() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-8);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void turnDownTheZeroVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.turnDownTheVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void turnDownTheVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        radio.turnDownTheVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void turnUpTheVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.turnUpTheVolume();

        int actual = radio.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void volumeAboveMaximum() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);
        radio.turnUpTheVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }
}
