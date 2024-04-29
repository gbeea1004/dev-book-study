package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._13_visitor.example;

public class Main {

    public static void main(String[] args) {
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");

        rootDir.add(binDir);
        rootDir.add(tmpDir);
        binDir.add(new File("vi", 1000));
        binDir.add(new File("latex", 2000));
        rootDir.accept(new ListVisitor());
    }
}
