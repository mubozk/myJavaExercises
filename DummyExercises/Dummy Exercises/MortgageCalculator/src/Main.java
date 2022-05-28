import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt(); // P is Principal

        System.out.println("Annual intrest rate: ");
        float annualIntrest = (scanner.nextFloat());//r is monthly  instrest rate
        float monthlyIntrest = annualIntrest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyIntrest * Math.pow(1+monthlyIntrest, numberOfPayments)) / (Math.pow(1 + monthlyIntrest, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormatted);
    }

}