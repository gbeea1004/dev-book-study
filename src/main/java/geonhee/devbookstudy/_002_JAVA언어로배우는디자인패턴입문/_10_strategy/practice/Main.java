package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._10_strategy.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 적은 순서
        list.sort(String::compareTo);
        System.out.println(list);

        // 사전순으로 큰 순서
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
