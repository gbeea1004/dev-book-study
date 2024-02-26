package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._07_builder.example;

public class Main {

    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.geTextResult();
        System.out.println(result);
    }
}
