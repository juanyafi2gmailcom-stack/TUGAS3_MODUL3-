public class MainApp {
    public static void main(String[] args) {
        InputReader reader = new InputReader();

        Long number = reader.readLongOrNull(Messages.PROMPT);
        if (number == null) {
            System.out.println(Messages.INVALID_MSG);
            return;
        }

        String label = ParityChecker.isEven(number) ? Messages.EVEN_LABEL : Messages.ODD_LABEL;
        System.out.println(number + label);
    }
}
