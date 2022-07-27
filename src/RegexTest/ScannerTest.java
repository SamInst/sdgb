package RegexTest;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        String text = "Levi, Eren, Mikasa, True, 200";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int" + i);
            } else if (scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
