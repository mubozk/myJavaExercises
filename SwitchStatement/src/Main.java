public class Main {
    public static void main(String[] args) {
        String role = "admin";
        switch(role) {
            case "admin":
                System.out.println("you're admin");
                break;
            case "moderator:":
                System.out.println("you're mod");
                break;
            default:
                System.out.println("you're a guest");
        }

        // switch statement is a good option for an if statement like this
        // if (bla bla)
        //      you are bla bla
        // else if (ble ble)
        //      you are ble ble
        // else (bluh bluh)
        //      you are bluh bluh

    }
}