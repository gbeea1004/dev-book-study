package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._13_visitor.example;

public class ListVisitor extends Visitor {

    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        for (Entry entry : directory) {
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
