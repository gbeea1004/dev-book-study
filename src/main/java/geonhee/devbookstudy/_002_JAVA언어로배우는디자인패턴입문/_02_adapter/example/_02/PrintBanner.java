package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._02_adapter.example._02;

public class PrintBanner implements Print {

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
