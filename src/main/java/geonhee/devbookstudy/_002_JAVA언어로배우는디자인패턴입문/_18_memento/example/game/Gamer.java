package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._18_memento.example.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {

    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();

    private static String[] fruitsName = {"사과", "포도", "바나나", "오렌지"};

    public Gamer(int money) {
        this.money = money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("소지금이 증가했습니다.");
            return;
        }

        if (dice == 2) {
            money /= 2;
            System.out.println("소지금이 절반으로 줄었습니다.");
            return;
        }

        if (dice == 6) {
            String fruit = getFruit();
            System.out.println("과일(" + fruit + ")를 받았습니다.");
            fruits.add(fruit);
            return;
        }

        System.out.println("변동 사항이 없습니다.");
    }

    private String getFruit() {
        String fruitName = fruitsName[random.nextInt(fruitsName.length)];
        return random.nextBoolean() ? "맛있는 " + fruitName : fruitName;
    }

    public Memento createMemento() {
        Memento memento = new Memento(money);
        for (String fruit : fruits) {
            if (fruit.startsWith("맛있는 ")) {
                memento.addFruit(fruit);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
}
