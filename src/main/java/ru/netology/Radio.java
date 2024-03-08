package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int quantityStation;


    public Radio() {

        this.quantityStation = 10;
    }
    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > quantityStation -1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation == quantityStation -1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = quantityStation -1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
