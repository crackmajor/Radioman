package ru.netology.radio;

public class Radio {
    private int currentNumberRadio;
    private int currentVolume;
    private int maxRadioStation = 9;
    private int maxCurrentVolume = 100;

    public Radio() {
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation - 1;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setCurrentNumberRadio(int currentNumberRadio) {
        if (currentNumberRadio < 0) {
            return;
        }
        if (currentNumberRadio > maxRadioStation) {
            return;
        }
        this.currentNumberRadio = currentNumberRadio;
    }

    public int getCurrentNumberRadio() {

        return currentNumberRadio;
    }

    public void nextRadio() {
        if (currentNumberRadio == maxRadioStation) {
            currentNumberRadio = 0;
        } else {
            currentNumberRadio = currentNumberRadio + 1;
        }
    }

    public void previousRadio() {
        if (currentNumberRadio == 0) {
            currentNumberRadio = maxRadioStation;
        } else {
            currentNumberRadio = currentNumberRadio - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxCurrentVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void turnDownTheVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

    public void turnUpTheVolume() {
        if (currentVolume == maxCurrentVolume) {
            currentVolume = maxCurrentVolume;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

}
