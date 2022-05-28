import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final byte FIZZ = 3;
        final byte BUZZ = 5;

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        boolean isFizzBuzz = inputNumber % FIZZ == 0 && inputNumber % BUZZ == 0 ? true : false ;
        boolean isFizz = inputNumber % FIZZ == 0 ? true : false;
        boolean isBuzz = inputNumber % BUZZ == 0 ? true : false;

        if (isFizzBuzz == true)
            System.out.println("FIZZBUZZ");
        else if (isFizz == true)
            System.out.println("FIZZ");
        else if (isBuzz == true)
            System.out.println("BUZZ");
        else
            System.out.println(inputNumber);
        //you can do the statements in if paranthesis like in tutorial
        //i just wanted to warmup on Ternary operators
    }
}