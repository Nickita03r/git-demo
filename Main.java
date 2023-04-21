public class Main {
    public static void main(String[] args) {
        Piano piano = new Piano(5);
        piano.tune();
        piano.startPlay();
        piano.pressPedal();
        piano.pressKey(2);
        piano.pressKey(3);
        piano.releaseKey(2);
        piano.pressKey(4);
        piano.releaseKey(3);
        piano.releaseKey(4);
        piano.releasePedal();
        piano.display();
        piano.stopPlay();
    }
}





