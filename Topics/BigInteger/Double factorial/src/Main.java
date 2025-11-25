import java.math.BigInteger;
import java.util.Scanner;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        // type your java code here
        if (n<=1)
            return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(calcDoubleFactorial(n-2));
    }
}