package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(int totalCapacity, String name) {
        super(totalCapacity, name);
    }

    public CD(int totalCapacity, int availableCapacity, int usedCapacity, String name) {
        super(totalCapacity, availableCapacity, usedCapacity, name);
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void rewind() {

    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
