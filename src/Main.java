import java.util.Scanner;

public class Main {
    private static final String MENU = "Choose on option from the following menu: \n" +
            "1. Count sum of lines; \n" +
            "2. Count sum of words; \n" +
            "3. Find the longest word; \n";

    private static final Scanner SCANNER = new Scanner(System.in);
    private static Counter counter = new Counter();

    public static void main(String[] args) {
        System.out.println(MENU);
        int option = Integer.parseInt(SCANNER.nextLine());
        doOption(option, args[0]);
    }

    private static void doOption(int option, String path) {
        if (option == 1)
            System.out.println(counter.countLineNumber(path));
        else if (option == 2)
            System.out.println(counter.countWordNumber(path));
        else if (option == 3)
            System.out.println(counter.findLongestWord(path));
    }
}
