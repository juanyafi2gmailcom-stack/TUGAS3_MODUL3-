public final class ParityChecker {
    private ParityChecker() {}

    public static boolean isEven(long number) {
        return (number & 1L) == 0; // pure logic (bisa juga number % 2 == 0)
    }
}
