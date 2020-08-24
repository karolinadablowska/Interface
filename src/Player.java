abstract class Player implements On, Play {

    protected int volume;
    private boolean works;
    protected String mark;

    public Player (String mark) {
        this.mark = mark;
        works = false;
    }

    public void on() {
        works = true;
    }

    public void off () {
        works = false;
    }

    public boolean ifWorks() {
        return works;
    }

    public abstract void moreVolume();
    public abstract void lessVolume();
    }



