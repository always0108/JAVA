import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        BigDecimal a = new BigDecimal("1");
        BigDecimal result = new BigDecimal("1");
        for(long i=1;i <= n; i++){
            BigDecimal tmp = new BigDecimal(factorial(i));
            tmp = a.divide(tmp,25,BigDecimal.ROUND_UP);
            result = result.add(tmp);
        }
        System.out.println(result);
    }

    public static String factorial(long n){
        BigInteger result = BigInteger.ONE;
        for(long i = 2; i <= n; i++){
            result = result.multiply(new BigInteger(i+""));
        }
        return result.toString();
    }
}
