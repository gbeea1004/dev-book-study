package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._13_visitor.example;


public abstract class Visitor {

    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
