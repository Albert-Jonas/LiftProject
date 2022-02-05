package com.example.liftproject.bozso;

public class vezerlo {
    enum direction {UP, DOWN};
    private short floor;
    private direction direction;
    private boolean ismoving;
    private boolean isOpenable;
    private boolean isCloseable;
    private boolean openDoorNow;

    public vezerlo() {

    }

    public vezerlo(short floor, vezerlo.direction direction, boolean ismoving) {
        this.floor = floor;
        this.direction = direction;
        this.ismoving = ismoving;
    }

    public short getFloor() {
        return floor;
    }

    public void setFloor(short floor) {
        this.floor = floor;
    }

    public vezerlo.direction getDirection() {
        return direction;
    }

    public void setDirection(vezerlo.direction direction) {
        this.direction = direction;
    }

    public boolean isIsmoving() {
        return ismoving;
    }

    public void setIsmoving(boolean ismoving) {
        this.ismoving = ismoving;
    }

    public boolean isOpenable() {
        return isOpenable;
    }

    public void setOpenable(boolean openable) {
        isOpenable = openable;
    }

    public boolean isCloseable() {
        return isCloseable;
    }

    public void setCloseable(boolean closeable) {
        isCloseable = closeable;
    }

    public boolean isOpenDoorNow() {
        return openDoorNow;
    }

    public void setOpenDoorNow(boolean openDoorNow) {
        this.openDoorNow = openDoorNow;
    }

    @Override
    public String toString() {
        return "vezerlo{" +
                "floor=" + floor +
                ", direction=" + direction +
                ", ismoving=" + ismoving +
                ", isOpenable=" + isOpenable +
                ", isCloseable=" + isCloseable +
                ", openDoorNow=" + openDoorNow +
                '}';
    }
}
