import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RemoveExtraSpacesProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // write your code here
        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(text);

        System.out.println(match.replaceAll(" ").trim());
    }
}