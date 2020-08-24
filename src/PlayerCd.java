public class PlayerCd extends Player {
    public PlayerCd(String mark) {
        super(mark);
        volume = 10;
    }
    @Override
    public void moreVolume() {
        volume++;
    }
    @Override
    public void lessVolume() {
        volume--;
    }

    @Override
    public void start() {
        System.out.println("Player CD works....");
    }

    @Override
    public void stop() {
        System.out.println("Player CD doesn't works....");
    }

    @Override
    public void pause() {
        System.out.println("Player CD is stopped...");
    }

    public String toString(){
        return "Player CD of mark:  " + mark + " is " + (ifWorks() ? "on" : "off") + " Volume:" + volume;
    }
}
