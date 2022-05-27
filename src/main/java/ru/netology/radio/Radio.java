package ru.netology.radio;

public class Radio {
    private int currentNumberRadio;
    private int currentVolume;

    public void setCurrentNumberRadio(int currentNumberRadio) {
        if (currentNumberRadio < 0) {
            return;
        }
        if (currentNumberRadio > 9) {
            return;
        }
        this.currentNumberRadio = currentNumberRadio;
    }

    public int getCurrentNumberRadio() {
        return currentNumberRadio;
    }

    public void nextRadio() {
        if (currentNumberRadio == 9) {
            currentNumberRadio = 0;
        } else {
            currentNumberRadio = currentNumberRadio + 1;
        }
    }

    public void previousRadio() {
        if (currentNumberRadio == 0) {
            currentNumberRadio = 9;
        } else {
            currentNumberRadio = currentNumberRadio - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
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
        if (currentVolume == 9) {
            currentVolume = 9;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

}
