package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._10_strategy.example;

public class Player {

    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() {
        gameCount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strategy=" + strategy +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                ", gameCount=" + gameCount +
                '}';
    }
}
