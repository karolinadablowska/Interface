public class SoundInstrument {

    public static void main (String [] args) {

        PlayerCd playerCD = new PlayerCd ("Sony");


        playerCD.on();
        playerCD.start();
        playerCD.moreVolume();
        playerCD.stop();

        System.out.println(playerCD);

        Mp3Player mp3Player = new Mp3Player("Samsung", 2, 5);

        mp3Player.on();
        mp3Player.start();
        mp3Player.moreVolume();
        mp3Player.stop();

        System.out.println(mp3Player);
    }
}
