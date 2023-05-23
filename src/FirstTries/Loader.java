package FirstTries;

public class Loader {

    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
    }

    public static String decode(char ch) {

        switch (ch) {
            case 'h':
                System.out.println("Hello!");
            break;
            case 'i':
                System.out.println("I can decode");
            break;
            case 'b':
                System.out.println("Bye!");
            break;
            default:
                System.out.println("I don't know these symbols :(");
        }
        return ("");
    }
}