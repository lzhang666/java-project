package _03objects.P8_1;

public class Driver {
    public static void main(String[] args) {
        MWPanel panel = new MWPanel();
        panel.reset();
        panel.increment();
        panel.increment();
        panel.increment();
        panel.switchP();
        panel.start();
    }
}
