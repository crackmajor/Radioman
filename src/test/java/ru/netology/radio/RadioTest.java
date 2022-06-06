package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio(77);
    Radio radioDefault = new Radio();

    @Test
    void setValidRadioStationNumber() {

        radio.setCurrentNumberRadio(5);

        int actual = radio.getCurrentNumberRadio();
        int expected = 5;

        assertEquals(expected, actual);


    }

    @Test
    void radioStationNumberOverMax() {

        radio.setCurrentNumberRadio(radio.getMaxRadioStation() + 1);

        int actual = radio.getCurrentNumberRadio();
        int expected = 0;

        assertEquals(expected, actual);


    }

    @Test
    void radioStationNumberSubZero() {

        radio.setCurrentNumberRadio(-99);

        int actual = radio.getCurrentNumberRadio();
        int expected = 0;

        assertEquals(expected, actual);


    }

    @Test
    void nextRadioStation() {

        radio.setCurrentNumberRadio(5);
        radio.nextRadio();

        int actual = radio.getCurrentNumberRadio();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStationFromMax() {

        radio.setCurrentNumberRadio(radio.getMaxRadioStation());
        radio.nextRadio();

        int actual = radio.getCurrentNumberRadio();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void previousRadioStationFrom0() {

        radio.setCurrentNumberRadio(0);
        radio.previousRadio();

        int actual = radio.getCurrentNumberRadio();
        int expected = radio.getMaxRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void previousRadioStationFrom4() {

        radio.setCurrentNumberRadio(4);
        radio.previousRadio();

        int actual = radio.getCurrentNumberRadio();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void wrongVolumeLevelUpperRange() {

        radio.setCurrentVolume(99);

        int actual = radio.getCurrentVolume();
        int expected = 99;

        assertEquals(expected, actual);
    }

    @Test
    void wrongVolumeLevelLowerRange() {

        radio.setCurrentVolume(-8);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void turnDownTheZeroVolume() {

        radio.setCurrentVolume(0);
        radio.turnDownTheVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void turnDownTheVolume() {

        radio.setCurrentVolume(7);
        radio.turnDownTheVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void turnUpTheVolume() {

        radio.setCurrentVolume(2);
        radio.turnUpTheVolume();

        int actual = radio.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void volumeAboveMaximum() {

        radio.setCurrentVolume(101);
        radio.turnUpTheVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void volumeAboveMaximumTurnUp() {
        radio.setCurrentVolume(100);
        radio.turnUpTheVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void setValidRadioStationNumberWithDefaultConstructor() {

        radioDefault.setCurrentNumberRadio(5);

        int actual = radioDefault.getCurrentNumberRadio();
        int expected = 5;

        assertEquals(expected, actual);


    }

    @Test
    void radioStationNumberOverMaxWithDefaultConstructor() {

        radioDefault.setCurrentNumberRadio(radio.getMaxRadioStation() + 1);

        int actual = radioDefault.getCurrentNumberRadio();
        int expected = 0;

        assertEquals(expected, actual);


    }

    @Test
    void radioStationNumberSubZeroWithDefaultConstructor() {

        radioDefault.setCurrentNumberRadio(-99);

        int actual = radioDefault.getCurrentNumberRadio();
        int expected = 0;

        assertEquals(expected, actual);


    }

    @Test
    void nextRadioStationWithDefaultConstructor() {

        radioDefault.setCurrentNumberRadio(5);
        radioDefault.nextRadio();

        int actual = radioDefault.getCurrentNumberRadio();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStationFromMaxWithDefaultConstructor() {

        radioDefault.setCurrentNumberRadio(radioDefault.getMaxRadioStation());
        radioDefault.nextRadio();

        int actual = radioDefault.getCurrentNumberRadio();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void previousRadioStationFrom0WithDefaultConstructor() {

        radioDefault.setCurrentNumberRadio(0);
        radioDefault.previousRadio();

        int actual = radioDefault.getCurrentNumberRadio();
        int expected = radioDefault.getMaxRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void previousRadioStationFrom4WithDefaultConstructor() {

        radioDefault.setCurrentNumberRadio(4);
        radioDefault.previousRadio();

        int actual = radioDefault.getCurrentNumberRadio();
        int expected = 3;

        assertEquals(expected, actual);
    }

}
