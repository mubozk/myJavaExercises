import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // read from terminal
        byte age = scanner.nextByte();
        System.out.println("Your are" + age);
        String name = scanner.next();
        System.out.println("You are" + name);
        String fullName = scanner.nextLine();
        System.out.println("You are" + fullName);
    }
}