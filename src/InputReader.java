import java.util.Scanner;

public class InputReader {
    private final Scanner scanner;

    public InputReader() {
        this.scanner = new Scanner(System.in);
    }

    /** @return Long valid, atau null kalau input bukan bilangan bulat */
    public Long readLongOrNull(String prompt) {
        System.out.print(prompt);
        if (!scanner.hasNextLong()) {
            scanner.next(); // buang token salah
            return null;
        }
        return scanner.nextLong();
    }
}
