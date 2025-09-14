package JIT;

public class JITIntComp {
    public static void main(String[] args) {
        final int iterations = 20;  // number of method calls
        System.out.println("Starting JIT Demo...");

        for (int i = 1; i <= iterations; i++) {
            long start = System.nanoTime();
            long sum = runCalculation();
            long end = System.nanoTime();

            System.out.printf("Iteration %2d: Time = %6d ms, Sum = %d%n",
                    i, (end - start) / 1_000_000, sum);
        }
    }
    // Hotspot method - called many times
    static long runCalculation() {
        long result = 0;
        for (int i = 0; i < 5_000_000; i++) {
            result += (i * i) % 7;
        }
        return result;
    }
}
