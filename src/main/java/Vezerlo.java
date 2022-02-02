    public class Vezerlo {

    enum direction {UP, DOWN;};
    private short floor;
    private direction direction;
    private boolean isMoving;
    private boolean isOpenable;
    private boolean isCloseable;
    private boolean openDoorNow;

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


    public short getFloor() {
        return floor;
    }

    public void setFloor(short floor) {
        this.floor = floor;
    }

    public Vezerlo.direction getDirection() {
        return direction;
    }

    public void setDirection(Vezerlo.direction direction) {
        this.direction = direction;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public Vezerlo()
    {

    }

    public void GetLiftDoorState(boolean a, boolean b, boolean c)
    {
        isOpenable = a;
        isCloseable = b;
        openDoorNow = c;
    }

    public boolean isWeightLimitReached(boolean a)
    {
        return a;
    }

    public void GetLiftPositionInfo(direction d, boolean b, short f)
    {
        setDirection(d);
        setMoving(b);
        setFloor(f);
    }

    public boolean isUPSWorking(boolean a)
    {
        return a;
    }
}
