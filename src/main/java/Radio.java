public class Radio {

    public int currentVolume;
    public int currentRadioStationNumber;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setToMaxVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }

    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setToMaxRadioStationNumber(int currentRadioStationNumber) {

        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > 9) {
            return;
        }
    public void next(){
            if (currentVolume < 10){
                currentVolume ++;
            }
            else {currentVolume=0;
            }
        }

    public void next(){
            if (currentRadioStationNumber < 9){
                currentRadioStationNumber ++;
            }
            else {currentRadioStationNumber = 0;
            }
        }

    }

}
