public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();
game.addPlayer();
game.addPlayer();
game.increaseScore(18);
        System.out.println("Player count: " + game.getPlayers());
        System.out.println("Total score: " + game.getScore());
        System.out.println("Average score per player: " + game.averageScorePerPlayer());

    }
}
