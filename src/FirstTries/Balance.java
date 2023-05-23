package FirstTries;

public class Balance {
    private final char[] arr = {'=', 'R', 'L'};
    private int left;
    private int right;

    void addRight(int i) {
        i = Math.abs(i);
        right += i;
    }
    void addLeft(int i) {
        i = Math.abs(i);
        left += i;
    }
    public char getSituation() {
        if (right == left) {
            System.out.println(arr[0]);
            return(arr[0]);
        } else if (right > left) {
            System.out.println(arr[1]);
            return (arr[1]);
        } else if (right < left) {
            System.out.println(arr[2]);
            return (arr[2]);
        }
        return 0;
    }
}
