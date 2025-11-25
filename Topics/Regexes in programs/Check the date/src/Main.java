import java.util.*;

class Date {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String date = scn.nextLine();
        String yearRegex = "(19|20)\\d{2}";
        String monthRegex = "0*([1-9])|(1[0-2])";
        String dayRegex = "0*([1-9])|([12]\\d)|(3[01])";
        String splittersRegex = "[-/.]";
        String yyyy_mm_ddRegex = String.format("(%s)(%s)(%s)%s(%s)",yearRegex,splittersRegex,monthRegex,splittersRegex,dayRegex);
        String dd_mm_yyyyRegex = String.format("(%s)(%s)(%s)%s(%s)",dayRegex,splittersRegex,monthRegex,splittersRegex,yearRegex);
        String dateRegex = String.format("(%s)|(%s)",yyyy_mm_ddRegex,dd_mm_yyyyRegex);
        if (date.matches(dateRegex))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}