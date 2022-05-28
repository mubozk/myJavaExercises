
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
        int h1,m1;
        Scanner input = new Scanner(new java.io.File(input.txt));
////        System.out.print("Hour -> ");
//        h1 = input.nextInt();
////        System.out.print("Minute -> ");
//        m1 = input.nextInt();
//        Time t1 = new Time(h1, m1);
//        System.out.println(t1.toString());
////        System.out.println("Hello world!");
//
//        int h2 = input.nextInt();
//        int m2 = input.nextInt();
//        Time t2 = new Time(h2, m2);
//        System.out.println(t2.toString());
//
//        System.out.println(Time.difference(h1,m1,h2,m2));
//        System.out.print(t2.difference(h1,m1));
//        System.out.print(Time.difference(h2,m2,h1,m1));
//        System.out.print(Time.difference(h2,m2));

        Time[] times = new Time[2];
        for (int i  = 0; i < times.lenght; i++) {
            h1 = input.nextInt();
            m1 = input.nextInt();
            //Time t = new Time(h1,m1);
            //times[i] = t
            times[i] = new Time(h1, m1)
        }
        System.out.println(times[1].difference(times[0].getH(),times [0].getM()));
        System.out.println(times[1].difference(times[0]));
    }
}