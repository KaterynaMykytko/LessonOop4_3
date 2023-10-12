public class Main {

    public static void main(String[] args) {
        Playable player1 = new Player();
        Recordable player2 = new Player();

        player1.play();
        player1.pause();
        player1.stop();
        player2.record();
        player2.pause();
        player2.stop();
    }

}
