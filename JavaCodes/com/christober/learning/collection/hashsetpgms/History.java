package christober.learning.collection.hashsetpgms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class History {
    private static final int MAX_HISTORY = 7;
    private final LinkedHashSet<String> history = new LinkedHashSet<>();

    public void viewProduct(String product) {
        if (product == null) return;
        product = product.trim();
        if (product.isEmpty()) return;

        if (history.contains(product)) {
            history.remove(product);
        }
        history.add(product);

        while (history.size() > MAX_HISTORY) {
            Iterator<String> it = history.iterator();
            if (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
    }

    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println("[history is empty]");
            return;
        }
        System.out.println("History (oldest -> newest):");
        for (String p : history) {
            System.out.println(" - " + p);
        }
    }

    public static void main(String[] args) {
        History h = new History();

        if (args != null && args.length > 0) {
            for (String p : args) {
                h.viewProduct(p);
                System.out.println("Viewed: " + p);
                h.printHistory();
                System.out.println();
            }
            return;
        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter product names to view (type 'exit' to quit):");
            while (true) {
                System.out.print("> ");
                if (!scanner.hasNextLine()) break;
                String line = scanner.nextLine().trim();
                if ("exit".equalsIgnoreCase(line)) break;
                if (line.isEmpty()) continue;
                h.viewProduct(line);
                System.out.println("Viewed: " + line);
                h.printHistory();
                System.out.println();
            }
        }
    }
}