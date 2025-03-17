public class PowerCalculator {
    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1; // Base case: any number raised to power 0 is 1
        }
        return base * power(base, exp - 1); // Recursive call
    }

    public static void main(String[] args) {
        int base = 2, exp = 3; // Change values as needed
        System.out.println(base + "^" + exp + " = " + power(base, exp));
    }
}
