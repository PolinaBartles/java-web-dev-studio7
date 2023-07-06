package org.launchcode.studio7;

public abstract class BaseDisc {
    private int totalCapacity;
    private int availableCapacity;
    private int usedCapacity;
    private String name;
    private final static int SPIN_RATE_CD = 0;

    public BaseDisc(int totalCapacity, String name) {
        this.totalCapacity = totalCapacity;
        this.name = name;
    }

    public BaseDisc(int totalCapacity, int availableCapacity, int usedCapacity, String name) {
        this.totalCapacity = totalCapacity;
        this.availableCapacity = availableCapacity;
        this.usedCapacity = usedCapacity;
        this.name = name;
    }
}
