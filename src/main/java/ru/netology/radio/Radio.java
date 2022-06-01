package ru.netology.radio;

public class Radio {
    private int currentStation;

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0){
            return;
        }
        if (currentStation >9){
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation(){
        return currentStation;
    }
    public int currentVolume;

}
