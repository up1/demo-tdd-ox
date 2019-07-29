public class Game {

    private Player player1;
    private Player player2;
    private Board board;

    public Game() {
        player1 = new Player();
        player2 = new Player();
        board = new Board();
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Board getBoard() {
        return board;
    }
}
