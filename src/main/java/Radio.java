public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0 || currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else currentRadioStation++;
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else currentRadioStation--;
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            currentVolume = 100;
        }else currentVolume++;
    }
    public void decreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
        }else currentVolume--;
    }
}
