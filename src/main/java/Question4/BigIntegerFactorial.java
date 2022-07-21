package Question4;

import java.math.BigInteger;

public class BigIntegerFactorial {

    public static BigInteger factorial(int N) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= N; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

}
