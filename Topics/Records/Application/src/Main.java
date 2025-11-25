import java.util.Scanner;

record Player(String username, String email) {

}

class OverrideTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(scanner.next(), scanner.next());
        System.out.println(player.username() + ":" + player.email());
    }
}