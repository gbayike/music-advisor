import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentState = scanner.nextInt();
        scanner.close();

        String nextState = getNextState(currentState);
        String action = getAction(currentState);

        System.out.println(nextState);
        System.out.println(action);
    }

    public static String getNextState(int currentState) {

    }

    public static String getAction(int currentState) {

    }
}