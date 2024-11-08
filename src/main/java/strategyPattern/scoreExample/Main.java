package strategyPattern.scoreExample;

import strategyPattern.scoreExample.controller.ScoreBoard;
import strategyPattern.scoreExample.model.Balloon;
import strategyPattern.scoreExample.model.Clown;
import strategyPattern.scoreExample.model.SquareBalloon;

public class Main {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Balloon tap score: ");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.print("Clown tap score: ");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.print("SquareBalloon tap score: ");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);
    }
}
