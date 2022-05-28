
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;

        int principal = 0;
        float annualIntrest = 0;
        float monthlyIntrest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1_000_000");
        }

        while(true) {
            System.out.println("Annual intrest rate: ");
            annualIntrest = scanner.nextFloat();
            if (annualIntrest >= 1 && annualIntrest <= 30){
                monthlyIntrest = annualIntrest / 100.0F / 12.0F;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while(true) {
            System.out.println("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <=30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        double mortgage = (double)principal * (double)monthlyIntrest * Math.pow((double)(1.0F + monthlyIntrest), (double)numberOfPayments) / (Math.pow((double)(1.0F + monthlyIntrest), (double)numberOfPayments) - 1.0);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormatted);
    }
}
