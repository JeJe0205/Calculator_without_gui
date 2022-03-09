import java.time.LocalDate;
import java.util.Scanner;

/**
 * Diese Klasse hilft bei der Eingabe in der Konsole
 *
 * @author Jenith Jeyaranjan
 */
public class Einleser {

    static Scanner scanner;

    public Einleser() {
        scanner = new Scanner(System.in);
    }

    public int readInt() {
        while (!scanner.hasNextInt()) {
            System.err.println("Bitte eine ganze Zahl eingenben");
            scanner.next();
        }
        int zahl = scanner.nextInt();
        scanner.nextLine();
        return zahl;
    }

    public double readDouble() {
        while (!scanner.hasNextDouble()) {
            System.err.println("Bitte eine Zahl eingeben");
            scanner.next();
        }
        double zahl = scanner.nextDouble();
        scanner.nextLine();
        return zahl;
    }

    public boolean readBoolean() {
        while (!scanner.nextBoolean()) {
            System.err.println("Bitte \"true\" oder \"false\" eingeben");
            scanner.next();
        }
        boolean bool = scanner.nextBoolean();
        return bool;
    }

    public String readString() {
        return scanner.nextLine();
    }

    public char readChar() {
        /*while (scanner.nextLine().length() < 1) {
            System.err.println("Bitte einen Buchstaben eingeben!");
            scanner.nextLine();
        }*/
        String line = scanner.nextLine();
        char ch = (line.length() > 0)? line.charAt(0) : ' ';
        return ch;
    }

    public LocalDate readDate() {
        LocalDate date = null;

        while (date != null) {
            try {
                String source = scanner.nextLine();
                LocalDate datum = LocalDate.parse(source);
            } catch (Error error) {
                System.out.println("Bitte Datum mit dem Format \"tt.mm.jjjj\" eingeben");
            }
        }
        return date;
    }
}

