import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
//        while (!input.equals("quit"))
//            input = scanner.next().toLowerCase();

        do
            input = scanner.next().toLowerCase();
        while (!input.equals("quit"));


    }
}