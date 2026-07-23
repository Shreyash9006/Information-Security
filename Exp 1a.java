class Main {

    public static int gcd(int firstNumber, int secondNumber) {
        if (firstNumber == 0) {
            return secondNumber;
        }

        int remainder = secondNumber % firstNumber;
        return gcd(remainder, firstNumber);
    }

    public static long lcm(int firstNumber, int secondNumber, int gcdValue) {
        long product = (long) firstNumber * secondNumber;
        long lcmValue = product / gcdValue;
        return lcmValue;
    }

    public static void main(String[] args) {

        int firstNumber = 36;
        int secondNumber = 60;

        int gcdValue = gcd(firstNumber, secondNumber);
        long lcmValue = lcm(firstNumber, secondNumber, gcdValue);

        System.out.println("First Number  : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);
        System.out.println("Greatest Common Divisor (GCD) = " + gcdValue);
        System.out.println("Least Common Multiple (LCM) = " + lcmValue);
    }
}
