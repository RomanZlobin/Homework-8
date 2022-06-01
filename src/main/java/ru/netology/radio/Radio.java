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
    public void next() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        else{ currentStation = 0;

        }
    }
    public int getCurrentStation(){
        return currentStation;
    }


    public int currentVolume;


}
