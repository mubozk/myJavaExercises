public class Main {
    public static void main(String[] args) {
        /* treat as constant  */final float PI = 3.14F;
//        PI = 3.1; error
        System.out.println(PI);
        // you should use capital letters for constants

        int x = 1;
        int y = x++; //y = 1
        System.out.println(x);
        System.out.println(y);
        // order of mathematical expressions are the same like first () then / * then + -
    }
}