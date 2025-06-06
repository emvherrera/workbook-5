package com.pluralsight;

public class Hovercraft extends Vehicle {
    private boolean surfaceTypeSupported; // water or land
    private boolean stabilitySystem; // true/false for automatic balance tech

    public boolean isSurfaceTypeSupported() {
        return surfaceTypeSupported;
    }

    public void setSurfaceTypeSupported(boolean surfaceTypeSupported) {
        this.surfaceTypeSupported = surfaceTypeSupported;
    }

    public boolean isStabilitySystem() {
        return stabilitySystem;
    }

    public void setStabilitySystem(boolean stabilitySystem) {
        this.stabilitySystem = stabilitySystem;
    }
}
