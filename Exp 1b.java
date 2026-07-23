public class ModularArithmetic {

    static long power(long base, long exp, long mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;

            base = (base * base) % mod;
            exp >>= 1;
        }

        return result;
    }

    static long modAdd(long a, long b, long mod) {
        return (a % mod + b % mod) % mod;
    }

    static long modSub(long a, long b, long mod) {
        return (a % mod - b % mod + mod) % mod;
    }

    static long modMul(long a, long b, long mod) {
        return ((a % mod) * (b % mod)) % mod;
    }

    static long modDiv(long a, long b, long mod) {
        return (a * power(b, mod - 2, mod)) % mod;
    }

    public static void main(String[] args) {
        long mod = 1000000007;

        System.out.println("Modular Addion :"+modAdd(8, 7, mod));
        System.out.println("Modular substraction :"+modSub(4, 9, mod));
        System.out.println("Modular Multiplication :"+modMul(6, 5, mod));
        System.out.println("Modular Division :"+modDiv(8, 3, 5));
    }
}
