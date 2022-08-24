import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe einen Betrag in EUR an:");
        Double money = scanner.nextDouble();
        convertTODOllars(money);
        convertTOYen(money);
    }
    public static void convertTODOllars(Double eur) {
        System.out.println("Der Beitrag in Dollar ist: " + eur * 1.28);
    }
    public static void convertTOYen(Double eur) {
        System.out.println("Der Beitrag in Yen ist: " + eur * 132.31);
    }
}

