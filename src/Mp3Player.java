public class Mp3Player extends PlayerCd {

    private int storage;
    private int battery;

    public Mp3Player(String mark, int storage, int battery) {
        super(mark);
        this.storage = storage;
        this.battery = battery;
    }

    public void moreVolume() {
        volume++;
    }
    public void lessVolume(){
        volume--;
    }

    public void start() {
        System.out.println("Mp3 Player works....");
    }
    public void stop() {
        System.out.println("Mp3 Player doesn't works....");
    }
    @Override
    public void pause() {
        System.out.println("Mp3 Player is stopped...");
    }

    public String toString(){
        return "Mp3 Player of mark:  " + mark + " is " + (ifWorks() ? "on" : "off") + " Volume:" + volume;
    }


}



