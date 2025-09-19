package Interface;

public class Printer implements Printing, Scanning {
    @Override
    public void print() {
        System.out.println("Printer can print");
    }

    @Override
    public void scan() {
        System.out.println("Printer can scan");
    }

    static void main() {
        Printer printer = new Printer();
        printer.print();
        printer.scan();
    }
}
