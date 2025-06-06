package com.pluralsight;

public class SemiTruck extends Vehicle{
    private String trailerType; // flatbed, refrigerated, tanker
    private boolean sleepingCab; // true/false for onboard driver rest area

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    public boolean isSleepingCab() {
        return sleepingCab;
    }

    public void setSleepingCab(boolean sleepingCab) {
        this.sleepingCab = sleepingCab;
    }
}
